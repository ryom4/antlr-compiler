// Generated from /home/mario/Mario/lp/llull.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class llullParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, INT=3, VAR=4, MES=5, RES=6, MUL=7, DIV=8, POT=9, LP=10, 
		RP=11, LB=12, RB=13, WR=14, PROCNAME=15, IG=16, WS=17;
	public static final int
		RULE_root = 0, RULE_program = 1, RULE_procCall = 2, RULE_proc = 3, RULE_statements = 4, 
		RULE_ass = 5, RULE_write = 6, RULE_expr = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "program", "procCall", "proc", "statements", "ass", "write", 
			"expr"
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

	@Override
	public String getGrammarFileName() { return "llull.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public llullParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(llullParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			program();
			setState(17);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19);
				proc();
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcCallContext extends ParserRuleContext {
		public TerminalNode PROCNAME() { return getToken(llullParser.PROCNAME, 0); }
		public TerminalNode LP() { return getToken(llullParser.LP, 0); }
		public TerminalNode RP() { return getToken(llullParser.RP, 0); }
		public ProcCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procCall; }
	}

	public final ProcCallContext procCall() throws RecognitionException {
		ProcCallContext _localctx = new ProcCallContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_procCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(PROCNAME);
			setState(25);
			match(LP);
			setState(26);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcContext extends ParserRuleContext {
		public TerminalNode PROCNAME() { return getToken(llullParser.PROCNAME, 0); }
		public TerminalNode LP() { return getToken(llullParser.LP, 0); }
		public TerminalNode RP() { return getToken(llullParser.RP, 0); }
		public TerminalNode LB() { return getToken(llullParser.LB, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RB() { return getToken(llullParser.RB, 0); }
		public List<TerminalNode> VAR() { return getTokens(llullParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(llullParser.VAR, i);
		}
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_proc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(29);
			match(PROCNAME);
			setState(30);
			match(LP);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(31);
				match(VAR);
				setState(32);
				match(T__1);
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VAR) {
					{
					{
					setState(33);
					match(VAR);
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(41);
			match(RP);
			setState(42);
			match(LB);
			setState(43);
			statements();
			setState(44);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<WriteContext> write() {
			return getRuleContexts(WriteContext.class);
		}
		public WriteContext write(int i) {
			return getRuleContext(WriteContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<AssContext> ass() {
			return getRuleContexts(AssContext.class);
		}
		public AssContext ass(int i) {
			return getRuleContext(AssContext.class,i);
		}
		public List<ProcCallContext> procCall() {
			return getRuleContexts(ProcCallContext.class);
		}
		public ProcCallContext procCall(int i) {
			return getRuleContext(ProcCallContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << VAR) | (1L << WR) | (1L << PROCNAME))) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WR:
					{
					setState(46);
					write();
					}
					break;
				case INT:
					{
					setState(47);
					expr(0);
					}
					break;
				case VAR:
					{
					setState(48);
					ass();
					}
					break;
				case PROCNAME:
					{
					setState(49);
					procCall();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(llullParser.VAR, 0); }
		public TerminalNode IG() { return getToken(llullParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ass; }
	}

	public final AssContext ass() throws RecognitionException {
		AssContext _localctx = new AssContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(VAR);
			setState(56);
			match(IG);
			setState(57);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WR() { return getToken(llullParser.WR, 0); }
		public TerminalNode LP() { return getToken(llullParser.LP, 0); }
		public TerminalNode VAR() { return getToken(llullParser.VAR, 0); }
		public TerminalNode RP() { return getToken(llullParser.RP, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(WR);
			setState(60);
			match(LP);
			setState(61);
			match(VAR);
			setState(62);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(llullParser.INT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(llullParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(llullParser.MUL, 0); }
		public TerminalNode RES() { return getToken(llullParser.RES, 0); }
		public TerminalNode MES() { return getToken(llullParser.MES, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(65);
			match(INT);
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(79);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(67);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(68);
						match(DIV);
						setState(69);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(70);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(71);
						match(MUL);
						setState(72);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(73);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(74);
						match(RES);
						setState(75);
						expr(4);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(76);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(77);
						match(MES);
						setState(78);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23W\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\6\3"+
		"\27\n\3\r\3\16\3\30\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5%\n\5\f"+
		"\5\16\5(\13\5\5\5*\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\65\n\6"+
		"\f\6\16\68\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tR\n\t\f\t\16\tU\13\t\3\t"+
		"\2\3\20\n\2\4\6\b\n\f\16\20\2\2\2Y\2\22\3\2\2\2\4\26\3\2\2\2\6\32\3\2"+
		"\2\2\b\36\3\2\2\2\n\66\3\2\2\2\f9\3\2\2\2\16=\3\2\2\2\20B\3\2\2\2\22\23"+
		"\5\4\3\2\23\24\7\2\2\3\24\3\3\2\2\2\25\27\5\b\5\2\26\25\3\2\2\2\27\30"+
		"\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\5\3\2\2\2\32\33\7\21\2\2\33\34"+
		"\7\f\2\2\34\35\7\r\2\2\35\7\3\2\2\2\36\37\7\3\2\2\37 \7\21\2\2 )\7\f\2"+
		"\2!\"\7\6\2\2\"&\7\4\2\2#%\7\6\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3"+
		"\2\2\2\'*\3\2\2\2(&\3\2\2\2)!\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\r\2\2,-"+
		"\7\16\2\2-.\5\n\6\2./\7\17\2\2/\t\3\2\2\2\60\65\5\16\b\2\61\65\5\20\t"+
		"\2\62\65\5\f\7\2\63\65\5\6\4\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2"+
		"\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\13\3\2\2\2"+
		"8\66\3\2\2\29:\7\6\2\2:;\7\22\2\2;<\5\20\t\2<\r\3\2\2\2=>\7\20\2\2>?\7"+
		"\f\2\2?@\7\6\2\2@A\7\r\2\2A\17\3\2\2\2BC\b\t\1\2CD\7\5\2\2DS\3\2\2\2E"+
		"F\f\7\2\2FG\7\n\2\2GR\5\20\t\bHI\f\6\2\2IJ\7\t\2\2JR\5\20\t\7KL\f\5\2"+
		"\2LM\7\b\2\2MR\5\20\t\6NO\f\4\2\2OP\7\7\2\2PR\5\20\t\5QE\3\2\2\2QH\3\2"+
		"\2\2QK\3\2\2\2QN\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\21\3\2\2\2US\3"+
		"\2\2\2\t\30&)\64\66QS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}