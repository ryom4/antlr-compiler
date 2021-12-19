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

    def visitExpr(self, ctx):
        l = list(ctx.getChildren())
        if len(l) == 1:
            return int(l[0].getText())
        else:
            if (l[1].getText() == '/'):
                return self.visit(l[0]) / self.visit(l[2])
            elif (l[1].getText() == '*'):
                return self.visit(l[0]) * self.visit(l[2])
            elif (l[1].getText() == '-'):
                return self.visit(l[0]) - self.visit(l[2])
            elif (l[1].getText() == '+'):
                return self.visit(l[0]) + self.visit(l[2])

    def visitProcCall(self, ctx):
        procname = ctx.PROCNAME().getText()
        params = list(ctx.parameters().getText())
        newmem = {}
        i = 0
        for param in list(self.processes[procname].parameters):
            # print(params])
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
        procname = ctx.PROCNAME().getText()
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
        print(self.mem[-1][l[2].getText()])

    def visitAss(self, ctx):
        l = list(ctx.getChildren())
        self.mem[-1][l[0].getText()] = self.visit(l[2])
