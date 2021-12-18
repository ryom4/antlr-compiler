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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f")
        buf.write("\66\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3")
        buf.write("\2\3\3\3\3\3\3\7\3\23\n\3\f\3\16\3\26\13\3\3\4\3\4\3\4")
        buf.write("\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3")
        buf.write("\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\61\n\6\f\6\16\6")
        buf.write("\64\13\6\3\6\2\3\n\7\2\4\6\b\n\2\2\28\2\f\3\2\2\2\4\24")
        buf.write("\3\2\2\2\6\27\3\2\2\2\b\33\3\2\2\2\n\36\3\2\2\2\f\r\5")
        buf.write("\4\3\2\r\16\7\2\2\3\16\3\3\2\2\2\17\23\5\6\4\2\20\23\5")
        buf.write("\n\6\2\21\23\5\b\5\2\22\17\3\2\2\2\22\20\3\2\2\2\22\21")
        buf.write("\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25")
        buf.write("\5\3\2\2\2\26\24\3\2\2\2\27\30\7\3\2\2\30\31\7\n\2\2\31")
        buf.write("\32\5\n\6\2\32\7\3\2\2\2\33\34\7\13\2\2\34\35\7\3\2\2")
        buf.write("\35\t\3\2\2\2\36\37\b\6\1\2\37 \7\4\2\2 \62\3\2\2\2!\"")
        buf.write("\f\b\2\2\"#\7\t\2\2#\61\5\n\6\b$%\f\7\2\2%&\7\b\2\2&\61")
        buf.write("\5\n\6\b\'(\f\6\2\2()\7\7\2\2)\61\5\n\6\7*+\f\5\2\2+,")
        buf.write("\7\6\2\2,\61\5\n\6\6-.\f\4\2\2./\7\5\2\2/\61\5\n\6\5\60")
        buf.write("!\3\2\2\2\60$\3\2\2\2\60\'\3\2\2\2\60*\3\2\2\2\60-\3\2")
        buf.write("\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\13\3")
        buf.write("\2\2\2\64\62\3\2\2\2\6\22\24\60\62")
        return buf.getvalue()


class llullParser ( Parser ):

    grammarFileName = "llull.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "'+'", "'-'", 
                     "'*'", "'/'", "'**'", "':='", "'write'" ]

    symbolicNames = [ "<INVALID>", "CAR", "INT", "MES", "RES", "MUL", "DIV", 
                      "POT", "IG", "WR", "WS" ]

    RULE_root = 0
    RULE_program = 1
    RULE_ass = 2
    RULE_write = 3
    RULE_expr = 4

    ruleNames =  [ "root", "program", "ass", "write", "expr" ]

    EOF = Token.EOF
    CAR=1
    INT=2
    MES=3
    RES=4
    MUL=5
    DIV=6
    POT=7
    IG=8
    WR=9
    WS=10

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
            self.state = 10
            self.program()
            self.state = 11
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

        def ass(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(llullParser.AssContext)
            else:
                return self.getTypedRuleContext(llullParser.AssContext,i)


        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(llullParser.ExprContext)
            else:
                return self.getTypedRuleContext(llullParser.ExprContext,i)


        def write(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(llullParser.WriteContext)
            else:
                return self.getTypedRuleContext(llullParser.WriteContext,i)


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
            self.state = 18
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << llullParser.CAR) | (1 << llullParser.INT) | (1 << llullParser.WR))) != 0):
                self.state = 16
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [llullParser.CAR]:
                    self.state = 13
                    self.ass()
                    pass
                elif token in [llullParser.INT]:
                    self.state = 14
                    self.expr(0)
                    pass
                elif token in [llullParser.WR]:
                    self.state = 15
                    self.write()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 20
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

        def CAR(self):
            return self.getToken(llullParser.CAR, 0)

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
        self.enterRule(localctx, 4, self.RULE_ass)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 21
            self.match(llullParser.CAR)
            self.state = 22
            self.match(llullParser.IG)
            self.state = 23
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

        def CAR(self):
            return self.getToken(llullParser.CAR, 0)

        def getRuleIndex(self):
            return llullParser.RULE_write

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWrite" ):
                return visitor.visitWrite(self)
            else:
                return visitor.visitChildren(self)




    def write(self):

        localctx = llullParser.WriteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_write)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 25
            self.match(llullParser.WR)
            self.state = 26
            self.match(llullParser.CAR)
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


        def POT(self):
            return self.getToken(llullParser.POT, 0)

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
        _startState = 8
        self.enterRecursionRule(localctx, 8, self.RULE_expr, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 29
            self.match(llullParser.INT)
            self._ctx.stop = self._input.LT(-1)
            self.state = 48
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,3,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 46
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
                    if la_ == 1:
                        localctx = llullParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 31
                        if not self.precpred(self._ctx, 6):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 6)")
                        self.state = 32
                        self.match(llullParser.POT)
                        self.state = 33
                        self.expr(6)
                        pass

                    elif la_ == 2:
                        localctx = llullParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 34
                        if not self.precpred(self._ctx, 5):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 5)")
                        self.state = 35
                        self.match(llullParser.DIV)
                        self.state = 36
                        self.expr(6)
                        pass

                    elif la_ == 3:
                        localctx = llullParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 37
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 38
                        self.match(llullParser.MUL)
                        self.state = 39
                        self.expr(5)
                        pass

                    elif la_ == 4:
                        localctx = llullParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 40
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 41
                        self.match(llullParser.RES)
                        self.state = 42
                        self.expr(4)
                        pass

                    elif la_ == 5:
                        localctx = llullParser.ExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 43
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 44
                        self.match(llullParser.MES)
                        self.state = 45
                        self.expr(3)
                        pass

             
                self.state = 50
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,3,self._ctx)

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
        self._predicates[4] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 6)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 5)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 4)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 3)
         

            if predIndex == 4:
                return self.precpred(self._ctx, 2)
         




