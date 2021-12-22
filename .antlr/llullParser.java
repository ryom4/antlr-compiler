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
		T__0=1, T__1=2, READ=3, SET=4, GET=5, ARRAY=6, FOR=7, WHILE=8, ELSE=9, 
		IF=10, WR=11, VOID=12, INT=13, ID=14, MES=15, RES=16, MUL=17, DIV=18, 
		STRING=19, LP=20, RP=21, LB=22, RB=23, IG=24, IGUAL=25, DIFERENCIA=26, 
		MENOR=27, MAJOR=28, MENORIGUAL=29, MAJORIGUAL=30, COMM=31, WS=32;
	public static final int
		RULE_root = 0, RULE_proc = 1, RULE_statements = 2, RULE_procCall = 3, 
		RULE_write = 4, RULE_read = 5, RULE_ass = 6, RULE_array = 7, RULE_setArray = 8, 
		RULE_conditional = 9, RULE_elseConditional = 10, RULE_loop = 11, RULE_forloop = 12, 
		RULE_cond = 13, RULE_expr = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "proc", "statements", "procCall", "write", "read", "ass", "array", 
			"setArray", "conditional", "elseConditional", "loop", "forloop", "cond", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "';'", "'read'", "'set'", "'get'", "'array'", "'for'", "'while'", 
			"'else'", "'if'", "'write'", "'void'", null, null, "'+'", "'-'", "'*'", 
			"'/'", null, "'('", "')'", "'{'", "'}'", "'='", "'=='", "'<>'", "'<'", 
			"'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "READ", "SET", "GET", "ARRAY", "FOR", "WHILE", "ELSE", 
			"IF", "WR", "VOID", "INT", "ID", "MES", "RES", "MUL", "DIV", "STRING", 
			"LP", "RP", "LB", "RB", "IG", "IGUAL", "DIFERENCIA", "MENOR", "MAJOR", 
			"MENORIGUAL", "MAJORIGUAL", "COMM", "WS"
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
		public TerminalNode EOF() { return getToken(llullParser.EOF, 0); }
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				proc();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VOID );
			setState(35);
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

	public static class ProcContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(llullParser.VOID, 0); }
		public List<TerminalNode> ID() { return getTokens(llullParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(llullParser.ID, i);
		}
		public TerminalNode LP() { return getToken(llullParser.LP, 0); }
		public TerminalNode RP() { return getToken(llullParser.RP, 0); }
		public TerminalNode LB() { return getToken(llullParser.LB, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RB() { return getToken(llullParser.RB, 0); }
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_proc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(VOID);
			setState(38);
			match(ID);
			setState(39);
			match(LP);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(40);
				match(ID);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(41);
					match(T__0);
					setState(42);
					match(ID);
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(50);
			match(RP);
			setState(51);
			match(LB);
			setState(52);
			statements();
			setState(53);
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
		public List<ConditionalContext> conditional() {
			return getRuleContexts(ConditionalContext.class);
		}
		public ConditionalContext conditional(int i) {
			return getRuleContext(ConditionalContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<ForloopContext> forloop() {
			return getRuleContexts(ForloopContext.class);
		}
		public ForloopContext forloop(int i) {
			return getRuleContext(ForloopContext.class,i);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<SetArrayContext> setArray() {
			return getRuleContexts(SetArrayContext.class);
		}
		public SetArrayContext setArray(int i) {
			return getRuleContext(SetArrayContext.class,i);
		}
		public List<ReadContext> read() {
			return getRuleContexts(ReadContext.class);
		}
		public ReadContext read(int i) {
			return getRuleContext(ReadContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(55);
					write();
					}
					break;
				case 2:
					{
					setState(56);
					expr(0);
					}
					break;
				case 3:
					{
					setState(57);
					ass();
					}
					break;
				case 4:
					{
					setState(58);
					procCall();
					}
					break;
				case 5:
					{
					setState(59);
					conditional();
					}
					break;
				case 6:
					{
					setState(60);
					loop();
					}
					break;
				case 7:
					{
					setState(61);
					forloop();
					}
					break;
				case 8:
					{
					setState(62);
					array();
					}
					break;
				case 9:
					{
					setState(63);
					setArray();
					}
					break;
				case 10:
					{
					setState(64);
					read();
					}
					break;
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << SET) | (1L << GET) | (1L << ARRAY) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << WR) | (1L << INT) | (1L << ID) | (1L << STRING) | (1L << LP))) != 0) );
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
		public TerminalNode ID() { return getToken(llullParser.ID, 0); }
		public TerminalNode LP() { return getToken(llullParser.LP, 0); }
		public TerminalNode RP() { return getToken(llullParser.RP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProcCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procCall; }
	}

	public final ProcCallContext procCall() throws RecognitionException {
		ProcCallContext _localctx = new ProcCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ID);
			setState(70);
			match(LP);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GET) | (1L << INT) | (1L << ID) | (1L << STRING) | (1L << LP))) != 0)) {
				{
				setState(71);
				expr(0);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(72);
					match(T__0);
					setState(73);
					expr(0);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(81);
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WR() { return getToken(llullParser.WR, 0); }
		public TerminalNode LP() { return getToken(llullParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP() { return getToken(llullParser.RP, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(WR);
			setState(84);
			match(LP);
			setState(85);
			expr(0);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(86);
				match(T__0);
				setState(87);
				expr(0);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(llullParser.READ, 0); }
		public TerminalNode LP() { return getToken(llullParser.LP, 0); }
		public TerminalNode ID() { return getToken(llullParser.ID, 0); }
		public TerminalNode RP() { return getToken(llullParser.RP, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(READ);
			setState(96);
			match(LP);
			setState(97);
			match(ID);
			setState(98);
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

	public static class AssContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(llullParser.ID, 0); }
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
		enterRule(_localctx, 12, RULE_ass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ID);
			setState(101);
			match(IG);
			setState(102);
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(llullParser.ARRAY, 0); }
		public TerminalNode LP() { return getToken(llullParser.LP, 0); }
		public TerminalNode ID() { return getToken(llullParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(llullParser.RP, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ARRAY);
			setState(105);
			match(LP);
			setState(106);
			match(ID);
			setState(107);
			match(T__0);
			setState(108);
			expr(0);
			setState(109);
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

	public static class SetArrayContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(llullParser.SET, 0); }
		public TerminalNode LP() { return getToken(llullParser.LP, 0); }
		public TerminalNode ID() { return getToken(llullParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP() { return getToken(llullParser.RP, 0); }
		public SetArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setArray; }
	}

	public final SetArrayContext setArray() throws RecognitionException {
		SetArrayContext _localctx = new SetArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_setArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(SET);
			setState(112);
			match(LP);
			setState(113);
			match(ID);
			setState(114);
			match(T__0);
			setState(115);
			expr(0);
			setState(116);
			match(T__0);
			setState(117);
			expr(0);
			setState(118);
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(llullParser.IF, 0); }
		public TerminalNode LP() { return getToken(llullParser.LP, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode RP() { return getToken(llullParser.RP, 0); }
		public TerminalNode LB() { return getToken(llullParser.LB, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RB() { return getToken(llullParser.RB, 0); }
		public ElseConditionalContext elseConditional() {
			return getRuleContext(ElseConditionalContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(IF);
			setState(121);
			match(LP);
			setState(122);
			cond();
			setState(123);
			match(RP);
			setState(124);
			match(LB);
			setState(125);
			statements();
			setState(126);
			match(RB);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(127);
				elseConditional();
				}
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

	public static class ElseConditionalContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(llullParser.ELSE, 0); }
		public TerminalNode LB() { return getToken(llullParser.LB, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RB() { return getToken(llullParser.RB, 0); }
		public ElseConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseConditional; }
	}

	public final ElseConditionalContext elseConditional() throws RecognitionException {
		ElseConditionalContext _localctx = new ElseConditionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(ELSE);
			setState(131);
			match(LB);
			setState(132);
			statements();
			setState(133);
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(llullParser.WHILE, 0); }
		public TerminalNode LP() { return getToken(llullParser.LP, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode RP() { return getToken(llullParser.RP, 0); }
		public TerminalNode LB() { return getToken(llullParser.LB, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RB() { return getToken(llullParser.RB, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(WHILE);
			setState(136);
			match(LP);
			setState(137);
			cond();
			setState(138);
			match(RP);
			setState(139);
			match(LB);
			setState(140);
			statements();
			setState(141);
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

	public static class ForloopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(llullParser.FOR, 0); }
		public TerminalNode LP() { return getToken(llullParser.LP, 0); }
		public List<AssContext> ass() {
			return getRuleContexts(AssContext.class);
		}
		public AssContext ass(int i) {
			return getRuleContext(AssContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode RP() { return getToken(llullParser.RP, 0); }
		public TerminalNode LB() { return getToken(llullParser.LB, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RB() { return getToken(llullParser.RB, 0); }
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(FOR);
			setState(144);
			match(LP);
			setState(145);
			ass();
			setState(146);
			match(T__1);
			setState(147);
			cond();
			setState(148);
			match(T__1);
			setState(149);
			ass();
			setState(150);
			match(RP);
			setState(151);
			match(LB);
			setState(152);
			statements();
			setState(153);
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

	public static class CondContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MENOR() { return getToken(llullParser.MENOR, 0); }
		public TerminalNode MAJOR() { return getToken(llullParser.MAJOR, 0); }
		public TerminalNode IGUAL() { return getToken(llullParser.IGUAL, 0); }
		public TerminalNode DIFERENCIA() { return getToken(llullParser.DIFERENCIA, 0); }
		public TerminalNode MENORIGUAL() { return getToken(llullParser.MENORIGUAL, 0); }
		public TerminalNode MAJORIGUAL() { return getToken(llullParser.MAJORIGUAL, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cond);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				expr(0);
				setState(156);
				match(MENOR);
				setState(157);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				expr(0);
				setState(160);
				match(MAJOR);
				setState(161);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				expr(0);
				setState(164);
				match(IGUAL);
				setState(165);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				expr(0);
				setState(168);
				match(DIFERENCIA);
				setState(169);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				expr(0);
				setState(172);
				match(MENORIGUAL);
				setState(173);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				expr(0);
				setState(176);
				match(MAJORIGUAL);
				setState(177);
				expr(0);
				}
				break;
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParentesisContext extends ExprContext {
		public TerminalNode LP() { return getToken(llullParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(llullParser.RP, 0); }
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(llullParser.DIV, 0); }
		public DivContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ResContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RES() { return getToken(llullParser.RES, 0); }
		public ResContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(llullParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MulContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(llullParser.MUL, 0); }
		public MulContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class VarContext extends ExprContext {
		public TerminalNode ID() { return getToken(llullParser.ID, 0); }
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class GetContext extends ExprContext {
		public TerminalNode GET() { return getToken(llullParser.GET, 0); }
		public TerminalNode LP() { return getToken(llullParser.LP, 0); }
		public TerminalNode ID() { return getToken(llullParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(llullParser.RP, 0); }
		public GetContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MesContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MES() { return getToken(llullParser.MES, 0); }
		public MesContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(llullParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(182);
				match(LP);
				setState(183);
				expr(0);
				setState(184);
				match(RP);
				}
				break;
			case ID:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(ID);
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(STRING);
				}
				break;
			case GET:
				{
				_localctx = new GetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(GET);
				setState(189);
				match(LP);
				setState(190);
				match(ID);
				setState(191);
				match(T__0);
				setState(192);
				expr(0);
				setState(193);
				match(RP);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(199);
						match(DIV);
						setState(200);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new MulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(202);
						match(MUL);
						setState(203);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ResContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(205);
						match(RES);
						setState(206);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new MesContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(208);
						match(MES);
						setState(209);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2\16"+
		"\2#\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\5\3\63\n"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4D\n"+
		"\4\r\4\16\4E\3\5\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\5\5R\n\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0083\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00b6\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c7\n\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d5\n\20\f\20"+
		"\16\20\u00d8\13\20\3\20\2\3\36\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\2\2\u00e8\2!\3\2\2\2\4\'\3\2\2\2\6C\3\2\2\2\bG\3\2\2\2\nU\3\2\2"+
		"\2\fa\3\2\2\2\16f\3\2\2\2\20j\3\2\2\2\22q\3\2\2\2\24z\3\2\2\2\26\u0084"+
		"\3\2\2\2\30\u0089\3\2\2\2\32\u0091\3\2\2\2\34\u00b5\3\2\2\2\36\u00c6\3"+
		"\2\2\2 \"\5\4\3\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%"+
		"&\7\2\2\3&\3\3\2\2\2\'(\7\16\2\2()\7\20\2\2)\62\7\26\2\2*/\7\20\2\2+,"+
		"\7\3\2\2,.\7\20\2\2-+\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\63"+
		"\3\2\2\2\61/\3\2\2\2\62*\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7\27"+
		"\2\2\65\66\7\30\2\2\66\67\5\6\4\2\678\7\31\2\28\5\3\2\2\29D\5\n\6\2:D"+
		"\5\36\20\2;D\5\16\b\2<D\5\b\5\2=D\5\24\13\2>D\5\30\r\2?D\5\32\16\2@D\5"+
		"\20\t\2AD\5\22\n\2BD\5\f\7\2C9\3\2\2\2C:\3\2\2\2C;\3\2\2\2C<\3\2\2\2C"+
		"=\3\2\2\2C>\3\2\2\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2DE\3\2\2\2"+
		"EC\3\2\2\2EF\3\2\2\2F\7\3\2\2\2GH\7\20\2\2HQ\7\26\2\2IN\5\36\20\2JK\7"+
		"\3\2\2KM\5\36\20\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2P"+
		"N\3\2\2\2QI\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\27\2\2T\t\3\2\2\2UV\7\r\2"+
		"\2VW\7\26\2\2W\\\5\36\20\2XY\7\3\2\2Y[\5\36\20\2ZX\3\2\2\2[^\3\2\2\2\\"+
		"Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\27\2\2`\13\3\2\2\2ab\7\5"+
		"\2\2bc\7\26\2\2cd\7\20\2\2de\7\27\2\2e\r\3\2\2\2fg\7\20\2\2gh\7\32\2\2"+
		"hi\5\36\20\2i\17\3\2\2\2jk\7\b\2\2kl\7\26\2\2lm\7\20\2\2mn\7\3\2\2no\5"+
		"\36\20\2op\7\27\2\2p\21\3\2\2\2qr\7\6\2\2rs\7\26\2\2st\7\20\2\2tu\7\3"+
		"\2\2uv\5\36\20\2vw\7\3\2\2wx\5\36\20\2xy\7\27\2\2y\23\3\2\2\2z{\7\f\2"+
		"\2{|\7\26\2\2|}\5\34\17\2}~\7\27\2\2~\177\7\30\2\2\177\u0080\5\6\4\2\u0080"+
		"\u0082\7\31\2\2\u0081\u0083\5\26\f\2\u0082\u0081\3\2\2\2\u0082\u0083\3"+
		"\2\2\2\u0083\25\3\2\2\2\u0084\u0085\7\13\2\2\u0085\u0086\7\30\2\2\u0086"+
		"\u0087\5\6\4\2\u0087\u0088\7\31\2\2\u0088\27\3\2\2\2\u0089\u008a\7\n\2"+
		"\2\u008a\u008b\7\26\2\2\u008b\u008c\5\34\17\2\u008c\u008d\7\27\2\2\u008d"+
		"\u008e\7\30\2\2\u008e\u008f\5\6\4\2\u008f\u0090\7\31\2\2\u0090\31\3\2"+
		"\2\2\u0091\u0092\7\t\2\2\u0092\u0093\7\26\2\2\u0093\u0094\5\16\b\2\u0094"+
		"\u0095\7\4\2\2\u0095\u0096\5\34\17\2\u0096\u0097\7\4\2\2\u0097\u0098\5"+
		"\16\b\2\u0098\u0099\7\27\2\2\u0099\u009a\7\30\2\2\u009a\u009b\5\6\4\2"+
		"\u009b\u009c\7\31\2\2\u009c\33\3\2\2\2\u009d\u009e\5\36\20\2\u009e\u009f"+
		"\7\35\2\2\u009f\u00a0\5\36\20\2\u00a0\u00b6\3\2\2\2\u00a1\u00a2\5\36\20"+
		"\2\u00a2\u00a3\7\36\2\2\u00a3\u00a4\5\36\20\2\u00a4\u00b6\3\2\2\2\u00a5"+
		"\u00a6\5\36\20\2\u00a6\u00a7\7\33\2\2\u00a7\u00a8\5\36\20\2\u00a8\u00b6"+
		"\3\2\2\2\u00a9\u00aa\5\36\20\2\u00aa\u00ab\7\34\2\2\u00ab\u00ac\5\36\20"+
		"\2\u00ac\u00b6\3\2\2\2\u00ad\u00ae\5\36\20\2\u00ae\u00af\7\37\2\2\u00af"+
		"\u00b0\5\36\20\2\u00b0\u00b6\3\2\2\2\u00b1\u00b2\5\36\20\2\u00b2\u00b3"+
		"\7 \2\2\u00b3\u00b4\5\36\20\2\u00b4\u00b6\3\2\2\2\u00b5\u009d\3\2\2\2"+
		"\u00b5\u00a1\3\2\2\2\u00b5\u00a5\3\2\2\2\u00b5\u00a9\3\2\2\2\u00b5\u00ad"+
		"\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6\35\3\2\2\2\u00b7\u00b8\b\20\1\2\u00b8"+
		"\u00b9\7\26\2\2\u00b9\u00ba\5\36\20\2\u00ba\u00bb\7\27\2\2\u00bb\u00c7"+
		"\3\2\2\2\u00bc\u00c7\7\20\2\2\u00bd\u00c7\7\25\2\2\u00be\u00bf\7\7\2\2"+
		"\u00bf\u00c0\7\26\2\2\u00c0\u00c1\7\20\2\2\u00c1\u00c2\7\3\2\2\u00c2\u00c3"+
		"\5\36\20\2\u00c3\u00c4\7\27\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c7\7\17\2"+
		"\2\u00c6\u00b7\3\2\2\2\u00c6\u00bc\3\2\2\2\u00c6\u00bd\3\2\2\2\u00c6\u00be"+
		"\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00d6\3\2\2\2\u00c8\u00c9\f\n\2\2\u00c9"+
		"\u00ca\7\24\2\2\u00ca\u00d5\5\36\20\13\u00cb\u00cc\f\t\2\2\u00cc\u00cd"+
		"\7\23\2\2\u00cd\u00d5\5\36\20\n\u00ce\u00cf\f\b\2\2\u00cf\u00d0\7\22\2"+
		"\2\u00d0\u00d5\5\36\20\t\u00d1\u00d2\f\7\2\2\u00d2\u00d3\7\21\2\2\u00d3"+
		"\u00d5\5\36\20\b\u00d4\u00c8\3\2\2\2\u00d4\u00cb\3\2\2\2\u00d4\u00ce\3"+
		"\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\37\3\2\2\2\u00d8\u00d6\3\2\2\2\17#/\62CENQ\\\u0082"+
		"\u00b5\u00c6\u00d4\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}