# Generated from llull.g4 by ANTLR 4.9
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .llullParser import llullParser
else:
    from llullParser import llullParser

# This class defines a complete generic visitor for a parse tree produced by llullParser.

class llullVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by llullParser#root.
    def visitRoot(self, ctx:llullParser.RootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#program.
    def visitProgram(self, ctx:llullParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#procCall.
    def visitProcCall(self, ctx:llullParser.ProcCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#parameters.
    def visitParameters(self, ctx:llullParser.ParametersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#proc.
    def visitProc(self, ctx:llullParser.ProcContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#statements.
    def visitStatements(self, ctx:llullParser.StatementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#ass.
    def visitAss(self, ctx:llullParser.AssContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#write.
    def visitWrite(self, ctx:llullParser.WriteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#expr.
    def visitExpr(self, ctx:llullParser.ExprContext):
        return self.visitChildren(ctx)



del llullParser