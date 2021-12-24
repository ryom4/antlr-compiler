if __name__ is not None and "." in __name__:
    from .llullParser import llullParser
    from .llullVisitor import llullVisitor
else:
    from llullParser import llullParser
    from llullVisitor import llullVisitor

from EvalVisitor import llullExceptions

class SaveProcess():
    def __init__(self, parameters, statements):
        self.parameters = parameters
        self.statements = statements


class SymbolsVisitor(llullVisitor):
    def __init__(self):
        self.processes = {}

    def visitRoot(self, ctx):
        l = list(ctx.getChildren())
        for proc in l:
            self.visit(proc)
        return self.processes

    def visitProc(self, ctx):
        l = list(ctx.getChildren())
        procname = l[1].getText()
        statements = ctx.statements()
        i = 3
        parameters = []

        if procname in self.processes:
            raise llullExceptions("Error: repetició de procediment ja definit.")

        while l[i].getText() != ')':
            if l[i].getText() != ',':
                if l[i].getText() in parameters:
                    raise llullExceptions("Error: nom de paràmetre a procediment repetit.")
                parameters.append(l[i].getText())
            i += 1

        self.processes[procname] = SaveProcess(parameters, statements)

  