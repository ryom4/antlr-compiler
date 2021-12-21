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
		T__0=1, T__1=2, FOR=3, WHILE=4, ELSE=5, IF=6, WR=7, VOID=8, INT=9, ID=10, 
		MES=11, RES=12, MUL=13, DIV=14, STRING=15, LP=16, RP=17, LB=18, RB=19, 
		IG=20, IGUAL=21, DIFERENCIA=22, MENOR=23, MAJOR=24, MENORIGUAL=25, MAJORIGUAL=26, 
		COMM=27, WS=28;
	public static final int
		RULE_root = 0, RULE_program = 1, RULE_proc = 2, RULE_statements = 3, RULE_procCall = 4, 
		RULE_parameters = 5, RULE_write = 6, RULE_ass = 7, RULE_conditional = 8, 
		RULE_elseConditional = 9, RULE_loop = 10, RULE_forloop = 11, RULE_cond = 12, 
		RULE_expr = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "program", "proc", "statements", "procCall", "parameters", "write", 
			"ass", "conditional", "elseConditional", "loop", "forloop", "cond", "expr"
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
			setState(28);
			program();
			setState(29);
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
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				proc();
				}
				}
				setState(34); 
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
			setState(36);
			match(VOID);
			setState(37);
			match(ID);
			setState(38);
			match(LP);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(39);
				match(ID);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(40);
					match(T__0);
					setState(41);
					match(ID);
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(49);
			match(RP);
			setState(50);
			match(LB);
			setState(51);
			statements();
			setState(52);
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
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(54);
					write();
					}
					break;
				case 2:
					{
					setState(55);
					expr(0);
					}
					break;
				case 3:
					{
					setState(56);
					ass();
					}
					break;
				case 4:
					{
					setState(57);
					procCall();
					}
					break;
				case 5:
					{
					setState(58);
					conditional();
					}
					break;
				case 6:
					{
					setState(59);
					loop();
					}
					break;
				case 7:
					{
					setState(60);
					forloop();
					}
					break;
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << WR) | (1L << INT) | (1L << ID) | (1L << STRING))) != 0) );
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
			setState(65);
			match(ID);
			setState(66);
			match(LP);
			setState(67);
			parameters();
			setState(68);
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
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(70);
				expr(0);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(71);
					match(T__0);
					setState(72);
					expr(0);
					}
					}
					setState(77);
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
			setState(80);
			match(WR);
			setState(81);
			match(LP);
			setState(82);
			expr(0);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(83);
				match(T__0);
				setState(84);
				expr(0);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
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
			setState(92);
			match(ID);
			setState(93);
			match(IG);
			setState(94);
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
		enterRule(_localctx, 16, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(IF);
			setState(97);
			match(LP);
			setState(98);
			cond();
			setState(99);
			match(RP);
			setState(100);
			match(LB);
			setState(101);
			statements();
			setState(102);
			match(RB);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(103);
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
		enterRule(_localctx, 18, RULE_elseConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ELSE);
			setState(107);
			match(LB);
			setState(108);
			statements();
			setState(109);
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
		enterRule(_localctx, 20, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(WHILE);
			setState(112);
			match(LP);
			setState(113);
			cond();
			setState(114);
			match(RP);
			setState(115);
			match(LB);
			setState(116);
			statements();
			setState(117);
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
		enterRule(_localctx, 22, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(FOR);
			setState(120);
			match(LP);
			setState(121);
			ass();
			setState(122);
			match(T__1);
			setState(123);
			cond();
			setState(124);
			match(T__1);
			setState(125);
			ass();
			setState(126);
			match(RP);
			setState(127);
			match(LB);
			setState(128);
			statements();
			setState(129);
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
		enterRule(_localctx, 24, RULE_cond);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				expr(0);
				setState(132);
				match(MENOR);
				setState(133);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				expr(0);
				setState(136);
				match(MAJOR);
				setState(137);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				expr(0);
				setState(140);
				match(IGUAL);
				setState(141);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				expr(0);
				setState(144);
				match(DIFERENCIA);
				setState(145);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				expr(0);
				setState(148);
				match(MENORIGUAL);
				setState(149);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				expr(0);
				setState(152);
				match(MAJORIGUAL);
				setState(153);
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
		public TerminalNode ID() { return getToken(llullParser.ID, 0); }
		public TerminalNode STRING() { return getToken(llullParser.STRING, 0); }
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(158);
				match(ID);
				}
				break;
			case STRING:
				{
				setState(159);
				match(STRING);
				}
				break;
			case INT:
				{
				setState(160);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(175);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(164);
						match(DIV);
						setState(165);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(167);
						match(MUL);
						setState(168);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(170);
						match(RES);
						setState(171);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(173);
						match(MES);
						setState(174);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(179);
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
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00b7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\6\3#\n\3\r\3"+
		"\16\3$\3\4\3\4\3\4\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\5\4\62\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5@\n\5\r\5\16\5A\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\5\7Q\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\7\bX\n\b\f\b\16\b[\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\nk\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009e\n\16\3\17\3\17"+
		"\3\17\3\17\5\17\u00a4\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u00b2\n\17\f\17\16\17\u00b5\13\17\3\17\2\3\34\20"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2\u00c1\2\36\3\2\2\2\4\"\3\2"+
		"\2\2\6&\3\2\2\2\b?\3\2\2\2\nC\3\2\2\2\fP\3\2\2\2\16R\3\2\2\2\20^\3\2\2"+
		"\2\22b\3\2\2\2\24l\3\2\2\2\26q\3\2\2\2\30y\3\2\2\2\32\u009d\3\2\2\2\34"+
		"\u00a3\3\2\2\2\36\37\5\4\3\2\37 \7\2\2\3 \3\3\2\2\2!#\5\6\4\2\"!\3\2\2"+
		"\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\5\3\2\2\2&\'\7\n\2\2\'(\7\f\2\2(\61"+
		"\7\22\2\2).\7\f\2\2*+\7\3\2\2+-\7\f\2\2,*\3\2\2\2-\60\3\2\2\2.,\3\2\2"+
		"\2./\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\61)\3\2\2\2\61\62\3\2\2\2\62\63\3"+
		"\2\2\2\63\64\7\23\2\2\64\65\7\24\2\2\65\66\5\b\5\2\66\67\7\25\2\2\67\7"+
		"\3\2\2\28@\5\16\b\29@\5\34\17\2:@\5\20\t\2;@\5\n\6\2<@\5\22\n\2=@\5\26"+
		"\f\2>@\5\30\r\2?8\3\2\2\2?9\3\2\2\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3"+
		"\2\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\t\3\2\2\2CD\7\f\2\2DE"+
		"\7\22\2\2EF\5\f\7\2FG\7\23\2\2G\13\3\2\2\2HM\5\34\17\2IJ\7\3\2\2JL\5\34"+
		"\17\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PH\3"+
		"\2\2\2PQ\3\2\2\2Q\r\3\2\2\2RS\7\t\2\2ST\7\22\2\2TY\5\34\17\2UV\7\3\2\2"+
		"VX\5\34\17\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2"+
		"\2\2\\]\7\23\2\2]\17\3\2\2\2^_\7\f\2\2_`\7\26\2\2`a\5\34\17\2a\21\3\2"+
		"\2\2bc\7\b\2\2cd\7\22\2\2de\5\32\16\2ef\7\23\2\2fg\7\24\2\2gh\5\b\5\2"+
		"hj\7\25\2\2ik\5\24\13\2ji\3\2\2\2jk\3\2\2\2k\23\3\2\2\2lm\7\7\2\2mn\7"+
		"\24\2\2no\5\b\5\2op\7\25\2\2p\25\3\2\2\2qr\7\6\2\2rs\7\22\2\2st\5\32\16"+
		"\2tu\7\23\2\2uv\7\24\2\2vw\5\b\5\2wx\7\25\2\2x\27\3\2\2\2yz\7\5\2\2z{"+
		"\7\22\2\2{|\5\20\t\2|}\7\4\2\2}~\5\32\16\2~\177\7\4\2\2\177\u0080\5\20"+
		"\t\2\u0080\u0081\7\23\2\2\u0081\u0082\7\24\2\2\u0082\u0083\5\b\5\2\u0083"+
		"\u0084\7\25\2\2\u0084\31\3\2\2\2\u0085\u0086\5\34\17\2\u0086\u0087\7\31"+
		"\2\2\u0087\u0088\5\34\17\2\u0088\u009e\3\2\2\2\u0089\u008a\5\34\17\2\u008a"+
		"\u008b\7\32\2\2\u008b\u008c\5\34\17\2\u008c\u009e\3\2\2\2\u008d\u008e"+
		"\5\34\17\2\u008e\u008f\7\27\2\2\u008f\u0090\5\34\17\2\u0090\u009e\3\2"+
		"\2\2\u0091\u0092\5\34\17\2\u0092\u0093\7\30\2\2\u0093\u0094\5\34\17\2"+
		"\u0094\u009e\3\2\2\2\u0095\u0096\5\34\17\2\u0096\u0097\7\33\2\2\u0097"+
		"\u0098\5\34\17\2\u0098\u009e\3\2\2\2\u0099\u009a\5\34\17\2\u009a\u009b"+
		"\7\34\2\2\u009b\u009c\5\34\17\2\u009c\u009e\3\2\2\2\u009d\u0085\3\2\2"+
		"\2\u009d\u0089\3\2\2\2\u009d\u008d\3\2\2\2\u009d\u0091\3\2\2\2\u009d\u0095"+
		"\3\2\2\2\u009d\u0099\3\2\2\2\u009e\33\3\2\2\2\u009f\u00a0\b\17\1\2\u00a0"+
		"\u00a4\7\f\2\2\u00a1\u00a4\7\21\2\2\u00a2\u00a4\7\13\2\2\u00a3\u009f\3"+
		"\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00b3\3\2\2\2\u00a5"+
		"\u00a6\f\t\2\2\u00a6\u00a7\7\20\2\2\u00a7\u00b2\5\34\17\n\u00a8\u00a9"+
		"\f\b\2\2\u00a9\u00aa\7\17\2\2\u00aa\u00b2\5\34\17\t\u00ab\u00ac\f\7\2"+
		"\2\u00ac\u00ad\7\16\2\2\u00ad\u00b2\5\34\17\b\u00ae\u00af\f\6\2\2\u00af"+
		"\u00b0\7\r\2\2\u00b0\u00b2\5\34\17\7\u00b1\u00a5\3\2\2\2\u00b1\u00a8\3"+
		"\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\35\3\2\2\2\u00b5\u00b3\3\2\2"+
		"\2\17$.\61?AMPYj\u009d\u00a3\u00b1\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}