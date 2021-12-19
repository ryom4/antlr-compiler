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
		T__0=1, T__1=2, INT=3, VAR=4, MES=5, RES=6, MUL=7, DIV=8, POT=9, LP=10, 
		RP=11, LB=12, RB=13, WR=14, PROCNAME=15, IG=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "INT", "VAR", "MES", "RES", "MUL", "DIV", "POT", "LP", 
			"RP", "LB", "RB", "WR", "PROCNAME", "IG", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "','", null, null, "'+'", "'-'", "'*'", "'/'", "'**'", 
			"'('", "')'", "'{'", "'}'", "'write'", null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "INT", "VAR", "MES", "RES", "MUL", "DIV", "POT", "LP", 
			"RP", "LB", "RB", "WR", "PROCNAME", "IG", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23Z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\6\4.\n\4\r\4\16\4/\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20N\n\20\r\20\16\20O\3\21\3\21\3"+
		"\22\6\22U\n\22\r\22\16\22V\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\5\3\2\62;"+
		"\3\2c|\5\2\f\f\17\17\"\"\2\\\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5*\3\2\2\2\7-\3\2\2\2\t\61\3"+
		"\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23;\3\2\2"+
		"\2\25>\3\2\2\2\27@\3\2\2\2\31B\3\2\2\2\33D\3\2\2\2\35F\3\2\2\2\37M\3\2"+
		"\2\2!Q\3\2\2\2#T\3\2\2\2%&\7x\2\2&\'\7q\2\2\'(\7k\2\2()\7f\2\2)\4\3\2"+
		"\2\2*+\7.\2\2+\6\3\2\2\2,.\t\2\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3"+
		"\2\2\2\60\b\3\2\2\2\61\62\t\3\2\2\62\n\3\2\2\2\63\64\7-\2\2\64\f\3\2\2"+
		"\2\65\66\7/\2\2\66\16\3\2\2\2\678\7,\2\28\20\3\2\2\29:\7\61\2\2:\22\3"+
		"\2\2\2;<\7,\2\2<=\7,\2\2=\24\3\2\2\2>?\7*\2\2?\26\3\2\2\2@A\7+\2\2A\30"+
		"\3\2\2\2BC\7}\2\2C\32\3\2\2\2DE\7\177\2\2E\34\3\2\2\2FG\7y\2\2GH\7t\2"+
		"\2HI\7k\2\2IJ\7v\2\2JK\7g\2\2K\36\3\2\2\2LN\5\t\5\2ML\3\2\2\2NO\3\2\2"+
		"\2OM\3\2\2\2OP\3\2\2\2P \3\2\2\2QR\7?\2\2R\"\3\2\2\2SU\t\4\2\2TS\3\2\2"+
		"\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\b\22\2\2Y$\3\2\2\2\6\2/O"+
		"V\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}