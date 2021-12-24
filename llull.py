import sys
from antlr4 import *
from llullLexer import llullLexer
from llullParser import llullParser
from EvalVisitor import EvalVisitor, llullExceptions
from SymbolsVisitor import SymbolsVisitor

input_stream = FileStream(sys.argv[1])
lexer = llullLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = llullParser(token_stream)
tree = parser.root()

symbolsVisitor = SymbolsVisitor()
try:
    symbols = symbolsVisitor.visit(tree)
except llullExceptions as excpt:
    print(excpt.missatge)
    exit()

if len(sys.argv) == 2:
    visitor = EvalVisitor(symbols)
    try:
        visitor.visit(tree)
    except llullExceptions as excpt:
        print(excpt.missatge) 
else:
    visitor = EvalVisitor(symbols, sys.argv[2], [int(param) for param in sys.argv[3:]])
    try:
        visitor.visit(tree)
    except llullExceptions as excpt:
        print(excpt.missatge)
    
