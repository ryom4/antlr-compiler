if __name__ is not None and "." in __name__:
    from .llullParser import llullParser
    from .llullVisitor import llullVisitor
else:
    from llullParser import llullParser
    from llullVisitor import llullVisitor

class llullExceptions(Exception):
    def __init__(self, missatge):
        self.missatge = missatge

class EvalVisitor(llullVisitor):
    def __init__(self, symbols, procname="main", parameters=[]):
        self.mem = [{}]
        self.processes = symbols
        self.procname = procname
        self.parameters = parameters

    def visitRoot(self, ctx):
        l = list(ctx.getChildren())
        newmem = {}

        if self.procname not in self.processes:
            raise llullExceptions("Error: nom de procediment incorrecte.")

        listParameters = (self.processes[self.procname].parameters)
        i = 0

        if len(listParameters) != len(self.parameters):
            raise llullExceptions("Error: nombre de paràmetres incorrectes.")

        for param in listParameters:
            if param != ',':
                newmem[param] = self.parameters[i]
                i += 1

        self.mem.append(newmem)
        self.visit(self.processes[self.procname].statements)
        self.mem.pop()

    def visitInt(self, ctx):
        l = list(ctx.getChildren())
        return int(l[0].getText())

    def visitMes(self, ctx):
        l = list(ctx.getChildren())
        return self.visit(l[0]) + self.visit(l[2])

    def visitRes(self, ctx):
        l = list(ctx.getChildren())
        return self.visit(l[0]) - self.visit(l[2])

    def visitMul(self, ctx):
        l = list(ctx.getChildren())
        return self.visit(l[0]) * self.visit(l[2])

    def visitDiv(self, ctx):
        l = list(ctx.getChildren())
        dividend = self.visit(l[0])
        divisor = self.visit(l[2])
        
        if divisor == 0:
            raise llullExceptions("Error: divisió per zero.")
        else:
            return dividend / divisor

    def visitMod(self, ctx):
        l = list(ctx.getChildren())
        return self.visit(l[0]) % self.visit(l[2])

    def visitVar(self, ctx):
        l = list(ctx.getChildren())
        if l[0].getText() not in self.mem[-1]:
            self.mem[-1][l[0].getText()] = 0

        return self.mem[-1][l[0].getText()]

    def visitString(self, ctx):
        l = list(ctx.getChildren())
        s = l[0].getText()
        return s[1:-1]

    def visitGet(self, ctx):
        l = list(ctx.getChildren())
        name = l[2].getText()
        it = self.visit(l[4])
        array = self.mem[-1][name]

        if it < 0 or it >= len(array):
            raise llullExceptions("Error: accés a índex inexistent d'una taula.")
        else:
            return self.mem[-1][name][it]

    def visitParentesis(self, ctx):
        l = list(ctx.getChildren())
        return self.visit(l[1])

    def visitCond(self, ctx):
        l = list(ctx.getChildren())
        op = l[1].getText()

        if op == '<':
            if self.visit(l[0]) < self.visit(l[2]):
                return 1
            else:
                return 0
        elif op == '>':
            if self.visit(l[0]) > self.visit(l[2]):
                return 1
            else:
                return 0
        elif op == '==':
            if self.visit(l[0]) == self.visit(l[2]):
                return 1
            else:
                return 0
        elif op == '<>':
            if self.visit(l[0]) != self.visit(l[2]):
                return 1
            else:
                return 0
        elif op == '<=':
            if self.visit(l[0]) <= self.visit(l[2]):
                return 1
            else:
                return 0
        elif op == '>=':
            if self.visit(l[0]) >= self.visit(l[2]):
                return 1
            else:
                return 0

    def visitConditional(self, ctx):
        l = list(ctx.getChildren())
        cond = self.visit(l[2])
        statements = l[5]

        if cond:
            self.visit(statements)
        elif len(l) == 8:
            self.visit(l[7])

    def visitLoop(self, ctx):
        l = list(ctx.getChildren())
        while self.visit(l[2]):
            self.visit(l[5])

    def visitForloop(self, ctx):
        l = list(ctx.getChildren())
        self.visit(l[2])  # statement1

        while self.visit(l[4]):
            self.visit(l[9])
            self.visit(l[6])  # statement2

    def visitProcCall(self, ctx):
        l = list(ctx.getChildren())
        procname = l[0].getText()
        newmem = {}
        i = 2

        if procname not in self.processes:
            raise llullExceptions("Error: crida a procediment no definit")

        listParameters = (self.processes[procname].parameters)

        nparams = 0
        j = 2
        while  l[j].getText() != ')':
            if l[j].getText() != ',':
                nparams += 1
            j += 1

        if len(listParameters) != nparams:
            raise llullExceptions("Error: nombre de paràmetres a crida incorrectes.")

        k = 0
        while l[i].getText() != ')':
            if l[i].getText() != ',':
                newparam = self.visit(l[i])
                if isinstance(newparam, int):
                    newmem[listParameters[k]] = newparam
                else:
                    newmem[listParameters[k]] = self.mem[-1][l[i].getText()]
                k += 1

            i += 1

        self.mem.append(newmem)
        self.visit(self.processes[procname].statements)
        self.mem.pop()

    def visitWrite(self, ctx):
        l = list(ctx.getChildren())
        i = 2

        while i < len(l):
            print(self.visit(l[i]), end=" ")
            i += 2

        print(end="\n")

    def visitRead(self, ctx):
        l = list(ctx.getChildren())
        self.mem[-1][l[2].getText()] = int(input())

    def visitAss(self, ctx):
        l = list(ctx.getChildren())
        value = self.visit(l[2])

        if isinstance(value, list):
            self.mem[-1][l[0].getText()] = value.copy()
        else:
            self.mem[-1][l[0].getText()] = value

    def visitArray(self, ctx):
        l = list(ctx.getChildren())
        name = l[2].getText()
        size = self.visit(l[4])
        self.mem[-1][name] = [0] * size

    def visitSetArray(self, ctx):
        l = list(ctx.getChildren())
        name = l[2].getText()
        it = self.visit(l[4])
        value = self.visit(l[6])
        self.mem[-1][name][it] = value
