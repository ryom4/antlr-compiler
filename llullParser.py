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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23")
        buf.write("W\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\3\2\3\2\3\2\3\3\6\3\27\n\3\r\3\16\3\30\3")
        buf.write("\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5%\n\5\f\5\16")
        buf.write("\5(\13\5\5\5*\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6")
        buf.write("\7\6\65\n\6\f\6\16\68\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b")
        buf.write("\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3")
        buf.write("\t\3\t\3\t\3\t\7\tR\n\t\f\t\16\tU\13\t\3\t\2\3\20\n\2")
        buf.write("\4\6\b\n\f\16\20\2\2\2Y\2\22\3\2\2\2\4\26\3\2\2\2\6\32")
        buf.write("\3\2\2\2\b\36\3\2\2\2\n\66\3\2\2\2\f9\3\2\2\2\16=\3\2")
        buf.write("\2\2\20B\3\2\2\2\22\23\5\4\3\2\23\24\7\2\2\3\24\3\3\2")
        buf.write("\2\2\25\27\5\b\5\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3")
        buf.write("\2\2\2\30\31\3\2\2\2\31\5\3\2\2\2\32\33\7\21\2\2\33\34")
        buf.write("\7\f\2\2\34\35\7\r\2\2\35\7\3\2\2\2\36\37\7\3\2\2\37 ")
        buf.write("\7\21\2\2 )\7\f\2\2!\"\7\6\2\2\"&\7\4\2\2#%\7\6\2\2$#")
        buf.write("\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'*\3\2\2\2(&\3")
        buf.write("\2\2\2)!\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\r\2\2,-\7\16")
        buf.write("\2\2-.\5\n\6\2./\7\17\2\2/\t\3\2\2\2\60\65\5\16\b\2\61")
        buf.write("\65\5\20\t\2\62\65\5\f\7\2\63\65\5\6\4\2\64\60\3\2\2\2")
        buf.write("\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\658\3\2\2\2")
        buf.write("\66\64\3\2\2\2\66\67\3\2\2\2\67\13\3\2\2\28\66\3\2\2\2")
        buf.write("9:\7\6\2\2:;\7\22\2\2;<\5\20\t\2<\r\3\2\2\2=>\7\20\2\2")
        buf.write(">?\7\f\2\2?@\7\6\2\2@A\7\r\2\2A\17\3\2\2\2BC\b\t\1\2C")
        buf.write("D\7\5\2\2DS\3\2\2\2EF\f\7\2\2FG\7\n\2\2GR\5\20\t\bHI\f")
        buf.write("\6\2\2IJ\7\t\2\2JR\5\20\t\7KL\f\5\2\2LM\7\b\2\2MR\5\20")
        buf.write("\t\6NO\f\4\2\2OP\7\7\2\2PR\5\20\t\5QE\3\2\2\2QH\3\2\2")
        buf.write("\2QK\3\2\2\2QN\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T")
        buf.write("\21\3\2\2\2US\3\2\2\2\t\30&)\64\66QS")
        return buf.getvalue()


class llullParser ( Parser ):

    grammarFileName = "llull.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'void'", "','", "<INVALID>", "<INVALID>", 
                     "'+'", "'-'", "'*'", "'/'", "'**'", "'('", "')'", "'{'", 
                     "'}'", "'write'", "<INVALID>", "'='" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "INT", "VAR", 
                      "MES", "RES", "MUL", "DIV", "POT", "LP", "RP", "LB", 
                      "RB", "WR", "PROCNAME", "IG", "WS" ]

    RULE_root = 0
    RULE_program = 1
    RULE_procCall = 2
    RULE_proc = 3
    RULE_statements = 4
    RULE_ass = 5
    RULE_write = 6
    RULE_expr = 7

    ruleNames =  [ "root", "program", "procCall", "proc", "statements", 
                   "ass", "write", "expr" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    INT=3
    VAR=4
    MES=5
    RES=6
    MUL=7
    DIV=8
    POT=9
    LP=10
    RP=11
    LB=12
    RB=13
    WR=14
    PROCNAME=15
    IG=16
    WS=17

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
            self.state = 16
            self.program()
            self.state = 17
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
            self.state = 20 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 19
                self.proc()
                self.state = 22 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==llullParser.T__0):
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
            self.state = 24
            self.match(llullParser.PROCNAME)
            self.state = 25
            self.match(llullParser.LP)
            self.state = 26
            self.match(llullParser.RP)
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
        self.enterRule(localctx, 6, self.RULE_proc)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 28
            self.match(llullParser.T__0)
            self.state = 29
            self.match(llullParser.PROCNAME)
            self.state = 30
            self.match(llullParser.LP)
            self.state = 39
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==llullParser.VAR:
                self.state = 31
                self.match(llullParser.VAR)
                self.state = 32
                self.match(llullParser.T__1)
                self.state = 36
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==llullParser.VAR:
                    self.state = 33
                    self.match(llullParser.VAR)
                    self.state = 38
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 41
            self.match(llullParser.RP)
            self.state = 42
            self.match(llullParser.LB)
            self.state = 43
            self.statements()
            self.state = 44
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
        self.enterRule(localctx, 8, self.RULE_statements)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 52
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << llullParser.INT) | (1 << llullParser.VAR) | (1 << llullParser.WR) | (1 << llullParser.PROCNAME))) != 0):
                self.state = 50
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [llullParser.WR]:
                    self.state = 46
                    self.write()
                    pass
                elif token in [llullParser.INT]:
                    self.state = 47
                    self.expr(0)
                    pass
                elif token in [llullParser.VAR]:
                    self.state = 48
                    self.ass()
                    pass
                elif token in [llullParser.PROCNAME]:
                    self.state = 49
                    self.procCall()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 54
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
        self.enterRule(localctx, 10, self.RULE_ass)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 55
            self.match(llullParser.VAR)
            self.state = 56
            self.match(llullParser.IG)
            self.state = 57
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
        self.enterRule(localctx, 12, self.RULE_write)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 59
            self.match(llullParser.WR)
            self.state = 60
            self.match(llullParser.LP)
            self.state = 61
            self.match(llullParser.VAR)
            self.state = 62
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
        _startState = 14
        self.enterRecursionRule(localctx, 14, self.RULE_expr, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 65
            self.match(llullParser.INT)
            self._ctx.stop = self._input.LT(-1)
            self.state = 81
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,6,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 79
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
                    if la_ == 1:
                        localctx = llullParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 67
                        if not self.precpred(self._ctx, 5):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 5)")
                        self.state = 68
                        self.match(llullParser.DIV)
                        self.state = 69
                        self.expr(6)
                        pass

                    elif la_ == 2:
                        localctx = llullParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 70
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 71
                        self.match(llullParser.MUL)
                        self.state = 72
                        self.expr(5)
                        pass

                    elif la_ == 3:
                        localctx = llullParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 73
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 74
                        self.match(llullParser.RES)
                        self.state = 75
                        self.expr(4)
                        pass

                    elif la_ == 4:
                        localctx = llullParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 76
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 77
                        self.match(llullParser.MES)
                        self.state = 78
                        self.expr(3)
                        pass

             
                self.state = 83
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,6,self._ctx)

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
        self._predicates[7] = self.expr_sempred
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
         




