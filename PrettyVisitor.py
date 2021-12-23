import colorama
from colorama import Fore

if __name__ is not None and "." in __name__:
    from .llullParser import llullParser
    from .llullVisitor import llullVisitor
else:
    from llullParser import llullParser
    from llullVisitor import llullVisitor


class PrettyVisitor(llullVisitor):
    def __init__(self):
        self.notIndent = False

    def visitRoot(self, ctx):
        l = list(ctx.getChildren())
        self.visit(l[0])

    def visitProgram(self, ctx):
        l = list(ctx.getChildren())
        for proc in l:
            self.visit(proc)

    def visitProc(self, ctx):
        l = list(ctx.getChildren())
        name = l[1].getText()
        statements = ctx.statements()
        self.nivell = 4

        print(Fore.LIGHTRED_EX + "void", end=" ")
        print(Fore.LIGHTBLUE_EX + name, end="")
        s = "("
        i = 3
        first = True

        while l[i].getText() != ")":
            if not first:
                s += " "
                s += l[i].getText()
            else:
                s += l[i].getText()
                first = False

            i += 1

        s += ") {"
        print(Fore.WHITE + s)
        self.visit(statements)
        print("}\n")

    def visitAss(self, ctx):
        l = list(ctx.getChildren())
        var = l[0].getText()
        expr = ctx.expr()

        s = " " * self.nivell
        s += var + " = "
        print(s, end="")

        self.nivell += 4
        self.visit(expr)
        self.nivell -= 4
        if not self.notIndent:
            print()

    def visitMes(self, ctx):
        l = list(ctx.getChildren())
        self.visit(l[0])
        print(" + ", end="")
        self.visit(l[2])

    def visitInt(self, ctx):
        l = list(ctx.getChildren())
        print(Fore.LIGHTGREEN_EX + l[0].getText(), end="")
        print(Fore.WHITE, end="")

    def visitRes(self, ctx):
        l = list(ctx.getChildren())
        self.visit(l[0])
        print(" - ", end="")
        self.visit(l[2])

    def visitMul(self, ctx):
        l = list(ctx.getChildren())
        self.visit(l[0])
        print(" * ", end="")
        self.visit(l[2])

    def visitDiv(self, ctx):
        l = list(ctx.getChildren())
        self.visit(l[0])
        print(" / ", end="")
        self.visit(l[2])

    def visitMod(self, ctx):
        l = list(ctx.getChildren())
        self.visit(l[0])
        print(" % ", end="")
        self.visit(l[2])

    def visitVar(self, ctx):
        l = list(ctx.getChildren())
        print(l[0].getText(), end="")

    def visitString(self, ctx):
        l = list(ctx.getChildren())
        print(Fore.GREEN + l[0].getText(), end="")
        print(Fore.WHITE, end="")

    def visitGet(self, ctx):
        l = list(ctx.getChildren())
        name = l[2].getText()
        value = l[4].getText()
        print("get(" + name + ", " + value + ")", end="")

    def visitParentesis(self, ctx):
        l = list(ctx.getChildren())
        print("(", end="")
        self.visit(l[1])
        print(")", end="")

    def visitCond(self, ctx):
        l = list(ctx.getChildren())
        op = l[1].getText()

        self.visit(l[0])
        print(" " + op + " ", end="")
        self.visit(l[2])

    def visitConditional(self, ctx):
        l = list(ctx.getChildren())
        cond = l[2]
        statements = l[5]

        print(" " * self.nivell + "if (", end="")
        self.visit(cond)
        print(") {")
        self.nivell += 4
        self.visit(statements)
        self.nivell -= 4
        print(" " * self.nivell + "}")
        if len(l) == 8:
            print(" " * self.nivell + "else {")
            self.nivell += 4
            self.visit(l[7])
            self.nivell -= 4
            print(" " * self.nivell + "}")

    def visitLoop(self, ctx):
        l = list(ctx.getChildren())
        print(" " * self.nivell + Fore.LIGHTRED_EX + "while", end="")
        print(Fore.WHITE, end="")
        print("(", end="")
        self.visit(l[2])
        print(") {")
        self.nivell += 4
        self.visit(l[5])
        self.nivell -= 4

        print(" " * self.nivell + "}")

    def visitForloop(self, ctx):
        l = list(ctx.getChildren())
        print(" " * self.nivell + Fore.LIGHTRED_EX + "for", end="")
        print(Fore.WHITE, end="")
        print("(", end="")

        nivellaux = self.nivell
        self.nivell = 0
        self.notIndent = True
        self.visit(l[2])  # statement1
        print("; ", end="")

        self.visit(l[4])
        print("; ", end="")
        self.visit(l[6])
        print(") {")
        self.notIndent = False

        self.nivell = nivellaux + 4
        self.visit(l[9])
        self.nivell -= 4
        print(" " * self.nivell + "}")

    def visitProcCall(self, ctx):
        l = list(ctx.getChildren())
        procname = l[0].getText()

        print(" " * self.nivell + Fore.LIGHTBLUE_EX + procname, end="")
        print(Fore.WHITE, end="")
        print("(", end="")
        self.notIndent = True

        i = 2
        while l[i].getText() != ')':
            if l[i].getText() != ',':
                self.visit(l[i])
            else:
                print(", ", end="")
            i += 1

        print(")")
        self.notIndent = False

    def visitWrite(self, ctx):
        l = list(ctx.getChildren())
        i = 2

        print(" " * self.nivell + Fore.LIGHTBLUE_EX + "write", end="")
        print(Fore.WHITE, end="")
        print("(", end="")

        while i < len(l):
            if l[i].getText() != ',':
                self.visit(l[i])
            else:
                print(", ", end="")
            i += 1

        print(")")

    def visitRead(self, ctx):
        l = list(ctx.getChildren())
        print(" " * self.nivell + Fore.LIGHTBLUE_EX + "read", end="")
        print(Fore.WHITE, end="")
        print("(", end="")

        print(l[2].getText(), end="")
        print(")")

    def visitArray(self, ctx):
        l = list(ctx.getChildren())
        name = l[2].getText()
        print(" " * self.nivell + Fore.LIGHTBLUE_EX + "array", end="")
        print(Fore.WHITE, end="")
        print("(" + name + ", ", end="")

        self.notIndent = True
        self.visit(l[4])
        self.notIndent = False

        print(")")

    def visitSetArray(self, ctx):
        l = list(ctx.getChildren())
        name = l[2].getText()
        print(" " * self.nivell + "set(" + name + ", ", end="")
        self.notIndent = True
        self.visit(l[4])
        print(", ", end="")
        self.visit(l[6])
        print(")")
        self.notIndent = False
