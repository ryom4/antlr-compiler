# Generated from llull.g4 by ANTLR 4.9
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22")
        buf.write("U\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\3\3\3\3")
        buf.write("\3\3\3\3\3\3\4\6\4,\n\4\r\4\16\4-\3\5\3\5\3\6\3\6\3\7")
        buf.write("\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r")
        buf.write("\3\16\3\16\3\16\3\16\3\16\3\16\3\17\6\17I\n\17\r\17\16")
        buf.write("\17J\3\20\3\20\3\21\6\21P\n\21\r\21\16\21Q\3\21\3\21\2")
        buf.write("\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27")
        buf.write("\r\31\16\33\17\35\20\37\21!\22\3\2\5\3\2\62;\3\2c|\5\2")
        buf.write("\f\f\17\17\"\"\2W\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2")
        buf.write("\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21")
        buf.write("\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3")
        buf.write("\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2")
        buf.write("\2\3#\3\2\2\2\5%\3\2\2\2\7+\3\2\2\2\t/\3\2\2\2\13\61\3")
        buf.write("\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\21\67\3\2\2\2\239\3")
        buf.write("\2\2\2\25;\3\2\2\2\27=\3\2\2\2\31?\3\2\2\2\33A\3\2\2\2")
        buf.write("\35H\3\2\2\2\37L\3\2\2\2!O\3\2\2\2#$\7.\2\2$\4\3\2\2\2")
        buf.write("%&\7x\2\2&\'\7q\2\2\'(\7k\2\2()\7f\2\2)\6\3\2\2\2*,\t")
        buf.write("\2\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\b\3\2")
        buf.write("\2\2/\60\t\3\2\2\60\n\3\2\2\2\61\62\7-\2\2\62\f\3\2\2")
        buf.write("\2\63\64\7/\2\2\64\16\3\2\2\2\65\66\7,\2\2\66\20\3\2\2")
        buf.write("\2\678\7\61\2\28\22\3\2\2\29:\7*\2\2:\24\3\2\2\2;<\7+")
        buf.write("\2\2<\26\3\2\2\2=>\7}\2\2>\30\3\2\2\2?@\7\177\2\2@\32")
        buf.write("\3\2\2\2AB\7y\2\2BC\7t\2\2CD\7k\2\2DE\7v\2\2EF\7g\2\2")
        buf.write("F\34\3\2\2\2GI\5\t\5\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2J")
        buf.write("K\3\2\2\2K\36\3\2\2\2LM\7?\2\2M \3\2\2\2NP\t\4\2\2ON\3")
        buf.write("\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\b\21")
        buf.write("\2\2T\"\3\2\2\2\6\2-JQ\3\b\2\2")
        return buf.getvalue()


class llullLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    INT = 3
    VAR = 4
    MES = 5
    RES = 6
    MUL = 7
    DIV = 8
    LP = 9
    RP = 10
    LB = 11
    RB = 12
    WR = 13
    PROCNAME = 14
    IG = 15
    WS = 16

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "','", "'void'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'{'", 
            "'}'", "'write'", "'='" ]

    symbolicNames = [ "<INVALID>",
            "INT", "VAR", "MES", "RES", "MUL", "DIV", "LP", "RP", "LB", 
            "RB", "WR", "PROCNAME", "IG", "WS" ]

    ruleNames = [ "T__0", "T__1", "INT", "VAR", "MES", "RES", "MUL", "DIV", 
                  "LP", "RP", "LB", "RB", "WR", "PROCNAME", "IG", "WS" ]

    grammarFileName = "llull.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


