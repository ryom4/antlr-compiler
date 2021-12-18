if __name__ is not None and "." in __name__:
    from .llullParser import llullParser
    from .llullVisitor import llullVisitor
else:
    from llullParser import llullParser
    from llullVisitor import llullVisitor


class TreeVisitor(llullVisitor):
    def __init__(self):
        self.nivell = 0

    def visitPotencia(self, ctx):
        l = list(ctx.getChildren())
        print('  ' * self.nivell + 'POT(^)')
        self.nivell += 1
        self.visit(l[0])
        self.visit(l[2])
        self.nivell -= 1

    def visitDivisio(self, ctx):
        l = list(ctx.getChildren())
        print('  ' * self.nivell + 'DIV(/)')
        self.nivell += 1
        self.visit(l[0])
        self.visit(l[2])
        self.nivell -= 1

    def visitMultiplicacio(self, ctx):
        l = list(ctx.getChildren())
        print('  ' * self.nivell + 'MUL(*)')
        self.nivell += 1
        self.visit(l[0])
        self.visit(l[2])
        self.nivell -= 1

    def visitResta(self, ctx):
        l = list(ctx.getChildren())
        print('  ' * self.nivell + 'RES(-)')
        self.nivell += 1
        self.visit(l[0])
        self.visit(l[2])
        self.nivell -= 1

    def visitSuma(self, ctx):
        l = list(ctx.getChildren())
        print('  ' * self.nivell + 'MES(+)')
        self.nivell += 1
        self.visit(l[0])
        self.visit(l[2])
        self.nivell -= 1

    def visitValor(self, ctx):
        l = list(ctx.getChildren())
        print("  " * self.nivell +
              llullParser.symbolicNames[l[0].getSymbol().type] +
              '(' + l[0].getText() + ')')
