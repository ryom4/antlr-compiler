# Generated from llull.g4 by ANTLR 4.9
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23")
        buf.write("Z\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\3\2\3\2")
        buf.write("\3\2\3\2\3\2\3\3\3\3\3\4\6\4.\n\4\r\4\16\4/\3\5\3\5\3")
        buf.write("\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3")
        buf.write("\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17")
        buf.write("\3\20\6\20N\n\20\r\20\16\20O\3\21\3\21\3\22\6\22U\n\22")
        buf.write("\r\22\16\22V\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b")
        buf.write("\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22")
        buf.write("#\23\3\2\5\3\2\62;\3\2c|\5\2\f\f\17\17\"\"\2\\\2\3\3\2")
        buf.write("\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2")
        buf.write("\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2")
        buf.write("\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35")
        buf.write("\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2")
        buf.write("\5*\3\2\2\2\7-\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65")
        buf.write("\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25>\3\2")
        buf.write("\2\2\27@\3\2\2\2\31B\3\2\2\2\33D\3\2\2\2\35F\3\2\2\2\37")
        buf.write("M\3\2\2\2!Q\3\2\2\2#T\3\2\2\2%&\7x\2\2&\'\7q\2\2\'(\7")
        buf.write("k\2\2()\7f\2\2)\4\3\2\2\2*+\7.\2\2+\6\3\2\2\2,.\t\2\2")
        buf.write("\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\b\3\2")
        buf.write("\2\2\61\62\t\3\2\2\62\n\3\2\2\2\63\64\7-\2\2\64\f\3\2")
        buf.write("\2\2\65\66\7/\2\2\66\16\3\2\2\2\678\7,\2\28\20\3\2\2\2")
        buf.write("9:\7\61\2\2:\22\3\2\2\2;<\7,\2\2<=\7,\2\2=\24\3\2\2\2")
        buf.write(">?\7*\2\2?\26\3\2\2\2@A\7+\2\2A\30\3\2\2\2BC\7}\2\2C\32")
        buf.write("\3\2\2\2DE\7\177\2\2E\34\3\2\2\2FG\7y\2\2GH\7t\2\2HI\7")
        buf.write("k\2\2IJ\7v\2\2JK\7g\2\2K\36\3\2\2\2LN\5\t\5\2ML\3\2\2")
        buf.write("\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P \3\2\2\2QR\7?\2\2R\"")
        buf.write("\3\2\2\2SU\t\4\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2")
        buf.write("\2\2WX\3\2\2\2XY\b\22\2\2Y$\3\2\2\2\6\2/OV\3\b\2\2")
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
    POT = 9
    LP = 10
    RP = 11
    LB = 12
    RB = 13
    WR = 14
    PROCNAME = 15
    IG = 16
    WS = 17

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'void'", "','", "'+'", "'-'", "'*'", "'/'", "'**'", "'('", 
            "')'", "'{'", "'}'", "'write'", "'='" ]

    symbolicNames = [ "<INVALID>",
            "INT", "VAR", "MES", "RES", "MUL", "DIV", "POT", "LP", "RP", 
            "LB", "RB", "WR", "PROCNAME", "IG", "WS" ]

    ruleNames = [ "T__0", "T__1", "INT", "VAR", "MES", "RES", "MUL", "DIV", 
                  "POT", "LP", "RP", "LB", "RB", "WR", "PROCNAME", "IG", 
                  "WS" ]

    grammarFileName = "llull.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


