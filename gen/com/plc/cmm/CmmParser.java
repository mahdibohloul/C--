// Generated from /home/tapsi/codes/c--/src/com/plc/cmm/Cmm.g4 by ANTLR 4.9.1
package com.plc.cmm;
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
		T__0=1, T__1=2, STRUCT=3, APPEND=4, SIZE=5, TRUE=6, FALSE=7, FPTR=8, DISPLAY=9, 
		STRING=10, MAIN=11, INT=12, BOOL=13, LIST=14, VOID=15, WHILE=16, DO=17, 
		IF=18, ENDIF=19, ELSE=20, RETURN=21, GET=22, BEGIN=23, END=24, SET=25, 
		NAMING_CONVENTION=26, SUM=27, PRODUCT=28, SUBTRACT=29, DIVIDE=30, EQUAL=31, 
		ASSIGN=32, NOT_EQUAL=33, SEMICOLON=34, LPAREN=35, RPAREN=36, UNDERLINE=37, 
		GREATER=38, SMALLER=39, COMMA=40, GREATER_AND_EQUAL=41, SMALLER_AND_EQUAL=42, 
		NEW_LINE=43, WS=44, SHARPSIGN=45, ARROW=46, DOT=47, TAB=48, LBRACKET=49, 
		RBRACKET=50, KEYWORDS=51, KEYWORDS_EXCLUDE=52, INTEGER=53, ALPHABET=54;
	public static final int
		RULE_cmm = 0, RULE_comment = 1, RULE_struct = 2, RULE_struct_scope = 3, 
		RULE_struct_var_dec = 4, RULE_getter_setter = 5, RULE_function_definition = 6, 
		RULE_arguments = 7, RULE_argument_list = 8, RULE_function_invoke = 9, 
		RULE_main = 10, RULE_statement = 11, RULE_assignment = 12, RULE_expression = 13, 
		RULE_term = 14, RULE_return_statement = 15, RULE_declaration = 16, RULE_argument = 17, 
		RULE_display = 18, RULE_append_dec = 19, RULE_size_dec = 20, RULE_scope_body_with_return = 21, 
		RULE_scope_body = 22, RULE_scope_body_one_line = 23, RULE_if_stament = 24, 
		RULE_else_stament = 25, RULE_condition = 26, RULE_while_statement = 27, 
		RULE_do_while_statement = 28, RULE_identifier = 29, RULE_integer = 30, 
		RULE_fptr_type = 31, RULE_list_type = 32, RULE_list_accessor = 33, RULE_built_in_data_type = 34, 
		RULE_type_specifier = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmm", "comment", "struct", "struct_scope", "struct_var_dec", "getter_setter", 
			"function_definition", "arguments", "argument_list", "function_invoke", 
			"main", "statement", "assignment", "expression", "term", "return_statement", 
			"declaration", "argument", "display", "append_dec", "size_dec", "scope_body_with_return", 
			"scope_body", "scope_body_one_line", "if_stament", "else_stament", "condition", 
			"while_statement", "do_while_statement", "identifier", "integer", "fptr_type", 
			"list_type", "list_accessor", "built_in_data_type", "type_specifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/*'", "'*/'", "'struct'", "'append'", "'size'", "'true'", "'false'", 
			"'fptr'", "'display'", "'string'", "'main'", "'int'", "'bool'", "'list'", 
			"'void'", "'while'", "'do'", "'if'", "'endif'", "'else'", "'return'", 
			"'get'", "'begin'", "'end'", "'set'", null, "'+'", "'*'", "'-'", "'/'", 
			"'=='", "'='", "'!='", "';'", "'('", "')'", "'_'", "'>'", "'<'", "','", 
			null, null, "'\n'", null, "'#'", "'->'", "'.'", "'\t'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "STRUCT", "APPEND", "SIZE", "TRUE", "FALSE", "FPTR", 
			"DISPLAY", "STRING", "MAIN", "INT", "BOOL", "LIST", "VOID", "WHILE", 
			"DO", "IF", "ENDIF", "ELSE", "RETURN", "GET", "BEGIN", "END", "SET", 
			"NAMING_CONVENTION", "SUM", "PRODUCT", "SUBTRACT", "DIVIDE", "EQUAL", 
			"ASSIGN", "NOT_EQUAL", "SEMICOLON", "LPAREN", "RPAREN", "UNDERLINE", 
			"GREATER", "SMALLER", "COMMA", "GREATER_AND_EQUAL", "SMALLER_AND_EQUAL", 
			"NEW_LINE", "WS", "SHARPSIGN", "ARROW", "DOT", "TAB", "LBRACKET", "RBRACKET", 
			"KEYWORDS", "KEYWORDS_EXCLUDE", "INTEGER", "ALPHABET"
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
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<StructContext> struct() {
			return getRuleContexts(StructContext.class);
		}
		public StructContext struct(int i) {
			return getRuleContext(StructContext.class,i);
		}
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72);
					comment();
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					struct();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					comment();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					function_definition();
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					comment();
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(102);
			main();
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

	public static class CommentContext extends ParserRuleContext {
		public List<TerminalNode> ALPHABET() { return getTokens(CmmParser.ALPHABET); }
		public TerminalNode ALPHABET(int i) {
			return getToken(CmmParser.ALPHABET, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(CmmParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(CmmParser.INTEGER, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__0);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTEGER || _la==ALPHABET) {
				{
				{
				setState(105);
				_la = _input.LA(1);
				if ( !(_la==INTEGER || _la==ALPHABET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(T__1);
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

	public static class StructContext extends ParserRuleContext {
		public Token a;
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public Struct_scopeContext struct_scope() {
			return getRuleContext(Struct_scopeContext.class,0);
		}
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			int a;
			setState(114);
			match(STRUCT);
			setState(115);
			((StructContext)_localctx).a = match(NAMING_CONVENTION);
			System.out.println("StructDec: "+(((StructContext)_localctx).a!=null?((StructContext)_localctx).a.getText():null));
			setState(117);
			struct_scope();
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

	public static class Struct_scopeContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CmmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CmmParser.SEMICOLON, i);
		}
		public List<Struct_var_decContext> struct_var_dec() {
			return getRuleContexts(Struct_var_decContext.class);
		}
		public Struct_var_decContext struct_var_dec(int i) {
			return getRuleContext(Struct_var_decContext.class,i);
		}
		public Struct_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStruct_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStruct_scope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStruct_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_scopeContext struct_scope() throws RecognitionException {
		Struct_scopeContext _localctx = new Struct_scopeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_struct_scope);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(119);
				match(BEGIN);
				setState(120);
				match(NEW_LINE);
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(121);
						declaration();
						setState(122);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						setState(124);
						declaration();
						}
						break;
					case 3:
						{
						setState(125);
						struct_var_dec();
						}
						break;
					}
					}
					setState(128); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << FPTR) | (1L << STRING) | (1L << INT) | (1L << BOOL) | (1L << LIST))) != 0) );
				setState(130);
				match(NEW_LINE);
				setState(131);
				match(END);
				}
				}
				break;
			case NEW_LINE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(133);
				match(NEW_LINE);
				setState(134);
				declaration();
				setState(135);
				match(NEW_LINE);
				}
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

	public static class Struct_var_decContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
		public Getter_setterContext getter_setter() {
			return getRuleContext(Getter_setterContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public Struct_var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_var_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStruct_var_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStruct_var_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStruct_var_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_var_decContext struct_var_dec() throws RecognitionException {
		Struct_var_decContext _localctx = new Struct_var_decContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_struct_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(139);
			declaration();
			setState(140);
			argument_list();
			setState(141);
			match(BEGIN);
			setState(142);
			match(NEW_LINE);
			setState(143);
			getter_setter();
			setState(144);
			match(NEW_LINE);
			setState(145);
			match(END);
			setState(146);
			match(NEW_LINE);
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

	public static class Getter_setterContext extends ParserRuleContext {
		public List<TerminalNode> SET() { return getTokens(CmmParser.SET); }
		public TerminalNode SET(int i) {
			return getToken(CmmParser.SET, i);
		}
		public List<Scope_bodyContext> scope_body() {
			return getRuleContexts(Scope_bodyContext.class);
		}
		public Scope_bodyContext scope_body(int i) {
			return getRuleContext(Scope_bodyContext.class,i);
		}
		public List<TerminalNode> GET() { return getTokens(CmmParser.GET); }
		public TerminalNode GET(int i) {
			return getToken(CmmParser.GET, i);
		}
		public List<Scope_body_with_returnContext> scope_body_with_return() {
			return getRuleContexts(Scope_body_with_returnContext.class);
		}
		public Scope_body_with_returnContext scope_body_with_return(int i) {
			return getRuleContext(Scope_body_with_returnContext.class,i);
		}
		public List<Scope_body_one_lineContext> scope_body_one_line() {
			return getRuleContexts(Scope_body_one_lineContext.class);
		}
		public Scope_body_one_lineContext scope_body_one_line(int i) {
			return getRuleContext(Scope_body_one_lineContext.class,i);
		}
		public List<Return_statementContext> return_statement() {
			return getRuleContexts(Return_statementContext.class);
		}
		public Return_statementContext return_statement(int i) {
			return getRuleContext(Return_statementContext.class,i);
		}
		public Getter_setterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterGetter_setter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitGetter_setter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitGetter_setter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_setterContext getter_setter() throws RecognitionException {
		Getter_setterContext _localctx = new Getter_setterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_getter_setter);
		int _la;
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(148);
					match(SET);
					setState(149);
					scope_body();
					setState(150);
					match(GET);
					setState(151);
					scope_body_with_return();
					}
					}
					setState(155); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SET );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(157);
					match(SET);
					setState(158);
					scope_body_one_line();
					setState(159);
					match(GET);
					setState(160);
					return_statement();
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SET );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(166);
					match(SET);
					setState(167);
					scope_body_one_line();
					setState(168);
					match(GET);
					setState(169);
					scope_body_with_return();
					}
					}
					setState(173); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SET );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(175);
				match(SET);
				setState(176);
				scope_body();
				setState(177);
				match(GET);
				setState(178);
				return_statement();
				}
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

	public static class Function_definitionContext extends ParserRuleContext {
		public Token a;
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
		}
		public List<Scope_bodyContext> scope_body() {
			return getRuleContexts(Scope_bodyContext.class);
		}
		public Scope_bodyContext scope_body(int i) {
			return getRuleContext(Scope_bodyContext.class,i);
		}
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunction_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_definition);
		try {
			int _alt;
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRUCT:
				case FPTR:
				case STRING:
				case INT:
				case BOOL:
				case LIST:
				case NAMING_CONVENTION:
					{
					int a;
					setState(183);
					type_specifier();
					setState(184);
					((Function_definitionContext)_localctx).a = match(NAMING_CONVENTION);
					System.out.println("FunctionDec: "+(((Function_definitionContext)_localctx).a!=null?((Function_definitionContext)_localctx).a.getText():null));
					setState(186);
					argument_list();
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(187);
						scope_body_one_line();
						}
						break;
					case 2:
						{
						setState(188);
						return_statement();
						}
						break;
					}
					}
					break;
				case T__0:
				case BEGIN:
				case NEW_LINE:
					{
					setState(194);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(191);
							scope_body();
							}
							} 
						}
						setState(196);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					}
					setState(197);
					return_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					int a;
					setState(201);
					match(VOID);
					setState(202);
					((Function_definitionContext)_localctx).a = match(NAMING_CONVENTION);
					System.out.println("FunctionDec: "+(((Function_definitionContext)_localctx).a!=null?((Function_definitionContext)_localctx).a.getText():null));
					setState(204);
					argument_list();
					{
					setState(205);
					scope_body_one_line();
					}
					}
					break;
				case T__0:
				case BEGIN:
				case NEW_LINE:
					{
					setState(208); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(207);
							scope_body();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(210); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << FPTR) | (1L << STRING) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << NAMING_CONVENTION))) != 0)) {
				{
				{
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(216);
						argument();
						setState(217);
						match(COMMA);
						}
						} 
					}
					setState(223);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				{
				setState(224);
				argument();
				}
				}
				}
				setState(229);
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

	public static class Argument_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argument_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(LPAREN);
			setState(231);
			arguments();
			setState(232);
			match(RPAREN);
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

	public static class Function_invokeContext extends ParserRuleContext {
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Function_invokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_invoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunction_invoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunction_invoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunction_invoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_invokeContext function_invoke() throws RecognitionException {
		Function_invokeContext _localctx = new Function_invokeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_invoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(NAMING_CONVENTION);
			setState(235);
			argument_list();
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
		public TerminalNode MAIN() { return getToken(CmmParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
		}
		public List<Scope_bodyContext> scope_body() {
			return getRuleContexts(Scope_bodyContext.class);
		}
		public Scope_bodyContext scope_body(int i) {
			return getRuleContext(Scope_bodyContext.class,i);
		}
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
		enterRule(_localctx, 20, RULE_main);
		int _la;
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIN:
				enterOuterAlt(_localctx, 1);
				{
				int a;
				System.out.println("Main");
				setState(239);
				match(MAIN);
				setState(240);
				match(LPAREN);
				setState(241);
				match(RPAREN);
				setState(242);
				scope_body_one_line();
				}
				break;
			case EOF:
			case T__0:
			case BEGIN:
			case NEW_LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BEGIN) | (1L << NEW_LINE))) != 0)) {
					{
					{
					setState(243);
					scope_body();
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class StatementContext extends ParserRuleContext {
		public If_stamentContext if_stament() {
			return getRuleContext(If_stamentContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DisplayContext display() {
			return getRuleContext(DisplayContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_invokeContext function_invoke() {
			return getRuleContext(Function_invokeContext.class,0);
		}
		public Size_decContext size_dec() {
			return getRuleContext(Size_decContext.class,0);
		}
		public Append_decContext append_dec() {
			return getRuleContext(Append_decContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				if_stament();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				while_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				do_while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				display();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
				declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(257);
				expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(258);
				function_invoke();
				System.out.println("FunctionCall");
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(261);
				size_dec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(262);
				append_dec();
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			expression();
			setState(266);
			match(ASSIGN);
			setState(267);
			expression();
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
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode PRODUCT() { return getToken(CmmParser.PRODUCT, 0); }
		public TerminalNode DIVIDE() { return getToken(CmmParser.DIVIDE, 0); }
		public TerminalNode SUM() { return getToken(CmmParser.SUM, 0); }
		public TerminalNode SUBTRACT() { return getToken(CmmParser.SUBTRACT, 0); }
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
		enterRule(_localctx, 26, RULE_expression);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				term();
				setState(271);
				match(PRODUCT);
				setState(272);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				term();
				setState(275);
				match(DIVIDE);
				setState(276);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				term();
				setState(279);
				match(SUM);
				setState(280);
				term();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				term();
				setState(283);
				match(SUBTRACT);
				setState(284);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Function_invokeContext function_invoke() {
			return getRuleContext(Function_invokeContext.class,0);
		}
		public List<TerminalNode> NAMING_CONVENTION() { return getTokens(CmmParser.NAMING_CONVENTION); }
		public TerminalNode NAMING_CONVENTION(int i) {
			return getToken(CmmParser.NAMING_CONVENTION, i);
		}
		public TerminalNode DOT() { return getToken(CmmParser.DOT, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				integer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				function_invoke();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(291);
				match(NAMING_CONVENTION);
				setState(292);
				match(DOT);
				setState(293);
				match(NAMING_CONVENTION);
				}
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode NEW_LINE() { return getToken(CmmParser.NEW_LINE, 0); }
		public TerminalNode RETURN() { return getToken(CmmParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(NEW_LINE);
			setState(297);
			match(RETURN);
			System.out.println("Return");
			setState(299);
			expression();
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

	public static class DeclarationContext extends ParserRuleContext {
		public Token a;
		public List<TerminalNode> NAMING_CONVENTION() { return getTokens(CmmParser.NAMING_CONVENTION); }
		public TerminalNode NAMING_CONVENTION(int i) {
			return getToken(CmmParser.NAMING_CONVENTION, i);
		}
		public Built_in_data_typeContext built_in_data_type() {
			return getRuleContext(Built_in_data_typeContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a;
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FPTR:
			case STRING:
			case INT:
			case BOOL:
			case LIST:
				{
				setState(302);
				built_in_data_type();
				}
				break;
			case STRUCT:
				{
				{
				setState(303);
				match(STRUCT);
				setState(304);
				match(NAMING_CONVENTION);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(307);
			((DeclarationContext)_localctx).a = match(NAMING_CONVENTION);
			System.out.println("VarDec: "+(((DeclarationContext)_localctx).a!=null?((DeclarationContext)_localctx).a.getText():null));
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

	public static class ArgumentContext extends ParserRuleContext {
		public Token a;
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a;
			setState(311);
			type_specifier();
			setState(312);
			((ArgumentContext)_localctx).a = match(NAMING_CONVENTION);
			System.out.println("ArgumentDec: "+(((ArgumentContext)_localctx).a!=null?((ArgumentContext)_localctx).a.getText():null));
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

	public static class DisplayContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(CmmParser.DISPLAY, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public DisplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDisplay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDisplay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDisplay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayContext display() throws RecognitionException {
		DisplayContext _localctx = new DisplayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_display);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(DISPLAY);
			System.out.println("Built-in: display");
			setState(317);
			match(LPAREN);
			setState(318);
			expression();
			setState(319);
			match(RPAREN);
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

	public static class Append_decContext extends ParserRuleContext {
		public TerminalNode APPEND() { return getToken(CmmParser.APPEND, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public Append_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAppend_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAppend_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAppend_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Append_decContext append_dec() throws RecognitionException {
		Append_decContext _localctx = new Append_decContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_append_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("Append");
			setState(322);
			match(APPEND);
			setState(323);
			match(LPAREN);
			setState(324);
			match(NAMING_CONVENTION);
			setState(325);
			match(RPAREN);
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

	public static class Size_decContext extends ParserRuleContext {
		public TerminalNode SIZE() { return getToken(CmmParser.SIZE, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public Size_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSize_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSize_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSize_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Size_decContext size_dec() throws RecognitionException {
		Size_decContext _localctx = new Size_decContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_size_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("Size");
			setState(328);
			match(SIZE);
			setState(329);
			match(LPAREN);
			setState(330);
			match(NAMING_CONVENTION);
			setState(331);
			match(RPAREN);
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

	public static class Scope_body_with_returnContext extends ParserRuleContext {
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public List<Scope_bodyContext> scope_body() {
			return getRuleContexts(Scope_bodyContext.class);
		}
		public Scope_bodyContext scope_body(int i) {
			return getRuleContext(Scope_bodyContext.class,i);
		}
		public Scope_body_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_body_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterScope_body_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitScope_body_with_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitScope_body_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scope_body_with_returnContext scope_body_with_return() throws RecognitionException {
		Scope_body_with_returnContext _localctx = new Scope_body_with_returnContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_scope_body_with_return);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(333);
					scope_body();
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(339);
			return_statement();
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

	public static class Scope_bodyContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CmmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CmmParser.SEMICOLON, i);
		}
		public List<Scope_body_one_lineContext> scope_body_one_line() {
			return getRuleContexts(Scope_body_one_lineContext.class);
		}
		public Scope_body_one_lineContext scope_body_one_line(int i) {
			return getRuleContext(Scope_body_one_lineContext.class,i);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public Scope_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterScope_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitScope_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitScope_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scope_bodyContext scope_body() throws RecognitionException {
		Scope_bodyContext _localctx = new Scope_bodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_scope_body);
		int _la;
		try {
			int _alt;
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(BEGIN);
				setState(342);
				match(NEW_LINE);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(343);
					comment();
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(353); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(353);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case STRUCT:
						case APPEND:
						case SIZE:
						case FPTR:
						case DISPLAY:
						case STRING:
						case INT:
						case BOOL:
						case LIST:
						case WHILE:
						case DO:
						case IF:
						case NAMING_CONVENTION:
						case INTEGER:
							{
							setState(349);
							statement();
							setState(350);
							match(SEMICOLON);
							}
							break;
						case NEW_LINE:
							{
							setState(352);
							scope_body_one_line();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(355); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__0:
			case NEW_LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(357);
					comment();
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(363);
				match(NEW_LINE);
				setState(364);
				match(END);
				setState(365);
				match(NEW_LINE);
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

	public static class Scope_body_one_lineContext extends ParserRuleContext {
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Scope_body_one_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_body_one_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterScope_body_one_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitScope_body_one_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitScope_body_one_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scope_body_one_lineContext scope_body_one_line() throws RecognitionException {
		Scope_body_one_lineContext _localctx = new Scope_body_one_lineContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_scope_body_one_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(NEW_LINE);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(369);
				comment();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
			statement();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(376);
				comment();
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			match(NEW_LINE);
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

	public static class If_stamentContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Else_stamentContext else_stament() {
			return getRuleContext(Else_stamentContext.class,0);
		}
		public Scope_bodyContext scope_body() {
			return getRuleContext(Scope_bodyContext.class,0);
		}
		public If_stamentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stament; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIf_stament(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIf_stament(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIf_stament(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stamentContext if_stament() throws RecognitionException {
		If_stamentContext _localctx = new If_stamentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_if_stament);
		try {
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(384);
				match(IF);
				System.out.println("Conditional: if");
				setState(386);
				match(LPAREN);
				setState(389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(387);
					expression();
					}
					break;
				case 2:
					{
					setState(388);
					condition();
					}
					break;
				}
				setState(391);
				match(RPAREN);
				setState(392);
				scope_body_one_line();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(394);
				match(IF);
				System.out.println("Conditional: if");
				setState(396);
				match(LPAREN);
				setState(399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(397);
					expression();
					}
					break;
				case 2:
					{
					setState(398);
					condition();
					}
					break;
				}
				setState(401);
				match(RPAREN);
				setState(402);
				scope_body_one_line();
				setState(403);
				else_stament();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(405);
				match(IF);
				System.out.println("Conditional: if");
				setState(407);
				match(LPAREN);
				setState(410);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(408);
					expression();
					}
					break;
				case 2:
					{
					setState(409);
					condition();
					}
					break;
				}
				setState(412);
				match(RPAREN);
				setState(413);
				scope_body();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(415);
				match(IF);
				System.out.println("Conditional: if");
				setState(417);
				match(LPAREN);
				setState(420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(418);
					expression();
					}
					break;
				case 2:
					{
					setState(419);
					condition();
					}
					break;
				}
				setState(422);
				match(RPAREN);
				setState(423);
				scope_body();
				setState(424);
				else_stament();
				}
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

	public static class Else_stamentContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CmmParser.ELSE, 0); }
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
		}
		public Scope_bodyContext scope_body() {
			return getRuleContext(Scope_bodyContext.class,0);
		}
		public Else_stamentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stament; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterElse_stament(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitElse_stament(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitElse_stament(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_stamentContext else_stament() throws RecognitionException {
		Else_stamentContext _localctx = new Else_stamentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_else_stament);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(428);
				match(ELSE);
				System.out.println("Conditonal: else");
				setState(430);
				scope_body_one_line();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(431);
				match(ELSE);
				System.out.println("Conditonal: else");
				setState(433);
				scope_body();
				}
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

	public static class ConditionContext extends ParserRuleContext {
		public Token a;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(CmmParser.EQUAL, 0); }
		public TerminalNode GREATER_AND_EQUAL() { return getToken(CmmParser.GREATER_AND_EQUAL, 0); }
		public TerminalNode SMALLER_AND_EQUAL() { return getToken(CmmParser.SMALLER_AND_EQUAL, 0); }
		public TerminalNode SMALLER() { return getToken(CmmParser.SMALLER, 0); }
		public TerminalNode GREATER() { return getToken(CmmParser.GREATER, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(CmmParser.NOT_EQUAL, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a;
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMING_CONVENTION:
				{
				setState(437);
				identifier();
				}
				break;
			case INTEGER:
				{
				setState(438);
				integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(441);
			((ConditionContext)_localctx).a = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << GREATER) | (1L << SMALLER) | (1L << GREATER_AND_EQUAL) | (1L << SMALLER_AND_EQUAL))) != 0)) ) {
				((ConditionContext)_localctx).a = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			System.out.println("Operator: "+(((ConditionContext)_localctx).a!=null?((ConditionContext)_localctx).a.getText():null));
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMING_CONVENTION:
				{
				setState(443);
				identifier();
				}
				break;
			case INTEGER:
				{
				setState(444);
				integer();
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Scope_bodyContext scope_body() {
			return getRuleContext(Scope_bodyContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_while_statement);
		try {
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(447);
				match(WHILE);
				System.out.println("Loop: while");
				setState(449);
				match(LPAREN);
				setState(452);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(450);
					expression();
					}
					break;
				case 2:
					{
					setState(451);
					condition();
					}
					break;
				}
				setState(454);
				match(RPAREN);
				setState(455);
				scope_body_one_line();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(457);
				match(WHILE);
				System.out.println("Loop: while");
				setState(459);
				match(LPAREN);
				setState(462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(460);
					expression();
					}
					break;
				case 2:
					{
					setState(461);
					condition();
					}
					break;
				}
				setState(464);
				match(RPAREN);
				setState(465);
				scope_body();
				}
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

	public static class Do_while_statementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(CmmParser.DO, 0); }
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Scope_bodyContext scope_body() {
			return getRuleContext(Scope_bodyContext.class,0);
		}
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDo_while_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDo_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_do_while_statement);
		try {
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(469);
				match(DO);
				System.out.println("Loop: do...while");
				setState(471);
				scope_body_one_line();
				setState(472);
				match(WHILE);
				setState(473);
				match(LPAREN);
				setState(476);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(474);
					expression();
					}
					break;
				case 2:
					{
					setState(475);
					condition();
					}
					break;
				}
				setState(478);
				match(RPAREN);
				setState(479);
				match(SEMICOLON);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(481);
				match(DO);
				System.out.println("Loop: do...while");
				setState(483);
				scope_body();
				setState(484);
				match(WHILE);
				setState(485);
				match(LPAREN);
				setState(488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(486);
					expression();
					}
					break;
				case 2:
					{
					setState(487);
					condition();
					}
					break;
				}
				setState(490);
				match(RPAREN);
				setState(491);
				match(SEMICOLON);
				}
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
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
		enterRule(_localctx, 58, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(NAMING_CONVENTION);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(CmmParser.INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(INTEGER);
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

	public static class Fptr_typeContext extends ParserRuleContext {
		public TerminalNode FPTR() { return getToken(CmmParser.FPTR, 0); }
		public TerminalNode SMALLER() { return getToken(CmmParser.SMALLER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(CmmParser.ARROW, 0); }
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Fptr_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fptr_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFptr_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFptr_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFptr_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fptr_typeContext fptr_type() throws RecognitionException {
		Fptr_typeContext _localctx = new Fptr_typeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fptr_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(499);
			match(FPTR);
			setState(500);
			match(SMALLER);
			setState(501);
			arguments();
			setState(502);
			match(ARROW);
			setState(503);
			type_specifier();
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

	public static class List_typeContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(CmmParser.LIST, 0); }
		public TerminalNode SHARPSIGN() { return getToken(CmmParser.SHARPSIGN, 0); }
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public List_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterList_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitList_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitList_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_typeContext list_type() throws RecognitionException {
		List_typeContext _localctx = new List_typeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_list_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(505);
			match(LIST);
			setState(506);
			match(SHARPSIGN);
			setState(507);
			type_specifier();
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

	public static class List_accessorContext extends ParserRuleContext {
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public TerminalNode LBRACKET() { return getToken(CmmParser.LBRACKET, 0); }
		public TerminalNode INTEGER() { return getToken(CmmParser.INTEGER, 0); }
		public TerminalNode RBRACKET() { return getToken(CmmParser.RBRACKET, 0); }
		public List_accessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_accessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterList_accessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitList_accessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitList_accessor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_accessorContext list_accessor() throws RecognitionException {
		List_accessorContext _localctx = new List_accessorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_list_accessor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(509);
			match(NAMING_CONVENTION);
			setState(510);
			match(LBRACKET);
			setState(511);
			match(INTEGER);
			setState(512);
			match(RBRACKET);
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

	public static class Built_in_data_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CmmParser.INT, 0); }
		public TerminalNode STRING() { return getToken(CmmParser.STRING, 0); }
		public List_typeContext list_type() {
			return getRuleContext(List_typeContext.class,0);
		}
		public Fptr_typeContext fptr_type() {
			return getRuleContext(Fptr_typeContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(CmmParser.BOOL, 0); }
		public TerminalNode FPTR() { return getToken(CmmParser.FPTR, 0); }
		public Built_in_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_built_in_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBuilt_in_data_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBuilt_in_data_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBuilt_in_data_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Built_in_data_typeContext built_in_data_type() throws RecognitionException {
		Built_in_data_typeContext _localctx = new Built_in_data_typeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_built_in_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(514);
				match(INT);
				}
				break;
			case 2:
				{
				setState(515);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(516);
				list_type();
				}
				break;
			case 4:
				{
				setState(517);
				fptr_type();
				}
				break;
			case 5:
				{
				setState(518);
				match(BOOL);
				}
				break;
			case 6:
				{
				setState(519);
				match(FPTR);
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

	public static class Type_specifierContext extends ParserRuleContext {
		public Built_in_data_typeContext built_in_data_type() {
			return getRuleContext(Built_in_data_typeContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public List_accessorContext list_accessor() {
			return getRuleContext(List_accessorContext.class,0);
		}
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterType_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitType_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitType_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_type_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FPTR:
			case STRING:
			case INT:
			case BOOL:
			case LIST:
				{
				setState(522);
				built_in_data_type();
				}
				break;
			case STRUCT:
				{
				setState(523);
				match(STRUCT);
				setState(524);
				match(NAMING_CONVENTION);
				}
				break;
			case NAMING_CONVENTION:
				{
				setState(525);
				list_accessor();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0213\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\7\2R\n\2"+
		"\f\2\16\2U\13\2\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2\7\2^\n\2\f\2\16\2a\13"+
		"\2\3\2\7\2d\n\2\f\2\16\2g\13\2\3\2\3\2\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u0081"+
		"\n\5\r\5\16\5\u0082\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008c\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\6\7\u009c\n\7\r\7\16"+
		"\7\u009d\3\7\3\7\3\7\3\7\3\7\6\7\u00a5\n\7\r\7\16\7\u00a6\3\7\3\7\3\7"+
		"\3\7\3\7\6\7\u00ae\n\7\r\7\16\7\u00af\3\7\3\7\3\7\3\7\3\7\5\7\u00b7\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c0\n\b\3\b\7\b\u00c3\n\b\f\b\16"+
		"\b\u00c6\13\b\3\b\5\b\u00c9\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u00d3"+
		"\n\b\r\b\16\b\u00d4\5\b\u00d7\n\b\5\b\u00d9\n\b\3\t\3\t\3\t\7\t\u00de"+
		"\n\t\f\t\16\t\u00e1\13\t\3\t\7\t\u00e4\n\t\f\t\16\t\u00e7\13\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00f7\n\f\f\f"+
		"\16\f\u00fa\13\f\5\f\u00fc\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u010a\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0121"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0129\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\5\22\u0134\n\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\7\27\u0151\n\27\f\27\16\27\u0154\13"+
		"\27\3\27\3\27\3\30\3\30\3\30\7\30\u015b\n\30\f\30\16\30\u015e\13\30\3"+
		"\30\3\30\3\30\3\30\6\30\u0164\n\30\r\30\16\30\u0165\3\30\7\30\u0169\n"+
		"\30\f\30\16\30\u016c\13\30\3\30\3\30\3\30\5\30\u0171\n\30\3\31\3\31\7"+
		"\31\u0175\n\31\f\31\16\31\u0178\13\31\3\31\3\31\7\31\u017c\n\31\f\31\16"+
		"\31\u017f\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u0188\n\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0192\n\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u019d\n\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u01a7\n\32\3\32\3\32\3\32\3\32\5\32\u01ad\n\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u01b5\n\33\3\34\3\34\3\34\5\34\u01ba\n\34"+
		"\3\34\3\34\3\34\3\34\5\34\u01c0\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u01c7"+
		"\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01d1\n\35\3\35\3\35"+
		"\3\35\5\35\u01d6\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01df\n"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01eb\n\36"+
		"\3\36\3\36\3\36\5\36\u01f0\n\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\5$\u020b\n$\3%\3%\3%\3%"+
		"\5%\u0211\n%\3%\2\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFH\2\4\3\2\678\6\2!!##()+,\2\u0238\2M\3\2\2\2\4j\3\2\2"+
		"\2\6s\3\2\2\2\b\u008b\3\2\2\2\n\u008d\3\2\2\2\f\u00b6\3\2\2\2\16\u00d8"+
		"\3\2\2\2\20\u00e5\3\2\2\2\22\u00e8\3\2\2\2\24\u00ec\3\2\2\2\26\u00fb\3"+
		"\2\2\2\30\u0109\3\2\2\2\32\u010b\3\2\2\2\34\u0120\3\2\2\2\36\u0128\3\2"+
		"\2\2 \u012a\3\2\2\2\"\u012f\3\2\2\2$\u0138\3\2\2\2&\u013d\3\2\2\2(\u0143"+
		"\3\2\2\2*\u0149\3\2\2\2,\u0152\3\2\2\2.\u0170\3\2\2\2\60\u0172\3\2\2\2"+
		"\62\u01ac\3\2\2\2\64\u01b4\3\2\2\2\66\u01b6\3\2\2\28\u01d5\3\2\2\2:\u01ef"+
		"\3\2\2\2<\u01f1\3\2\2\2>\u01f3\3\2\2\2@\u01f5\3\2\2\2B\u01fb\3\2\2\2D"+
		"\u01ff\3\2\2\2F\u020a\3\2\2\2H\u0210\3\2\2\2JL\5\4\3\2KJ\3\2\2\2LO\3\2"+
		"\2\2MK\3\2\2\2MN\3\2\2\2NS\3\2\2\2OM\3\2\2\2PR\5\6\4\2QP\3\2\2\2RU\3\2"+
		"\2\2SQ\3\2\2\2ST\3\2\2\2TY\3\2\2\2US\3\2\2\2VX\5\4\3\2WV\3\2\2\2X[\3\2"+
		"\2\2YW\3\2\2\2YZ\3\2\2\2Z_\3\2\2\2[Y\3\2\2\2\\^\5\16\b\2]\\\3\2\2\2^a"+
		"\3\2\2\2_]\3\2\2\2_`\3\2\2\2`e\3\2\2\2a_\3\2\2\2bd\5\4\3\2cb\3\2\2\2d"+
		"g\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\5\26\f\2i\3\3\2\2"+
		"\2jn\7\3\2\2km\t\2\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2"+
		"\2pn\3\2\2\2qr\7\4\2\2r\5\3\2\2\2st\b\4\1\2tu\7\5\2\2uv\7\34\2\2vw\b\4"+
		"\1\2wx\5\b\5\2x\7\3\2\2\2yz\7\31\2\2z\u0080\7-\2\2{|\5\"\22\2|}\7$\2\2"+
		"}\u0081\3\2\2\2~\u0081\5\"\22\2\177\u0081\5\n\6\2\u0080{\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7-\2\2\u0085\u0086\7\32"+
		"\2\2\u0086\u008c\3\2\2\2\u0087\u0088\7-\2\2\u0088\u0089\5\"\22\2\u0089"+
		"\u008a\7-\2\2\u008a\u008c\3\2\2\2\u008by\3\2\2\2\u008b\u0087\3\2\2\2\u008c"+
		"\t\3\2\2\2\u008d\u008e\5\"\22\2\u008e\u008f\5\22\n\2\u008f\u0090\7\31"+
		"\2\2\u0090\u0091\7-\2\2\u0091\u0092\5\f\7\2\u0092\u0093\7-\2\2\u0093\u0094"+
		"\7\32\2\2\u0094\u0095\7-\2\2\u0095\13\3\2\2\2\u0096\u0097\7\33\2\2\u0097"+
		"\u0098\5.\30\2\u0098\u0099\7\30\2\2\u0099\u009a\5,\27\2\u009a\u009c\3"+
		"\2\2\2\u009b\u0096\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00b7\3\2\2\2\u009f\u00a0\7\33\2\2\u00a0\u00a1\5"+
		"\60\31\2\u00a1\u00a2\7\30\2\2\u00a2\u00a3\5 \21\2\u00a3\u00a5\3\2\2\2"+
		"\u00a4\u009f\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00b7\3\2\2\2\u00a8\u00a9\7\33\2\2\u00a9\u00aa\5\60\31"+
		"\2\u00aa\u00ab\7\30\2\2\u00ab\u00ac\5,\27\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00a8\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b7\3\2\2\2\u00b1\u00b2\7\33\2\2\u00b2\u00b3\5.\30\2\u00b3"+
		"\u00b4\7\30\2\2\u00b4\u00b5\5 \21\2\u00b5\u00b7\3\2\2\2\u00b6\u009b\3"+
		"\2\2\2\u00b6\u00a4\3\2\2\2\u00b6\u00ad\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b7"+
		"\r\3\2\2\2\u00b8\u00b9\b\b\1\2\u00b9\u00ba\5H%\2\u00ba\u00bb\7\34\2\2"+
		"\u00bb\u00bc\b\b\1\2\u00bc\u00bf\5\22\n\2\u00bd\u00c0\5\60\31\2\u00be"+
		"\u00c0\5 \21\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c9\3\2"+
		"\2\2\u00c1\u00c3\5.\30\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c7\u00c9\5 \21\2\u00c8\u00b8\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9"+
		"\u00d9\3\2\2\2\u00ca\u00cb\b\b\1\2\u00cb\u00cc\7\21\2\2\u00cc\u00cd\7"+
		"\34\2\2\u00cd\u00ce\b\b\1\2\u00ce\u00cf\5\22\n\2\u00cf\u00d0\5\60\31\2"+
		"\u00d0\u00d7\3\2\2\2\u00d1\u00d3\5.\30\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00ca\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00c8\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d9\17\3\2\2\2\u00da\u00db\5$\23\2\u00db\u00dc"+
		"\7*\2\2\u00dc\u00de\3\2\2\2\u00dd\u00da\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e2\u00e4\5$\23\2\u00e3\u00df\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\21\3\2\2\2\u00e7\u00e5\3\2\2"+
		"\2\u00e8\u00e9\7%\2\2\u00e9\u00ea\5\20\t\2\u00ea\u00eb\7&\2\2\u00eb\23"+
		"\3\2\2\2\u00ec\u00ed\7\34\2\2\u00ed\u00ee\5\22\n\2\u00ee\25\3\2\2\2\u00ef"+
		"\u00f0\b\f\1\2\u00f0\u00f1\b\f\1\2\u00f1\u00f2\7\r\2\2\u00f2\u00f3\7%"+
		"\2\2\u00f3\u00f4\7&\2\2\u00f4\u00fc\5\60\31\2\u00f5\u00f7\5.\30\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00ef\3\2\2\2\u00fb"+
		"\u00f8\3\2\2\2\u00fc\27\3\2\2\2\u00fd\u010a\5\62\32\2\u00fe\u010a\58\35"+
		"\2\u00ff\u010a\5:\36\2\u0100\u010a\5\32\16\2\u0101\u010a\5&\24\2\u0102"+
		"\u010a\5\"\22\2\u0103\u010a\5\34\17\2\u0104\u0105\5\24\13\2\u0105\u0106"+
		"\b\r\1\2\u0106\u010a\3\2\2\2\u0107\u010a\5*\26\2\u0108\u010a\5(\25\2\u0109"+
		"\u00fd\3\2\2\2\u0109\u00fe\3\2\2\2\u0109\u00ff\3\2\2\2\u0109\u0100\3\2"+
		"\2\2\u0109\u0101\3\2\2\2\u0109\u0102\3\2\2\2\u0109\u0103\3\2\2\2\u0109"+
		"\u0104\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a\31\3\2\2"+
		"\2\u010b\u010c\5\34\17\2\u010c\u010d\7\"\2\2\u010d\u010e\5\34\17\2\u010e"+
		"\33\3\2\2\2\u010f\u0121\5\36\20\2\u0110\u0111\5\36\20\2\u0111\u0112\7"+
		"\36\2\2\u0112\u0113\5\36\20\2\u0113\u0121\3\2\2\2\u0114\u0115\5\36\20"+
		"\2\u0115\u0116\7 \2\2\u0116\u0117\5\36\20\2\u0117\u0121\3\2\2\2\u0118"+
		"\u0119\5\36\20\2\u0119\u011a\7\35\2\2\u011a\u011b\5\36\20\2\u011b\u0121"+
		"\3\2\2\2\u011c\u011d\5\36\20\2\u011d\u011e\7\37\2\2\u011e\u011f\5\36\20"+
		"\2\u011f\u0121\3\2\2\2\u0120\u010f\3\2\2\2\u0120\u0110\3\2\2\2\u0120\u0114"+
		"\3\2\2\2\u0120\u0118\3\2\2\2\u0120\u011c\3\2\2\2\u0121\35\3\2\2\2\u0122"+
		"\u0129\5<\37\2\u0123\u0129\5> \2\u0124\u0129\5\24\13\2\u0125\u0126\7\34"+
		"\2\2\u0126\u0127\7\61\2\2\u0127\u0129\7\34\2\2\u0128\u0122\3\2\2\2\u0128"+
		"\u0123\3\2\2\2\u0128\u0124\3\2\2\2\u0128\u0125\3\2\2\2\u0129\37\3\2\2"+
		"\2\u012a\u012b\7-\2\2\u012b\u012c\7\27\2\2\u012c\u012d\b\21\1\2\u012d"+
		"\u012e\5\34\17\2\u012e!\3\2\2\2\u012f\u0133\b\22\1\2\u0130\u0134\5F$\2"+
		"\u0131\u0132\7\5\2\2\u0132\u0134\7\34\2\2\u0133\u0130\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\7\34\2\2\u0136\u0137\b\22\1\2"+
		"\u0137#\3\2\2\2\u0138\u0139\b\23\1\2\u0139\u013a\5H%\2\u013a\u013b\7\34"+
		"\2\2\u013b\u013c\b\23\1\2\u013c%\3\2\2\2\u013d\u013e\7\13\2\2\u013e\u013f"+
		"\b\24\1\2\u013f\u0140\7%\2\2\u0140\u0141\5\34\17\2\u0141\u0142\7&\2\2"+
		"\u0142\'\3\2\2\2\u0143\u0144\b\25\1\2\u0144\u0145\7\6\2\2\u0145\u0146"+
		"\7%\2\2\u0146\u0147\7\34\2\2\u0147\u0148\7&\2\2\u0148)\3\2\2\2\u0149\u014a"+
		"\b\26\1\2\u014a\u014b\7\7\2\2\u014b\u014c\7%\2\2\u014c\u014d\7\34\2\2"+
		"\u014d\u014e\7&\2\2\u014e+\3\2\2\2\u014f\u0151\5.\30\2\u0150\u014f\3\2"+
		"\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\5 \21\2\u0156-\3\2\2\2"+
		"\u0157\u0158\7\31\2\2\u0158\u015c\7-\2\2\u0159\u015b\5\4\3\2\u015a\u0159"+
		"\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u0163\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\5\30\r\2\u0160\u0161\7"+
		"$\2\2\u0161\u0164\3\2\2\2\u0162\u0164\5\60\31\2\u0163\u015f\3\2\2\2\u0163"+
		"\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166\u0171\3\2\2\2\u0167\u0169\5\4\3\2\u0168\u0167\3\2\2\2\u0169"+
		"\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2"+
		"\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7-\2\2\u016e\u016f\7\32\2\2\u016f"+
		"\u0171\7-\2\2\u0170\u0157\3\2\2\2\u0170\u016a\3\2\2\2\u0171/\3\2\2\2\u0172"+
		"\u0176\7-\2\2\u0173\u0175\5\4\3\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2"+
		"\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0179\u017d\5\30\r\2\u017a\u017c\5\4\3\2\u017b\u017a\3"+
		"\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0181\7-\2\2\u0181\61\3\2\2\2"+
		"\u0182\u0183\7\24\2\2\u0183\u0184\b\32\1\2\u0184\u0187\7%\2\2\u0185\u0188"+
		"\5\34\17\2\u0186\u0188\5\66\34\2\u0187\u0185\3\2\2\2\u0187\u0186\3\2\2"+
		"\2\u0188\u0189\3\2\2\2\u0189\u018a\7&\2\2\u018a\u018b\5\60\31\2\u018b"+
		"\u01ad\3\2\2\2\u018c\u018d\7\24\2\2\u018d\u018e\b\32\1\2\u018e\u0191\7"+
		"%\2\2\u018f\u0192\5\34\17\2\u0190\u0192\5\66\34\2\u0191\u018f\3\2\2\2"+
		"\u0191\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\7&\2\2\u0194\u0195"+
		"\5\60\31\2\u0195\u0196\5\64\33\2\u0196\u01ad\3\2\2\2\u0197\u0198\7\24"+
		"\2\2\u0198\u0199\b\32\1\2\u0199\u019c\7%\2\2\u019a\u019d\5\34\17\2\u019b"+
		"\u019d\5\66\34\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019d\u019e\3"+
		"\2\2\2\u019e\u019f\7&\2\2\u019f\u01a0\5.\30\2\u01a0\u01ad\3\2\2\2\u01a1"+
		"\u01a2\7\24\2\2\u01a2\u01a3\b\32\1\2\u01a3\u01a6\7%\2\2\u01a4\u01a7\5"+
		"\34\17\2\u01a5\u01a7\5\66\34\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2"+
		"\u01a7\u01a8\3\2\2\2\u01a8\u01a9\7&\2\2\u01a9\u01aa\5.\30\2\u01aa\u01ab"+
		"\5\64\33\2\u01ab\u01ad\3\2\2\2\u01ac\u0182\3\2\2\2\u01ac\u018c\3\2\2\2"+
		"\u01ac\u0197\3\2\2\2\u01ac\u01a1\3\2\2\2\u01ad\63\3\2\2\2\u01ae\u01af"+
		"\7\26\2\2\u01af\u01b0\b\33\1\2\u01b0\u01b5\5\60\31\2\u01b1\u01b2\7\26"+
		"\2\2\u01b2\u01b3\b\33\1\2\u01b3\u01b5\5.\30\2\u01b4\u01ae\3\2\2\2\u01b4"+
		"\u01b1\3\2\2\2\u01b5\65\3\2\2\2\u01b6\u01b9\b\34\1\2\u01b7\u01ba\5<\37"+
		"\2\u01b8\u01ba\5> \2\u01b9\u01b7\3\2\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb\u01bc\t\3\2\2\u01bc\u01bf\b\34\1\2\u01bd\u01c0\5<\37\2"+
		"\u01be\u01c0\5> \2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0\67\3"+
		"\2\2\2\u01c1\u01c2\7\22\2\2\u01c2\u01c3\b\35\1\2\u01c3\u01c6\7%\2\2\u01c4"+
		"\u01c7\5\34\17\2\u01c5\u01c7\5\66\34\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5"+
		"\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\7&\2\2\u01c9\u01ca\5\60\31\2"+
		"\u01ca\u01d6\3\2\2\2\u01cb\u01cc\7\22\2\2\u01cc\u01cd\b\35\1\2\u01cd\u01d0"+
		"\7%\2\2\u01ce\u01d1\5\34\17\2\u01cf\u01d1\5\66\34\2\u01d0\u01ce\3\2\2"+
		"\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\7&\2\2\u01d3\u01d4"+
		"\5.\30\2\u01d4\u01d6\3\2\2\2\u01d5\u01c1\3\2\2\2\u01d5\u01cb\3\2\2\2\u01d6"+
		"9\3\2\2\2\u01d7\u01d8\7\23\2\2\u01d8\u01d9\b\36\1\2\u01d9\u01da\5\60\31"+
		"\2\u01da\u01db\7\22\2\2\u01db\u01de\7%\2\2\u01dc\u01df\5\34\17\2\u01dd"+
		"\u01df\5\66\34\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2\2\u01df\u01e0\3"+
		"\2\2\2\u01e0\u01e1\7&\2\2\u01e1\u01e2\7$\2\2\u01e2\u01f0\3\2\2\2\u01e3"+
		"\u01e4\7\23\2\2\u01e4\u01e5\b\36\1\2\u01e5\u01e6\5.\30\2\u01e6\u01e7\7"+
		"\22\2\2\u01e7\u01ea\7%\2\2\u01e8\u01eb\5\34\17\2\u01e9\u01eb\5\66\34\2"+
		"\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed"+
		"\7&\2\2\u01ed\u01ee\7$\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01d7\3\2\2\2\u01ef"+
		"\u01e3\3\2\2\2\u01f0;\3\2\2\2\u01f1\u01f2\7\34\2\2\u01f2=\3\2\2\2\u01f3"+
		"\u01f4\7\67\2\2\u01f4?\3\2\2\2\u01f5\u01f6\7\n\2\2\u01f6\u01f7\7)\2\2"+
		"\u01f7\u01f8\5\20\t\2\u01f8\u01f9\7\60\2\2\u01f9\u01fa\5H%\2\u01faA\3"+
		"\2\2\2\u01fb\u01fc\7\20\2\2\u01fc\u01fd\7/\2\2\u01fd\u01fe\5H%\2\u01fe"+
		"C\3\2\2\2\u01ff\u0200\7\34\2\2\u0200\u0201\7\63\2\2\u0201\u0202\7\67\2"+
		"\2\u0202\u0203\7\64\2\2\u0203E\3\2\2\2\u0204\u020b\7\16\2\2\u0205\u020b"+
		"\7\f\2\2\u0206\u020b\5B\"\2\u0207\u020b\5@!\2\u0208\u020b\7\17\2\2\u0209"+
		"\u020b\7\n\2\2\u020a\u0204\3\2\2\2\u020a\u0205\3\2\2\2\u020a\u0206\3\2"+
		"\2\2\u020a\u0207\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u0209\3\2\2\2\u020b"+
		"G\3\2\2\2\u020c\u0211\5F$\2\u020d\u020e\7\5\2\2\u020e\u0211\7\34\2\2\u020f"+
		"\u0211\5D#\2\u0210\u020c\3\2\2\2\u0210\u020d\3\2\2\2\u0210\u020f\3\2\2"+
		"\2\u0211I\3\2\2\2\65MSY_en\u0080\u0082\u008b\u009d\u00a6\u00af\u00b6\u00bf"+
		"\u00c4\u00c8\u00d4\u00d6\u00d8\u00df\u00e5\u00f8\u00fb\u0109\u0120\u0128"+
		"\u0133\u0152\u015c\u0163\u0165\u016a\u0170\u0176\u017d\u0187\u0191\u019c"+
		"\u01a6\u01ac\u01b4\u01b9\u01bf\u01c6\u01d0\u01d5\u01de\u01ea\u01ef\u020a"+
		"\u0210";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}