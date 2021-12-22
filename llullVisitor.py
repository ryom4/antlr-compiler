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


    # Visit a parse tree produced by llullParser#proc.
    def visitProc(self, ctx:llullParser.ProcContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#statements.
    def visitStatements(self, ctx:llullParser.StatementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#procCall.
    def visitProcCall(self, ctx:llullParser.ProcCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#write.
    def visitWrite(self, ctx:llullParser.WriteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#read.
    def visitRead(self, ctx:llullParser.ReadContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#ass.
    def visitAss(self, ctx:llullParser.AssContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#array.
    def visitArray(self, ctx:llullParser.ArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#setArray.
    def visitSetArray(self, ctx:llullParser.SetArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#conditional.
    def visitConditional(self, ctx:llullParser.ConditionalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#elseConditional.
    def visitElseConditional(self, ctx:llullParser.ElseConditionalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#loop.
    def visitLoop(self, ctx:llullParser.LoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#forloop.
    def visitForloop(self, ctx:llullParser.ForloopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#cond.
    def visitCond(self, ctx:llullParser.CondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#parentesis.
    def visitParentesis(self, ctx:llullParser.ParentesisContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#div.
    def visitDiv(self, ctx:llullParser.DivContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#res.
    def visitRes(self, ctx:llullParser.ResContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#string.
    def visitString(self, ctx:llullParser.StringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#mul.
    def visitMul(self, ctx:llullParser.MulContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#var.
    def visitVar(self, ctx:llullParser.VarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#get.
    def visitGet(self, ctx:llullParser.GetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#mes.
    def visitMes(self, ctx:llullParser.MesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by llullParser#int.
    def visitInt(self, ctx:llullParser.IntContext):
        return self.visitChildren(ctx)



del llullParser