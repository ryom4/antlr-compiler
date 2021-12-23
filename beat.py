import sys
from antlr4 import *
from llullLexer import llullLexer
from llullParser import llullParser
from PrettyVisitor import PrettyVisitor

input_stream = FileStream(sys.argv[1])
lexer = llullLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = llullParser(token_stream)
tree = parser.root()

PrettyVisitor = PrettyVisitor()
PrettyVisitor.visit(tree)

