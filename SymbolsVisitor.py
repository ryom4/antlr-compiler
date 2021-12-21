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


class SymbolsVisitor(llullVisitor):
    def __init__(self):
        self.processes = {}

    def visitRoot(self, ctx):
        l = list(ctx.getChildren())
        self.visit(l[0])
        return self.processes

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

  