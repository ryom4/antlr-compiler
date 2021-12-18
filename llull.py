import sys
from antlr4 import *
from llullLexer import llullLexer
from llullParser import llullParser
from EvalVisitor import EvalVisitor

input_stream = FileStream(sys.argv[1])
#input_stream = InputStream(input('? '))
lexer = llullLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = llullParser(token_stream)
tree = parser.root()

visitor = EvalVisitor()
visitor.visit(tree)
