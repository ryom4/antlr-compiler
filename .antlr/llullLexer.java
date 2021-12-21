// Generated from /home/mario/Mario/lp/llull.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class llullLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, FOR=3, WHILE=4, ELSE=5, IF=6, WR=7, VOID=8, INT=9, ID=10, 
		MES=11, RES=12, MUL=13, DIV=14, STRING=15, LP=16, RP=17, LB=18, RB=19, 
		IG=20, IGUAL=21, DIFERENCIA=22, MENOR=23, MAJOR=24, MENORIGUAL=25, MAJORIGUAL=26, 
		COMM=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "FOR", "WHILE", "ELSE", "IF", "WR", "VOID", "INT", "ID", 
			"MES", "RES", "MUL", "DIV", "STRING", "LP", "RP", "LB", "RB", "IG", "IGUAL", 
			"DIFERENCIA", "MENOR", "MAJOR", "MENORIGUAL", "MAJORIGUAL", "COMM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "';'", "'for'", "'while'", "'else'", "'if'", "'write'", 
			"'void'", null, null, "'+'", "'-'", "'*'", "'/'", null, "'('", "')'", 
			"'{'", "'}'", "'='", "'=='", "'<>'", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "FOR", "WHILE", "ELSE", "IF", "WR", "VOID", "INT", 
			"ID", "MES", "RES", "MUL", "DIV", "STRING", "LP", "RP", "LB", "RB", "IG", 
			"IGUAL", "DIFERENCIA", "MENOR", "MAJOR", "MENORIGUAL", "MAJORIGUAL", 
			"COMM", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public llullLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "llull.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\6\n^\n\n\r\n\16\n_\3\13\6\13"+
		"c\n\13\r\13\16\13d\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\5\20"+
		"q\n\20\3\20\3\20\3\20\7\20v\n\20\f\20\16\20y\13\20\3\20\5\20|\n\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\7\34\u009c\n\34\f\34\16\34\u009f\13\34\3\34\3\34\3\35\6\35\u00a4"+
		"\n\35\r\35\16\35\u00a5\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36\3\2\6\3\2\62;\3\2c|\4\2\f\f\17\17"+
		"\5\2\f\f\17\17\"\"\2\u00af\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tC\3\2\2\2\13I\3"+
		"\2\2\2\rN\3\2\2\2\17Q\3\2\2\2\21W\3\2\2\2\23]\3\2\2\2\25b\3\2\2\2\27f"+
		"\3\2\2\2\31h\3\2\2\2\33j\3\2\2\2\35l\3\2\2\2\37n\3\2\2\2!\177\3\2\2\2"+
		"#\u0081\3\2\2\2%\u0083\3\2\2\2\'\u0085\3\2\2\2)\u0087\3\2\2\2+\u0089\3"+
		"\2\2\2-\u008c\3\2\2\2/\u008f\3\2\2\2\61\u0091\3\2\2\2\63\u0093\3\2\2\2"+
		"\65\u0096\3\2\2\2\67\u0099\3\2\2\29\u00a3\3\2\2\2;<\7.\2\2<\4\3\2\2\2"+
		"=>\7=\2\2>\6\3\2\2\2?@\7h\2\2@A\7q\2\2AB\7t\2\2B\b\3\2\2\2CD\7y\2\2DE"+
		"\7j\2\2EF\7k\2\2FG\7n\2\2GH\7g\2\2H\n\3\2\2\2IJ\7g\2\2JK\7n\2\2KL\7u\2"+
		"\2LM\7g\2\2M\f\3\2\2\2NO\7k\2\2OP\7h\2\2P\16\3\2\2\2QR\7y\2\2RS\7t\2\2"+
		"ST\7k\2\2TU\7v\2\2UV\7g\2\2V\20\3\2\2\2WX\7x\2\2XY\7q\2\2YZ\7k\2\2Z[\7"+
		"f\2\2[\22\3\2\2\2\\^\t\2\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2"+
		"`\24\3\2\2\2ac\t\3\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\26\3\2"+
		"\2\2fg\7-\2\2g\30\3\2\2\2hi\7/\2\2i\32\3\2\2\2jk\7,\2\2k\34\3\2\2\2lm"+
		"\7\61\2\2m\36\3\2\2\2np\7$\2\2oq\7\"\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2"+
		"rw\5\25\13\2st\7\"\2\2tv\5\25\13\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2"+
		"\2\2x{\3\2\2\2yw\3\2\2\2z|\7\"\2\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7$"+
		"\2\2~ \3\2\2\2\177\u0080\7*\2\2\u0080\"\3\2\2\2\u0081\u0082\7+\2\2\u0082"+
		"$\3\2\2\2\u0083\u0084\7}\2\2\u0084&\3\2\2\2\u0085\u0086\7\177\2\2\u0086"+
		"(\3\2\2\2\u0087\u0088\7?\2\2\u0088*\3\2\2\2\u0089\u008a\7?\2\2\u008a\u008b"+
		"\7?\2\2\u008b,\3\2\2\2\u008c\u008d\7>\2\2\u008d\u008e\7@\2\2\u008e.\3"+
		"\2\2\2\u008f\u0090\7>\2\2\u0090\60\3\2\2\2\u0091\u0092\7@\2\2\u0092\62"+
		"\3\2\2\2\u0093\u0094\7>\2\2\u0094\u0095\7?\2\2\u0095\64\3\2\2\2\u0096"+
		"\u0097\7@\2\2\u0097\u0098\7?\2\2\u0098\66\3\2\2\2\u0099\u009d\7%\2\2\u009a"+
		"\u009c\n\4\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a1\b\34\2\2\u00a18\3\2\2\2\u00a2\u00a4\t\5\2\2\u00a3\u00a2\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a8\b\35\2\2\u00a8:\3\2\2\2\n\2_dpw{\u009d\u00a5\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}