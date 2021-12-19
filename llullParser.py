# Generated from llull.g4 by ANTLR 4.9
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22")
        buf.write("d\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2\3\3\6\3\31\n\3\r\3\16")
        buf.write("\3\32\3\4\3\4\3\4\3\4\3\4\3\5\5\5#\n\5\3\5\3\5\7\5\'\n")
        buf.write("\5\f\5\16\5*\13\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\62\n\6\f")
        buf.write("\6\16\6\65\13\6\5\6\67\n\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7")
        buf.write("\3\7\3\7\7\7B\n\7\f\7\16\7E\13\7\3\b\3\b\3\b\3\b\3\t\3")
        buf.write("\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n")
        buf.write("\3\n\3\n\3\n\3\n\3\n\7\n_\n\n\f\n\16\nb\13\n\3\n\2\3\22")
        buf.write("\13\2\4\6\b\n\f\16\20\22\2\3\3\2\5\6\2g\2\24\3\2\2\2\4")
        buf.write("\30\3\2\2\2\6\34\3\2\2\2\b\"\3\2\2\2\n+\3\2\2\2\fC\3\2")
        buf.write("\2\2\16F\3\2\2\2\20J\3\2\2\2\22O\3\2\2\2\24\25\5\4\3\2")
        buf.write("\25\26\7\2\2\3\26\3\3\2\2\2\27\31\5\n\6\2\30\27\3\2\2")
        buf.write("\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\5\3\2")
        buf.write("\2\2\34\35\7\20\2\2\35\36\7\13\2\2\36\37\5\b\5\2\37 \7")
        buf.write("\f\2\2 \7\3\2\2\2!#\t\2\2\2\"!\3\2\2\2\"#\3\2\2\2#(\3")
        buf.write("\2\2\2$%\7\3\2\2%\'\t\2\2\2&$\3\2\2\2\'*\3\2\2\2(&\3\2")
        buf.write("\2\2()\3\2\2\2)\t\3\2\2\2*(\3\2\2\2+,\7\4\2\2,-\7\20\2")
        buf.write("\2-\66\7\13\2\2.\63\7\6\2\2/\60\7\3\2\2\60\62\7\6\2\2")
        buf.write("\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2")
        buf.write("\64\67\3\2\2\2\65\63\3\2\2\2\66.\3\2\2\2\66\67\3\2\2\2")
        buf.write("\678\3\2\2\289\7\f\2\29:\7\r\2\2:;\5\f\7\2;<\7\16\2\2")
        buf.write("<\13\3\2\2\2=B\5\20\t\2>B\5\22\n\2?B\5\16\b\2@B\5\6\4")
        buf.write("\2A=\3\2\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2BE\3\2\2\2C")
        buf.write("A\3\2\2\2CD\3\2\2\2D\r\3\2\2\2EC\3\2\2\2FG\7\6\2\2GH\7")
        buf.write("\21\2\2HI\5\22\n\2I\17\3\2\2\2JK\7\17\2\2KL\7\13\2\2L")
        buf.write("M\7\6\2\2MN\7\f\2\2N\21\3\2\2\2OP\b\n\1\2PQ\7\5\2\2Q`")
        buf.write("\3\2\2\2RS\f\7\2\2ST\7\n\2\2T_\5\22\n\bUV\f\6\2\2VW\7")
        buf.write("\t\2\2W_\5\22\n\7XY\f\5\2\2YZ\7\b\2\2Z_\5\22\n\6[\\\f")
        buf.write("\4\2\2\\]\7\7\2\2]_\5\22\n\5^R\3\2\2\2^U\3\2\2\2^X\3\2")
        buf.write("\2\2^[\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\23\3\2\2")
        buf.write("\2b`\3\2\2\2\13\32\"(\63\66AC^`")
        return buf.getvalue()


class llullParser ( Parser ):

    grammarFileName = "llull.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "','", "'void'", "<INVALID>", "<INVALID>", 
                     "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'{'", "'}'", 
                     "'write'", "<INVALID>", "'='" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "INT", "VAR", 
                      "MES", "RES", "MUL", "DIV", "LP", "RP", "LB", "RB", 
                      "WR", "PROCNAME", "IG", "WS" ]

    RULE_root = 0
    RULE_program = 1
    RULE_procCall = 2
    RULE_parameters = 3
    RULE_proc = 4
    RULE_statements = 5
    RULE_ass = 6
    RULE_write = 7
    RULE_expr = 8

    ruleNames =  [ "root", "program", "procCall", "parameters", "proc", 
                   "statements", "ass", "write", "expr" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    INT=3
    VAR=4
    MES=5
    RES=6
    MUL=7
    DIV=8
    LP=9
    RP=10
    LB=11
    RB=12
    WR=13
    PROCNAME=14
    IG=15
    WS=16

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def program(self):
            return self.getTypedRuleContext(llullParser.ProgramContext,0)


        def EOF(self):
            return self.getToken(llullParser.EOF, 0)

        def getRuleIndex(self):
            return llullParser.RULE_root

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRoot" ):
                return visitor.visitRoot(self)
            else:
                return visitor.visitChildren(self)




    def root(self):

        localctx = llullParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 18
            self.program()
            self.state = 19
            self.match(llullParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ProgramContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def proc(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(llullParser.ProcContext)
            else:
                return self.getTypedRuleContext(llullParser.ProcContext,i)


        def getRuleIndex(self):
            return llullParser.RULE_program

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = llullParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 22 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 21
                self.proc()
                self.state = 24 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==llullParser.T__1):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ProcCallContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PROCNAME(self):
            return self.getToken(llullParser.PROCNAME, 0)

        def LP(self):
            return self.getToken(llullParser.LP, 0)

        def parameters(self):
            return self.getTypedRuleContext(llullParser.ParametersContext,0)


        def RP(self):
            return self.getToken(llullParser.RP, 0)

        def getRuleIndex(self):
            return llullParser.RULE_procCall

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProcCall" ):
                return visitor.visitProcCall(self)
            else:
                return visitor.visitChildren(self)




    def procCall(self):

        localctx = llullParser.ProcCallContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_procCall)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 26
            self.match(llullParser.PROCNAME)
            self.state = 27
            self.match(llullParser.LP)
            self.state = 28
            self.parameters()
            self.state = 29
            self.match(llullParser.RP)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametersContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self, i:int=None):
            if i is None:
                return self.getTokens(llullParser.INT)
            else:
                return self.getToken(llullParser.INT, i)

        def VAR(self, i:int=None):
            if i is None:
                return self.getTokens(llullParser.VAR)
            else:
                return self.getToken(llullParser.VAR, i)

        def getRuleIndex(self):
            return llullParser.RULE_parameters

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParameters" ):
                return visitor.visitParameters(self)
            else:
                return visitor.visitChildren(self)




    def parameters(self):

        localctx = llullParser.ParametersContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_parameters)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 32
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==llullParser.INT or _la==llullParser.VAR:
                self.state = 31
                _la = self._input.LA(1)
                if not(_la==llullParser.INT or _la==llullParser.VAR):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()


            self.state = 38
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==llullParser.T__0:
                self.state = 34
                self.match(llullParser.T__0)
                self.state = 35
                _la = self._input.LA(1)
                if not(_la==llullParser.INT or _la==llullParser.VAR):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 40
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ProcContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PROCNAME(self):
            return self.getToken(llullParser.PROCNAME, 0)

        def LP(self):
            return self.getToken(llullParser.LP, 0)

        def RP(self):
            return self.getToken(llullParser.RP, 0)

        def LB(self):
            return self.getToken(llullParser.LB, 0)

        def statements(self):
            return self.getTypedRuleContext(llullParser.StatementsContext,0)


        def RB(self):
            return self.getToken(llullParser.RB, 0)

        def VAR(self, i:int=None):
            if i is None:
                return self.getTokens(llullParser.VAR)
            else:
                return self.getToken(llullParser.VAR, i)

        def getRuleIndex(self):
            return llullParser.RULE_proc

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProc" ):
                return visitor.visitProc(self)
            else:
                return visitor.visitChildren(self)




    def proc(self):

        localctx = llullParser.ProcContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_proc)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 41
            self.match(llullParser.T__1)
            self.state = 42
            self.match(llullParser.PROCNAME)
            self.state = 43
            self.match(llullParser.LP)
            self.state = 52
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==llullParser.VAR:
                self.state = 44
                self.match(llullParser.VAR)
                self.state = 49
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==llullParser.T__0:
                    self.state = 45
                    self.match(llullParser.T__0)
                    self.state = 46
                    self.match(llullParser.VAR)
                    self.state = 51
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 54
            self.match(llullParser.RP)
            self.state = 55
            self.match(llullParser.LB)
            self.state = 56
            self.statements()
            self.state = 57
            self.match(llullParser.RB)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementsContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def write(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(llullParser.WriteContext)
            else:
                return self.getTypedRuleContext(llullParser.WriteContext,i)


        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(llullParser.ExprContext)
            else:
                return self.getTypedRuleContext(llullParser.ExprContext,i)


        def ass(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(llullParser.AssContext)
            else:
                return self.getTypedRuleContext(llullParser.AssContext,i)


        def procCall(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(llullParser.ProcCallContext)
            else:
                return self.getTypedRuleContext(llullParser.ProcCallContext,i)


        def getRuleIndex(self):
            return llullParser.RULE_statements

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatements" ):
                return visitor.visitStatements(self)
            else:
                return visitor.visitChildren(self)




    def statements(self):

        localctx = llullParser.StatementsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_statements)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 65
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << llullParser.INT) | (1 << llullParser.VAR) | (1 << llullParser.WR) | (1 << llullParser.PROCNAME))) != 0):
                self.state = 63
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [llullParser.WR]:
                    self.state = 59
                    self.write()
                    pass
                elif token in [llullParser.INT]:
                    self.state = 60
                    self.expr(0)
                    pass
                elif token in [llullParser.VAR]:
                    self.state = 61
                    self.ass()
                    pass
                elif token in [llullParser.PROCNAME]:
                    self.state = 62
                    self.procCall()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 67
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(llullParser.VAR, 0)

        def IG(self):
            return self.getToken(llullParser.IG, 0)

        def expr(self):
            return self.getTypedRuleContext(llullParser.ExprContext,0)


        def getRuleIndex(self):
            return llullParser.RULE_ass

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAss" ):
                return visitor.visitAss(self)
            else:
                return visitor.visitChildren(self)




    def ass(self):

        localctx = llullParser.AssContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_ass)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 68
            self.match(llullParser.VAR)
            self.state = 69
            self.match(llullParser.IG)
            self.state = 70
            self.expr(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class WriteContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WR(self):
            return self.getToken(llullParser.WR, 0)

        def LP(self):
            return self.getToken(llullParser.LP, 0)

        def VAR(self):
            return self.getToken(llullParser.VAR, 0)

        def RP(self):
            return self.getToken(llullParser.RP, 0)

        def getRuleIndex(self):
            return llullParser.RULE_write

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWrite" ):
                return visitor.visitWrite(self)
            else:
                return visitor.visitChildren(self)




    def write(self):

        localctx = llullParser.WriteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_write)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 72
            self.match(llullParser.WR)
            self.state = 73
            self.match(llullParser.LP)
            self.state = 74
            self.match(llullParser.VAR)
            self.state = 75
            self.match(llullParser.RP)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(llullParser.INT, 0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(llullParser.ExprContext)
            else:
                return self.getTypedRuleContext(llullParser.ExprContext,i)


        def DIV(self):
            return self.getToken(llullParser.DIV, 0)

        def MUL(self):
            return self.getToken(llullParser.MUL, 0)

        def RES(self):
            return self.getToken(llullParser.RES, 0)

        def MES(self):
            return self.getToken(llullParser.MES, 0)

        def getRuleIndex(self):
            return llullParser.RULE_expr

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpr" ):
                return visitor.visitExpr(self)
            else:
                return visitor.visitChildren(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = llullParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 16
        self.enterRecursionRule(localctx, 16, self.RULE_expr, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 78
            self.match(llullParser.INT)
            self._ctx.stop = self._input.LT(-1)
            self.state = 94
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,8,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 92
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
                    if la_ == 1:
                        localctx = llullParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 80
                        if not self.precpred(self._ctx, 5):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 5)")
                        self.state = 81
                        self.match(llullParser.DIV)
                        self.state = 82
                        self.expr(6)
                        pass

                    elif la_ == 2:
                        localctx = llullParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 83
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 84
                        self.match(llullParser.MUL)
                        self.state = 85
                        self.expr(5)
                        pass

                    elif la_ == 3:
                        localctx = llullParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 86
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 87
                        self.match(llullParser.RES)
                        self.state = 88
                        self.expr(4)
                        pass

                    elif la_ == 4:
                        localctx = llullParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 89
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 90
                        self.match(llullParser.MES)
                        self.state = 91
                        self.expr(3)
                        pass

             
                self.state = 96
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,8,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[8] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 5)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 4)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 3)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 2)
         




