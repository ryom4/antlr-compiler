if __name__ is not None and "." in __name__:
    from .llullParser import llullParser
    from .llullVisitor import llullVisitor
else:
    from llullParser import llullParser
    from llullVisitor import llullVisitor


class EvalVisitor(llullVisitor):
    def __init__(self):
        self.mem = {}

    def visitRoot(self, ctx):
        l = list(ctx.getChildren())
        self.visit(l[0])

    def visitExpr(self, ctx):
        l = list(ctx.getChildren())
        if len(l) == 1:
            return int(l[0].getText())
        else:  # len(l) == 3
            if (l[1].getText() == '**'):
                return self.visit(l[0]) ** self.visit(l[2])
            elif (l[1].getText() == '/'):
                return self.visit(l[0]) / self.visit(l[2])
            elif (l[1].getText() == '*'):
                return self.visit(l[0]) * self.visit(l[2])
            elif (l[1].getText() == '-'):
                return self.visit(l[0]) - self.visit(l[2])
            elif (l[1].getText() == '+'):
                return self.visit(l[0]) + self.visit(l[2])

    def visitWrite(self, ctx):
        l = list(ctx.getChildren())
        print(self.mem[l[1].getText()])

    def visitAss(self, ctx):
        l = list(ctx.getChildren())
        self.mem[l[0].getText()] = self.visit(l[2])
