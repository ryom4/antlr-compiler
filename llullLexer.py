# Generated from llull.g4 by ANTLR 4.9
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f")
        buf.write("9\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2\3\2\3\3\6\3\33")
        buf.write("\n\3\r\3\16\3\34\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3")
        buf.write("\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13\64")
        buf.write("\n\13\r\13\16\13\65\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13")
        buf.write("\7\r\b\17\t\21\n\23\13\25\f\3\2\5\3\2c|\3\2\62;\4\2\f")
        buf.write("\f\"\"\2:\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2")
        buf.write("\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2")
        buf.write("\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\32\3\2\2\2")
        buf.write("\7\36\3\2\2\2\t \3\2\2\2\13\"\3\2\2\2\r$\3\2\2\2\17&\3")
        buf.write("\2\2\2\21)\3\2\2\2\23,\3\2\2\2\25\63\3\2\2\2\27\30\t\2")
        buf.write("\2\2\30\4\3\2\2\2\31\33\t\3\2\2\32\31\3\2\2\2\33\34\3")
        buf.write("\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\6\3\2\2\2\36\37")
        buf.write("\7-\2\2\37\b\3\2\2\2 !\7/\2\2!\n\3\2\2\2\"#\7,\2\2#\f")
        buf.write("\3\2\2\2$%\7\61\2\2%\16\3\2\2\2&\'\7,\2\2\'(\7,\2\2(\20")
        buf.write("\3\2\2\2)*\7<\2\2*+\7?\2\2+\22\3\2\2\2,-\7y\2\2-.\7t\2")
        buf.write("\2./\7k\2\2/\60\7v\2\2\60\61\7g\2\2\61\24\3\2\2\2\62\64")
        buf.write("\t\4\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65")
        buf.write("\66\3\2\2\2\66\67\3\2\2\2\678\b\13\2\28\26\3\2\2\2\5\2")
        buf.write("\34\65\3\b\2\2")
        return buf.getvalue()


class llullLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    CAR = 1
    INT = 2
    MES = 3
    RES = 4
    MUL = 5
    DIV = 6
    POT = 7
    IG = 8
    WR = 9
    WS = 10

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'+'", "'-'", "'*'", "'/'", "'**'", "':='", "'write'" ]

    symbolicNames = [ "<INVALID>",
            "CAR", "INT", "MES", "RES", "MUL", "DIV", "POT", "IG", "WR", 
            "WS" ]

    ruleNames = [ "CAR", "INT", "MES", "RES", "MUL", "DIV", "POT", "IG", 
                  "WR", "WS" ]

    grammarFileName = "llull.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


