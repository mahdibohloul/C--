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
		T__0=1, T__1=2, WHILE=3, STRUCT=4, APPEND=5, SIZE=6, TRUE=7, FALSE=8, 
		FPTR=9, DISPLAY=10, STRING=11, MAIN=12, INT=13, BOOL=14, LIST=15, VOID=16, 
		DO=17, IF=18, ENDIF=19, ELSE=20, RETURN=21, GET=22, BEGIN=23, END=24, 
		SET=25, NAMING_CONVENTION=26, SUM=27, PRODUCT=28, ARROW=29, SUBTRACT=30, 
		DIVIDE=31, EQUAL=32, ASSIGN=33, NOT_EQUAL=34, SEMICOLON=35, LPAREN=36, 
		RPAREN=37, UNDERLINE=38, GREATER=39, SMALLER=40, COMMA=41, GREATER_AND_EQUAL=42, 
		SMALLER_AND_EQUAL=43, NEW_LINE=44, WS=45, SHARPSIGN=46, DOT=47, TAB=48, 
		LBRACKET=49, RBRACKET=50, KEYWORDS=51, KEYWORDS_EXCLUDE=52, INTEGER=53, 
		ALPHABET=54;
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
			null, "'/*'", "'*/'", "'while'", "'struct'", "'append'", "'size'", "'true'", 
			"'false'", "'fptr'", "'display'", "'string'", "'main'", "'int'", "'bool'", 
			"'list'", "'void'", "'do'", "'if'", "'endif'", "'else'", "'return'", 
			"'get'", "'begin'", "'end'", "'set'", null, "'+'", "'*'", "'->'", "'-'", 
			"'/'", "'=='", "'='", "'!='", "';'", "'('", "')'", "'_'", "'>'", "'<'", 
			"','", null, null, "'\n'", null, "'#'", "'.'", "'\t'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WHILE", "STRUCT", "APPEND", "SIZE", "TRUE", "FALSE", 
			"FPTR", "DISPLAY", "STRING", "MAIN", "INT", "BOOL", "LIST", "VOID", "DO", 
			"IF", "ENDIF", "ELSE", "RETURN", "GET", "BEGIN", "END", "SET", "NAMING_CONVENTION", 
			"SUM", "PRODUCT", "ARROW", "SUBTRACT", "DIVIDE", "EQUAL", "ASSIGN", "NOT_EQUAL", 
			"SEMICOLON", "LPAREN", "RPAREN", "UNDERLINE", "GREATER", "SMALLER", "COMMA", 
			"GREATER_AND_EQUAL", "SMALLER_AND_EQUAL", "NEW_LINE", "WS", "SHARPSIGN", 
			"DOT", "TAB", "LBRACKET", "RBRACKET", "KEYWORDS", "KEYWORDS_EXCLUDE", 
			"INTEGER", "ALPHABET"
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
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public List<Struct_scopeContext> struct_scope() {
			return getRuleContexts(Struct_scopeContext.class);
		}
		public Struct_scopeContext struct_scope(int i) {
			return getRuleContext(Struct_scopeContext.class,i);
		}
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
		int _la;
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
			match(BEGIN);
			setState(118);
			match(NEW_LINE);
			setState(122); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				struct_scope();
				setState(120);
				match(NEW_LINE);
				}
				}
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << FPTR) | (1L << STRING) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << NEW_LINE))) != 0) );
			setState(126);
			match(END);
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
		public Struct_var_decContext struct_var_dec() {
			return getRuleContext(Struct_var_decContext.class,0);
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << FPTR) | (1L << STRING) | (1L << INT) | (1L << BOOL) | (1L << LIST))) != 0)) {
					{
					{
					setState(128);
					declaration();
					setState(129);
					match(SEMICOLON);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				struct_var_dec();
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
			setState(140);
			declaration();
			setState(141);
			argument_list();
			setState(142);
			match(BEGIN);
			setState(143);
			match(NEW_LINE);
			setState(144);
			getter_setter();
			setState(145);
			match(NEW_LINE);
			setState(146);
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

	public static class Getter_setterContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CmmParser.SET, 0); }
		public List<TerminalNode> BEGIN() { return getTokens(CmmParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(CmmParser.BEGIN, i);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
		public Scope_bodyContext scope_body() {
			return getRuleContext(Scope_bodyContext.class,0);
		}
		public List<TerminalNode> END() { return getTokens(CmmParser.END); }
		public TerminalNode END(int i) {
			return getToken(CmmParser.END, i);
		}
		public TerminalNode GET() { return getToken(CmmParser.GET, 0); }
		public Scope_body_with_returnContext scope_body_with_return() {
			return getRuleContext(Scope_body_with_returnContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
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
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(148);
				match(SET);
				setState(149);
				match(BEGIN);
				setState(150);
				match(NEW_LINE);
				setState(151);
				scope_body();
				setState(152);
				match(NEW_LINE);
				setState(153);
				match(END);
				setState(154);
				match(NEW_LINE);
				setState(155);
				match(GET);
				setState(156);
				match(BEGIN);
				setState(157);
				match(NEW_LINE);
				setState(158);
				scope_body_with_return();
				setState(159);
				match(NEW_LINE);
				setState(160);
				match(END);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(162);
				match(SET);
				setState(163);
				match(BEGIN);
				setState(164);
				match(NEW_LINE);
				setState(165);
				scope_body();
				setState(166);
				match(NEW_LINE);
				setState(167);
				match(END);
				setState(168);
				match(NEW_LINE);
				setState(169);
				match(GET);
				setState(170);
				return_statement();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(172);
				match(SET);
				setState(173);
				scope_body_one_line();
				setState(174);
				match(GET);
				setState(175);
				return_statement();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(177);
				match(SET);
				setState(178);
				scope_body_one_line();
				setState(179);
				match(GET);
				setState(180);
				match(BEGIN);
				setState(181);
				match(NEW_LINE);
				setState(182);
				scope_body_with_return();
				setState(183);
				match(NEW_LINE);
				setState(184);
				match(END);
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
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
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
		int _la;
		try {
			int _alt;
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				int a;
				setState(189);
				type_specifier();
				setState(190);
				((Function_definitionContext)_localctx).a = match(NAMING_CONVENTION);
				System.out.println("FunctionDec: "+(((Function_definitionContext)_localctx).a!=null?((Function_definitionContext)_localctx).a.getText():null));
				setState(192);
				argument_list();
				setState(210);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case WHILE:
				case STRUCT:
				case APPEND:
				case SIZE:
				case FPTR:
				case DISPLAY:
				case STRING:
				case INT:
				case BOOL:
				case LIST:
				case DO:
				case IF:
				case RETURN:
				case NAMING_CONVENTION:
				case INTEGER:
					{
					setState(195);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case WHILE:
					case STRUCT:
					case APPEND:
					case SIZE:
					case FPTR:
					case DISPLAY:
					case STRING:
					case INT:
					case BOOL:
					case LIST:
					case DO:
					case IF:
					case NAMING_CONVENTION:
					case INTEGER:
						{
						setState(193);
						scope_body_one_line();
						}
						break;
					case RETURN:
						{
						setState(194);
						return_statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case BEGIN:
					{
					{
					setState(197);
					match(BEGIN);
					setState(198);
					match(NEW_LINE);
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << WHILE) | (1L << STRUCT) | (1L << APPEND) | (1L << SIZE) | (1L << FPTR) | (1L << DISPLAY) | (1L << STRING) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << DO) | (1L << IF) | (1L << NAMING_CONVENTION) | (1L << NEW_LINE) | (1L << INTEGER))) != 0)) {
						{
						{
						setState(199);
						scope_body();
						}
						}
						setState(204);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(205);
					return_statement();
					setState(206);
					match(NEW_LINE);
					setState(207);
					match(END);
					setState(208);
					match(NEW_LINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					int a;
					setState(213);
					match(VOID);
					setState(214);
					((Function_definitionContext)_localctx).a = match(NAMING_CONVENTION);
					System.out.println("FunctionDec: "+(((Function_definitionContext)_localctx).a!=null?((Function_definitionContext)_localctx).a.getText():null));
					setState(216);
					argument_list();
					{
					setState(217);
					scope_body_one_line();
					}
					}
					break;
				case T__0:
				case WHILE:
				case STRUCT:
				case APPEND:
				case SIZE:
				case FPTR:
				case DISPLAY:
				case STRING:
				case INT:
				case BOOL:
				case LIST:
				case DO:
				case IF:
				case NAMING_CONVENTION:
				case NEW_LINE:
				case INTEGER:
					{
					setState(220); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(219);
							scope_body();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(222); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << FPTR) | (1L << STRING) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << NAMING_CONVENTION))) != 0)) {
				{
				{
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(228);
						argument();
						setState(229);
						match(COMMA);
						}
						} 
					}
					setState(235);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				{
				setState(236);
				argument();
				}
				}
				}
				setState(241);
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
			setState(242);
			match(LPAREN);
			setState(243);
			arguments();
			setState(244);
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
			setState(246);
			match(NAMING_CONVENTION);
			setState(247);
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
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIN:
				enterOuterAlt(_localctx, 1);
				{
				int a;
				System.out.println("Main");
				setState(251);
				match(MAIN);
				setState(252);
				match(LPAREN);
				setState(253);
				match(RPAREN);
				setState(254);
				scope_body_one_line();
				}
				break;
			case EOF:
			case T__0:
			case WHILE:
			case STRUCT:
			case APPEND:
			case SIZE:
			case FPTR:
			case DISPLAY:
			case STRING:
			case INT:
			case BOOL:
			case LIST:
			case DO:
			case IF:
			case NAMING_CONVENTION:
			case NEW_LINE:
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << WHILE) | (1L << STRUCT) | (1L << APPEND) | (1L << SIZE) | (1L << FPTR) | (1L << DISPLAY) | (1L << STRING) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << DO) | (1L << IF) | (1L << NAMING_CONVENTION) | (1L << NEW_LINE) | (1L << INTEGER))) != 0)) {
					{
					{
					setState(255);
					scope_body();
					}
					}
					setState(260);
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
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				if_stament();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				while_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				do_while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				display();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(268);
				declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(269);
				expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(270);
				function_invoke();
				System.out.println("FunctionCall");
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(273);
				size_dec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(274);
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
			setState(277);
			expression();
			setState(278);
			match(ASSIGN);
			setState(279);
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
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				term();
				setState(283);
				match(PRODUCT);
				setState(284);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				term();
				setState(287);
				match(DIVIDE);
				setState(288);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				term();
				setState(291);
				match(SUM);
				setState(292);
				term();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(294);
				term();
				setState(295);
				match(SUBTRACT);
				setState(296);
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
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				integer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				function_invoke();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(303);
				match(NAMING_CONVENTION);
				setState(304);
				match(DOT);
				setState(305);
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
		public TerminalNode RETURN() { return getToken(CmmParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
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
			setState(308);
			match(RETURN);
			System.out.println("Return");
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(310);
				expression();
				}
				break;
			case 2:
				{
				setState(311);
				expression();
				setState(312);
				match(SEMICOLON);
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
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FPTR:
			case STRING:
			case INT:
			case BOOL:
			case LIST:
				{
				setState(317);
				built_in_data_type();
				}
				break;
			case STRUCT:
				{
				{
				setState(318);
				match(STRUCT);
				setState(319);
				match(NAMING_CONVENTION);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(322);
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
			setState(326);
			type_specifier();
			setState(327);
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
			setState(330);
			match(DISPLAY);
			System.out.println("Built-in: display");
			setState(332);
			match(LPAREN);
			setState(333);
			expression();
			setState(334);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CmmParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			setState(337);
			match(APPEND);
			setState(338);
			match(LPAREN);
			setState(339);
			identifier();
			setState(340);
			match(COMMA);
			setState(341);
			expression();
			setState(342);
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
			setState(345);
			match(SIZE);
			setState(346);
			match(LPAREN);
			setState(347);
			match(NAMING_CONVENTION);
			setState(348);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << WHILE) | (1L << STRUCT) | (1L << APPEND) | (1L << SIZE) | (1L << FPTR) | (1L << DISPLAY) | (1L << STRING) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << DO) | (1L << IF) | (1L << NAMING_CONVENTION) | (1L << NEW_LINE) | (1L << INTEGER))) != 0)) {
				{
				{
				setState(350);
				scope_body();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
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
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(358);
				comment();
				}
				break;
			}
			setState(366); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(366);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(361);
						statement();
						setState(362);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						setState(364);
						scope_body_one_line();
						}
						break;
					case 3:
						{
						setState(365);
						match(NEW_LINE);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(368); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(370);
				comment();
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

	public static class Scope_body_one_lineContext extends ParserRuleContext {
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
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(373);
				comment();
				}
			}

			setState(376);
			statement();
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(377);
				comment();
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

	public static class If_stamentContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Else_stamentContext else_stament() {
			return getRuleContext(Else_stamentContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
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
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(380);
				match(IF);
				System.out.println("Conditional: if");
				setState(382);
				match(LPAREN);
				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(383);
					expression();
					}
					break;
				case 2:
					{
					setState(384);
					condition();
					}
					break;
				}
				setState(387);
				match(RPAREN);
				setState(390);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case WHILE:
				case STRUCT:
				case APPEND:
				case SIZE:
				case FPTR:
				case DISPLAY:
				case STRING:
				case INT:
				case BOOL:
				case LIST:
				case DO:
				case IF:
				case NAMING_CONVENTION:
				case INTEGER:
					{
					setState(388);
					scope_body_one_line();
					}
					break;
				case RETURN:
					{
					setState(389);
					return_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(392);
				match(NEW_LINE);
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
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
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
				setState(404);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case WHILE:
				case STRUCT:
				case APPEND:
				case SIZE:
				case FPTR:
				case DISPLAY:
				case STRING:
				case INT:
				case BOOL:
				case LIST:
				case DO:
				case IF:
				case NAMING_CONVENTION:
				case INTEGER:
					{
					setState(402);
					scope_body_one_line();
					}
					break;
				case RETURN:
					{
					setState(403);
					return_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(406);
				else_stament();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(408);
				match(IF);
				System.out.println("Conditional: if");
				setState(410);
				match(LPAREN);
				setState(413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(411);
					expression();
					}
					break;
				case 2:
					{
					setState(412);
					condition();
					}
					break;
				}
				setState(415);
				match(RPAREN);
				setState(416);
				match(BEGIN);
				setState(417);
				match(NEW_LINE);
				setState(422);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(418);
					scope_body();
					}
					break;
				case 2:
					{
					setState(419);
					scope_body();
					setState(420);
					return_statement();
					}
					break;
				}
				setState(424);
				match(NEW_LINE);
				setState(425);
				match(END);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(427);
				match(IF);
				System.out.println("Conditional: if");
				setState(429);
				match(LPAREN);
				setState(432);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(430);
					expression();
					}
					break;
				case 2:
					{
					setState(431);
					condition();
					}
					break;
				}
				setState(434);
				match(RPAREN);
				setState(435);
				match(BEGIN);
				setState(436);
				match(NEW_LINE);
				setState(441);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(437);
					scope_body();
					}
					break;
				case 2:
					{
					setState(438);
					scope_body();
					setState(439);
					return_statement();
					}
					break;
				}
				setState(443);
				match(NEW_LINE);
				setState(444);
				match(END);
				setState(445);
				match(NEW_LINE);
				setState(446);
				else_stament();
				setState(447);
				match(NEW_LINE);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(449);
				match(IF);
				System.out.println("Conditional: if");
				setState(453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(451);
					expression();
					}
					break;
				case 2:
					{
					setState(452);
					condition();
					}
					break;
				}
				setState(457);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case WHILE:
				case STRUCT:
				case APPEND:
				case SIZE:
				case FPTR:
				case DISPLAY:
				case STRING:
				case INT:
				case BOOL:
				case LIST:
				case DO:
				case IF:
				case NAMING_CONVENTION:
				case INTEGER:
					{
					setState(455);
					scope_body_one_line();
					}
					break;
				case RETURN:
					{
					setState(456);
					return_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(459);
				match(NEW_LINE);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(461);
				match(IF);
				System.out.println("Conditional: if");
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(463);
					expression();
					}
					break;
				case 2:
					{
					setState(464);
					condition();
					}
					break;
				}
				setState(469);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case WHILE:
				case STRUCT:
				case APPEND:
				case SIZE:
				case FPTR:
				case DISPLAY:
				case STRING:
				case INT:
				case BOOL:
				case LIST:
				case DO:
				case IF:
				case NAMING_CONVENTION:
				case INTEGER:
					{
					setState(467);
					scope_body_one_line();
					}
					break;
				case RETURN:
					{
					setState(468);
					return_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(471);
				match(NEW_LINE);
				setState(472);
				else_stament();
				setState(473);
				match(NEW_LINE);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(475);
				match(IF);
				System.out.println("Conditional: if");
				setState(479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(477);
					expression();
					}
					break;
				case 2:
					{
					setState(478);
					condition();
					}
					break;
				}
				setState(481);
				match(BEGIN);
				setState(482);
				match(NEW_LINE);
				setState(487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(483);
					scope_body();
					}
					break;
				case 2:
					{
					setState(484);
					scope_body();
					setState(485);
					return_statement();
					}
					break;
				}
				setState(489);
				match(NEW_LINE);
				setState(490);
				match(END);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(492);
				match(IF);
				System.out.println("Conditional: if");
				setState(496);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(494);
					expression();
					}
					break;
				case 2:
					{
					setState(495);
					condition();
					}
					break;
				}
				setState(498);
				match(BEGIN);
				setState(499);
				match(NEW_LINE);
				setState(504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(500);
					scope_body();
					}
					break;
				case 2:
					{
					setState(501);
					scope_body();
					setState(502);
					return_statement();
					}
					break;
				}
				setState(506);
				match(NEW_LINE);
				setState(507);
				match(END);
				setState(508);
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
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
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
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(512);
				match(ELSE);
				System.out.println("Conditonal: else");
				setState(516);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case WHILE:
				case STRUCT:
				case APPEND:
				case SIZE:
				case FPTR:
				case DISPLAY:
				case STRING:
				case INT:
				case BOOL:
				case LIST:
				case DO:
				case IF:
				case NAMING_CONVENTION:
				case INTEGER:
					{
					setState(514);
					scope_body_one_line();
					}
					break;
				case RETURN:
					{
					setState(515);
					return_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(518);
				match(ELSE);
				System.out.println("Conditonal: else");
				setState(520);
				match(BEGIN);
				setState(521);
				match(NEW_LINE);
				setState(526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(522);
					scope_body();
					}
					break;
				case 2:
					{
					setState(523);
					scope_body();
					setState(524);
					return_statement();
					}
					break;
				}
				setState(528);
				match(NEW_LINE);
				setState(529);
				match(END);
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
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMING_CONVENTION:
				{
				setState(534);
				identifier();
				}
				break;
			case INTEGER:
				{
				setState(535);
				integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(538);
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
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMING_CONVENTION:
				{
				setState(540);
				identifier();
				}
				break;
			case INTEGER:
				{
				setState(541);
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
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
		public Scope_bodyContext scope_body() {
			return getRuleContext(Scope_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(544);
			match(WHILE);
			System.out.println("Loop: while");
			setState(546);
			match(LPAREN);
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(547);
				expression();
				}
				break;
			case 2:
				{
				setState(548);
				condition();
				}
				break;
			}
			setState(551);
			match(RPAREN);
			setState(552);
			match(BEGIN);
			setState(553);
			match(NEW_LINE);
			setState(554);
			scope_body();
			setState(555);
			match(NEW_LINE);
			setState(556);
			match(END);
			setState(557);
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
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(559);
				match(DO);
				System.out.println("Loop: do...while");
				setState(561);
				scope_body_one_line();
				setState(562);
				match(WHILE);
				setState(563);
				match(LPAREN);
				setState(566);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(564);
					expression();
					}
					break;
				case 2:
					{
					setState(565);
					condition();
					}
					break;
				}
				setState(568);
				match(RPAREN);
				setState(569);
				match(SEMICOLON);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(571);
				match(DO);
				System.out.println("Loop: do...while");
				setState(573);
				scope_body();
				setState(574);
				match(WHILE);
				setState(575);
				match(LPAREN);
				setState(578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(576);
					expression();
					}
					break;
				case 2:
					{
					setState(577);
					condition();
					}
					break;
				}
				setState(580);
				match(RPAREN);
				setState(581);
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
			setState(585);
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
			setState(587);
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
		public TerminalNode ARROW() { return getToken(CmmParser.ARROW, 0); }
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public TerminalNode GREATER() { return getToken(CmmParser.GREATER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(FPTR);
			setState(590);
			match(SMALLER);
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << FPTR) | (1L << STRING) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << NAMING_CONVENTION))) != 0)) {
				{
				{
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(591);
						type_specifier();
						setState(592);
						match(COMMA);
						}
						} 
					}
					setState(598);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				setState(599);
				type_specifier();
				}
				}
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(605);
			match(ARROW);
			setState(606);
			type_specifier();
			setState(607);
			match(GREATER);
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
			setState(609);
			match(LIST);
			setState(610);
			match(SHARPSIGN);
			setState(611);
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
			setState(613);
			match(NAMING_CONVENTION);
			setState(614);
			match(LBRACKET);
			setState(615);
			match(INTEGER);
			setState(616);
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
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(618);
				match(INT);
				}
				break;
			case 2:
				{
				setState(619);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(620);
				list_type();
				}
				break;
			case 4:
				{
				setState(621);
				fptr_type();
				}
				break;
			case 5:
				{
				setState(622);
				match(BOOL);
				}
				break;
			case 6:
				{
				setState(623);
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
			setState(630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FPTR:
			case STRING:
			case INT:
			case BOOL:
			case LIST:
				{
				setState(626);
				built_in_data_type();
				}
				break;
			case STRUCT:
				{
				setState(627);
				match(STRUCT);
				setState(628);
				match(NAMING_CONVENTION);
				}
				break;
			case NAMING_CONVENTION:
				{
				setState(629);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u027b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\7\2R\n\2"+
		"\f\2\16\2U\13\2\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2\7\2^\n\2\f\2\16\2a\13"+
		"\2\3\2\7\2d\n\2\f\2\16\2g\13\2\3\2\3\2\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4}\n\4\r\4\16\4~\3\4\3"+
		"\4\3\5\3\5\3\5\7\5\u0086\n\5\f\5\16\5\u0089\13\5\3\5\3\5\5\5\u008d\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00bd\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00c6\n\b\3\b\3\b\3\b\7\b\u00cb\n\b\f\b\16\b\u00ce"+
		"\13\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d5\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\6\b\u00df\n\b\r\b\16\b\u00e0\5\b\u00e3\n\b\5\b\u00e5\n\b\3\t\3\t\3"+
		"\t\7\t\u00ea\n\t\f\t\16\t\u00ed\13\t\3\t\7\t\u00f0\n\t\f\t\16\t\u00f3"+
		"\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0103"+
		"\n\f\f\f\16\f\u0106\13\f\5\f\u0108\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0116\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u012d\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0135\n\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u013d\n\21\3\22\3\22\3\22\3\22\5\22\u0143\n\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\7\27\u0162\n\27\f\27\16\27\u0165\13\27\3\27\3\27\3\30\5\30\u016a"+
		"\n\30\3\30\3\30\3\30\3\30\3\30\6\30\u0171\n\30\r\30\16\30\u0172\3\30\5"+
		"\30\u0176\n\30\3\31\5\31\u0179\n\31\3\31\3\31\5\31\u017d\n\31\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0184\n\32\3\32\3\32\3\32\5\32\u0189\n\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u0192\n\32\3\32\3\32\3\32\5\32\u0197"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01a0\n\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u01a9\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u01b3\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01bc\n"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01c8\n\32"+
		"\3\32\3\32\5\32\u01cc\n\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01d4\n"+
		"\32\3\32\3\32\5\32\u01d8\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u01e2\n\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01ea\n\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u01f3\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u01fb\n\32\3\32\3\32\3\32\3\32\5\32\u0201\n\32\3\33\3\33\3"+
		"\33\3\33\5\33\u0207\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0211\n\33\3\33\3\33\3\33\5\33\u0216\n\33\3\34\3\34\3\34\5\34\u021b\n"+
		"\34\3\34\3\34\3\34\3\34\5\34\u0221\n\34\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0228\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0239\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0245\n\36\3\36\3\36\3\36\5\36\u024a\n\36\3\37\3\37\3"+
		" \3 \3!\3!\3!\3!\3!\7!\u0255\n!\f!\16!\u0258\13!\3!\7!\u025b\n!\f!\16"+
		"!\u025e\13!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$"+
		"\3$\5$\u0273\n$\3%\3%\3%\3%\5%\u0279\n%\3%\2\2&\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\4\3\2\678\6\2\"\"$$)*"+
		",-\2\u02b0\2M\3\2\2\2\4j\3\2\2\2\6s\3\2\2\2\b\u008c\3\2\2\2\n\u008e\3"+
		"\2\2\2\f\u00bc\3\2\2\2\16\u00e4\3\2\2\2\20\u00f1\3\2\2\2\22\u00f4\3\2"+
		"\2\2\24\u00f8\3\2\2\2\26\u0107\3\2\2\2\30\u0115\3\2\2\2\32\u0117\3\2\2"+
		"\2\34\u012c\3\2\2\2\36\u0134\3\2\2\2 \u0136\3\2\2\2\"\u013e\3\2\2\2$\u0147"+
		"\3\2\2\2&\u014c\3\2\2\2(\u0152\3\2\2\2*\u015a\3\2\2\2,\u0163\3\2\2\2."+
		"\u0169\3\2\2\2\60\u0178\3\2\2\2\62\u0200\3\2\2\2\64\u0215\3\2\2\2\66\u0217"+
		"\3\2\2\28\u0222\3\2\2\2:\u0249\3\2\2\2<\u024b\3\2\2\2>\u024d\3\2\2\2@"+
		"\u024f\3\2\2\2B\u0263\3\2\2\2D\u0267\3\2\2\2F\u0272\3\2\2\2H\u0278\3\2"+
		"\2\2JL\5\4\3\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NS\3\2\2\2OM\3\2"+
		"\2\2PR\5\6\4\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TY\3\2\2\2US\3\2"+
		"\2\2VX\5\4\3\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z_\3\2\2\2[Y\3\2"+
		"\2\2\\^\5\16\b\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`e\3\2\2\2a_"+
		"\3\2\2\2bd\5\4\3\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2g"+
		"e\3\2\2\2hi\5\26\f\2i\3\3\2\2\2jn\7\3\2\2km\t\2\2\2lk\3\2\2\2mp\3\2\2"+
		"\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\4\2\2r\5\3\2\2\2st\b\4"+
		"\1\2tu\7\6\2\2uv\7\34\2\2vw\b\4\1\2wx\7\31\2\2x|\7.\2\2yz\5\b\5\2z{\7"+
		".\2\2{}\3\2\2\2|y\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080\u0081\7\32\2\2\u0081\7\3\2\2\2\u0082\u0083\5\"\22\2\u0083"+
		"\u0084\7%\2\2\u0084\u0086\3\2\2\2\u0085\u0082\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008d\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008d\5\"\22\2\u008b\u008d\5\n\6\2\u008c\u0087\3"+
		"\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\t\3\2\2\2\u008e\u008f"+
		"\5\"\22\2\u008f\u0090\5\22\n\2\u0090\u0091\7\31\2\2\u0091\u0092\7.\2\2"+
		"\u0092\u0093\5\f\7\2\u0093\u0094\7.\2\2\u0094\u0095\7\32\2\2\u0095\13"+
		"\3\2\2\2\u0096\u0097\7\33\2\2\u0097\u0098\7\31\2\2\u0098\u0099\7.\2\2"+
		"\u0099\u009a\5.\30\2\u009a\u009b\7.\2\2\u009b\u009c\7\32\2\2\u009c\u009d"+
		"\7.\2\2\u009d\u009e\7\30\2\2\u009e\u009f\7\31\2\2\u009f\u00a0\7.\2\2\u00a0"+
		"\u00a1\5,\27\2\u00a1\u00a2\7.\2\2\u00a2\u00a3\7\32\2\2\u00a3\u00bd\3\2"+
		"\2\2\u00a4\u00a5\7\33\2\2\u00a5\u00a6\7\31\2\2\u00a6\u00a7\7.\2\2\u00a7"+
		"\u00a8\5.\30\2\u00a8\u00a9\7.\2\2\u00a9\u00aa\7\32\2\2\u00aa\u00ab\7."+
		"\2\2\u00ab\u00ac\7\30\2\2\u00ac\u00ad\5 \21\2\u00ad\u00bd\3\2\2\2\u00ae"+
		"\u00af\7\33\2\2\u00af\u00b0\5\60\31\2\u00b0\u00b1\7\30\2\2\u00b1\u00b2"+
		"\5 \21\2\u00b2\u00bd\3\2\2\2\u00b3\u00b4\7\33\2\2\u00b4\u00b5\5\60\31"+
		"\2\u00b5\u00b6\7\30\2\2\u00b6\u00b7\7\31\2\2\u00b7\u00b8\7.\2\2\u00b8"+
		"\u00b9\5,\27\2\u00b9\u00ba\7.\2\2\u00ba\u00bb\7\32\2\2\u00bb\u00bd\3\2"+
		"\2\2\u00bc\u0096\3\2\2\2\u00bc\u00a4\3\2\2\2\u00bc\u00ae\3\2\2\2\u00bc"+
		"\u00b3\3\2\2\2\u00bd\r\3\2\2\2\u00be\u00bf\b\b\1\2\u00bf\u00c0\5H%\2\u00c0"+
		"\u00c1\7\34\2\2\u00c1\u00c2\b\b\1\2\u00c2\u00d4\5\22\n\2\u00c3\u00c6\5"+
		"\60\31\2\u00c4\u00c6\5 \21\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00d5\3\2\2\2\u00c7\u00c8\7\31\2\2\u00c8\u00cc\7.\2\2\u00c9\u00cb\5."+
		"\30\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\5 "+
		"\21\2\u00d0\u00d1\7.\2\2\u00d1\u00d2\7\32\2\2\u00d2\u00d3\7.\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00c5\3\2\2\2\u00d4\u00c7\3\2\2\2\u00d5\u00e5\3\2"+
		"\2\2\u00d6\u00d7\b\b\1\2\u00d7\u00d8\7\22\2\2\u00d8\u00d9\7\34\2\2\u00d9"+
		"\u00da\b\b\1\2\u00da\u00db\5\22\n\2\u00db\u00dc\5\60\31\2\u00dc\u00e3"+
		"\3\2\2\2\u00dd\u00df\5.\30\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00d6\3\2"+
		"\2\2\u00e2\u00de\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00be\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\17\3\2\2\2\u00e6\u00e7\5$\23\2\u00e7\u00e8\7+\2\2"+
		"\u00e8\u00ea\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f0\5$\23\2\u00ef\u00eb\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\21\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5"+
		"\7&\2\2\u00f5\u00f6\5\20\t\2\u00f6\u00f7\7\'\2\2\u00f7\23\3\2\2\2\u00f8"+
		"\u00f9\7\34\2\2\u00f9\u00fa\5\22\n\2\u00fa\25\3\2\2\2\u00fb\u00fc\b\f"+
		"\1\2\u00fc\u00fd\b\f\1\2\u00fd\u00fe\7\16\2\2\u00fe\u00ff\7&\2\2\u00ff"+
		"\u0100\7\'\2\2\u0100\u0108\5\60\31\2\u0101\u0103\5.\30\2\u0102\u0101\3"+
		"\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u00fb\3\2\2\2\u0107\u0104\3\2"+
		"\2\2\u0108\27\3\2\2\2\u0109\u0116\5\62\32\2\u010a\u0116\58\35\2\u010b"+
		"\u0116\5:\36\2\u010c\u0116\5\32\16\2\u010d\u0116\5&\24\2\u010e\u0116\5"+
		"\"\22\2\u010f\u0116\5\34\17\2\u0110\u0111\5\24\13\2\u0111\u0112\b\r\1"+
		"\2\u0112\u0116\3\2\2\2\u0113\u0116\5*\26\2\u0114\u0116\5(\25\2\u0115\u0109"+
		"\3\2\2\2\u0115\u010a\3\2\2\2\u0115\u010b\3\2\2\2\u0115\u010c\3\2\2\2\u0115"+
		"\u010d\3\2\2\2\u0115\u010e\3\2\2\2\u0115\u010f\3\2\2\2\u0115\u0110\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\31\3\2\2\2\u0117\u0118"+
		"\5\34\17\2\u0118\u0119\7#\2\2\u0119\u011a\5\34\17\2\u011a\33\3\2\2\2\u011b"+
		"\u012d\5\36\20\2\u011c\u011d\5\36\20\2\u011d\u011e\7\36\2\2\u011e\u011f"+
		"\5\36\20\2\u011f\u012d\3\2\2\2\u0120\u0121\5\36\20\2\u0121\u0122\7!\2"+
		"\2\u0122\u0123\5\36\20\2\u0123\u012d\3\2\2\2\u0124\u0125\5\36\20\2\u0125"+
		"\u0126\7\35\2\2\u0126\u0127\5\36\20\2\u0127\u012d\3\2\2\2\u0128\u0129"+
		"\5\36\20\2\u0129\u012a\7 \2\2\u012a\u012b\5\36\20\2\u012b\u012d\3\2\2"+
		"\2\u012c\u011b\3\2\2\2\u012c\u011c\3\2\2\2\u012c\u0120\3\2\2\2\u012c\u0124"+
		"\3\2\2\2\u012c\u0128\3\2\2\2\u012d\35\3\2\2\2\u012e\u0135\5<\37\2\u012f"+
		"\u0135\5> \2\u0130\u0135\5\24\13\2\u0131\u0132\7\34\2\2\u0132\u0133\7"+
		"\61\2\2\u0133\u0135\7\34\2\2\u0134\u012e\3\2\2\2\u0134\u012f\3\2\2\2\u0134"+
		"\u0130\3\2\2\2\u0134\u0131\3\2\2\2\u0135\37\3\2\2\2\u0136\u0137\7\27\2"+
		"\2\u0137\u013c\b\21\1\2\u0138\u013d\5\34\17\2\u0139\u013a\5\34\17\2\u013a"+
		"\u013b\7%\2\2\u013b\u013d\3\2\2\2\u013c\u0138\3\2\2\2\u013c\u0139\3\2"+
		"\2\2\u013d!\3\2\2\2\u013e\u0142\b\22\1\2\u013f\u0143\5F$\2\u0140\u0141"+
		"\7\6\2\2\u0141\u0143\7\34\2\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2\2\2"+
		"\u0143\u0144\3\2\2\2\u0144\u0145\7\34\2\2\u0145\u0146\b\22\1\2\u0146#"+
		"\3\2\2\2\u0147\u0148\b\23\1\2\u0148\u0149\5H%\2\u0149\u014a\7\34\2\2\u014a"+
		"\u014b\b\23\1\2\u014b%\3\2\2\2\u014c\u014d\7\f\2\2\u014d\u014e\b\24\1"+
		"\2\u014e\u014f\7&\2\2\u014f\u0150\5\34\17\2\u0150\u0151\7\'\2\2\u0151"+
		"\'\3\2\2\2\u0152\u0153\b\25\1\2\u0153\u0154\7\7\2\2\u0154\u0155\7&\2\2"+
		"\u0155\u0156\5<\37\2\u0156\u0157\7+\2\2\u0157\u0158\5\34\17\2\u0158\u0159"+
		"\7\'\2\2\u0159)\3\2\2\2\u015a\u015b\b\26\1\2\u015b\u015c\7\b\2\2\u015c"+
		"\u015d\7&\2\2\u015d\u015e\7\34\2\2\u015e\u015f\7\'\2\2\u015f+\3\2\2\2"+
		"\u0160\u0162\5.\30\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0167\5 \21\2\u0167-\3\2\2\2\u0168\u016a\5\4\3\2\u0169\u0168\3\2\2\2"+
		"\u0169\u016a\3\2\2\2\u016a\u0170\3\2\2\2\u016b\u016c\5\30\r\2\u016c\u016d"+
		"\7%\2\2\u016d\u0171\3\2\2\2\u016e\u0171\5\60\31\2\u016f\u0171\7.\2\2\u0170"+
		"\u016b\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174"+
		"\u0176\5\4\3\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176/\3\2\2\2"+
		"\u0177\u0179\5\4\3\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a"+
		"\3\2\2\2\u017a\u017c\5\30\r\2\u017b\u017d\5\4\3\2\u017c\u017b\3\2\2\2"+
		"\u017c\u017d\3\2\2\2\u017d\61\3\2\2\2\u017e\u017f\7\24\2\2\u017f\u0180"+
		"\b\32\1\2\u0180\u0183\7&\2\2\u0181\u0184\5\34\17\2\u0182\u0184\5\66\34"+
		"\2\u0183\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0188"+
		"\7\'\2\2\u0186\u0189\5\60\31\2\u0187\u0189\5 \21\2\u0188\u0186\3\2\2\2"+
		"\u0188\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\7.\2\2\u018b\u0201"+
		"\3\2\2\2\u018c\u018d\7\24\2\2\u018d\u018e\b\32\1\2\u018e\u0191\7&\2\2"+
		"\u018f\u0192\5\34\17\2\u0190\u0192\5\66\34\2\u0191\u018f\3\2\2\2\u0191"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0196\7\'\2\2\u0194\u0197\5\60"+
		"\31\2\u0195\u0197\5 \21\2\u0196\u0194\3\2\2\2\u0196\u0195\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u0199\5\64\33\2\u0199\u0201\3\2\2\2\u019a\u019b\7"+
		"\24\2\2\u019b\u019c\b\32\1\2\u019c\u019f\7&\2\2\u019d\u01a0\5\34\17\2"+
		"\u019e\u01a0\5\66\34\2\u019f\u019d\3\2\2\2\u019f\u019e\3\2\2\2\u01a0\u01a1"+
		"\3\2\2\2\u01a1\u01a2\7\'\2\2\u01a2\u01a3\7\31\2\2\u01a3\u01a8\7.\2\2\u01a4"+
		"\u01a9\5.\30\2\u01a5\u01a6\5.\30\2\u01a6\u01a7\5 \21\2\u01a7\u01a9\3\2"+
		"\2\2\u01a8\u01a4\3\2\2\2\u01a8\u01a5\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01ab\7.\2\2\u01ab\u01ac\7\32\2\2\u01ac\u0201\3\2\2\2\u01ad\u01ae\7\24"+
		"\2\2\u01ae\u01af\b\32\1\2\u01af\u01b2\7&\2\2\u01b0\u01b3\5\34\17\2\u01b1"+
		"\u01b3\5\66\34\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3\u01b4\3"+
		"\2\2\2\u01b4\u01b5\7\'\2\2\u01b5\u01b6\7\31\2\2\u01b6\u01bb\7.\2\2\u01b7"+
		"\u01bc\5.\30\2\u01b8\u01b9\5.\30\2\u01b9\u01ba\5 \21\2\u01ba\u01bc\3\2"+
		"\2\2\u01bb\u01b7\3\2\2\2\u01bb\u01b8\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01be\7.\2\2\u01be\u01bf\7\32\2\2\u01bf\u01c0\7.\2\2\u01c0\u01c1\5\64"+
		"\33\2\u01c1\u01c2\7.\2\2\u01c2\u0201\3\2\2\2\u01c3\u01c4\7\24\2\2\u01c4"+
		"\u01c7\b\32\1\2\u01c5\u01c8\5\34\17\2\u01c6\u01c8\5\66\34\2\u01c7\u01c5"+
		"\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01cc\5\60\31\2"+
		"\u01ca\u01cc\5 \21\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01cd"+
		"\3\2\2\2\u01cd\u01ce\7.\2\2\u01ce\u0201\3\2\2\2\u01cf\u01d0\7\24\2\2\u01d0"+
		"\u01d3\b\32\1\2\u01d1\u01d4\5\34\17\2\u01d2\u01d4\5\66\34\2\u01d3\u01d1"+
		"\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d8\5\60\31\2"+
		"\u01d6\u01d8\5 \21\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01da\7.\2\2\u01da\u01db\5\64\33\2\u01db\u01dc\7.\2\2\u01dc"+
		"\u0201\3\2\2\2\u01dd\u01de\7\24\2\2\u01de\u01e1\b\32\1\2\u01df\u01e2\5"+
		"\34\17\2\u01e0\u01e2\5\66\34\2\u01e1\u01df\3\2\2\2\u01e1\u01e0\3\2\2\2"+
		"\u01e2\u01e3\3\2\2\2\u01e3\u01e4\7\31\2\2\u01e4\u01e9\7.\2\2\u01e5\u01ea"+
		"\5.\30\2\u01e6\u01e7\5.\30\2\u01e7\u01e8\5 \21\2\u01e8\u01ea\3\2\2\2\u01e9"+
		"\u01e5\3\2\2\2\u01e9\u01e6\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\7."+
		"\2\2\u01ec\u01ed\7\32\2\2\u01ed\u0201\3\2\2\2\u01ee\u01ef\7\24\2\2\u01ef"+
		"\u01f2\b\32\1\2\u01f0\u01f3\5\34\17\2\u01f1\u01f3\5\66\34\2\u01f2\u01f0"+
		"\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\7\31\2\2"+
		"\u01f5\u01fa\7.\2\2\u01f6\u01fb\5.\30\2\u01f7\u01f8\5.\30\2\u01f8\u01f9"+
		"\5 \21\2\u01f9\u01fb\3\2\2\2\u01fa\u01f6\3\2\2\2\u01fa\u01f7\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fd\7.\2\2\u01fd\u01fe\7\32\2\2\u01fe\u01ff\5\64"+
		"\33\2\u01ff\u0201\3\2\2\2\u0200\u017e\3\2\2\2\u0200\u018c\3\2\2\2\u0200"+
		"\u019a\3\2\2\2\u0200\u01ad\3\2\2\2\u0200\u01c3\3\2\2\2\u0200\u01cf\3\2"+
		"\2\2\u0200\u01dd\3\2\2\2\u0200\u01ee\3\2\2\2\u0201\63\3\2\2\2\u0202\u0203"+
		"\7\26\2\2\u0203\u0206\b\33\1\2\u0204\u0207\5\60\31\2\u0205\u0207\5 \21"+
		"\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207\u0216\3\2\2\2\u0208\u0209"+
		"\7\26\2\2\u0209\u020a\b\33\1\2\u020a\u020b\7\31\2\2\u020b\u0210\7.\2\2"+
		"\u020c\u0211\5.\30\2\u020d\u020e\5.\30\2\u020e\u020f\5 \21\2\u020f\u0211"+
		"\3\2\2\2\u0210\u020c\3\2\2\2\u0210\u020d\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"\u0213\7.\2\2\u0213\u0214\7\32\2\2\u0214\u0216\3\2\2\2\u0215\u0202\3\2"+
		"\2\2\u0215\u0208\3\2\2\2\u0216\65\3\2\2\2\u0217\u021a\b\34\1\2\u0218\u021b"+
		"\5<\37\2\u0219\u021b\5> \2\u021a\u0218\3\2\2\2\u021a\u0219\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021d\t\3\2\2\u021d\u0220\b\34\1\2\u021e\u0221\5"+
		"<\37\2\u021f\u0221\5> \2\u0220\u021e\3\2\2\2\u0220\u021f\3\2\2\2\u0221"+
		"\67\3\2\2\2\u0222\u0223\7\5\2\2\u0223\u0224\b\35\1\2\u0224\u0227\7&\2"+
		"\2\u0225\u0228\5\34\17\2\u0226\u0228\5\66\34\2\u0227\u0225\3\2\2\2\u0227"+
		"\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\7\'\2\2\u022a\u022b\7\31"+
		"\2\2\u022b\u022c\7.\2\2\u022c\u022d\5.\30\2\u022d\u022e\7.\2\2\u022e\u022f"+
		"\7\32\2\2\u022f\u0230\7.\2\2\u02309\3\2\2\2\u0231\u0232\7\23\2\2\u0232"+
		"\u0233\b\36\1\2\u0233\u0234\5\60\31\2\u0234\u0235\7\5\2\2\u0235\u0238"+
		"\7&\2\2\u0236\u0239\5\34\17\2\u0237\u0239\5\66\34\2\u0238\u0236\3\2\2"+
		"\2\u0238\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\7\'\2\2\u023b\u023c"+
		"\7%\2\2\u023c\u024a\3\2\2\2\u023d\u023e\7\23\2\2\u023e\u023f\b\36\1\2"+
		"\u023f\u0240\5.\30\2\u0240\u0241\7\5\2\2\u0241\u0244\7&\2\2\u0242\u0245"+
		"\5\34\17\2\u0243\u0245\5\66\34\2\u0244\u0242\3\2\2\2\u0244\u0243\3\2\2"+
		"\2\u0245\u0246\3\2\2\2\u0246\u0247\7\'\2\2\u0247\u0248\7%\2\2\u0248\u024a"+
		"\3\2\2\2\u0249\u0231\3\2\2\2\u0249\u023d\3\2\2\2\u024a;\3\2\2\2\u024b"+
		"\u024c\7\34\2\2\u024c=\3\2\2\2\u024d\u024e\7\67\2\2\u024e?\3\2\2\2\u024f"+
		"\u0250\7\13\2\2\u0250\u025c\7*\2\2\u0251\u0252\5H%\2\u0252\u0253\7+\2"+
		"\2\u0253\u0255\3\2\2\2\u0254\u0251\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254"+
		"\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0259\3\2\2\2\u0258\u0256\3\2\2\2\u0259"+
		"\u025b\5H%\2\u025a\u0256\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2"+
		"\2\u025c\u025d\3\2\2\2\u025d\u025f\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0260"+
		"\7\37\2\2\u0260\u0261\5H%\2\u0261\u0262\7)\2\2\u0262A\3\2\2\2\u0263\u0264"+
		"\7\21\2\2\u0264\u0265\7\60\2\2\u0265\u0266\5H%\2\u0266C\3\2\2\2\u0267"+
		"\u0268\7\34\2\2\u0268\u0269\7\63\2\2\u0269\u026a\7\67\2\2\u026a\u026b"+
		"\7\64\2\2\u026bE\3\2\2\2\u026c\u0273\7\17\2\2\u026d\u0273\7\r\2\2\u026e"+
		"\u0273\5B\"\2\u026f\u0273\5@!\2\u0270\u0273\7\20\2\2\u0271\u0273\7\13"+
		"\2\2\u0272\u026c\3\2\2\2\u0272\u026d\3\2\2\2\u0272\u026e\3\2\2\2\u0272"+
		"\u026f\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0271\3\2\2\2\u0273G\3\2\2\2"+
		"\u0274\u0279\5F$\2\u0275\u0276\7\6\2\2\u0276\u0279\7\34\2\2\u0277\u0279"+
		"\5D#\2\u0278\u0274\3\2\2\2\u0278\u0275\3\2\2\2\u0278\u0277\3\2\2\2\u0279"+
		"I\3\2\2\2@MSY_en~\u0087\u008c\u00bc\u00c5\u00cc\u00d4\u00e0\u00e2\u00e4"+
		"\u00eb\u00f1\u0104\u0107\u0115\u012c\u0134\u013c\u0142\u0163\u0169\u0170"+
		"\u0172\u0175\u0178\u017c\u0183\u0188\u0191\u0196\u019f\u01a8\u01b2\u01bb"+
		"\u01c7\u01cb\u01d3\u01d7\u01e1\u01e9\u01f2\u01fa\u0200\u0206\u0210\u0215"+
		"\u021a\u0220\u0227\u0238\u0244\u0249\u0256\u025c\u0272\u0278";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}