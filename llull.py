import sys
from antlr4 import *
from llullLexer import llullLexer
from llullParser import llullParser
from EvalVisitor import EvalVisitor
from SymbolsVisitor import SymbolsVisitor

input_stream = FileStream(sys.argv[1])
#input_stream = InputStream(input('? '))
lexer = llullLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = llullParser(token_stream)
tree = parser.root()

symbolsVisitor = SymbolsVisitor()
symbols = symbolsVisitor.visit(tree)

visitor = EvalVisitor(symbols)
visitor.visit(tree)
