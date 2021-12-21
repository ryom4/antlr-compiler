if __name__ is not None and "." in __name__:
    from .llullParser import llullParser
    from .llullVisitor import llullVisitor
else:
    from llullParser import llullParser
    from llullVisitor import llullVisitor


class SaveProcess():
    def __init__(self, parameters, statements):
        self.parameters = parameters
        self.statements = statements


class EvalVisitor(llullVisitor):
    def __init__(self):
        self.mem = [{}]
        self.processes = {}

    def visitRoot(self, ctx):
        l = list(ctx.getChildren())
        self.visit(l[0])

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
        return self.visit(l[0]) / self.visit(l[2])

    def visitVar(self, ctx):
        l = list(ctx.getChildren())
        return self.mem[-1][l[0].getText()]

    def visitString(self, ctx):
        l = list(ctx.getChildren())
        s = l[0].getText()
        return s[1:-1]

    def visitGet(self, ctx):
        l = list(ctx.getChildren())
        name = l[2].getText()
        value = self.visit(l[4])
        return self.mem[-1][name][value]

    def visitCond(self, ctx):
        l = list(ctx.getChildren())
        op = l[1].getText()

        if op == '<':
            return self.visit(l[0]) < self.visit(l[2])
        elif op == '>':
            return self.visit(l[0]) > self.visit(l[2])
        elif op == '==':
            return self.visit(l[0]) == self.visit(l[2])
        elif op == '<>':
            return self.visit(l[0]) != self.visit(l[2])
        elif op == '<=':
            return self.visit(l[0]) <= self.visit(l[2])
        elif op == '>=':
            return self.visit(l[0]) >= self.visit(l[2])

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
        params = list(ctx.parameters().getText())
        newmem = {}
        i = 0
        for param in list(self.processes[procname].parameters):
            if params[i] != ',':
                if not params[i].isnumeric():
                    newmem[param] = self.mem[-1][params[i]]
                else:
                    newmem[param] = params[i]
            i += 1

        self.mem.append(newmem)

        self.visit(self.processes[procname].statements)
        self.mem.pop()

    def visitProc(self, ctx):
        l = list(ctx.getChildren())
        procname = l[1].getText()
        statements = ctx.statements()

        if procname == "main":
            self.visit(statements)
        else:
            i = 3
            parameters = []
            while l[i].getText() != ')':
                parameters.append(l[i].getText())
                i += 1

            self.processes[procname] = SaveProcess(parameters, statements)

    def visitWrite(self, ctx):
        l = list(ctx.getChildren())
        i = 2

        while i < len(l):
            print(self.visit(l[i]))
            i += 2

    def visitAss(self, ctx):
        l = list(ctx.getChildren())
        self.mem[-1][l[0].getText()] = self.visit(l[2])

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
