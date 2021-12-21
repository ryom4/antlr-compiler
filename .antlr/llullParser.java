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
		T__0=1, T__1=2, SET=3, GET=4, ARRAY=5, FOR=6, WHILE=7, ELSE=8, IF=9, WR=10, 
		VOID=11, INT=12, ID=13, MES=14, RES=15, MUL=16, DIV=17, STRING=18, LP=19, 
		RP=20, LB=21, RB=22, IG=23, IGUAL=24, DIFERENCIA=25, MENOR=26, MAJOR=27, 
		MENORIGUAL=28, MAJORIGUAL=29, COMM=30, WS=31;
	public static final int
		RULE_root = 0, RULE_program = 1, RULE_proc = 2, RULE_statements = 3, RULE_procCall = 4, 
		RULE_parameters = 5, RULE_write = 6, RULE_ass = 7, RULE_array = 8, RULE_setArray = 9, 
		RULE_conditional = 10, RULE_elseConditional = 11, RULE_loop = 12, RULE_forloop = 13, 
		RULE_cond = 14, RULE_expr = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "program", "proc", "statements", "procCall", "parameters", "write", 
			"ass", "array", "setArray", "conditional", "elseConditional", "loop", 
			"forloop", "cond", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "';'", "'set'", "'get'", "'array'", "'for'", "'while'", 
			"'else'", "'if'", "'write'", "'void'", null, null, "'+'", "'-'", "'*'", 
			"'/'", null, "'('", "')'", "'{'", "'}'", "'='", "'=='", "'<>'", "'<'", 
			"'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "SET", "GET", "ARRAY", "FOR", "WHILE", "ELSE", "IF", 
			"WR", "VOID", "INT", "ID", "MES", "RES", "MUL", "DIV", "STRING", "LP", 
			"RP", "LB", "RB", "IG", "IGUAL", "DIFERENCIA", "MENOR", "MAJOR", "MENORIGUAL", 
			"MAJORIGUAL", "COMM", "WS"
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
			setState(32);
			program();
			setState(33);
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
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				proc();
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VOID );
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
		enterRule(_localctx, 4, RULE_proc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(VOID);
			setState(41);
			match(ID);
			setState(42);
			match(LP);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(43);
				match(ID);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(44);
					match(T__0);
					setState(45);
					match(ID);
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(53);
			match(RP);
			setState(54);
			match(LB);
			setState(55);
			statements();
			setState(56);
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
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(58);
					write();
					}
					break;
				case 2:
					{
					setState(59);
					expr(0);
					}
					break;
				case 3:
					{
					setState(60);
					ass();
					}
					break;
				case 4:
					{
					setState(61);
					procCall();
					}
					break;
				case 5:
					{
					setState(62);
					conditional();
					}
					break;
				case 6:
					{
					setState(63);
					loop();
					}
					break;
				case 7:
					{
					setState(64);
					forloop();
					}
					break;
				case 8:
					{
					setState(65);
					array();
					}
					break;
				case 9:
					{
					setState(66);
					setArray();
					}
					break;
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << GET) | (1L << ARRAY) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << WR) | (1L << INT) | (1L << ID) | (1L << STRING))) != 0) );
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
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RP() { return getToken(llullParser.RP, 0); }
		public ProcCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procCall; }
	}

	public final ProcCallContext procCall() throws RecognitionException {
		ProcCallContext _localctx = new ProcCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ID);
			setState(72);
			match(LP);
			setState(73);
			parameters();
			setState(74);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GET) | (1L << INT) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(76);
				expr(0);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(77);
					match(T__0);
					setState(78);
					expr(0);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		enterRule(_localctx, 12, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(WR);
			setState(87);
			match(LP);
			setState(88);
			expr(0);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(89);
				match(T__0);
				setState(90);
				expr(0);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
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
		enterRule(_localctx, 14, RULE_ass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(ID);
			setState(99);
			match(IG);
			setState(100);
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
		enterRule(_localctx, 16, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ARRAY);
			setState(103);
			match(LP);
			setState(104);
			match(ID);
			setState(105);
			match(T__0);
			setState(106);
			expr(0);
			setState(107);
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
		enterRule(_localctx, 18, RULE_setArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(SET);
			setState(110);
			match(LP);
			setState(111);
			match(ID);
			setState(112);
			match(T__0);
			setState(113);
			expr(0);
			setState(114);
			match(T__0);
			setState(115);
			expr(0);
			setState(116);
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
		enterRule(_localctx, 20, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IF);
			setState(119);
			match(LP);
			setState(120);
			cond();
			setState(121);
			match(RP);
			setState(122);
			match(LB);
			setState(123);
			statements();
			setState(124);
			match(RB);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(125);
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
		enterRule(_localctx, 22, RULE_elseConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(ELSE);
			setState(129);
			match(LB);
			setState(130);
			statements();
			setState(131);
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
		enterRule(_localctx, 24, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(WHILE);
			setState(134);
			match(LP);
			setState(135);
			cond();
			setState(136);
			match(RP);
			setState(137);
			match(LB);
			setState(138);
			statements();
			setState(139);
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
		enterRule(_localctx, 26, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(FOR);
			setState(142);
			match(LP);
			setState(143);
			ass();
			setState(144);
			match(T__1);
			setState(145);
			cond();
			setState(146);
			match(T__1);
			setState(147);
			ass();
			setState(148);
			match(RP);
			setState(149);
			match(LB);
			setState(150);
			statements();
			setState(151);
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
		enterRule(_localctx, 28, RULE_cond);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				expr(0);
				setState(154);
				match(MENOR);
				setState(155);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				expr(0);
				setState(158);
				match(MAJOR);
				setState(159);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				expr(0);
				setState(162);
				match(IGUAL);
				setState(163);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				expr(0);
				setState(166);
				match(DIFERENCIA);
				setState(167);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				expr(0);
				setState(170);
				match(MENORIGUAL);
				setState(171);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				expr(0);
				setState(174);
				match(MAJORIGUAL);
				setState(175);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(180);
				match(ID);
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(STRING);
				}
				break;
			case GET:
				{
				_localctx = new GetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(GET);
				setState(183);
				match(LP);
				setState(184);
				match(ID);
				setState(185);
				match(T__0);
				setState(186);
				expr(0);
				setState(187);
				match(RP);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(204);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(193);
						match(DIV);
						setState(194);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new MulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(196);
						match(MUL);
						setState(197);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ResContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(199);
						match(RES);
						setState(200);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new MesContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(202);
						match(MES);
						setState(203);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(208);
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
		case 15:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\6\3\'\n\3\r\3\16\3(\3\4\3\4\3\4\3\4\3\4\3\4\7\4\61\n\4\f\4\16\4"+
		"\64\13\4\5\4\66\n\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\6\5F\n\5\r\5\16\5G\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7R\n\7\f\7"+
		"\16\7U\13\7\5\7W\n\7\3\b\3\b\3\b\3\b\3\b\7\b^\n\b\f\b\16\ba\13\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0081\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00b4\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00c1\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00cf\n\21\f\21\16\21\u00d2\13\21"+
		"\3\21\2\3 \22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\2\u00df\2\""+
		"\3\2\2\2\4&\3\2\2\2\6*\3\2\2\2\bE\3\2\2\2\nI\3\2\2\2\fV\3\2\2\2\16X\3"+
		"\2\2\2\20d\3\2\2\2\22h\3\2\2\2\24o\3\2\2\2\26x\3\2\2\2\30\u0082\3\2\2"+
		"\2\32\u0087\3\2\2\2\34\u008f\3\2\2\2\36\u00b3\3\2\2\2 \u00c0\3\2\2\2\""+
		"#\5\4\3\2#$\7\2\2\3$\3\3\2\2\2%\'\5\6\4\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2"+
		"\2()\3\2\2\2)\5\3\2\2\2*+\7\r\2\2+,\7\17\2\2,\65\7\25\2\2-\62\7\17\2\2"+
		"./\7\3\2\2/\61\7\17\2\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\65-\3\2\2\2\65\66\3\2\2\2\66\67\3"+
		"\2\2\2\678\7\26\2\289\7\27\2\29:\5\b\5\2:;\7\30\2\2;\7\3\2\2\2<F\5\16"+
		"\b\2=F\5 \21\2>F\5\20\t\2?F\5\n\6\2@F\5\26\f\2AF\5\32\16\2BF\5\34\17\2"+
		"CF\5\22\n\2DF\5\24\13\2E<\3\2\2\2E=\3\2\2\2E>\3\2\2\2E?\3\2\2\2E@\3\2"+
		"\2\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2"+
		"\2\2H\t\3\2\2\2IJ\7\17\2\2JK\7\25\2\2KL\5\f\7\2LM\7\26\2\2M\13\3\2\2\2"+
		"NS\5 \21\2OP\7\3\2\2PR\5 \21\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"TW\3\2\2\2US\3\2\2\2VN\3\2\2\2VW\3\2\2\2W\r\3\2\2\2XY\7\f\2\2YZ\7\25\2"+
		"\2Z_\5 \21\2[\\\7\3\2\2\\^\5 \21\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2"+
		"\2\2`b\3\2\2\2a_\3\2\2\2bc\7\26\2\2c\17\3\2\2\2de\7\17\2\2ef\7\31\2\2"+
		"fg\5 \21\2g\21\3\2\2\2hi\7\7\2\2ij\7\25\2\2jk\7\17\2\2kl\7\3\2\2lm\5 "+
		"\21\2mn\7\26\2\2n\23\3\2\2\2op\7\5\2\2pq\7\25\2\2qr\7\17\2\2rs\7\3\2\2"+
		"st\5 \21\2tu\7\3\2\2uv\5 \21\2vw\7\26\2\2w\25\3\2\2\2xy\7\13\2\2yz\7\25"+
		"\2\2z{\5\36\20\2{|\7\26\2\2|}\7\27\2\2}~\5\b\5\2~\u0080\7\30\2\2\177\u0081"+
		"\5\30\r\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\27\3\2\2\2\u0082"+
		"\u0083\7\n\2\2\u0083\u0084\7\27\2\2\u0084\u0085\5\b\5\2\u0085\u0086\7"+
		"\30\2\2\u0086\31\3\2\2\2\u0087\u0088\7\t\2\2\u0088\u0089\7\25\2\2\u0089"+
		"\u008a\5\36\20\2\u008a\u008b\7\26\2\2\u008b\u008c\7\27\2\2\u008c\u008d"+
		"\5\b\5\2\u008d\u008e\7\30\2\2\u008e\33\3\2\2\2\u008f\u0090\7\b\2\2\u0090"+
		"\u0091\7\25\2\2\u0091\u0092\5\20\t\2\u0092\u0093\7\4\2\2\u0093\u0094\5"+
		"\36\20\2\u0094\u0095\7\4\2\2\u0095\u0096\5\20\t\2\u0096\u0097\7\26\2\2"+
		"\u0097\u0098\7\27\2\2\u0098\u0099\5\b\5\2\u0099\u009a\7\30\2\2\u009a\35"+
		"\3\2\2\2\u009b\u009c\5 \21\2\u009c\u009d\7\34\2\2\u009d\u009e\5 \21\2"+
		"\u009e\u00b4\3\2\2\2\u009f\u00a0\5 \21\2\u00a0\u00a1\7\35\2\2\u00a1\u00a2"+
		"\5 \21\2\u00a2\u00b4\3\2\2\2\u00a3\u00a4\5 \21\2\u00a4\u00a5\7\32\2\2"+
		"\u00a5\u00a6\5 \21\2\u00a6\u00b4\3\2\2\2\u00a7\u00a8\5 \21\2\u00a8\u00a9"+
		"\7\33\2\2\u00a9\u00aa\5 \21\2\u00aa\u00b4\3\2\2\2\u00ab\u00ac\5 \21\2"+
		"\u00ac\u00ad\7\36\2\2\u00ad\u00ae\5 \21\2\u00ae\u00b4\3\2\2\2\u00af\u00b0"+
		"\5 \21\2\u00b0\u00b1\7\37\2\2\u00b1\u00b2\5 \21\2\u00b2\u00b4\3\2\2\2"+
		"\u00b3\u009b\3\2\2\2\u00b3\u009f\3\2\2\2\u00b3\u00a3\3\2\2\2\u00b3\u00a7"+
		"\3\2\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\37\3\2\2\2\u00b5"+
		"\u00b6\b\21\1\2\u00b6\u00c1\7\17\2\2\u00b7\u00c1\7\24\2\2\u00b8\u00b9"+
		"\7\6\2\2\u00b9\u00ba\7\25\2\2\u00ba\u00bb\7\17\2\2\u00bb\u00bc\7\3\2\2"+
		"\u00bc\u00bd\5 \21\2\u00bd\u00be\7\26\2\2\u00be\u00c1\3\2\2\2\u00bf\u00c1"+
		"\7\16\2\2\u00c0\u00b5\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c0\u00b8\3\2\2\2"+
		"\u00c0\u00bf\3\2\2\2\u00c1\u00d0\3\2\2\2\u00c2\u00c3\f\n\2\2\u00c3\u00c4"+
		"\7\23\2\2\u00c4\u00cf\5 \21\13\u00c5\u00c6\f\t\2\2\u00c6\u00c7\7\22\2"+
		"\2\u00c7\u00cf\5 \21\n\u00c8\u00c9\f\b\2\2\u00c9\u00ca\7\21\2\2\u00ca"+
		"\u00cf\5 \21\t\u00cb\u00cc\f\7\2\2\u00cc\u00cd\7\20\2\2\u00cd\u00cf\5"+
		" \21\b\u00ce\u00c2\3\2\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce"+
		"\u00cb\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1!\3\2\2\2\u00d2\u00d0\3\2\2\2\17(\62\65EGSV_\u0080\u00b3\u00c0"+
		"\u00ce\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}