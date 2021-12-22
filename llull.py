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

if len(sys.argv) == 2:
    visitor = EvalVisitor(symbols)
    visitor.visit(tree)
else:
    visitor = EvalVisitor(symbols, sys.argv[2], [int(param) for param in sys.argv[3:]])
    visitor.visit(tree)
