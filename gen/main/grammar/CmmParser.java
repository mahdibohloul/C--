// Generated from /home/tapsi/codes/c--/src/main/grammar/Cmm.g4 by ANTLR 4.9.1
package main.grammar;

     import main.ast.nodes.*;
     import main.ast.nodes.declaration.*;
     import main.ast.nodes.declaration.struct.*;
     import main.ast.nodes.expression.*;
     import main.ast.nodes.expression.operators.*;
     import main.ast.nodes.expression.values.*;
     import main.ast.nodes.expression.values.primitive.*;
     import main.ast.nodes.statement.*;
     import main.ast.types.*;
     import main.ast.types.primitives.*;
     import java.util.*;
 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, RETURN=2, VOID=3, SIZE=4, DISPLAY=5, APPEND=6, IF=7, ELSE=8, PLUS=9, 
		MINUS=10, MULT=11, DIVIDE=12, EQUAL=13, ARROW=14, GREATER_THAN=15, LESS_THAN=16, 
		AND=17, OR=18, NOT=19, TRUE=20, FALSE=21, BEGIN=22, END=23, INT=24, BOOL=25, 
		LIST=26, STRUCT=27, FPTR=28, GET=29, SET=30, WHILE=31, DO=32, ASSIGN=33, 
		SHARP=34, LPAR=35, RPAR=36, LBRACK=37, RBRACK=38, COMMA=39, DOT=40, SEMICOLON=41, 
		NEWLINE=42, INT_VALUE=43, IDENTIFIER=44, COMMENT=45, WS=46;
	public static final int
		RULE_cmm = 0, RULE_program = 1, RULE_main = 2, RULE_structDeclaration = 3, 
		RULE_singleVarWithGetAndSet = 4, RULE_singleStatementStructBody = 5, RULE_structBody = 6, 
		RULE_getBody = 7, RULE_setBody = 8, RULE_functionDeclaration = 9, RULE_functionArgsDec = 10, 
		RULE_functionArguments = 11, RULE_body = 12, RULE_loopCondBody = 13, RULE_blockStatement = 14, 
		RULE_varDecStatement = 15, RULE_functionCallStmt = 16, RULE_returnStatement = 17, 
		RULE_ifStatement = 18, RULE_elseStatement = 19, RULE_loopStatement = 20, 
		RULE_whileLoopStatement = 21, RULE_doWhileLoopStatement = 22, RULE_displayStatement = 23, 
		RULE_assignmentStatement = 24, RULE_singleStatement = 25, RULE_expression = 26, 
		RULE_orExpression = 27, RULE_andExpression = 28, RULE_equalityExpression = 29, 
		RULE_relationalExpression = 30, RULE_additiveExpression = 31, RULE_multiplicativeExpression = 32, 
		RULE_preUnaryExpression = 33, RULE_accessExpression = 34, RULE_otherExpression = 35, 
		RULE_size = 36, RULE_append = 37, RULE_value = 38, RULE_boolValue = 39, 
		RULE_identifier = 40, RULE_type = 41, RULE_fptrType = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmm", "program", "main", "structDeclaration", "singleVarWithGetAndSet", 
			"singleStatementStructBody", "structBody", "getBody", "setBody", "functionDeclaration", 
			"functionArgsDec", "functionArguments", "body", "loopCondBody", "blockStatement", 
			"varDecStatement", "functionCallStmt", "returnStatement", "ifStatement", 
			"elseStatement", "loopStatement", "whileLoopStatement", "doWhileLoopStatement", 
			"displayStatement", "assignmentStatement", "singleStatement", "expression", 
			"orExpression", "andExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "preUnaryExpression", 
			"accessExpression", "otherExpression", "size", "append", "value", "boolValue", 
			"identifier", "type", "fptrType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'return'", "'void'", "'size'", "'display'", "'append'", 
			"'if'", "'else'", "'+'", "'-'", "'*'", "'/'", "'=='", "'->'", "'>'", 
			"'<'", "'&'", "'|'", "'~'", "'true'", "'false'", "'begin'", "'end'", 
			"'int'", "'bool'", "'list'", "'struct'", "'fptr'", "'get'", "'set'", 
			"'while'", "'do'", "'='", "'#'", "'('", "')'", "'['", "']'", "','", "'.'", 
			"';'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "RETURN", "VOID", "SIZE", "DISPLAY", "APPEND", "IF", "ELSE", 
			"PLUS", "MINUS", "MULT", "DIVIDE", "EQUAL", "ARROW", "GREATER_THAN", 
			"LESS_THAN", "AND", "OR", "NOT", "TRUE", "FALSE", "BEGIN", "END", "INT", 
			"BOOL", "LIST", "STRUCT", "FPTR", "GET", "SET", "WHILE", "DO", "ASSIGN", 
			"SHARP", "LPAR", "RPAR", "LBRACK", "RBRACK", "COMMA", "DOT", "SEMICOLON", 
			"NEWLINE", "INT_VALUE", "IDENTIFIER", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmmContext extends ParserRuleContext {
		public Program cmmProgram;
		public ProgramContext p;
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public CmmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterCmm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitCmm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitCmm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmmContext cmm() throws RecognitionException {
		CmmContext _localctx = new CmmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(86);
				match(NEWLINE);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			((CmmContext)_localctx).p = program();
			((CmmContext)_localctx).cmmProgram =  ((CmmContext)_localctx).p.programRet;
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(94);
				match(NEWLINE);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
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
		public Program programRet;
		public StructDeclarationContext s;
		public FunctionDeclarationContext f;
		public MainContext m;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((ProgramContext)_localctx).programRet =  new Program();
			     int line = 1;
			     _localctx.programRet.setLine(line);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					((ProgramContext)_localctx).s = structDeclaration();
					_localctx.programRet.addStruct(((ProgramContext)_localctx).s.structDeclarationRet);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				{
				setState(111);
				((ProgramContext)_localctx).f = functionDeclaration();
				_localctx.programRet.addFunction(((ProgramContext)_localctx).f.functionDeclarationRet);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			((ProgramContext)_localctx).m = main();
			_localctx.programRet.setMain(((ProgramContext)_localctx).m.mainRet);
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

	public static class MainContext extends ParserRuleContext {
		public MainDeclaration mainRet;
		public Token m;
		public BodyContext body;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode MAIN() { return getToken(CmmParser.MAIN, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			((MainContext)_localctx).m = match(MAIN);
			setState(123);
			match(LPAR);
			setState(124);
			match(RPAR);
			setState(125);
			((MainContext)_localctx).body = body();

			        ((MainContext)_localctx).mainRet =  new MainDeclaration();
			        _localctx.mainRet.setBody(((MainContext)_localctx).body.bodyRet);
			        _localctx.mainRet.setLine((((MainContext)_localctx).m!=null?((MainContext)_localctx).m.getLine():0));
			    
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public StructDeclaration structDeclarationRet;
		public Token s;
		public IdentifierContext identifier;
		public Token b;
		public StructBodyContext structBody;
		public SingleStatementStructBodyContext singleStatementStructBody;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public SingleStatementStructBodyContext singleStatementStructBody() {
			return getRuleContext(SingleStatementStructBodyContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((StructDeclarationContext)_localctx).structDeclarationRet =  new StructDeclaration();
			setState(129);
			((StructDeclarationContext)_localctx).s = match(STRUCT);
			_localctx.structDeclarationRet.setLine((((StructDeclarationContext)_localctx).s!=null?((StructDeclarationContext)_localctx).s.getLine():0));
			setState(131);
			((StructDeclarationContext)_localctx).identifier = identifier();
			_localctx.structDeclarationRet.setStructName(((StructDeclarationContext)_localctx).identifier.identifierRet);
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				{
				setState(133);
				((StructDeclarationContext)_localctx).b = match(BEGIN);
				setState(134);
				((StructDeclarationContext)_localctx).structBody = structBody();
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(135);
					match(NEWLINE);
					}
					}
					setState(138); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(140);
				match(END);

				        BlockStmt blockStmt = new BlockStmt();
				        blockStmt.setLine((((StructDeclarationContext)_localctx).b!=null?((StructDeclarationContext)_localctx).b.getLine():0));
				        blockStmt.setStatements(((StructDeclarationContext)_localctx).structBody.structBodyRet);
				        _localctx.structDeclarationRet.setBody(blockStmt);
				    
				}
				}
				break;
			case NEWLINE:
				{
				{
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(143);
					match(NEWLINE);
					}
					}
					setState(146); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(148);
				((StructDeclarationContext)_localctx).singleStatementStructBody = singleStatementStructBody();

				        _localctx.structDeclarationRet.setBody(((StructDeclarationContext)_localctx).singleStatementStructBody.singleStatementStructBodyRet);
				    
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(150);
					match(SEMICOLON);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				match(NEWLINE);
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class SingleVarWithGetAndSetContext extends ParserRuleContext {
		public SetGetVarDeclaration singleVarWithGetAndSetRet;
		public TypeContext type;
		public IdentifierContext identifier;
		public FunctionArgsDecContext functionArgsDec;
		public SetBodyContext setBody;
		public GetBodyContext getBody;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionArgsDecContext functionArgsDec() {
			return getRuleContext(FunctionArgsDecContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public SetBodyContext setBody() {
			return getRuleContext(SetBodyContext.class,0);
		}
		public GetBodyContext getBody() {
			return getRuleContext(GetBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public SingleVarWithGetAndSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleVarWithGetAndSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSingleVarWithGetAndSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSingleVarWithGetAndSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSingleVarWithGetAndSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleVarWithGetAndSetContext singleVarWithGetAndSet() throws RecognitionException {
		SingleVarWithGetAndSetContext _localctx = new SingleVarWithGetAndSetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleVarWithGetAndSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SingleVarWithGetAndSetContext)_localctx).singleVarWithGetAndSetRet =  new SetGetVarDeclaration();
			setState(161);
			((SingleVarWithGetAndSetContext)_localctx).type = type();
			setState(162);
			((SingleVarWithGetAndSetContext)_localctx).identifier = identifier();
			setState(163);
			((SingleVarWithGetAndSetContext)_localctx).functionArgsDec = functionArgsDec();
			setState(164);
			match(BEGIN);
			setState(166); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				match(NEWLINE);
				}
				}
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(170);
			((SingleVarWithGetAndSetContext)_localctx).setBody = setBody();
			setState(171);
			((SingleVarWithGetAndSetContext)_localctx).getBody = getBody();
			setState(172);
			match(END);

			        _localctx.singleVarWithGetAndSetRet.setVarName(((SingleVarWithGetAndSetContext)_localctx).identifier.identifierRet);
			        _localctx.singleVarWithGetAndSetRet.setVarType(((SingleVarWithGetAndSetContext)_localctx).type.typeRet);
			        _localctx.singleVarWithGetAndSetRet.setArgs(((SingleVarWithGetAndSetContext)_localctx).functionArgsDec.functionArgsDecRet);
			        _localctx.singleVarWithGetAndSetRet.setSetterBody(((SingleVarWithGetAndSetContext)_localctx).setBody.setBodyRet);
			        _localctx.singleVarWithGetAndSetRet.setGetterBody(((SingleVarWithGetAndSetContext)_localctx).getBody.getBodyRet);
			    
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

	public static class SingleStatementStructBodyContext extends ParserRuleContext {
		public Statement singleStatementStructBodyRet;
		public VarDecStatementContext varDecStatement;
		public SingleVarWithGetAndSetContext singleVarWithGetAndSet;
		public VarDecStatementContext varDecStatement() {
			return getRuleContext(VarDecStatementContext.class,0);
		}
		public SingleVarWithGetAndSetContext singleVarWithGetAndSet() {
			return getRuleContext(SingleVarWithGetAndSetContext.class,0);
		}
		public SingleStatementStructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatementStructBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSingleStatementStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSingleStatementStructBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSingleStatementStructBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementStructBodyContext singleStatementStructBody() throws RecognitionException {
		SingleStatementStructBodyContext _localctx = new SingleStatementStructBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleStatementStructBody);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				((SingleStatementStructBodyContext)_localctx).varDecStatement = varDecStatement();
				((SingleStatementStructBodyContext)_localctx).singleStatementStructBodyRet =  ((SingleStatementStructBodyContext)_localctx).varDecStatement.varDecStatementRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				((SingleStatementStructBodyContext)_localctx).singleVarWithGetAndSet = singleVarWithGetAndSet();
				((SingleStatementStructBodyContext)_localctx).singleStatementStructBodyRet =  ((SingleStatementStructBodyContext)_localctx).singleVarWithGetAndSet.singleVarWithGetAndSetRet;
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

	public static class StructBodyContext extends ParserRuleContext {
		public ArrayList<Statement> structBodyRet;
		public SingleStatementStructBodyContext singleStatementStructBody;
		public List<SingleStatementStructBodyContext> singleStatementStructBody() {
			return getRuleContexts(SingleStatementStructBodyContext.class);
		}
		public SingleStatementStructBodyContext singleStatementStructBody(int i) {
			return getRuleContext(SingleStatementStructBodyContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CmmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CmmParser.SEMICOLON, i);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((StructBodyContext)_localctx).structBodyRet =  new ArrayList<Statement>();
			setState(203); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(185); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(184);
						match(NEWLINE);
						}
						}
						setState(187); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(195);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(189);
							((StructBodyContext)_localctx).singleStatementStructBody = singleStatementStructBody();
							_localctx.structBodyRet.add(((StructBodyContext)_localctx).singleStatementStructBody.singleStatementStructBodyRet);
							setState(191);
							match(SEMICOLON);
							}
							} 
						}
						setState(197);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					}
					setState(198);
					((StructBodyContext)_localctx).singleStatementStructBody = singleStatementStructBody();
					_localctx.structBodyRet.add(((StructBodyContext)_localctx).singleStatementStructBody.singleStatementStructBodyRet);
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(200);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(205); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class GetBodyContext extends ParserRuleContext {
		public Statement getBodyRet;
		public BodyContext body;
		public TerminalNode GET() { return getToken(CmmParser.GET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public GetBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterGetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitGetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitGetBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetBodyContext getBody() throws RecognitionException {
		GetBodyContext _localctx = new GetBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_getBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(GET);
			setState(208);
			((GetBodyContext)_localctx).body = body();
			((GetBodyContext)_localctx).getBodyRet =  ((GetBodyContext)_localctx).body.bodyRet;
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(210);
				match(NEWLINE);
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class SetBodyContext extends ParserRuleContext {
		public Statement setBodyRet;
		public BodyContext body;
		public TerminalNode SET() { return getToken(CmmParser.SET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public SetBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSetBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetBodyContext setBody() throws RecognitionException {
		SetBodyContext _localctx = new SetBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_setBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(SET);
			setState(216);
			((SetBodyContext)_localctx).body = body();
			((SetBodyContext)_localctx).setBodyRet =  ((SetBodyContext)_localctx).body.bodyRet;
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(218);
				match(NEWLINE);
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclaration functionDeclarationRet;
		public TypeContext type;
		public IdentifierContext identifier;
		public FunctionArgsDecContext functionArgsDec;
		public BodyContext body;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionArgsDecContext functionArgsDec() {
			return getRuleContext(FunctionArgsDecContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(223);
				((FunctionDeclarationContext)_localctx).type = type();
				}
				break;
			case VOID:
				{
				setState(224);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(227);
			((FunctionDeclarationContext)_localctx).identifier = identifier();
			setState(228);
			((FunctionDeclarationContext)_localctx).functionArgsDec = functionArgsDec();
			setState(229);
			((FunctionDeclarationContext)_localctx).body = body();
			setState(231); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(230);
				match(NEWLINE);
				}
				}
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );

			        ((FunctionDeclarationContext)_localctx).functionDeclarationRet =  new FunctionDeclaration();
			        _localctx.functionDeclarationRet.setReturnType(((FunctionDeclarationContext)_localctx).type.typeRet);
			        _localctx.functionDeclarationRet.setFunctionName(((FunctionDeclarationContext)_localctx).identifier.identifierRet);
			        _localctx.functionDeclarationRet.setArgs(((FunctionDeclarationContext)_localctx).functionArgsDec.functionArgsDecRet);
			        _localctx.functionDeclarationRet.setBody(((FunctionDeclarationContext)_localctx).body.bodyRet);
			    
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

	public static class FunctionArgsDecContext extends ParserRuleContext {
		public ArrayList<VariableDeclaration> functionArgsDecRet;
		public TypeContext type;
		public IdentifierContext identifier;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public FunctionArgsDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgsDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionArgsDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionArgsDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionArgsDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgsDecContext functionArgsDec() throws RecognitionException {
		FunctionArgsDecContext _localctx = new FunctionArgsDecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionArgsDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((FunctionArgsDecContext)_localctx).functionArgsDecRet =  new ArrayList<VariableDeclaration>();
			    
			setState(238);
			match(LPAR);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(239);
				((FunctionArgsDecContext)_localctx).type = type();
				setState(240);
				((FunctionArgsDecContext)_localctx).identifier = identifier();
				_localctx.functionArgsDecRet.add(new VariableDeclaration(((FunctionArgsDecContext)_localctx).identifier.identifierRet, ((FunctionArgsDecContext)_localctx).type.typeRet));
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(242);
					match(COMMA);
					setState(243);
					((FunctionArgsDecContext)_localctx).type = type();
					setState(244);
					((FunctionArgsDecContext)_localctx).identifier = identifier();
					_localctx.functionArgsDecRet.add(new VariableDeclaration(((FunctionArgsDecContext)_localctx).identifier.identifierRet, ((FunctionArgsDecContext)_localctx).type.typeRet));
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(254);
			match(RPAR);
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

	public static class FunctionArgumentsContext extends ParserRuleContext {
		public ExprInPar functionArgumentsRet;
		public ExpressionContext e;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public FunctionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentsContext functionArguments() throws RecognitionException {
		FunctionArgumentsContext _localctx = new FunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ArrayList<Expression> inputs = new ArrayList<>();
			    
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(257);
				((FunctionArgumentsContext)_localctx).e = expression();
				inputs.add(((FunctionArgumentsContext)_localctx).e.expressionRet);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(259);
					match(COMMA);
					setState(260);
					((FunctionArgumentsContext)_localctx).e = expression();
					inputs.add(((FunctionArgumentsContext)_localctx).e.expressionRet);
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}


			        ((FunctionArgumentsContext)_localctx).functionArgumentsRet =  new ExprInPar(inputs);
			    
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

	public static class BodyContext extends ParserRuleContext {
		public Statement bodyRet;
		public BlockStatementContext blockStatement;
		public SingleStatementContext singleStatement;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(272);
				((BodyContext)_localctx).blockStatement = blockStatement();
				((BodyContext)_localctx).bodyRet =  ((BodyContext)_localctx).blockStatement.blockStatementRet;
				}
				break;
			case NEWLINE:
				{
				{
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(275);
					match(NEWLINE);
					}
					}
					setState(278); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(280);
				((BodyContext)_localctx).singleStatement = singleStatement();
				((BodyContext)_localctx).bodyRet =  ((BodyContext)_localctx).singleStatement.singleStatementRet;
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(282);
					match(SEMICOLON);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LoopCondBodyContext extends ParserRuleContext {
		public Statement loopCondBodyRet;
		public BlockStatementContext blockStatement;
		public SingleStatementContext singleStatement;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public LoopCondBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopCondBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterLoopCondBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitLoopCondBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitLoopCondBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopCondBodyContext loopCondBody() throws RecognitionException {
		LoopCondBodyContext _localctx = new LoopCondBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loopCondBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(287);
				((LoopCondBodyContext)_localctx).blockStatement = blockStatement();
				((LoopCondBodyContext)_localctx).loopCondBodyRet =  ((LoopCondBodyContext)_localctx).blockStatement.blockStatementRet;
				}
				break;
			case NEWLINE:
				{
				{
				setState(291); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(290);
					match(NEWLINE);
					}
					}
					setState(293); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(295);
				((LoopCondBodyContext)_localctx).singleStatement = singleStatement();
				((LoopCondBodyContext)_localctx).loopCondBodyRet =  ((LoopCondBodyContext)_localctx).singleStatement.singleStatementRet;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStmt blockStatementRet;
		public Token b;
		public SingleStatementContext singleStatement;
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CmmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CmmParser.SEMICOLON, i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((BlockStatementContext)_localctx).blockStatementRet =  new BlockStmt();
			setState(301);
			((BlockStatementContext)_localctx).b = match(BEGIN);
			_localctx.blockStatementRet.setLine((((BlockStatementContext)_localctx).b!=null?((BlockStatementContext)_localctx).b.getLine():0));
			setState(322); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(304); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(303);
						match(NEWLINE);
						}
						}
						setState(306); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(314);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(308);
							((BlockStatementContext)_localctx).singleStatement = singleStatement();
							_localctx.blockStatementRet.addStatement(((BlockStatementContext)_localctx).singleStatement.singleStatementRet);
							setState(310);
							match(SEMICOLON);
							}
							} 
						}
						setState(316);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					}
					setState(317);
					((BlockStatementContext)_localctx).singleStatement = singleStatement();
					_localctx.blockStatementRet.addStatement(((BlockStatementContext)_localctx).singleStatement.singleStatementRet);
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(319);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(324); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(327); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(326);
				match(NEWLINE);
				}
				}
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(331);
			match(END);
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

	public static class VarDecStatementContext extends ParserRuleContext {
		public VarDecStmt varDecStatementRet;
		public TypeContext type;
		public IdentifierContext identifier;
		public OrExpressionContext orExpression;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CmmParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CmmParser.ASSIGN, i);
		}
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public VarDecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVarDecStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVarDecStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVarDecStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecStatementContext varDecStatement() throws RecognitionException {
		VarDecStatementContext _localctx = new VarDecStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varDecStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((VarDecStatementContext)_localctx).varDecStatementRet =  new VarDecStmt();
			        ArrayList<VariableDeclaration> vars = new ArrayList<>();
			    
			{
			VariableDeclaration v = null;
			setState(335);
			((VarDecStatementContext)_localctx).type = type();
			setState(336);
			((VarDecStatementContext)_localctx).identifier = identifier();

			        _localctx.varDecStatementRet.setLine(((VarDecStatementContext)_localctx).identifier.identifierRet.getLine());
			        v = new VariableDeclaration(((VarDecStatementContext)_localctx).identifier.identifierRet, ((VarDecStatementContext)_localctx).type.typeRet);
			        v.setLine(((VarDecStatementContext)_localctx).identifier.identifierRet.getLine());
			        vars.add(v);
			    
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(338);
				match(ASSIGN);
				setState(339);
				((VarDecStatementContext)_localctx).orExpression = orExpression();
				v.setDefaultValue(((VarDecStatementContext)_localctx).orExpression.orExpressionRet);
				}
			}

			}
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				VariableDeclaration v1 = null;
				setState(345);
				match(COMMA);
				setState(346);
				((VarDecStatementContext)_localctx).identifier = identifier();

				        v1 = new VariableDeclaration(((VarDecStatementContext)_localctx).identifier.identifierRet, ((VarDecStatementContext)_localctx).type.typeRet);
				        v1.setLine(((VarDecStatementContext)_localctx).identifier.identifierRet.getLine());
				        vars.add(v1);
				    
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(348);
					match(ASSIGN);
					setState(349);
					((VarDecStatementContext)_localctx).orExpression = orExpression();
					v1.setDefaultValue(((VarDecStatementContext)_localctx).orExpression.orExpressionRet);
					}
				}

				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        _localctx.varDecStatementRet.setVars(vars);
			    
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

	public static class FunctionCallStmtContext extends ParserRuleContext {
		public FunctionCallStmt functionCallStmtRet;
		public OtherExpressionContext otherExpression;
		public Token l;
		public FunctionArgumentsContext functionArguments;
		public Token d;
		public IdentifierContext identifier;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<FunctionArgumentsContext> functionArguments() {
			return getRuleContexts(FunctionArgumentsContext.class);
		}
		public FunctionArgumentsContext functionArguments(int i) {
			return getRuleContext(FunctionArgumentsContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(CmmParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(CmmParser.RPAR, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(CmmParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(CmmParser.LPAR, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(CmmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CmmParser.DOT, i);
		}
		public FunctionCallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStmtContext functionCallStmt() throws RecognitionException {
		FunctionCallStmtContext _localctx = new FunctionCallStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionCallStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			((FunctionCallStmtContext)_localctx).otherExpression = otherExpression();
			Expression prev = ((FunctionCallStmtContext)_localctx).otherExpression.otherExpressionRet;
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(372);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(363);
						((FunctionCallStmtContext)_localctx).l = match(LPAR);
						setState(364);
						((FunctionCallStmtContext)_localctx).functionArguments = functionArguments();
						setState(365);
						match(RPAR);

						        FunctionCall f = new FunctionCall(prev);
						        f.setArgs(((FunctionCallStmtContext)_localctx).functionArguments.functionArgumentsRet.getInputs());
						        f.setLine((((FunctionCallStmtContext)_localctx).l!=null?((FunctionCallStmtContext)_localctx).l.getLine():0));
						        prev = f;
						     
						}
						}
						break;
					case DOT:
						{
						{
						setState(368);
						((FunctionCallStmtContext)_localctx).d = match(DOT);
						setState(369);
						((FunctionCallStmtContext)_localctx).identifier = identifier();

						        StructAccess sa = new StructAccess(prev, ((FunctionCallStmtContext)_localctx).identifier.identifierRet);
						        sa.setLine((((FunctionCallStmtContext)_localctx).d!=null?((FunctionCallStmtContext)_localctx).d.getLine():0));
						        prev = sa;
						     
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			{
			setState(377);
			((FunctionCallStmtContext)_localctx).l = match(LPAR);
			setState(378);
			((FunctionCallStmtContext)_localctx).functionArguments = functionArguments();
			setState(379);
			match(RPAR);

			        FunctionCall f = new FunctionCall(prev, ((FunctionCallStmtContext)_localctx).functionArguments.functionArgumentsRet.getInputs());
			        f.setLine((((FunctionCallStmtContext)_localctx).l!=null?((FunctionCallStmtContext)_localctx).l.getLine():0));
			        ((FunctionCallStmtContext)_localctx).functionCallStmtRet =  new FunctionCallStmt(f);
			     
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStmt returnStatementRet;
		public Token r;
		public ExpressionContext expression;
		public TerminalNode RETURN() { return getToken(CmmParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ReturnStatementContext)_localctx).returnStatementRet =  new ReturnStmt();
			setState(383);
			((ReturnStatementContext)_localctx).r = match(RETURN);
			_localctx.returnStatementRet.setLine((((ReturnStatementContext)_localctx).r!=null?((ReturnStatementContext)_localctx).r.getLine():0));
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(385);
				((ReturnStatementContext)_localctx).expression = expression();
				_localctx.returnStatementRet.setReturnedExpr(((ReturnStatementContext)_localctx).expression.expressionRet);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ConditionalStmt ifStatementRet;
		public Token i;
		public ExpressionContext expression;
		public LoopCondBodyContext loopCondBody;
		public BodyContext body;
		public ElseStatementContext elseStatement;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public LoopCondBodyContext loopCondBody() {
			return getRuleContext(LoopCondBodyContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			((IfStatementContext)_localctx).i = match(IF);
			setState(391);
			((IfStatementContext)_localctx).expression = expression();

			        ((IfStatementContext)_localctx).ifStatementRet =  new ConditionalStmt(((IfStatementContext)_localctx).expression.expressionRet);
			        _localctx.ifStatementRet.setLine((((IfStatementContext)_localctx).i!=null?((IfStatementContext)_localctx).i.getLine():0));
			    
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(393);
				((IfStatementContext)_localctx).loopCondBody = loopCondBody();
				_localctx.ifStatementRet.setThenBody(((IfStatementContext)_localctx).loopCondBody.loopCondBodyRet);
				}
				break;
			case 2:
				{
				setState(396);
				((IfStatementContext)_localctx).body = body();
				setState(397);
				((IfStatementContext)_localctx).elseStatement = elseStatement();

				        _localctx.ifStatementRet.setThenBody(((IfStatementContext)_localctx).body.bodyRet);
				        _localctx.ifStatementRet.setElseBody(((IfStatementContext)_localctx).elseStatement.elseStatementRet);
				    
				}
				break;
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

	public static class ElseStatementContext extends ParserRuleContext {
		public Statement elseStatementRet;
		public LoopCondBodyContext loopCondBody;
		public TerminalNode ELSE() { return getToken(CmmParser.ELSE, 0); }
		public LoopCondBodyContext loopCondBody() {
			return getRuleContext(LoopCondBodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(402);
				match(NEWLINE);
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			match(ELSE);
			setState(409);
			((ElseStatementContext)_localctx).loopCondBody = loopCondBody();
			((ElseStatementContext)_localctx).elseStatementRet =  ((ElseStatementContext)_localctx).loopCondBody.loopCondBodyRet;
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

	public static class LoopStatementContext extends ParserRuleContext {
		public LoopStmt loopStatementRet;
		public WhileLoopStatementContext whileLoopStatement;
		public DoWhileLoopStatementContext doWhileLoopStatement;
		public WhileLoopStatementContext whileLoopStatement() {
			return getRuleContext(WhileLoopStatementContext.class,0);
		}
		public DoWhileLoopStatementContext doWhileLoopStatement() {
			return getRuleContext(DoWhileLoopStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_loopStatement);
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				((LoopStatementContext)_localctx).whileLoopStatement = whileLoopStatement();
				((LoopStatementContext)_localctx).loopStatementRet =  ((LoopStatementContext)_localctx).whileLoopStatement.whileLoopStatementRet;
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				((LoopStatementContext)_localctx).doWhileLoopStatement = doWhileLoopStatement();
				((LoopStatementContext)_localctx).loopStatementRet =  ((LoopStatementContext)_localctx).doWhileLoopStatement.doWhileLoopStatementRet;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class WhileLoopStatementContext extends ParserRuleContext {
		public LoopStmt whileLoopStatementRet;
		public Token w;
		public ExpressionContext expression;
		public LoopCondBodyContext loopCondBody;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopCondBodyContext loopCondBody() {
			return getRuleContext(LoopCondBodyContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public WhileLoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterWhileLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitWhileLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitWhileLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopStatementContext whileLoopStatement() throws RecognitionException {
		WhileLoopStatementContext _localctx = new WhileLoopStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_whileLoopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			((WhileLoopStatementContext)_localctx).w = match(WHILE);
			setState(421);
			((WhileLoopStatementContext)_localctx).expression = expression();
			setState(422);
			((WhileLoopStatementContext)_localctx).loopCondBody = loopCondBody();

			        ((WhileLoopStatementContext)_localctx).whileLoopStatementRet =  new LoopStmt();
			        _localctx.whileLoopStatementRet.setCondition(((WhileLoopStatementContext)_localctx).expression.expressionRet);
			        _localctx.whileLoopStatementRet.setBody(((WhileLoopStatementContext)_localctx).loopCondBody.loopCondBodyRet);
			        _localctx.whileLoopStatementRet.setLine((((WhileLoopStatementContext)_localctx).w!=null?((WhileLoopStatementContext)_localctx).w.getLine():0));
			    
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

	public static class DoWhileLoopStatementContext extends ParserRuleContext {
		public LoopStmt doWhileLoopStatementRet;
		public Token d;
		public BodyContext body;
		public ExpressionContext expression;
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(CmmParser.DO, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public DoWhileLoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileLoopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDoWhileLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDoWhileLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDoWhileLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileLoopStatementContext doWhileLoopStatement() throws RecognitionException {
		DoWhileLoopStatementContext _localctx = new DoWhileLoopStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_doWhileLoopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			((DoWhileLoopStatementContext)_localctx).d = match(DO);
			setState(426);
			((DoWhileLoopStatementContext)_localctx).body = body();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(427);
				match(NEWLINE);
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
			match(WHILE);
			setState(434);
			((DoWhileLoopStatementContext)_localctx).expression = expression();

			        ((DoWhileLoopStatementContext)_localctx).doWhileLoopStatementRet =  new LoopStmt();
			        _localctx.doWhileLoopStatementRet.setCondition(((DoWhileLoopStatementContext)_localctx).expression.expressionRet);
			        _localctx.doWhileLoopStatementRet.setBody(((DoWhileLoopStatementContext)_localctx).body.bodyRet);
			        _localctx.doWhileLoopStatementRet.setLine(((DoWhileLoopStatementContext)_localctx).d.getLine());
			    
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

	public static class DisplayStatementContext extends ParserRuleContext {
		public DisplayStmt displayStatementRet;
		public Token d;
		public ExpressionContext expression;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode DISPLAY() { return getToken(CmmParser.DISPLAY, 0); }
		public DisplayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDisplayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDisplayStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDisplayStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayStatementContext displayStatement() throws RecognitionException {
		DisplayStatementContext _localctx = new DisplayStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_displayStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			((DisplayStatementContext)_localctx).d = match(DISPLAY);
			setState(438);
			match(LPAR);
			setState(439);
			((DisplayStatementContext)_localctx).expression = expression();
			setState(440);
			match(RPAR);

			      ((DisplayStatementContext)_localctx).displayStatementRet =  new DisplayStmt(((DisplayStatementContext)_localctx).expression.expressionRet);
			      _localctx.displayStatementRet.setLine((((DisplayStatementContext)_localctx).d!=null?((DisplayStatementContext)_localctx).d.getLine():0));
			  
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentStmt assignmentStatementRet;
		public OrExpressionContext orExpression;
		public Token a;
		public ExpressionContext expression;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{

			        Expression lhs = null;
			        Expression rhs = null;
			    
			setState(444);
			((AssignmentStatementContext)_localctx).orExpression = orExpression();
			lhs = ((AssignmentStatementContext)_localctx).orExpression.orExpressionRet;
			setState(446);
			((AssignmentStatementContext)_localctx).a = match(ASSIGN);
			setState(447);
			((AssignmentStatementContext)_localctx).expression = expression();
			rhs = ((AssignmentStatementContext)_localctx).expression.expressionRet;

			        ((AssignmentStatementContext)_localctx).assignmentStatementRet =  new AssignmentStmt(lhs, rhs);
			        _localctx.assignmentStatementRet.setLine((((AssignmentStatementContext)_localctx).a!=null?((AssignmentStatementContext)_localctx).a.getLine():0));
			    
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

	public static class SingleStatementContext extends ParserRuleContext {
		public Statement singleStatementRet;
		public IfStatementContext ifStatement;
		public DisplayStatementContext displayStatement;
		public FunctionCallStmtContext functionCallStmt;
		public ReturnStatementContext returnStatement;
		public AssignmentStatementContext assignmentStatement;
		public VarDecStatementContext varDecStatement;
		public LoopStatementContext loopStatement;
		public AppendContext append;
		public SizeContext size;
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public DisplayStatementContext displayStatement() {
			return getRuleContext(DisplayStatementContext.class,0);
		}
		public FunctionCallStmtContext functionCallStmt() {
			return getRuleContext(FunctionCallStmtContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public VarDecStatementContext varDecStatement() {
			return getRuleContext(VarDecStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public AppendContext append() {
			return getRuleContext(AppendContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_singleStatement);
		try {
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				((SingleStatementContext)_localctx).ifStatement = ifStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).ifStatement.ifStatementRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				((SingleStatementContext)_localctx).displayStatement = displayStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).displayStatement.displayStatementRet;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
				((SingleStatementContext)_localctx).functionCallStmt = functionCallStmt();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).functionCallStmt.functionCallStmtRet;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				((SingleStatementContext)_localctx).returnStatement = returnStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).returnStatement.returnStatementRet;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(463);
				((SingleStatementContext)_localctx).assignmentStatement = assignmentStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).assignmentStatement.assignmentStatementRet;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(466);
				((SingleStatementContext)_localctx).varDecStatement = varDecStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).varDecStatement.varDecStatementRet;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(469);
				((SingleStatementContext)_localctx).loopStatement = loopStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).loopStatement.loopStatementRet;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(472);
				((SingleStatementContext)_localctx).append = append();
				((SingleStatementContext)_localctx).singleStatementRet =  new ListAppendStmt(((SingleStatementContext)_localctx).append.appendRet);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(475);
				((SingleStatementContext)_localctx).size = size();
				((SingleStatementContext)_localctx).singleStatementRet =  new ListSizeStmt(((SingleStatementContext)_localctx).size.sizeRet);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression expressionRet;
		public OrExpressionContext orExpression;
		public Token op;
		public ExpressionContext expression;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			Expression prev = null;
			setState(481);
			((ExpressionContext)_localctx).orExpression = orExpression();
			prev = ((ExpressionContext)_localctx).orExpression.orExpressionRet;
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(483);
				((ExpressionContext)_localctx).op = match(ASSIGN);
				setState(484);
				((ExpressionContext)_localctx).expression = expression();

				        prev = new BinaryExpression(prev,
				                                    ((ExpressionContext)_localctx).expression.expressionRet,
				                                    BinaryOperator.assign);
				        prev.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
				    
				}
			}

			((ExpressionContext)_localctx).expressionRet =  prev;
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

	public static class OrExpressionContext extends ParserRuleContext {
		public Expression orExpressionRet;
		public AndExpressionContext ae1;
		public Token op;
		public AndExpressionContext ae2;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CmmParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CmmParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			Expression prev = null;
			setState(492);
			((OrExpressionContext)_localctx).ae1 = andExpression();
			prev = ((OrExpressionContext)_localctx).ae1.andExpressionRet;
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(494);
				((OrExpressionContext)_localctx).op = match(OR);
				setState(495);
				((OrExpressionContext)_localctx).ae2 = andExpression();

				        prev = new BinaryExpression(prev,
				                                ((OrExpressionContext)_localctx).ae2.andExpressionRet,
				                                BinaryOperator.or);
				        prev.setLine((((OrExpressionContext)_localctx).op!=null?((OrExpressionContext)_localctx).op.getLine():0));
				    
				}
				}
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((OrExpressionContext)_localctx).orExpressionRet =  prev;
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

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression andExpressionRet;
		public EqualityExpressionContext ex1;
		public Token op;
		public EqualityExpressionContext ex2;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CmmParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CmmParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			Expression prev = null;
			setState(506);
			((AndExpressionContext)_localctx).ex1 = equalityExpression();
			prev = ((AndExpressionContext)_localctx).ex1.equalityExpressionRet;
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(508);
				((AndExpressionContext)_localctx).op = match(AND);
				setState(509);
				((AndExpressionContext)_localctx).ex2 = equalityExpression();

				        prev = new BinaryExpression(prev,
				                                ((AndExpressionContext)_localctx).ex2.equalityExpressionRet,
				                                BinaryOperator.and);
				        prev.setLine((((AndExpressionContext)_localctx).op!=null?((AndExpressionContext)_localctx).op.getLine():0));
				    
				}
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((AndExpressionContext)_localctx).andExpressionRet =  prev;
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Expression equalityExpressionRet;
		public RelationalExpressionContext re1;
		public RelationalExpressionContext relationalExpression;
		public Token op;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(CmmParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(CmmParser.EQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			Expression prev = null;
			setState(520);
			((EqualityExpressionContext)_localctx).re1 = ((EqualityExpressionContext)_localctx).relationalExpression = relationalExpression();
			prev = ((EqualityExpressionContext)_localctx).re1.relationalExpressionRet;
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(522);
				((EqualityExpressionContext)_localctx).op = match(EQUAL);
				setState(523);
				((EqualityExpressionContext)_localctx).relationalExpression = relationalExpression();

				        prev = new BinaryExpression(prev,
				                                ((EqualityExpressionContext)_localctx).relationalExpression.relationalExpressionRet,
				                                BinaryOperator.eq);
				        prev.setLine((((EqualityExpressionContext)_localctx).op!=null?((EqualityExpressionContext)_localctx).op.getLine():0));
				    
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((EqualityExpressionContext)_localctx).equalityExpressionRet =  prev;
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression relationalExpressionRet;
		public AdditiveExpressionContext ae;
		public AdditiveExpressionContext additiveExpression;
		public Token op;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(CmmParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(CmmParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(CmmParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(CmmParser.LESS_THAN, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			Expression prev = null;
			setState(534);
			((RelationalExpressionContext)_localctx).ae = ((RelationalExpressionContext)_localctx).additiveExpression = additiveExpression();
			prev = ((RelationalExpressionContext)_localctx).ae.additiveExpressionRet;
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(538);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(536);
					((RelationalExpressionContext)_localctx).op = match(GREATER_THAN);
					}
					break;
				case LESS_THAN:
					{
					setState(537);
					((RelationalExpressionContext)_localctx).op = match(LESS_THAN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(540);
				((RelationalExpressionContext)_localctx).additiveExpression = additiveExpression();

				        BinaryOperator op = null;
				        if((((RelationalExpressionContext)_localctx).op!=null?((RelationalExpressionContext)_localctx).op.getText():null) == ">")
				            op = BinaryOperator.gt;
				        else
				            op = BinaryOperator.lt;
				        prev = new BinaryExpression(prev,
				                                    ((RelationalExpressionContext)_localctx).additiveExpression.additiveExpressionRet,
				                                    op);
				        prev.setLine((((RelationalExpressionContext)_localctx).op!=null?((RelationalExpressionContext)_localctx).op.getLine():0));
				    
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((RelationalExpressionContext)_localctx).relationalExpressionRet =  prev;
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression additiveExpressionRet;
		public MultiplicativeExpressionContext me;
		public MultiplicativeExpressionContext multiplicativeExpression;
		public Token op;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CmmParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CmmParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CmmParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CmmParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			Expression prev = null;
			setState(551);
			((AdditiveExpressionContext)_localctx).me = ((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression();
			prev = ((AdditiveExpressionContext)_localctx).me.multiplicativeExpressionRet;
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(555);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(553);
					((AdditiveExpressionContext)_localctx).op = match(PLUS);
					}
					break;
				case MINUS:
					{
					setState(554);
					((AdditiveExpressionContext)_localctx).op = match(MINUS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(557);
				((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression();

				        BinaryOperator op = null;
				        if((((AdditiveExpressionContext)_localctx).op!=null?((AdditiveExpressionContext)_localctx).op.getText():null) == "+")
				            op = BinaryOperator.add;
				        else
				            op = BinaryOperator.sub;
				        prev = new BinaryExpression(prev,
				                                    ((AdditiveExpressionContext)_localctx).multiplicativeExpression.multiplicativeExpressionRet,
				                                    op);
				        prev.setLine((((AdditiveExpressionContext)_localctx).op!=null?((AdditiveExpressionContext)_localctx).op.getLine():0));
				    
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((AdditiveExpressionContext)_localctx).additiveExpressionRet =  prev;
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression multiplicativeExpressionRet;
		public PreUnaryExpressionContext pue;
		public PreUnaryExpressionContext preUnaryExpression;
		public Token op;
		public List<PreUnaryExpressionContext> preUnaryExpression() {
			return getRuleContexts(PreUnaryExpressionContext.class);
		}
		public PreUnaryExpressionContext preUnaryExpression(int i) {
			return getRuleContext(PreUnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(CmmParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(CmmParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(CmmParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(CmmParser.DIVIDE, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			Expression prev = null;
			setState(568);
			((MultiplicativeExpressionContext)_localctx).pue = ((MultiplicativeExpressionContext)_localctx).preUnaryExpression = preUnaryExpression();
			prev = ((MultiplicativeExpressionContext)_localctx).pue.preUnaryExpressionRet;
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVIDE) {
				{
				{
				setState(572);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(570);
					((MultiplicativeExpressionContext)_localctx).op = match(MULT);
					}
					break;
				case DIVIDE:
					{
					setState(571);
					((MultiplicativeExpressionContext)_localctx).op = match(DIVIDE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(574);
				((MultiplicativeExpressionContext)_localctx).preUnaryExpression = preUnaryExpression();

				        BinaryOperator op = null;
				        if((((MultiplicativeExpressionContext)_localctx).op!=null?((MultiplicativeExpressionContext)_localctx).op.getText():null) == "*")
				            op = BinaryOperator.mult;
				        else
				            op = BinaryOperator.div;
				        prev = new BinaryExpression(prev,
				                                    ((MultiplicativeExpressionContext)_localctx).preUnaryExpression.preUnaryExpressionRet,
				                                    op);
				        prev.setLine((((MultiplicativeExpressionContext)_localctx).op!=null?((MultiplicativeExpressionContext)_localctx).op.getLine():0));
				    
				}
				}
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((MultiplicativeExpressionContext)_localctx).multiplicativeExpressionRet =  prev;
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

	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public Expression preUnaryExpressionRet;
		public Token op;
		public PreUnaryExpressionContext preUnaryExpression;
		public AccessExpressionContext accessExpression;
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CmmParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(CmmParser.MINUS, 0); }
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterPreUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitPreUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_preUnaryExpression);
		try {
			setState(595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(586);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(584);
					((PreUnaryExpressionContext)_localctx).op = match(NOT);
					}
					break;
				case MINUS:
					{
					setState(585);
					((PreUnaryExpressionContext)_localctx).op = match(MINUS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(588);
				((PreUnaryExpressionContext)_localctx).preUnaryExpression = preUnaryExpression();
				}

				        UnaryExpression curr = null;
				        if((((PreUnaryExpressionContext)_localctx).op!=null?((PreUnaryExpressionContext)_localctx).op.getText():null) == "~")
				            curr = new UnaryExpression(((PreUnaryExpressionContext)_localctx).preUnaryExpression.preUnaryExpressionRet,
				                                    UnaryOperator.not);
				        else
				            curr = new UnaryExpression(((PreUnaryExpressionContext)_localctx).preUnaryExpression.preUnaryExpressionRet,
				                                    UnaryOperator.minus);
				        curr.setLine((((PreUnaryExpressionContext)_localctx).op!=null?((PreUnaryExpressionContext)_localctx).op.getLine():0));
				        ((PreUnaryExpressionContext)_localctx).preUnaryExpressionRet =  curr;
				    
				}
				break;
			case SIZE:
			case APPEND:
			case TRUE:
			case FALSE:
			case LPAR:
			case INT_VALUE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				((PreUnaryExpressionContext)_localctx).accessExpression = accessExpression();
				((PreUnaryExpressionContext)_localctx).preUnaryExpressionRet =  ((PreUnaryExpressionContext)_localctx).accessExpression.accessExpressionRet;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AccessExpressionContext extends ParserRuleContext {
		public Expression accessExpressionRet;
		public OtherExpressionContext otherExpression;
		public Token l;
		public FunctionArgumentsContext functionArguments;
		public Token d;
		public IdentifierContext identifier;
		public ExpressionContext expression;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<FunctionArgumentsContext> functionArguments() {
			return getRuleContexts(FunctionArgumentsContext.class);
		}
		public FunctionArgumentsContext functionArguments(int i) {
			return getRuleContext(FunctionArgumentsContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(CmmParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(CmmParser.RPAR, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CmmParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CmmParser.RBRACK, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(CmmParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(CmmParser.LPAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CmmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CmmParser.DOT, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(CmmParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CmmParser.LBRACK, i);
		}
		public AccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessExpressionContext accessExpression() throws RecognitionException {
		AccessExpressionContext _localctx = new AccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_accessExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			((AccessExpressionContext)_localctx).otherExpression = otherExpression();
			Expression prev = ((AccessExpressionContext)_localctx).otherExpression.otherExpressionRet;
			setState(610);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(608);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(599);
						((AccessExpressionContext)_localctx).l = match(LPAR);
						setState(600);
						((AccessExpressionContext)_localctx).functionArguments = functionArguments();
						setState(601);
						match(RPAR);

						        FunctionCall f = new FunctionCall(prev);
						        f.setArgs(((AccessExpressionContext)_localctx).functionArguments.functionArgumentsRet.getInputs());
						        f.setLine((((AccessExpressionContext)_localctx).l!=null?((AccessExpressionContext)_localctx).l.getLine():0));
						        prev = f;
						    
						}
						}
						break;
					case DOT:
						{
						{
						setState(604);
						((AccessExpressionContext)_localctx).d = match(DOT);
						setState(605);
						((AccessExpressionContext)_localctx).identifier = identifier();

						        StructAccess sa = new StructAccess(prev, ((AccessExpressionContext)_localctx).identifier.identifierRet);
						        sa.setLine((((AccessExpressionContext)_localctx).d!=null?((AccessExpressionContext)_localctx).d.getLine():0));
						        prev = sa;
						    
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==DOT) {
				{
				setState(622);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					{
					setState(613);
					((AccessExpressionContext)_localctx).l = match(LBRACK);
					setState(614);
					((AccessExpressionContext)_localctx).expression = expression();
					setState(615);
					match(RBRACK);

					        ListAccessByIndex l = new ListAccessByIndex(prev, ((AccessExpressionContext)_localctx).expression.expressionRet);
					        l.setLine((((AccessExpressionContext)_localctx).l!=null?((AccessExpressionContext)_localctx).l.getLine():0));
					    
					}
					}
					break;
				case DOT:
					{
					{
					setState(618);
					((AccessExpressionContext)_localctx).d = match(DOT);
					setState(619);
					((AccessExpressionContext)_localctx).identifier = identifier();

					        StructAccess sa = new StructAccess(prev, ((AccessExpressionContext)_localctx).identifier.identifierRet);
					        sa.setLine((((AccessExpressionContext)_localctx).d!=null?((AccessExpressionContext)_localctx).d.getLine():0));
					        prev = sa;
					    
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((AccessExpressionContext)_localctx).accessExpressionRet =  prev;
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

	public static class OtherExpressionContext extends ParserRuleContext {
		public Expression otherExpressionRet;
		public ValueContext v;
		public IdentifierContext i;
		public Token l;
		public FunctionArgumentsContext f;
		public SizeContext s;
		public AppendContext a;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public AppendContext append() {
			return getRuleContext(AppendContext.class,0);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_otherExpression);
		try {
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case INT_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				((OtherExpressionContext)_localctx).v = value();
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).v.valueRet;
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				((OtherExpressionContext)_localctx).i = identifier();
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).i.identifierRet;
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(635);
				((OtherExpressionContext)_localctx).l = match(LPAR);
				{
				setState(636);
				((OtherExpressionContext)_localctx).f = functionArguments();
				}
				setState(637);
				match(RPAR);

				        ((OtherExpressionContext)_localctx).f.functionArgumentsRet.setLine((((OtherExpressionContext)_localctx).l!=null?((OtherExpressionContext)_localctx).l.getLine():0));
				        ((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).f.functionArgumentsRet;
				    
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 4);
				{
				setState(640);
				((OtherExpressionContext)_localctx).s = size();
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).s.sizeRet;
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 5);
				{
				setState(643);
				((OtherExpressionContext)_localctx).a = append();
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).a.appendRet;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SizeContext extends ParserRuleContext {
		public ListSize sizeRet;
		public Token s;
		public ExpressionContext e;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode SIZE() { return getToken(CmmParser.SIZE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			Expression arg = null;
			setState(649);
			((SizeContext)_localctx).s = match(SIZE);
			setState(650);
			match(LPAR);
			setState(651);
			((SizeContext)_localctx).e = expression();
			((SizeContext)_localctx).sizeRet =  new ListSize(((SizeContext)_localctx).e.expressionRet);
			setState(653);
			match(RPAR);
			_localctx.sizeRet.setLine((((SizeContext)_localctx).s!=null?((SizeContext)_localctx).s.getLine():0));
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

	public static class AppendContext extends ParserRuleContext {
		public ListAppend appendRet;
		public Token a;
		public ExpressionContext la;
		public ExpressionContext ea;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode COMMA() { return getToken(CmmParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode APPEND() { return getToken(CmmParser.APPEND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AppendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAppend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAppend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAppend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendContext append() throws RecognitionException {
		AppendContext _localctx = new AppendContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_append);
		try {
			enterOuterAlt(_localctx, 1);
			{

			    Expression listArg = null;
			    Expression elementArg = null;
			    
			setState(657);
			((AppendContext)_localctx).a = match(APPEND);
			setState(658);
			match(LPAR);
			setState(659);
			((AppendContext)_localctx).la = expression();
			listArg = ((AppendContext)_localctx).la.expressionRet;
			setState(661);
			match(COMMA);
			setState(662);
			((AppendContext)_localctx).ea = expression();
			elementArg = ((AppendContext)_localctx).ea.expressionRet;
			setState(664);
			match(RPAR);

			    ((AppendContext)_localctx).appendRet =  new ListAppend(listArg, elementArg);
			    _localctx.appendRet.setLine((((AppendContext)_localctx).a!=null?((AppendContext)_localctx).a.getLine():0));
			    
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

	public static class ValueContext extends ParserRuleContext {
		public Value valueRet;
		public BoolValueContext b;
		public Token i;
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode INT_VALUE() { return getToken(CmmParser.INT_VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_value);
		try {
			setState(672);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				((ValueContext)_localctx).b = boolValue();
				((ValueContext)_localctx).valueRet =  ((ValueContext)_localctx).b.boolValueRet;
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				((ValueContext)_localctx).i = match(INT_VALUE);
				((ValueContext)_localctx).valueRet =  new IntValue((((ValueContext)_localctx).i!=null?Integer.valueOf(((ValueContext)_localctx).i.getText()):0)); _localctx.valueRet.setLine((((ValueContext)_localctx).i!=null?((ValueContext)_localctx).i.getLine():0));
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BoolValueContext extends ParserRuleContext {
		public BoolValue boolValueRet;
		public Token t;
		public Token f;
		public TerminalNode TRUE() { return getToken(CmmParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CmmParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_boolValue);
		try {
			setState(678);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				((BoolValueContext)_localctx).t = match(TRUE);
				((BoolValueContext)_localctx).boolValueRet =  new BoolValue(true); _localctx.boolValueRet.setLine((((BoolValueContext)_localctx).t!=null?((BoolValueContext)_localctx).t.getLine():0));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				((BoolValueContext)_localctx).f = match(FALSE);
				((BoolValueContext)_localctx).boolValueRet =  new BoolValue(false); _localctx.boolValueRet.setLine((((BoolValueContext)_localctx).f!=null?((BoolValueContext)_localctx).f.getLine():0));
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier identifierRet;
		public Token i;
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			((IdentifierContext)_localctx).i = match(IDENTIFIER);
			((IdentifierContext)_localctx).identifierRet =  new Identifier((((IdentifierContext)_localctx).i!=null?((IdentifierContext)_localctx).i.getText():null));
			                    _localctx.identifierRet.setLine((((IdentifierContext)_localctx).i!=null?((IdentifierContext)_localctx).i.getLine():0));
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

	public static class TypeContext extends ParserRuleContext {
		public Type typeRet;
		public TypeContext t;
		public IdentifierContext i;
		public FptrTypeContext f;
		public TerminalNode INT() { return getToken(CmmParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(CmmParser.BOOL, 0); }
		public TerminalNode LIST() { return getToken(CmmParser.LIST, 0); }
		public TerminalNode SHARP() { return getToken(CmmParser.SHARP, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FptrTypeContext fptrType() {
			return getRuleContext(FptrTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_type);
		try {
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				match(INT);
				 ((TypeContext)_localctx).typeRet =  new IntType(); 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				match(BOOL);
				 ((TypeContext)_localctx).typeRet =  new BoolType(); 
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(687);
				match(LIST);
				setState(688);
				match(SHARP);
				setState(689);
				((TypeContext)_localctx).t = type();
				 ((TypeContext)_localctx).typeRet =  new ListType(((TypeContext)_localctx).t.typeRet); 
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 4);
				{
				setState(692);
				match(STRUCT);
				setState(693);
				((TypeContext)_localctx).i = identifier();
				 ((TypeContext)_localctx).typeRet =  new StructType(((TypeContext)_localctx).i.identifierRet); 
				}
				break;
			case FPTR:
				enterOuterAlt(_localctx, 5);
				{
				setState(696);
				((TypeContext)_localctx).f = fptrType();
				((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).f.fptrTypeRet;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FptrTypeContext extends ParserRuleContext {
		public FptrType fptrTypeRet;
		public TypeContext t1;
		public TypeContext t2;
		public TypeContext t3;
		public TerminalNode FPTR() { return getToken(CmmParser.FPTR, 0); }
		public TerminalNode LESS_THAN() { return getToken(CmmParser.LESS_THAN, 0); }
		public TerminalNode ARROW() { return getToken(CmmParser.ARROW, 0); }
		public TerminalNode GREATER_THAN() { return getToken(CmmParser.GREATER_THAN, 0); }
		public List<TerminalNode> VOID() { return getTokens(CmmParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(CmmParser.VOID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public FptrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fptrType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFptrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFptrType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFptrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FptrTypeContext fptrType() throws RecognitionException {
		FptrTypeContext _localctx = new FptrTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fptrType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ArrayList<Type> args = new ArrayList<>();
			        Type returnType = null;
			    
			setState(702);
			match(FPTR);
			setState(703);
			match(LESS_THAN);
			setState(717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(704);
				match(VOID);
				 args.add(new VoidType()); 
				}
				break;
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				{
				setState(706);
				((FptrTypeContext)_localctx).t1 = type();
				 args.add(((FptrTypeContext)_localctx).t1.typeRet); 
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(708);
					match(COMMA);
					setState(709);
					((FptrTypeContext)_localctx).t2 = type();
					 args.add(((FptrTypeContext)_localctx).t2.typeRet); 
					}
					}
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(719);
			match(ARROW);
			setState(725);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(720);
				((FptrTypeContext)_localctx).t3 = type();
				 returnType = ((FptrTypeContext)_localctx).t3.typeRet; 
				}
				break;
			case VOID:
				{
				setState(723);
				match(VOID);
				 returnType = new VoidType(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(727);
			match(GREATER_THAN);
			 ((FptrTypeContext)_localctx).fptrTypeRet =  new FptrType(args, returnType); 
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u02dd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\3\2\7\2b\n\2\f\2\16\2e\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\3\3\3\3\7\3u\n\3\f"+
		"\3\16\3x\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\6\5\u008b\n\5\r\5\16\5\u008c\3\5\3\5\3\5\3\5\6\5\u0093\n"+
		"\5\r\5\16\5\u0094\3\5\3\5\3\5\5\5\u009a\n\5\5\5\u009c\n\5\3\5\6\5\u009f"+
		"\n\5\r\5\16\5\u00a0\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00a9\n\6\r\6\16\6\u00aa"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b8\n\7\3\b\3\b\6\b"+
		"\u00bc\n\b\r\b\16\b\u00bd\3\b\3\b\3\b\3\b\7\b\u00c4\n\b\f\b\16\b\u00c7"+
		"\13\b\3\b\3\b\3\b\5\b\u00cc\n\b\6\b\u00ce\n\b\r\b\16\b\u00cf\3\t\3\t\3"+
		"\t\3\t\6\t\u00d6\n\t\r\t\16\t\u00d7\3\n\3\n\3\n\3\n\6\n\u00de\n\n\r\n"+
		"\16\n\u00df\3\13\3\13\5\13\u00e4\n\13\3\13\3\13\3\13\3\13\6\13\u00ea\n"+
		"\13\r\13\16\13\u00eb\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u00fa\n\f\f\f\16\f\u00fd\13\f\5\f\u00ff\n\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u010a\n\r\f\r\16\r\u010d\13\r\5\r\u010f\n\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\6\16\u0117\n\16\r\16\16\16\u0118\3\16\3\16\3\16\5"+
		"\16\u011e\n\16\5\16\u0120\n\16\3\17\3\17\3\17\3\17\6\17\u0126\n\17\r\17"+
		"\16\17\u0127\3\17\3\17\3\17\5\17\u012d\n\17\3\20\3\20\3\20\3\20\6\20\u0133"+
		"\n\20\r\20\16\20\u0134\3\20\3\20\3\20\3\20\7\20\u013b\n\20\f\20\16\20"+
		"\u013e\13\20\3\20\3\20\3\20\5\20\u0143\n\20\6\20\u0145\n\20\r\20\16\20"+
		"\u0146\3\20\6\20\u014a\n\20\r\20\16\20\u014b\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0159\n\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0163\n\21\7\21\u0165\n\21\f\21\16\21\u0168\13\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u0177\n\22\f\22\16\22\u017a\13\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0187\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0193\n\24\3\25\7\25\u0196\n\25\f\25\16\25\u0199"+
		"\13\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01a5\n"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u01af\n\30\f\30\16\30"+
		"\u01b2\13\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u01e1\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u01ea\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\7\35\u01f5\n\35\f\35\16\35\u01f8\13\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\7\36\u0203\n\36\f\36\16\36\u0206\13\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0211\n\37\f\37\16\37\u0214\13\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \5 \u021d\n \3 \3 \3 \7 \u0222\n \f \16 \u0225"+
		"\13 \3 \3 \3!\3!\3!\3!\3!\5!\u022e\n!\3!\3!\3!\7!\u0233\n!\f!\16!\u0236"+
		"\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u023f\n\"\3\"\3\"\3\"\7\"\u0244\n\""+
		"\f\"\16\"\u0247\13\"\3\"\3\"\3#\3#\5#\u024d\n#\3#\3#\3#\3#\3#\3#\3#\5"+
		"#\u0256\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0263\n$\f$\16$\u0266\13"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0271\n$\f$\16$\u0274\13$\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0289\n%\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\5(\u02a3\n(\3)\3)\3)\3)\5)\u02a9\n)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u02be\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\7,\u02cb\n,\f,\16,\u02ce\13,\5,\u02d0\n,\3,\3,\3,\3,\3,\3,\5,\u02d8"+
		"\n,\3,\3,\3,\3,\2\2-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTV\2\2\2\u0301\2[\3\2\2\2\4h\3\2\2\2\6|\3\2\2\2"+
		"\b\u0082\3\2\2\2\n\u00a2\3\2\2\2\f\u00b7\3\2\2\2\16\u00b9\3\2\2\2\20\u00d1"+
		"\3\2\2\2\22\u00d9\3\2\2\2\24\u00e3\3\2\2\2\26\u00ef\3\2\2\2\30\u0102\3"+
		"\2\2\2\32\u011f\3\2\2\2\34\u012c\3\2\2\2\36\u012e\3\2\2\2 \u014f\3\2\2"+
		"\2\"\u016b\3\2\2\2$\u0180\3\2\2\2&\u0188\3\2\2\2(\u0197\3\2\2\2*\u01a4"+
		"\3\2\2\2,\u01a6\3\2\2\2.\u01ab\3\2\2\2\60\u01b7\3\2\2\2\62\u01bd\3\2\2"+
		"\2\64\u01e0\3\2\2\2\66\u01e2\3\2\2\28\u01ed\3\2\2\2:\u01fb\3\2\2\2<\u0209"+
		"\3\2\2\2>\u0217\3\2\2\2@\u0228\3\2\2\2B\u0239\3\2\2\2D\u0255\3\2\2\2F"+
		"\u0257\3\2\2\2H\u0288\3\2\2\2J\u028a\3\2\2\2L\u0292\3\2\2\2N\u02a2\3\2"+
		"\2\2P\u02a8\3\2\2\2R\u02aa\3\2\2\2T\u02bd\3\2\2\2V\u02bf\3\2\2\2XZ\7,"+
		"\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\5"+
		"\4\3\2_c\b\2\1\2`b\7,\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3"+
		"\2\2\2ec\3\2\2\2fg\7\2\2\3g\3\3\2\2\2hn\b\3\1\2ij\5\b\5\2jk\b\3\1\2km"+
		"\3\2\2\2li\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2ov\3\2\2\2pn\3\2\2\2q"+
		"r\5\24\13\2rs\b\3\1\2su\3\2\2\2tq\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2"+
		"\2wy\3\2\2\2xv\3\2\2\2yz\5\6\4\2z{\b\3\1\2{\5\3\2\2\2|}\7\3\2\2}~\7%\2"+
		"\2~\177\7&\2\2\177\u0080\5\32\16\2\u0080\u0081\b\4\1\2\u0081\7\3\2\2\2"+
		"\u0082\u0083\b\5\1\2\u0083\u0084\7\35\2\2\u0084\u0085\b\5\1\2\u0085\u0086"+
		"\5R*\2\u0086\u009b\b\5\1\2\u0087\u0088\7\30\2\2\u0088\u008a\5\16\b\2\u0089"+
		"\u008b\7,\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\31\2\2\u008f"+
		"\u0090\b\5\1\2\u0090\u009c\3\2\2\2\u0091\u0093\7,\2\2\u0092\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\5\f\7\2\u0097\u0099\b\5\1\2\u0098\u009a\7+"+
		"\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b"+
		"\u0087\3\2\2\2\u009b\u0092\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009f\7,"+
		"\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\t\3\2\2\2\u00a2\u00a3\b\6\1\2\u00a3\u00a4\5T+\2\u00a4"+
		"\u00a5\5R*\2\u00a5\u00a6\5\26\f\2\u00a6\u00a8\7\30\2\2\u00a7\u00a9\7,"+
		"\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\5\22\n\2\u00ad\u00ae\5"+
		"\20\t\2\u00ae\u00af\7\31\2\2\u00af\u00b0\b\6\1\2\u00b0\13\3\2\2\2\u00b1"+
		"\u00b2\5 \21\2\u00b2\u00b3\b\7\1\2\u00b3\u00b8\3\2\2\2\u00b4\u00b5\5\n"+
		"\6\2\u00b5\u00b6\b\7\1\2\u00b6\u00b8\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7"+
		"\u00b4\3\2\2\2\u00b8\r\3\2\2\2\u00b9\u00cd\b\b\1\2\u00ba\u00bc\7,\2\2"+
		"\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00c5\3\2\2\2\u00bf\u00c0\5\f\7\2\u00c0\u00c1\b\b\1\2\u00c1"+
		"\u00c2\7+\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c4\u00c7\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00c9\5\f\7\2\u00c9\u00cb\b\b\1\2\u00ca\u00cc\7+"+
		"\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00bb\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\17\3\2\2\2\u00d1\u00d2\7\37\2\2\u00d2\u00d3\5\32\16\2\u00d3"+
		"\u00d5\b\t\1\2\u00d4\u00d6\7,\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\21\3\2\2\2\u00d9\u00da"+
		"\7 \2\2\u00da\u00db\5\32\16\2\u00db\u00dd\b\n\1\2\u00dc\u00de\7,\2\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\23\3\2\2\2\u00e1\u00e4\5T+\2\u00e2\u00e4\7\5\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\5R*\2\u00e6"+
		"\u00e7\5\26\f\2\u00e7\u00e9\5\32\16\2\u00e8\u00ea\7,\2\2\u00e9\u00e8\3"+
		"\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ee\b\13\1\2\u00ee\25\3\2\2\2\u00ef\u00f0\b\f\1"+
		"\2\u00f0\u00fe\7%\2\2\u00f1\u00f2\5T+\2\u00f2\u00f3\5R*\2\u00f3\u00fb"+
		"\b\f\1\2\u00f4\u00f5\7)\2\2\u00f5\u00f6\5T+\2\u00f6\u00f7\5R*\2\u00f7"+
		"\u00f8\b\f\1\2\u00f8\u00fa\3\2\2\2\u00f9\u00f4\3\2\2\2\u00fa\u00fd\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u00f1\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0101\7&\2\2\u0101\27\3\2\2\2\u0102\u010e\b\r\1\2\u0103\u0104"+
		"\5\66\34\2\u0104\u010b\b\r\1\2\u0105\u0106\7)\2\2\u0106\u0107\5\66\34"+
		"\2\u0107\u0108\b\r\1\2\u0108\u010a\3\2\2\2\u0109\u0105\3\2\2\2\u010a\u010d"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0103\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0111\b\r\1\2\u0111\31\3\2\2\2\u0112\u0113\5\36\20\2\u0113"+
		"\u0114\b\16\1\2\u0114\u0120\3\2\2\2\u0115\u0117\7,\2\2\u0116\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\5\64\33\2\u011b\u011d\b\16\1\2\u011c\u011e"+
		"\7+\2\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f"+
		"\u0112\3\2\2\2\u011f\u0116\3\2\2\2\u0120\33\3\2\2\2\u0121\u0122\5\36\20"+
		"\2\u0122\u0123\b\17\1\2\u0123\u012d\3\2\2\2\u0124\u0126\7,\2\2\u0125\u0124"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012a\5\64\33\2\u012a\u012b\b\17\1\2\u012b\u012d"+
		"\3\2\2\2\u012c\u0121\3\2\2\2\u012c\u0125\3\2\2\2\u012d\35\3\2\2\2\u012e"+
		"\u012f\b\20\1\2\u012f\u0130\7\30\2\2\u0130\u0144\b\20\1\2\u0131\u0133"+
		"\7,\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u013c\3\2\2\2\u0136\u0137\5\64\33\2\u0137\u0138\b"+
		"\20\1\2\u0138\u0139\7+\2\2\u0139\u013b\3\2\2\2\u013a\u0136\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013f\u0140\5\64\33\2\u0140\u0142\b\20\1\2\u0141"+
		"\u0143\7+\2\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2"+
		"\2\2\u0144\u0132\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u014a\7,\2\2\u0149\u0148\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014e\7\31\2\2\u014e\37\3\2\2\2\u014f\u0150\b\21"+
		"\1\2\u0150\u0151\b\21\1\2\u0151\u0152\5T+\2\u0152\u0153\5R*\2\u0153\u0158"+
		"\b\21\1\2\u0154\u0155\7#\2\2\u0155\u0156\58\35\2\u0156\u0157\b\21\1\2"+
		"\u0157\u0159\3\2\2\2\u0158\u0154\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0166"+
		"\3\2\2\2\u015a\u015b\b\21\1\2\u015b\u015c\7)\2\2\u015c\u015d\5R*\2\u015d"+
		"\u0162\b\21\1\2\u015e\u015f\7#\2\2\u015f\u0160\58\35\2\u0160\u0161\b\21"+
		"\1\2\u0161\u0163\3\2\2\2\u0162\u015e\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0165\3\2\2\2\u0164\u015a\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016a\b\21\1\2\u016a!\3\2\2\2\u016b\u016c\5H%\2\u016c\u0178\b\22\1\2"+
		"\u016d\u016e\7%\2\2\u016e\u016f\5\30\r\2\u016f\u0170\7&\2\2\u0170\u0171"+
		"\b\22\1\2\u0171\u0177\3\2\2\2\u0172\u0173\7*\2\2\u0173\u0174\5R*\2\u0174"+
		"\u0175\b\22\1\2\u0175\u0177\3\2\2\2\u0176\u016d\3\2\2\2\u0176\u0172\3"+
		"\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\7%\2\2\u017c\u017d\5\30"+
		"\r\2\u017d\u017e\7&\2\2\u017e\u017f\b\22\1\2\u017f#\3\2\2\2\u0180\u0181"+
		"\b\23\1\2\u0181\u0182\7\4\2\2\u0182\u0186\b\23\1\2\u0183\u0184\5\66\34"+
		"\2\u0184\u0185\b\23\1\2\u0185\u0187\3\2\2\2\u0186\u0183\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187%\3\2\2\2\u0188\u0189\7\t\2\2\u0189\u018a\5\66\34"+
		"\2\u018a\u0192\b\24\1\2\u018b\u018c\5\34\17\2\u018c\u018d\b\24\1\2\u018d"+
		"\u0193\3\2\2\2\u018e\u018f\5\32\16\2\u018f\u0190\5(\25\2\u0190\u0191\b"+
		"\24\1\2\u0191\u0193\3\2\2\2\u0192\u018b\3\2\2\2\u0192\u018e\3\2\2\2\u0193"+
		"\'\3\2\2\2\u0194\u0196\7,\2\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2"+
		"\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197"+
		"\3\2\2\2\u019a\u019b\7\n\2\2\u019b\u019c\5\34\17\2\u019c\u019d\b\25\1"+
		"\2\u019d)\3\2\2\2\u019e\u019f\5,\27\2\u019f\u01a0\b\26\1\2\u01a0\u01a5"+
		"\3\2\2\2\u01a1\u01a2\5.\30\2\u01a2\u01a3\b\26\1\2\u01a3\u01a5\3\2\2\2"+
		"\u01a4\u019e\3\2\2\2\u01a4\u01a1\3\2\2\2\u01a5+\3\2\2\2\u01a6\u01a7\7"+
		"!\2\2\u01a7\u01a8\5\66\34\2\u01a8\u01a9\5\34\17\2\u01a9\u01aa\b\27\1\2"+
		"\u01aa-\3\2\2\2\u01ab\u01ac\7\"\2\2\u01ac\u01b0\5\32\16\2\u01ad\u01af"+
		"\7,\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\7!"+
		"\2\2\u01b4\u01b5\5\66\34\2\u01b5\u01b6\b\30\1\2\u01b6/\3\2\2\2\u01b7\u01b8"+
		"\7\7\2\2\u01b8\u01b9\7%\2\2\u01b9\u01ba\5\66\34\2\u01ba\u01bb\7&\2\2\u01bb"+
		"\u01bc\b\31\1\2\u01bc\61\3\2\2\2\u01bd\u01be\b\32\1\2\u01be\u01bf\58\35"+
		"\2\u01bf\u01c0\b\32\1\2\u01c0\u01c1\7#\2\2\u01c1\u01c2\5\66\34\2\u01c2"+
		"\u01c3\b\32\1\2\u01c3\u01c4\b\32\1\2\u01c4\63\3\2\2\2\u01c5\u01c6\5&\24"+
		"\2\u01c6\u01c7\b\33\1\2\u01c7\u01e1\3\2\2\2\u01c8\u01c9\5\60\31\2\u01c9"+
		"\u01ca\b\33\1\2\u01ca\u01e1\3\2\2\2\u01cb\u01cc\5\"\22\2\u01cc\u01cd\b"+
		"\33\1\2\u01cd\u01e1\3\2\2\2\u01ce\u01cf\5$\23\2\u01cf\u01d0\b\33\1\2\u01d0"+
		"\u01e1\3\2\2\2\u01d1\u01d2\5\62\32\2\u01d2\u01d3\b\33\1\2\u01d3\u01e1"+
		"\3\2\2\2\u01d4\u01d5\5 \21\2\u01d5\u01d6\b\33\1\2\u01d6\u01e1\3\2\2\2"+
		"\u01d7\u01d8\5*\26\2\u01d8\u01d9\b\33\1\2\u01d9\u01e1\3\2\2\2\u01da\u01db"+
		"\5L\'\2\u01db\u01dc\b\33\1\2\u01dc\u01e1\3\2\2\2\u01dd\u01de\5J&\2\u01de"+
		"\u01df\b\33\1\2\u01df\u01e1\3\2\2\2\u01e0\u01c5\3\2\2\2\u01e0\u01c8\3"+
		"\2\2\2\u01e0\u01cb\3\2\2\2\u01e0\u01ce\3\2\2\2\u01e0\u01d1\3\2\2\2\u01e0"+
		"\u01d4\3\2\2\2\u01e0\u01d7\3\2\2\2\u01e0\u01da\3\2\2\2\u01e0\u01dd\3\2"+
		"\2\2\u01e1\65\3\2\2\2\u01e2\u01e3\b\34\1\2\u01e3\u01e4\58\35\2\u01e4\u01e9"+
		"\b\34\1\2\u01e5\u01e6\7#\2\2\u01e6\u01e7\5\66\34\2\u01e7\u01e8\b\34\1"+
		"\2\u01e8\u01ea\3\2\2\2\u01e9\u01e5\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb"+
		"\3\2\2\2\u01eb\u01ec\b\34\1\2\u01ec\67\3\2\2\2\u01ed\u01ee\b\35\1\2\u01ee"+
		"\u01ef\5:\36\2\u01ef\u01f6\b\35\1\2\u01f0\u01f1\7\24\2\2\u01f1\u01f2\5"+
		":\36\2\u01f2\u01f3\b\35\1\2\u01f3\u01f5\3\2\2\2\u01f4\u01f0\3\2\2\2\u01f5"+
		"\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2"+
		"\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fa\b\35\1\2\u01fa9\3\2\2\2\u01fb\u01fc"+
		"\b\36\1\2\u01fc\u01fd\5<\37\2\u01fd\u0204\b\36\1\2\u01fe\u01ff\7\23\2"+
		"\2\u01ff\u0200\5<\37\2\u0200\u0201\b\36\1\2\u0201\u0203\3\2\2\2\u0202"+
		"\u01fe\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2"+
		"\2\2\u0205\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\b\36\1\2\u0208"+
		";\3\2\2\2\u0209\u020a\b\37\1\2\u020a\u020b\5> \2\u020b\u0212\b\37\1\2"+
		"\u020c\u020d\7\17\2\2\u020d\u020e\5> \2\u020e\u020f\b\37\1\2\u020f\u0211"+
		"\3\2\2\2\u0210\u020c\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0216\b\37"+
		"\1\2\u0216=\3\2\2\2\u0217\u0218\b \1\2\u0218\u0219\5@!\2\u0219\u0223\b"+
		" \1\2\u021a\u021d\7\21\2\2\u021b\u021d\7\22\2\2\u021c\u021a\3\2\2\2\u021c"+
		"\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\5@!\2\u021f\u0220\b \1"+
		"\2\u0220\u0222\3\2\2\2\u0221\u021c\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221"+
		"\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0226\3\2\2\2\u0225\u0223\3\2\2\2\u0226"+
		"\u0227\b \1\2\u0227?\3\2\2\2\u0228\u0229\b!\1\2\u0229\u022a\5B\"\2\u022a"+
		"\u0234\b!\1\2\u022b\u022e\7\13\2\2\u022c\u022e\7\f\2\2\u022d\u022b\3\2"+
		"\2\2\u022d\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\5B\"\2\u0230"+
		"\u0231\b!\1\2\u0231\u0233\3\2\2\2\u0232\u022d\3\2\2\2\u0233\u0236\3\2"+
		"\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236"+
		"\u0234\3\2\2\2\u0237\u0238\b!\1\2\u0238A\3\2\2\2\u0239\u023a\b\"\1\2\u023a"+
		"\u023b\5D#\2\u023b\u0245\b\"\1\2\u023c\u023f\7\r\2\2\u023d\u023f\7\16"+
		"\2\2\u023e\u023c\3\2\2\2\u023e\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u0241\5D#\2\u0241\u0242\b\"\1\2\u0242\u0244\3\2\2\2\u0243\u023e\3\2\2"+
		"\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248"+
		"\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u0249\b\"\1\2\u0249C\3\2\2\2\u024a"+
		"\u024d\7\25\2\2\u024b\u024d\7\f\2\2\u024c\u024a\3\2\2\2\u024c\u024b\3"+
		"\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\5D#\2\u024f\u0250\3\2\2\2\u0250"+
		"\u0251\b#\1\2\u0251\u0256\3\2\2\2\u0252\u0253\5F$\2\u0253\u0254\b#\1\2"+
		"\u0254\u0256\3\2\2\2\u0255\u024c\3\2\2\2\u0255\u0252\3\2\2\2\u0256E\3"+
		"\2\2\2\u0257\u0258\5H%\2\u0258\u0264\b$\1\2\u0259\u025a\7%\2\2\u025a\u025b"+
		"\5\30\r\2\u025b\u025c\7&\2\2\u025c\u025d\b$\1\2\u025d\u0263\3\2\2\2\u025e"+
		"\u025f\7*\2\2\u025f\u0260\5R*\2\u0260\u0261\b$\1\2\u0261\u0263\3\2\2\2"+
		"\u0262\u0259\3\2\2\2\u0262\u025e\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262"+
		"\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0272\3\2\2\2\u0266\u0264\3\2\2\2\u0267"+
		"\u0268\7\'\2\2\u0268\u0269\5\66\34\2\u0269\u026a\7(\2\2\u026a\u026b\b"+
		"$\1\2\u026b\u0271\3\2\2\2\u026c\u026d\7*\2\2\u026d\u026e\5R*\2\u026e\u026f"+
		"\b$\1\2\u026f\u0271\3\2\2\2\u0270\u0267\3\2\2\2\u0270\u026c\3\2\2\2\u0271"+
		"\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\3\2"+
		"\2\2\u0274\u0272\3\2\2\2\u0275\u0276\b$\1\2\u0276G\3\2\2\2\u0277\u0278"+
		"\5N(\2\u0278\u0279\b%\1\2\u0279\u0289\3\2\2\2\u027a\u027b\5R*\2\u027b"+
		"\u027c\b%\1\2\u027c\u0289\3\2\2\2\u027d\u027e\7%\2\2\u027e\u027f\5\30"+
		"\r\2\u027f\u0280\7&\2\2\u0280\u0281\b%\1\2\u0281\u0289\3\2\2\2\u0282\u0283"+
		"\5J&\2\u0283\u0284\b%\1\2\u0284\u0289\3\2\2\2\u0285\u0286\5L\'\2\u0286"+
		"\u0287\b%\1\2\u0287\u0289\3\2\2\2\u0288\u0277\3\2\2\2\u0288\u027a\3\2"+
		"\2\2\u0288\u027d\3\2\2\2\u0288\u0282\3\2\2\2\u0288\u0285\3\2\2\2\u0289"+
		"I\3\2\2\2\u028a\u028b\b&\1\2\u028b\u028c\7\6\2\2\u028c\u028d\7%\2\2\u028d"+
		"\u028e\5\66\34\2\u028e\u028f\b&\1\2\u028f\u0290\7&\2\2\u0290\u0291\b&"+
		"\1\2\u0291K\3\2\2\2\u0292\u0293\b\'\1\2\u0293\u0294\7\b\2\2\u0294\u0295"+
		"\7%\2\2\u0295\u0296\5\66\34\2\u0296\u0297\b\'\1\2\u0297\u0298\7)\2\2\u0298"+
		"\u0299\5\66\34\2\u0299\u029a\b\'\1\2\u029a\u029b\7&\2\2\u029b\u029c\b"+
		"\'\1\2\u029cM\3\2\2\2\u029d\u029e\5P)\2\u029e\u029f\b(\1\2\u029f\u02a3"+
		"\3\2\2\2\u02a0\u02a1\7-\2\2\u02a1\u02a3\b(\1\2\u02a2\u029d\3\2\2\2\u02a2"+
		"\u02a0\3\2\2\2\u02a3O\3\2\2\2\u02a4\u02a5\7\26\2\2\u02a5\u02a9\b)\1\2"+
		"\u02a6\u02a7\7\27\2\2\u02a7\u02a9\b)\1\2\u02a8\u02a4\3\2\2\2\u02a8\u02a6"+
		"\3\2\2\2\u02a9Q\3\2\2\2\u02aa\u02ab\7.\2\2\u02ab\u02ac\b*\1\2\u02acS\3"+
		"\2\2\2\u02ad\u02ae\7\32\2\2\u02ae\u02be\b+\1\2\u02af\u02b0\7\33\2\2\u02b0"+
		"\u02be\b+\1\2\u02b1\u02b2\7\34\2\2\u02b2\u02b3\7$\2\2\u02b3\u02b4\5T+"+
		"\2\u02b4\u02b5\b+\1\2\u02b5\u02be\3\2\2\2\u02b6\u02b7\7\35\2\2\u02b7\u02b8"+
		"\5R*\2\u02b8\u02b9\b+\1\2\u02b9\u02be\3\2\2\2\u02ba\u02bb\5V,\2\u02bb"+
		"\u02bc\b+\1\2\u02bc\u02be\3\2\2\2\u02bd\u02ad\3\2\2\2\u02bd\u02af\3\2"+
		"\2\2\u02bd\u02b1\3\2\2\2\u02bd\u02b6\3\2\2\2\u02bd\u02ba\3\2\2\2\u02be"+
		"U\3\2\2\2\u02bf\u02c0\b,\1\2\u02c0\u02c1\7\36\2\2\u02c1\u02cf\7\22\2\2"+
		"\u02c2\u02c3\7\5\2\2\u02c3\u02d0\b,\1\2\u02c4\u02c5\5T+\2\u02c5\u02cc"+
		"\b,\1\2\u02c6\u02c7\7)\2\2\u02c7\u02c8\5T+\2\u02c8\u02c9\b,\1\2\u02c9"+
		"\u02cb\3\2\2\2\u02ca\u02c6\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2"+
		"\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf"+
		"\u02c2\3\2\2\2\u02cf\u02c4\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d7\7\20"+
		"\2\2\u02d2\u02d3\5T+\2\u02d3\u02d4\b,\1\2\u02d4\u02d8\3\2\2\2\u02d5\u02d6"+
		"\7\5\2\2\u02d6\u02d8\b,\1\2\u02d7\u02d2\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8"+
		"\u02d9\3\2\2\2\u02d9\u02da\7\21\2\2\u02da\u02db\b,\1\2\u02dbW\3\2\2\2"+
		"E[cnv\u008c\u0094\u0099\u009b\u00a0\u00aa\u00b7\u00bd\u00c5\u00cb\u00cf"+
		"\u00d7\u00df\u00e3\u00eb\u00fb\u00fe\u010b\u010e\u0118\u011d\u011f\u0127"+
		"\u012c\u0134\u013c\u0142\u0146\u014b\u0158\u0162\u0166\u0176\u0178\u0186"+
		"\u0192\u0197\u01a4\u01b0\u01e0\u01e9\u01f6\u0204\u0212\u021c\u0223\u022d"+
		"\u0234\u023e\u0245\u024c\u0255\u0262\u0264\u0270\u0272\u0288\u02a2\u02a8"+
		"\u02bd\u02cc\u02cf\u02d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}