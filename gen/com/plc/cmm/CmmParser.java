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
		SET=25, NAMING_CONVENTION=26, LPAREN=27, RPAREN=28, DOT=29, LBRACKET=30, 
		RBRACKET=31, TILDA=32, PRODUCT=33, DIVIDE=34, SUM=35, SUBTRACT=36, GREATER=37, 
		SMALLER=38, EQUAL=39, AND=40, OR=41, ASSIGN=42, COMMA=43, ARROW=44, NOT_EQUAL=45, 
		SEMICOLON=46, UNDERLINE=47, GREATER_AND_EQUAL=48, SMALLER_AND_EQUAL=49, 
		NEW_LINE=50, SHARPSIGN=51, TAB=52, INTEGER=53, ALPHABET=54, Whitespace=55, 
		Linebreak=56;
	public static final int
		RULE_cmm = 0, RULE_comment = 1, RULE_struct = 2, RULE_struct_scope = 3, 
		RULE_struct_var_dec = 4, RULE_getter_setter = 5, RULE_function_definition = 6, 
		RULE_arguments = 7, RULE_argument_list = 8, RULE_function_invoke = 9, 
		RULE_main = 10, RULE_statement = 11, RULE_expression = 12, RULE_term = 13, 
		RULE_struct_accessor = 14, RULE_return_statement = 15, RULE_argument = 16, 
		RULE_assignment = 17, RULE_declaration = 18, RULE_display = 19, RULE_append_dec = 20, 
		RULE_size_dec = 21, RULE_scope_body_with_return = 22, RULE_scope_body = 23, 
		RULE_scope_body_one_line = 24, RULE_if_stament = 25, RULE_else_stament = 26, 
		RULE_condition = 27, RULE_while_statement = 28, RULE_do_while_statement = 29, 
		RULE_identifier = 30, RULE_integer = 31, RULE_fptr_type = 32, RULE_fptr_accessor = 33, 
		RULE_list_type = 34, RULE_list_accessor = 35, RULE_built_in_data_type = 36, 
		RULE_keywords = 37, RULE_type_specifier = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmm", "comment", "struct", "struct_scope", "struct_var_dec", "getter_setter", 
			"function_definition", "arguments", "argument_list", "function_invoke", 
			"main", "statement", "expression", "term", "struct_accessor", "return_statement", 
			"argument", "assignment", "declaration", "display", "append_dec", "size_dec", 
			"scope_body_with_return", "scope_body", "scope_body_one_line", "if_stament", 
			"else_stament", "condition", "while_statement", "do_while_statement", 
			"identifier", "integer", "fptr_type", "fptr_accessor", "list_type", "list_accessor", 
			"built_in_data_type", "keywords", "type_specifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/*'", "'*/'", "'while'", "'struct'", "'append'", "'size'", "'true'", 
			"'false'", "'fptr'", "'display'", "'string'", "'main'", "'int'", "'bool'", 
			"'list'", "'void'", "'do'", "'if'", "'endif'", "'else'", "'return'", 
			"'get'", "'begin'", "'end'", "'set'", null, "'('", "')'", "'.'", "'['", 
			"']'", "'~'", "'*'", "'/'", "'+'", "'-'", "'>'", "'<'", "'=='", "'&'", 
			"'|'", "'='", "','", "'->'", "'!='", "';'", "'_'", null, null, "'\n'", 
			"'#'", "'\t'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WHILE", "STRUCT", "APPEND", "SIZE", "TRUE", "FALSE", 
			"FPTR", "DISPLAY", "STRING", "MAIN", "INT", "BOOL", "LIST", "VOID", "DO", 
			"IF", "ENDIF", "ELSE", "RETURN", "GET", "BEGIN", "END", "SET", "NAMING_CONVENTION", 
			"LPAREN", "RPAREN", "DOT", "LBRACKET", "RBRACKET", "TILDA", "PRODUCT", 
			"DIVIDE", "SUM", "SUBTRACT", "GREATER", "SMALLER", "EQUAL", "AND", "OR", 
			"ASSIGN", "COMMA", "ARROW", "NOT_EQUAL", "SEMICOLON", "UNDERLINE", "GREATER_AND_EQUAL", 
			"SMALLER_AND_EQUAL", "NEW_LINE", "SHARPSIGN", "TAB", "INTEGER", "ALPHABET", 
			"Whitespace", "Linebreak"
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					comment();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					struct();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					comment();
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					function_definition();
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(102);
				comment();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
			setState(110);
			match(T__0);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTEGER || _la==ALPHABET) {
				{
				{
				setState(111);
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
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
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
			setState(120);
			match(STRUCT);
			setState(121);
			((StructContext)_localctx).a = match(NAMING_CONVENTION);
			System.out.println("StructDec: "+(((StructContext)_localctx).a!=null?((StructContext)_localctx).a.getText():null));
			setState(123);
			match(BEGIN);
			setState(124);
			match(NEW_LINE);
			setState(128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				struct_scope();
				setState(126);
				match(NEW_LINE);
				}
				}
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << APPEND) | (1L << SIZE) | (1L << FPTR) | (1L << STRING) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << NAMING_CONVENTION) | (1L << LPAREN) | (1L << TILDA) | (1L << SUBTRACT) | (1L << NEW_LINE) | (1L << INTEGER))) != 0) );
			setState(132);
			match(END);
			setState(133);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << FPTR) | (1L << STRING) | (1L << INT) | (1L << BOOL) | (1L << LIST))) != 0)) {
					{
					{
					setState(135);
					declaration();
					setState(136);
					match(SEMICOLON);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				struct_var_dec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(145);
				assignment();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(146);
					match(SEMICOLON);
					}
				}

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
			setState(151);
			declaration();
			setState(152);
			argument_list();
			setState(153);
			match(BEGIN);
			setState(154);
			match(NEW_LINE);
			setState(155);
			getter_setter();
			setState(156);
			match(NEW_LINE);
			setState(157);
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
		public List<TerminalNode> END() { return getTokens(CmmParser.END); }
		public TerminalNode END(int i) {
			return getToken(CmmParser.END, i);
		}
		public TerminalNode GET() { return getToken(CmmParser.GET, 0); }
		public Scope_body_with_returnContext scope_body_with_return() {
			return getRuleContext(Scope_body_with_returnContext.class,0);
		}
		public List<Scope_bodyContext> scope_body() {
			return getRuleContexts(Scope_bodyContext.class);
		}
		public Scope_bodyContext scope_body(int i) {
			return getRuleContext(Scope_bodyContext.class,i);
		}
		public List<Return_statementContext> return_statement() {
			return getRuleContexts(Return_statementContext.class);
		}
		public Return_statementContext return_statement(int i) {
			return getRuleContext(Return_statementContext.class,i);
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
			int _alt;
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(159);
				match(SET);
				System.out.println("Setter");
				setState(161);
				match(BEGIN);
				setState(162);
				match(NEW_LINE);
				setState(166); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(166);
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
						case LPAREN:
						case TILDA:
						case SUBTRACT:
						case INTEGER:
							{
							setState(163);
							scope_body();
							}
							break;
						case RETURN:
							{
							setState(164);
							return_statement();
							}
							break;
						case NEW_LINE:
							{
							setState(165);
							match(NEW_LINE);
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
					setState(168); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(170);
				match(NEW_LINE);
				setState(171);
				match(END);
				setState(172);
				match(NEW_LINE);
				setState(173);
				match(GET);
				System.out.println("Getter");
				setState(175);
				match(BEGIN);
				setState(176);
				match(NEW_LINE);
				setState(177);
				scope_body_with_return();
				setState(178);
				match(NEW_LINE);
				setState(179);
				match(END);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(181);
				match(SET);
				System.out.println("Setter");
				setState(183);
				match(BEGIN);
				setState(184);
				match(NEW_LINE);
				setState(188); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(188);
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
						case LPAREN:
						case TILDA:
						case SUBTRACT:
						case INTEGER:
							{
							setState(185);
							scope_body();
							}
							break;
						case RETURN:
							{
							setState(186);
							return_statement();
							}
							break;
						case NEW_LINE:
							{
							setState(187);
							match(NEW_LINE);
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
					setState(190); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(192);
				match(NEW_LINE);
				setState(193);
				match(END);
				setState(194);
				match(NEW_LINE);
				setState(195);
				match(GET);
				System.out.println("Getter");
				setState(197);
				match(NEW_LINE);
				setState(198);
				return_statement();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(199);
				match(SET);
				System.out.println("Setter");
				setState(203);
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
				case LPAREN:
				case TILDA:
				case SUBTRACT:
				case INTEGER:
					{
					setState(201);
					scope_body_one_line();
					}
					break;
				case RETURN:
					{
					setState(202);
					return_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(205);
				match(GET);
				System.out.println("Getter");
				setState(207);
				match(NEW_LINE);
				setState(208);
				return_statement();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(210);
				match(SET);
				System.out.println("Setter");
				setState(214);
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
				case LPAREN:
				case TILDA:
				case SUBTRACT:
				case INTEGER:
					{
					setState(212);
					scope_body_one_line();
					}
					break;
				case RETURN:
					{
					setState(213);
					return_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(216);
				match(GET);
				System.out.println("Getter");
				setState(218);
				match(BEGIN);
				setState(219);
				match(NEW_LINE);
				setState(220);
				scope_body_with_return();
				setState(221);
				match(NEW_LINE);
				setState(222);
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
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
		}
		public List<Return_statementContext> return_statement() {
			return getRuleContexts(Return_statementContext.class);
		}
		public Return_statementContext return_statement(int i) {
			return getRuleContext(Return_statementContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<Scope_bodyContext> scope_body() {
			return getRuleContexts(Scope_bodyContext.class);
		}
		public Scope_bodyContext scope_body(int i) {
			return getRuleContext(Scope_bodyContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CmmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CmmParser.SEMICOLON, i);
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
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				int a;
				setState(227);
				type_specifier();
				setState(228);
				((Function_definitionContext)_localctx).a = match(NAMING_CONVENTION);
				System.out.println("FunctionDec: "+(((Function_definitionContext)_localctx).a!=null?((Function_definitionContext)_localctx).a.getText():null));
				setState(230);
				argument_list();
				setState(252);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RETURN:
				case NEW_LINE:
					{
					setState(234);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NEW_LINE:
						{
						setState(231);
						match(NEW_LINE);
						setState(232);
						scope_body_one_line();
						}
						break;
					case RETURN:
						{
						setState(233);
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
					setState(236);
					match(BEGIN);
					setState(237);
					match(NEW_LINE);
					setState(246);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							setState(244);
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
							case LPAREN:
							case TILDA:
							case SUBTRACT:
							case INTEGER:
								{
								setState(238);
								scope_body();
								}
								break;
							case NEW_LINE:
								{
								setState(239);
								match(NEW_LINE);
								}
								break;
							case RETURN:
								{
								{
								setState(240);
								return_statement();
								setState(242);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==SEMICOLON) {
									{
									setState(241);
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
						setState(248);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					}
					setState(249);
					match(NEW_LINE);
					setState(250);
					match(END);
					setState(251);
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
				setState(272);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					int a;
					setState(255);
					match(VOID);
					setState(256);
					((Function_definitionContext)_localctx).a = match(NAMING_CONVENTION);
					System.out.println("FunctionDec: "+(((Function_definitionContext)_localctx).a!=null?((Function_definitionContext)_localctx).a.getText():null));
					setState(258);
					argument_list();
					{
					setState(259);
					match(NEW_LINE);
					setState(260);
					scope_body_one_line();
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEW_LINE) {
						{
						{
						setState(261);
						match(NEW_LINE);
						}
						}
						setState(266);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
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
				case LPAREN:
				case TILDA:
				case SUBTRACT:
				case INTEGER:
					{
					setState(268); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(267);
							scope_body();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(270); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << APPEND) | (1L << FPTR) | (1L << STRING) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << NAMING_CONVENTION))) != 0)) {
				{
				{
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(276);
						argument();
						setState(277);
						match(COMMA);
						}
						} 
					}
					setState(283);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				{
				setState(284);
				argument();
				}
				}
				}
				setState(289);
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
			setState(290);
			match(LPAREN);
			setState(291);
			arguments();
			setState(292);
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
		public List<TerminalNode> LPAREN() { return getTokens(CmmParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CmmParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CmmParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CmmParser.RPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<KeywordsContext> keywords() {
			return getRuleContexts(KeywordsContext.class);
		}
		public KeywordsContext keywords(int i) {
			return getRuleContext(KeywordsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("FunctionCall");
			setState(295);
			match(NAMING_CONVENTION);
			setState(314); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(296);
					match(LPAREN);
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << STRUCT) | (1L << APPEND) | (1L << SIZE) | (1L << TRUE) | (1L << FALSE) | (1L << FPTR) | (1L << DISPLAY) | (1L << MAIN) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << VOID) | (1L << DO) | (1L << IF) | (1L << ENDIF) | (1L << ELSE) | (1L << RETURN) | (1L << GET) | (1L << BEGIN) | (1L << END) | (1L << SET) | (1L << NAMING_CONVENTION) | (1L << LPAREN) | (1L << TILDA) | (1L << SUBTRACT) | (1L << INTEGER))) != 0)) {
						{
						setState(299);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
						case 1:
							{
							setState(297);
							expression(0);
							}
							break;
						case 2:
							{
							setState(298);
							keywords();
							}
							break;
						}
						setState(308);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(301);
							match(COMMA);
							setState(304);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
							case 1:
								{
								setState(302);
								keywords();
								}
								break;
							case 2:
								{
								setState(303);
								expression(0);
								}
								break;
							}
							}
							}
							setState(310);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(313);
					match(RPAREN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(316); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(CmmParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
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
			int _alt;
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				int a;
				System.out.println("Main");
				{
				setState(320);
				match(MAIN);
				setState(321);
				match(LPAREN);
				setState(322);
				match(RPAREN);
				setState(323);
				match(NEW_LINE);
				setState(324);
				scope_body_one_line();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(325);
				match(MAIN);
				setState(326);
				match(LPAREN);
				setState(327);
				match(RPAREN);
				setState(328);
				match(BEGIN);
				setState(329);
				match(NEW_LINE);
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(332);
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
						case LPAREN:
						case TILDA:
						case SUBTRACT:
						case INTEGER:
							{
							setState(330);
							scope_body();
							}
							break;
						case NEW_LINE:
							{
							setState(331);
							match(NEW_LINE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(336);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(337);
				match(NEW_LINE);
				setState(338);
				match(END);
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(339);
					match(NEW_LINE);
					}
					}
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				if_stament();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				while_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				do_while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(351);
				display();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(352);
				declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(353);
				expression(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(354);
				function_invoke();
				System.out.println("FunctionCall");
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(357);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token a;
		public TerminalNode SUBTRACT() { return getToken(CmmParser.SUBTRACT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List_accessorContext list_accessor() {
			return getRuleContext(List_accessorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public TerminalNode TILDA() { return getToken(CmmParser.TILDA, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PRODUCT() { return getToken(CmmParser.PRODUCT, 0); }
		public TerminalNode DIVIDE() { return getToken(CmmParser.DIVIDE, 0); }
		public TerminalNode SUM() { return getToken(CmmParser.SUM, 0); }
		public TerminalNode AND() { return getToken(CmmParser.AND, 0); }
		public TerminalNode OR() { return getToken(CmmParser.OR, 0); }
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(361);
				match(SUBTRACT);
				System.out.println("Operator : -");
				setState(363);
				expression(8);
				}
				break;
			case 2:
				{
				setState(364);
				term();
				}
				break;
			case 3:
				{
				setState(365);
				list_accessor();
				}
				break;
			case 4:
				{
				setState(366);
				match(LPAREN);
				setState(367);
				expression(0);
				setState(368);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(370);
				match(TILDA);
				System.out.println("Operator : ~");
				setState(372);
				match(LPAREN);
				setState(373);
				expression(0);
				setState(374);
				match(RPAREN);
				}
				break;
			case 6:
				{
				setState(376);
				condition();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(409);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(379);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						int a;
						setState(381);
						((ExpressionContext)_localctx).a = match(PRODUCT);
						System.out.println("Operator : " + (((ExpressionContext)_localctx).a!=null?((ExpressionContext)_localctx).a.getText():null));
						setState(383);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(384);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						int a;
						setState(386);
						((ExpressionContext)_localctx).a = match(DIVIDE);
						System.out.println("Operator : " + (((ExpressionContext)_localctx).a!=null?((ExpressionContext)_localctx).a.getText():null));
						setState(388);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(389);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						int a;
						setState(391);
						((ExpressionContext)_localctx).a = match(SUM);
						System.out.println("Operator : " + (((ExpressionContext)_localctx).a!=null?((ExpressionContext)_localctx).a.getText():null));
						setState(393);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(394);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						int a;
						setState(396);
						((ExpressionContext)_localctx).a = match(SUBTRACT);
						System.out.println("Operator : " + (((ExpressionContext)_localctx).a!=null?((ExpressionContext)_localctx).a.getText():null));
						setState(398);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(399);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						int a;
						setState(401);
						((ExpressionContext)_localctx).a = match(AND);
						System.out.println("Operator : " + (((ExpressionContext)_localctx).a!=null?((ExpressionContext)_localctx).a.getText():null));
						setState(403);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(404);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						int a;
						setState(406);
						((ExpressionContext)_localctx).a = match(OR);
						System.out.println("Operator : " + (((ExpressionContext)_localctx).a!=null?((ExpressionContext)_localctx).a.getText():null));
						setState(408);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public Function_invokeContext function_invoke() {
			return getRuleContext(Function_invokeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Struct_accessorContext struct_accessor() {
			return getRuleContext(Struct_accessorContext.class,0);
		}
		public Size_decContext size_dec() {
			return getRuleContext(Size_decContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_term);
		try {
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				function_invoke();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				integer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				struct_accessor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(418);
				size_dec();
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

	public static class Struct_accessorContext extends ParserRuleContext {
		public List<TerminalNode> NAMING_CONVENTION() { return getTokens(CmmParser.NAMING_CONVENTION); }
		public TerminalNode NAMING_CONVENTION(int i) {
			return getToken(CmmParser.NAMING_CONVENTION, i);
		}
		public TerminalNode DOT() { return getToken(CmmParser.DOT, 0); }
		public Struct_accessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_accessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStruct_accessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStruct_accessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStruct_accessor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_accessorContext struct_accessor() throws RecognitionException {
		Struct_accessorContext _localctx = new Struct_accessorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_struct_accessor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(NAMING_CONVENTION);
			setState(422);
			match(DOT);
			setState(423);
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CmmParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Append_decContext append_dec() {
			return getRuleContext(Append_decContext.class,0);
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
			setState(425);
			match(RETURN);
			System.out.println("Return");
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(427);
					expression(0);
					}
					break;
				case 2:
					{
					setState(428);
					append_dec();
					}
					break;
				}
				setState(432);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(431);
					match(SEMICOLON);
					}
					break;
				}
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
		enterRule(_localctx, 32, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a;
			setState(437);
			type_specifier();
			setState(438);
			((ArgumentContext)_localctx).a = match(NAMING_CONVENTION);
			System.out.println("ArgumentDec : "+(((ArgumentContext)_localctx).a!=null?((ArgumentContext)_localctx).a.getText():null));
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
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 34, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APPEND:
			case SIZE:
			case NAMING_CONVENTION:
			case LPAREN:
			case TILDA:
			case SUBTRACT:
			case INTEGER:
				{
				setState(441);
				expression(0);
				}
				break;
			case STRUCT:
			case FPTR:
			case STRING:
			case INT:
			case BOOL:
			case LIST:
				{
				setState(442);
				declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(445);
			match(ASSIGN);
			setState(446);
			expression(0);
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(447);
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
		public Built_in_data_typeContext built_in_data_type() {
			return getRuleContext(Built_in_data_typeContext.class,0);
		}
		public Fptr_accessorContext fptr_accessor() {
			return getRuleContext(Fptr_accessorContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
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
		enterRule(_localctx, 36, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(450);
				built_in_data_type();
				}
				break;
			case 2:
				{
				{
				setState(451);
				match(STRUCT);
				setState(452);
				match(NAMING_CONVENTION);
				}
				}
				break;
			case 3:
				{
				setState(453);
				fptr_accessor();
				}
				break;
			}
			setState(456);
			identifier();
			}
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(458);
				match(COMMA);
				setState(459);
				identifier();
				}
				}
				setState(464);
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

	public static class DisplayContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(CmmParser.DISPLAY, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		enterRule(_localctx, 38, RULE_display);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(DISPLAY);
			System.out.println("Built-in: display");
			setState(467);
			match(LPAREN);
			setState(468);
			statement();
			setState(469);
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
		public TerminalNode COMMA() { return getToken(CmmParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public List_accessorContext list_accessor() {
			return getRuleContext(List_accessorContext.class,0);
		}
		public Struct_accessorContext struct_accessor() {
			return getRuleContext(Struct_accessorContext.class,0);
		}
		public Function_invokeContext function_invoke() {
			return getRuleContext(Function_invokeContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_append_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("Append");
			setState(472);
			match(APPEND);
			setState(473);
			match(LPAREN);
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(474);
				match(NAMING_CONVENTION);
				}
				break;
			case 2:
				{
				setState(475);
				list_accessor();
				}
				break;
			case 3:
				{
				setState(476);
				struct_accessor();
				}
				break;
			case 4:
				{
				setState(477);
				function_invoke();
				}
				break;
			}
			setState(480);
			match(COMMA);
			setState(481);
			expression(0);
			setState(482);
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
		enterRule(_localctx, 42, RULE_size_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("Size");
			setState(485);
			match(SIZE);
			setState(486);
			match(LPAREN);
			setState(487);
			match(NAMING_CONVENTION);
			setState(488);
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
		enterRule(_localctx, 44, RULE_scope_body_with_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << WHILE) | (1L << STRUCT) | (1L << APPEND) | (1L << SIZE) | (1L << FPTR) | (1L << DISPLAY) | (1L << STRING) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << DO) | (1L << IF) | (1L << NAMING_CONVENTION) | (1L << LPAREN) | (1L << TILDA) | (1L << SUBTRACT) | (1L << INTEGER))) != 0)) {
				{
				{
				setState(490);
				scope_body();
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(496);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 46, RULE_scope_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(498);
				comment();
				}
			}

			{
			setState(501);
			statement();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(502);
				match(SEMICOLON);
				}
			}

			}
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(505);
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
		enterRule(_localctx, 48, RULE_scope_body_one_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(508);
				comment();
				}
			}

			{
			setState(511);
			statement();
			}
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(512);
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
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 50, RULE_if_stament);
		int _la;
		try {
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(515);
				match(IF);
				System.out.println("Conditional: if");
				setState(517);
				match(LPAREN);
				setState(520);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(518);
					expression(0);
					}
					break;
				case 2:
					{
					setState(519);
					condition();
					}
					break;
				}
				setState(522);
				match(RPAREN);
				setState(525);
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
				case LPAREN:
				case TILDA:
				case SUBTRACT:
				case INTEGER:
					{
					setState(523);
					scope_body_one_line();
					}
					break;
				case RETURN:
					{
					setState(524);
					return_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(527);
				match(NEW_LINE);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(529);
				match(IF);
				System.out.println("Conditional: if");
				setState(531);
				match(LPAREN);
				setState(534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(532);
					expression(0);
					}
					break;
				case 2:
					{
					setState(533);
					condition();
					}
					break;
				}
				setState(536);
				match(RPAREN);
				setState(539);
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
				case LPAREN:
				case TILDA:
				case SUBTRACT:
				case INTEGER:
					{
					setState(537);
					scope_body_one_line();
					}
					break;
				case RETURN:
					{
					setState(538);
					return_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(541);
				else_stament();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(543);
				match(IF);
				System.out.println("Conditional: if");
				setState(545);
				match(LPAREN);
				setState(548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(546);
					expression(0);
					}
					break;
				case 2:
					{
					setState(547);
					condition();
					}
					break;
				}
				setState(550);
				match(RPAREN);
				setState(551);
				match(BEGIN);
				setState(552);
				match(NEW_LINE);
				setState(557);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(553);
					scope_body();
					}
					break;
				case 2:
					{
					setState(554);
					scope_body();
					setState(555);
					return_statement();
					}
					break;
				}
				setState(559);
				match(NEW_LINE);
				setState(560);
				match(END);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(562);
				match(IF);
				System.out.println("Conditional: if");
				setState(564);
				match(LPAREN);
				setState(567);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(565);
					expression(0);
					}
					break;
				case 2:
					{
					setState(566);
					condition();
					}
					break;
				}
				setState(569);
				match(RPAREN);
				setState(570);
				match(BEGIN);
				setState(571);
				match(NEW_LINE);
				setState(576);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(572);
					scope_body();
					}
					break;
				case 2:
					{
					setState(573);
					scope_body();
					setState(574);
					return_statement();
					}
					break;
				}
				setState(578);
				match(NEW_LINE);
				setState(579);
				match(END);
				setState(580);
				else_stament();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(582);
				match(IF);
				System.out.println("Conditional: if");
				setState(586);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(584);
					expression(0);
					}
					break;
				case 2:
					{
					setState(585);
					condition();
					}
					break;
				}
				setState(588);
				match(NEW_LINE);
				setState(594);
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
				case LPAREN:
				case TILDA:
				case SUBTRACT:
				case INTEGER:
					{
					setState(589);
					scope_body_one_line();
					}
					break;
				case RETURN:
					{
					setState(590);
					return_statement();
					setState(592);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(591);
						match(SEMICOLON);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(596);
				match(NEW_LINE);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(598);
				match(IF);
				System.out.println("Conditional: if");
				setState(602);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(600);
					expression(0);
					}
					break;
				case 2:
					{
					setState(601);
					condition();
					}
					break;
				}
				setState(604);
				match(NEW_LINE);
				setState(610);
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
				case LPAREN:
				case TILDA:
				case SUBTRACT:
				case INTEGER:
					{
					setState(605);
					scope_body_one_line();
					}
					break;
				case RETURN:
					{
					setState(606);
					return_statement();
					setState(608);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(607);
						match(SEMICOLON);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(612);
				match(NEW_LINE);
				setState(613);
				else_stament();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(615);
				match(IF);
				System.out.println("Conditional: if");
				setState(619);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(617);
					expression(0);
					}
					break;
				case 2:
					{
					setState(618);
					condition();
					}
					break;
				}
				setState(621);
				match(BEGIN);
				setState(622);
				match(NEW_LINE);
				setState(627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(623);
					scope_body();
					}
					break;
				case 2:
					{
					setState(624);
					scope_body();
					setState(625);
					return_statement();
					}
					break;
				}
				setState(629);
				match(NEW_LINE);
				setState(630);
				match(END);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(632);
				match(IF);
				System.out.println("Conditional: if");
				setState(636);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(634);
					expression(0);
					}
					break;
				case 2:
					{
					setState(635);
					condition();
					}
					break;
				}
				setState(638);
				match(BEGIN);
				setState(639);
				match(NEW_LINE);
				setState(644);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(640);
					scope_body();
					}
					break;
				case 2:
					{
					setState(641);
					scope_body();
					setState(642);
					return_statement();
					}
					break;
				}
				setState(646);
				match(NEW_LINE);
				setState(647);
				match(END);
				setState(648);
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
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
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
		enterRule(_localctx, 52, RULE_else_stament);
		int _la;
		try {
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(652);
				match(ELSE);
				System.out.println("Conditonal: else");
				setState(654);
				match(NEW_LINE);
				setState(660);
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
				case LPAREN:
				case TILDA:
				case SUBTRACT:
				case INTEGER:
					{
					setState(655);
					scope_body_one_line();
					}
					break;
				case RETURN:
					{
					setState(656);
					return_statement();
					setState(658);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						setState(657);
						match(SEMICOLON);
						}
						break;
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
				{
				setState(662);
				match(ELSE);
				System.out.println("Conditonal: else");
				setState(664);
				match(BEGIN);
				setState(665);
				match(NEW_LINE);
				setState(672);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(666);
					scope_body();
					}
					break;
				case 2:
					{
					setState(667);
					scope_body();
					setState(668);
					return_statement();
					setState(670);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(669);
						match(SEMICOLON);
						}
					}

					}
					break;
				}
				setState(674);
				match(NEW_LINE);
				setState(675);
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
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(CmmParser.EQUAL, 0); }
		public TerminalNode GREATER_AND_EQUAL() { return getToken(CmmParser.GREATER_AND_EQUAL, 0); }
		public TerminalNode SMALLER_AND_EQUAL() { return getToken(CmmParser.SMALLER_AND_EQUAL, 0); }
		public TerminalNode SMALLER() { return getToken(CmmParser.SMALLER, 0); }
		public TerminalNode GREATER() { return getToken(CmmParser.GREATER, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(CmmParser.NOT_EQUAL, 0); }
		public TerminalNode AND() { return getToken(CmmParser.AND, 0); }
		public TerminalNode OR() { return getToken(CmmParser.OR, 0); }
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
		enterRule(_localctx, 54, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			int a;
			setState(682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(680);
				integer();
				}
				break;
			case NAMING_CONVENTION:
				{
				setState(681);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(684);
			((ConditionContext)_localctx).a = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << SMALLER) | (1L << EQUAL) | (1L << AND) | (1L << OR) | (1L << NOT_EQUAL) | (1L << GREATER_AND_EQUAL) | (1L << SMALLER_AND_EQUAL))) != 0)) ) {
				((ConditionContext)_localctx).a = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			System.out.println("Operator : "+(((ConditionContext)_localctx).a!=null?((ConditionContext)_localctx).a.getText():null));
			setState(688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(686);
				integer();
				}
				break;
			case NAMING_CONVENTION:
				{
				setState(687);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
		public Scope_body_one_lineContext scope_body_one_line() {
			return getRuleContext(Scope_body_one_lineContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<Scope_bodyContext> scope_body() {
			return getRuleContexts(Scope_bodyContext.class);
		}
		public Scope_bodyContext scope_body(int i) {
			return getRuleContext(Scope_bodyContext.class,i);
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
		enterRule(_localctx, 56, RULE_while_statement);
		try {
			int _alt;
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(690);
				match(WHILE);
				System.out.println("Loop: while");
				setState(692);
				match(LPAREN);
				{
				setState(693);
				expression(0);
				}
				setState(694);
				match(RPAREN);
				setState(695);
				match(NEW_LINE);
				setState(696);
				scope_body_one_line();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(698);
				match(WHILE);
				System.out.println("Loop: while");
				setState(700);
				match(LPAREN);
				{
				setState(701);
				expression(0);
				}
				setState(702);
				match(RPAREN);
				setState(703);
				match(BEGIN);
				setState(704);
				match(NEW_LINE);
				setState(707); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(707);
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
						case LPAREN:
						case TILDA:
						case SUBTRACT:
						case INTEGER:
							{
							setState(705);
							scope_body();
							}
							break;
						case NEW_LINE:
							{
							setState(706);
							match(NEW_LINE);
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
					setState(709); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(711);
				match(NEW_LINE);
				setState(712);
				match(END);
				setState(713);
				match(NEW_LINE);
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
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(CmmParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CmmParser.NEW_LINE, i);
		}
		public Scope_bodyContext scope_body() {
			return getRuleContext(Scope_bodyContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
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
		enterRule(_localctx, 58, RULE_do_while_statement);
		int _la;
		try {
			setState(748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(717);
				match(DO);
				setState(719); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(718);
					match(NEW_LINE);
					}
					}
					setState(721); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				System.out.println("Loop: do...while");
				setState(724);
				scope_body_one_line();
				setState(725);
				match(SEMICOLON);
				setState(727); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(726);
					match(NEW_LINE);
					}
					}
					setState(729); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(731);
				match(WHILE);
				setState(734);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(732);
					expression(0);
					}
					break;
				case 2:
					{
					setState(733);
					condition();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(736);
				match(DO);
				System.out.println("Loop: do...while");
				setState(738);
				scope_body();
				setState(739);
				match(WHILE);
				setState(740);
				match(LPAREN);
				setState(743);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(741);
					expression(0);
					}
					break;
				case 2:
					{
					setState(742);
					condition();
					}
					break;
				}
				setState(745);
				match(RPAREN);
				setState(746);
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
		public Token a;
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
		enterRule(_localctx, 60, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a;
			setState(751);
			((IdentifierContext)_localctx).a = match(NAMING_CONVENTION);
			System.out.println("VarDec : "+(((IdentifierContext)_localctx).a!=null?((IdentifierContext)_localctx).a.getText():null));
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
		enterRule(_localctx, 62, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
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
		public List<TerminalNode> VOID() { return getTokens(CmmParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(CmmParser.VOID, i);
		}
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
		enterRule(_localctx, 64, RULE_fptr_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(FPTR);
			setState(757);
			match(SMALLER);
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << APPEND) | (1L << FPTR) | (1L << STRING) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << VOID) | (1L << NAMING_CONVENTION))) != 0)) {
				{
				{
				setState(765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(760);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case STRUCT:
						case APPEND:
						case FPTR:
						case STRING:
						case INT:
						case BOOL:
						case LIST:
						case NAMING_CONVENTION:
							{
							setState(758);
							type_specifier();
							}
							break;
						case VOID:
							{
							setState(759);
							match(VOID);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(762);
						match(COMMA);
						}
						} 
					}
					setState(767);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				}
				setState(770);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRUCT:
				case APPEND:
				case FPTR:
				case STRING:
				case INT:
				case BOOL:
				case LIST:
				case NAMING_CONVENTION:
					{
					setState(768);
					type_specifier();
					}
					break;
				case VOID:
					{
					setState(769);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(777);
			match(ARROW);
			setState(778);
			type_specifier();
			setState(779);
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

	public static class Fptr_accessorContext extends ParserRuleContext {
		public TerminalNode FPTR() { return getToken(CmmParser.FPTR, 0); }
		public TerminalNode SMALLER() { return getToken(CmmParser.SMALLER, 0); }
		public TerminalNode GREATER() { return getToken(CmmParser.GREATER, 0); }
		public TerminalNode ARROW() { return getToken(CmmParser.ARROW, 0); }
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public List<TerminalNode> VOID() { return getTokens(CmmParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(CmmParser.VOID, i);
		}
		public Fptr_accessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fptr_accessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFptr_accessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFptr_accessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFptr_accessor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fptr_accessorContext fptr_accessor() throws RecognitionException {
		Fptr_accessorContext _localctx = new Fptr_accessorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fptr_accessor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			match(FPTR);
			setState(782);
			match(SMALLER);
			{
			{
			setState(785);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case APPEND:
			case FPTR:
			case STRING:
			case INT:
			case BOOL:
			case LIST:
			case NAMING_CONVENTION:
				{
				setState(783);
				type_specifier();
				}
				break;
			case VOID:
				{
				setState(784);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(787);
			match(ARROW);
			setState(790);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case APPEND:
			case FPTR:
			case STRING:
			case INT:
			case BOOL:
			case LIST:
			case NAMING_CONVENTION:
				{
				setState(788);
				type_specifier();
				}
				break;
			case VOID:
				{
				setState(789);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(792);
			match(GREATER);
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
		enterRule(_localctx, 68, RULE_list_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(794);
			match(LIST);
			setState(795);
			match(SHARPSIGN);
			setState(796);
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
		public List<TerminalNode> LBRACKET() { return getTokens(CmmParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CmmParser.LBRACKET, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(CmmParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(CmmParser.INTEGER, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(CmmParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(CmmParser.RBRACKET, i);
		}
		public TerminalNode NAMING_CONVENTION() { return getToken(CmmParser.NAMING_CONVENTION, 0); }
		public Append_decContext append_dec() {
			return getRuleContext(Append_decContext.class,0);
		}
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
		enterRule(_localctx, 70, RULE_list_accessor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMING_CONVENTION:
				{
				setState(798);
				match(NAMING_CONVENTION);
				}
				break;
			case APPEND:
				{
				setState(799);
				append_dec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(802);
			match(LBRACKET);
			setState(803);
			match(INTEGER);
			setState(804);
			match(RBRACKET);
			setState(810);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(805);
					match(LBRACKET);
					setState(806);
					match(INTEGER);
					setState(807);
					match(RBRACKET);
					}
					} 
				}
				setState(812);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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
		enterRule(_localctx, 72, RULE_built_in_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(813);
				match(INT);
				}
				break;
			case 2:
				{
				setState(814);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(815);
				list_type();
				}
				break;
			case 4:
				{
				setState(816);
				fptr_type();
				}
				break;
			case 5:
				{
				setState(817);
				match(BOOL);
				}
				break;
			case 6:
				{
				setState(818);
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

	public static class KeywordsContext extends ParserRuleContext {
		public TerminalNode APPEND() { return getToken(CmmParser.APPEND, 0); }
		public TerminalNode SIZE() { return getToken(CmmParser.SIZE, 0); }
		public TerminalNode TRUE() { return getToken(CmmParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CmmParser.FALSE, 0); }
		public TerminalNode FPTR() { return getToken(CmmParser.FPTR, 0); }
		public TerminalNode DISPLAY() { return getToken(CmmParser.DISPLAY, 0); }
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public TerminalNode MAIN() { return getToken(CmmParser.MAIN, 0); }
		public TerminalNode INT() { return getToken(CmmParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(CmmParser.BOOL, 0); }
		public TerminalNode LIST() { return getToken(CmmParser.LIST, 0); }
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(CmmParser.DO, 0); }
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public TerminalNode ENDIF() { return getToken(CmmParser.ENDIF, 0); }
		public TerminalNode ELSE() { return getToken(CmmParser.ELSE, 0); }
		public TerminalNode RETURN() { return getToken(CmmParser.RETURN, 0); }
		public TerminalNode GET() { return getToken(CmmParser.GET, 0); }
		public TerminalNode SET() { return getToken(CmmParser.SET, 0); }
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public KeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterKeywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitKeywords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitKeywords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordsContext keywords() throws RecognitionException {
		KeywordsContext _localctx = new KeywordsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << STRUCT) | (1L << APPEND) | (1L << SIZE) | (1L << TRUE) | (1L << FALSE) | (1L << FPTR) | (1L << DISPLAY) | (1L << MAIN) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << VOID) | (1L << DO) | (1L << IF) | (1L << ENDIF) | (1L << ELSE) | (1L << RETURN) | (1L << GET) | (1L << BEGIN) | (1L << END) | (1L << SET))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 76, RULE_type_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FPTR:
			case STRING:
			case INT:
			case BOOL:
			case LIST:
				{
				setState(823);
				built_in_data_type();
				}
				break;
			case STRUCT:
				{
				setState(824);
				match(STRUCT);
				setState(825);
				match(NAMING_CONVENTION);
				}
				break;
			case APPEND:
			case NAMING_CONVENTION:
				{
				setState(826);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0340\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2\7\2^\n\2\f\2\16\2a\13\2\3\2\7"+
		"\2d\n\2\f\2\16\2g\13\2\3\2\7\2j\n\2\f\2\16\2m\13\2\3\2\3\2\3\3\3\3\7\3"+
		"s\n\3\f\3\16\3v\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4\u0083"+
		"\n\4\r\4\16\4\u0084\3\4\3\4\3\4\3\5\3\5\3\5\7\5\u008d\n\5\f\5\16\5\u0090"+
		"\13\5\3\5\3\5\3\5\3\5\5\5\u0096\n\5\5\5\u0098\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00a9\n\7\r\7\16\7\u00aa"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\6\7\u00bf\n\7\r\7\16\7\u00c0\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u00ce\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d9\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00e3\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u00ed\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00f5\n\b\7\b\u00f7"+
		"\n\b\f\b\16\b\u00fa\13\b\3\b\3\b\3\b\5\b\u00ff\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\b\u0109\n\b\f\b\16\b\u010c\13\b\3\b\6\b\u010f\n\b\r\b\16"+
		"\b\u0110\5\b\u0113\n\b\5\b\u0115\n\b\3\t\3\t\3\t\7\t\u011a\n\t\f\t\16"+
		"\t\u011d\13\t\3\t\7\t\u0120\n\t\f\t\16\t\u0123\13\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u012e\n\13\3\13\3\13\3\13\5\13\u0133\n\13"+
		"\7\13\u0135\n\13\f\13\16\13\u0138\13\13\5\13\u013a\n\13\3\13\6\13\u013d"+
		"\n\13\r\13\16\13\u013e\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u014f\n\f\f\f\16\f\u0152\13\f\3\f\3\f\3\f\7\f\u0157\n\f\f"+
		"\f\16\f\u015a\13\f\5\f\u015c\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0169\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u017c\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u019c"+
		"\n\16\f\16\16\16\u019f\13\16\3\17\3\17\3\17\3\17\3\17\5\17\u01a6\n\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u01b0\n\21\3\21\5\21\u01b3"+
		"\n\21\5\21\u01b5\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u01be\n"+
		"\23\3\23\3\23\3\23\5\23\u01c3\n\23\3\24\3\24\3\24\3\24\5\24\u01c9\n\24"+
		"\3\24\3\24\3\24\3\24\7\24\u01cf\n\24\f\24\16\24\u01d2\13\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01e1\n\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\7\30\u01ee\n\30"+
		"\f\30\16\30\u01f1\13\30\3\30\3\30\3\31\5\31\u01f6\n\31\3\31\3\31\5\31"+
		"\u01fa\n\31\3\31\5\31\u01fd\n\31\3\32\5\32\u0200\n\32\3\32\3\32\5\32\u0204"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u020b\n\33\3\33\3\33\3\33\5\33\u0210"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0219\n\33\3\33\3\33\3\33"+
		"\5\33\u021e\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0227\n\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0230\n\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u023a\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0243\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u024d\n"+
		"\33\3\33\3\33\3\33\3\33\5\33\u0253\n\33\5\33\u0255\n\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u025d\n\33\3\33\3\33\3\33\3\33\5\33\u0263\n\33\5"+
		"\33\u0265\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u026e\n\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0276\n\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u027f\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0287\n\33\3"+
		"\33\3\33\3\33\3\33\5\33\u028d\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0295\n\34\5\34\u0297\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5"+
		"\34\u02a1\n\34\5\34\u02a3\n\34\3\34\3\34\3\34\5\34\u02a8\n\34\3\35\3\35"+
		"\3\35\5\35\u02ad\n\35\3\35\3\35\3\35\3\35\5\35\u02b3\n\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\6\36\u02c6\n\36\r\36\16\36\u02c7\3\36\3\36\3\36\3\36\5\36\u02ce\n"+
		"\36\3\37\3\37\6\37\u02d2\n\37\r\37\16\37\u02d3\3\37\3\37\3\37\3\37\6\37"+
		"\u02da\n\37\r\37\16\37\u02db\3\37\3\37\3\37\5\37\u02e1\n\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u02ea\n\37\3\37\3\37\3\37\5\37\u02ef\n"+
		"\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\5\"\u02fb\n\"\3\"\7\"\u02fe\n\""+
		"\f\"\16\"\u0301\13\"\3\"\3\"\5\"\u0305\n\"\7\"\u0307\n\"\f\"\16\"\u030a"+
		"\13\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u0314\n#\3#\3#\3#\5#\u0319\n#\3#"+
		"\3#\3$\3$\3$\3$\3%\3%\5%\u0323\n%\3%\3%\3%\3%\3%\3%\7%\u032b\n%\f%\16"+
		"%\u032e\13%\3&\3&\3&\3&\3&\3&\5&\u0336\n&\3\'\3\'\3(\3(\3(\3(\5(\u033e"+
		"\n(\3(\2\3\32)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLN\2\5\3\2\678\5\2\'+//\62\63\4\2\5\f\16\33\2\u03a3\2S\3"+
		"\2\2\2\4p\3\2\2\2\6y\3\2\2\2\b\u0097\3\2\2\2\n\u0099\3\2\2\2\f\u00e2\3"+
		"\2\2\2\16\u0114\3\2\2\2\20\u0121\3\2\2\2\22\u0124\3\2\2\2\24\u0128\3\2"+
		"\2\2\26\u015b\3\2\2\2\30\u0168\3\2\2\2\32\u017b\3\2\2\2\34\u01a5\3\2\2"+
		"\2\36\u01a7\3\2\2\2 \u01ab\3\2\2\2\"\u01b6\3\2\2\2$\u01bd\3\2\2\2&\u01c8"+
		"\3\2\2\2(\u01d3\3\2\2\2*\u01d9\3\2\2\2,\u01e6\3\2\2\2.\u01ef\3\2\2\2\60"+
		"\u01f5\3\2\2\2\62\u01ff\3\2\2\2\64\u028c\3\2\2\2\66\u02a7\3\2\2\28\u02a9"+
		"\3\2\2\2:\u02cd\3\2\2\2<\u02ee\3\2\2\2>\u02f0\3\2\2\2@\u02f4\3\2\2\2B"+
		"\u02f6\3\2\2\2D\u030f\3\2\2\2F\u031c\3\2\2\2H\u0322\3\2\2\2J\u0335\3\2"+
		"\2\2L\u0337\3\2\2\2N\u033d\3\2\2\2PR\5\4\3\2QP\3\2\2\2RU\3\2\2\2SQ\3\2"+
		"\2\2ST\3\2\2\2TY\3\2\2\2US\3\2\2\2VX\5\6\4\2WV\3\2\2\2X[\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z_\3\2\2\2[Y\3\2\2\2\\^\5\4\3\2]\\\3\2\2\2^a\3\2\2\2_]\3"+
		"\2\2\2_`\3\2\2\2`e\3\2\2\2a_\3\2\2\2bd\5\16\b\2cb\3\2\2\2dg\3\2\2\2ec"+
		"\3\2\2\2ef\3\2\2\2fk\3\2\2\2ge\3\2\2\2hj\5\4\3\2ih\3\2\2\2jm\3\2\2\2k"+
		"i\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\5\26\f\2o\3\3\2\2\2pt\7\3\2"+
		"\2qs\t\2\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2"+
		"\2wx\7\4\2\2x\5\3\2\2\2yz\b\4\1\2z{\7\6\2\2{|\7\34\2\2|}\b\4\1\2}~\7\31"+
		"\2\2~\u0082\7\64\2\2\177\u0080\5\b\5\2\u0080\u0081\7\64\2\2\u0081\u0083"+
		"\3\2\2\2\u0082\177\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\32\2\2\u0087\u0088\7"+
		"\64\2\2\u0088\7\3\2\2\2\u0089\u008a\5&\24\2\u008a\u008b\7\60\2\2\u008b"+
		"\u008d\3\2\2\2\u008c\u0089\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0098\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0098\5&\24\2\u0092\u0098\5\n\6\2\u0093\u0095\5$\23\2\u0094\u0096\7\60"+
		"\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u008e\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2"+
		"\2\2\u0098\t\3\2\2\2\u0099\u009a\5&\24\2\u009a\u009b\5\22\n\2\u009b\u009c"+
		"\7\31\2\2\u009c\u009d\7\64\2\2\u009d\u009e\5\f\7\2\u009e\u009f\7\64\2"+
		"\2\u009f\u00a0\7\32\2\2\u00a0\13\3\2\2\2\u00a1\u00a2\7\33\2\2\u00a2\u00a3"+
		"\b\7\1\2\u00a3\u00a4\7\31\2\2\u00a4\u00a8\7\64\2\2\u00a5\u00a9\5\60\31"+
		"\2\u00a6\u00a9\5 \21\2\u00a7\u00a9\7\64\2\2\u00a8\u00a5\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\64\2\2\u00ad"+
		"\u00ae\7\32\2\2\u00ae\u00af\7\64\2\2\u00af\u00b0\7\30\2\2\u00b0\u00b1"+
		"\b\7\1\2\u00b1\u00b2\7\31\2\2\u00b2\u00b3\7\64\2\2\u00b3\u00b4\5.\30\2"+
		"\u00b4\u00b5\7\64\2\2\u00b5\u00b6\7\32\2\2\u00b6\u00e3\3\2\2\2\u00b7\u00b8"+
		"\7\33\2\2\u00b8\u00b9\b\7\1\2\u00b9\u00ba\7\31\2\2\u00ba\u00be\7\64\2"+
		"\2\u00bb\u00bf\5\60\31\2\u00bc\u00bf\5 \21\2\u00bd\u00bf\7\64\2\2\u00be"+
		"\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\7\64\2\2\u00c3\u00c4\7\32\2\2\u00c4\u00c5\7\64\2\2\u00c5\u00c6"+
		"\7\30\2\2\u00c6\u00c7\b\7\1\2\u00c7\u00c8\7\64\2\2\u00c8\u00e3\5 \21\2"+
		"\u00c9\u00ca\7\33\2\2\u00ca\u00cd\b\7\1\2\u00cb\u00ce\5\62\32\2\u00cc"+
		"\u00ce\5 \21\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d0\7\30\2\2\u00d0\u00d1\b\7\1\2\u00d1\u00d2\7\64\2\2\u00d2"+
		"\u00d3\5 \21\2\u00d3\u00e3\3\2\2\2\u00d4\u00d5\7\33\2\2\u00d5\u00d8\b"+
		"\7\1\2\u00d6\u00d9\5\62\32\2\u00d7\u00d9\5 \21\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\30\2\2\u00db\u00dc\b"+
		"\7\1\2\u00dc\u00dd\7\31\2\2\u00dd\u00de\7\64\2\2\u00de\u00df\5.\30\2\u00df"+
		"\u00e0\7\64\2\2\u00e0\u00e1\7\32\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00a1\3"+
		"\2\2\2\u00e2\u00b7\3\2\2\2\u00e2\u00c9\3\2\2\2\u00e2\u00d4\3\2\2\2\u00e3"+
		"\r\3\2\2\2\u00e4\u00e5\b\b\1\2\u00e5\u00e6\5N(\2\u00e6\u00e7\7\34\2\2"+
		"\u00e7\u00e8\b\b\1\2\u00e8\u00fe\5\22\n\2\u00e9\u00ea\7\64\2\2\u00ea\u00ed"+
		"\5\62\32\2\u00eb\u00ed\5 \21\2\u00ec\u00e9\3\2\2\2\u00ec\u00eb\3\2\2\2"+
		"\u00ed\u00ff\3\2\2\2\u00ee\u00ef\7\31\2\2\u00ef\u00f8\7\64\2\2\u00f0\u00f7"+
		"\5\60\31\2\u00f1\u00f7\7\64\2\2\u00f2\u00f4\5 \21\2\u00f3\u00f5\7\60\2"+
		"\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f0"+
		"\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fc\7\64\2\2\u00fc\u00fd\7\32\2\2\u00fd\u00ff\7\64\2\2\u00fe"+
		"\u00ec\3\2\2\2\u00fe\u00ee\3\2\2\2\u00ff\u0115\3\2\2\2\u0100\u0101\b\b"+
		"\1\2\u0101\u0102\7\22\2\2\u0102\u0103\7\34\2\2\u0103\u0104\b\b\1\2\u0104"+
		"\u0105\5\22\n\2\u0105\u0106\7\64\2\2\u0106\u010a\5\62\32\2\u0107\u0109"+
		"\7\64\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2"+
		"\u010a\u010b\3\2\2\2\u010b\u0113\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010f"+
		"\5\60\31\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2"+
		"\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0100\3\2\2\2\u0112\u010e"+
		"\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u00e4\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\17\3\2\2\2\u0116\u0117\5\"\22\2\u0117\u0118\7-\2\2\u0118\u011a\3\2\2"+
		"\2\u0119\u0116\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\5\"\22\2"+
		"\u011f\u011b\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\21\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7\35\2\2\u0125"+
		"\u0126\5\20\t\2\u0126\u0127\7\36\2\2\u0127\23\3\2\2\2\u0128\u0129\b\13"+
		"\1\2\u0129\u013c\7\34\2\2\u012a\u0139\7\35\2\2\u012b\u012e\5\32\16\2\u012c"+
		"\u012e\5L\'\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\u0136\3\2"+
		"\2\2\u012f\u0132\7-\2\2\u0130\u0133\5L\'\2\u0131\u0133\5\32\16\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u012f\3\2"+
		"\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u012d\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\u013d\7\36\2\2\u013c\u012a\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\25\3\2\2"+
		"\2\u0140\u0141\b\f\1\2\u0141\u0142\b\f\1\2\u0142\u0143\7\16\2\2\u0143"+
		"\u0144\7\35\2\2\u0144\u0145\7\36\2\2\u0145\u0146\7\64\2\2\u0146\u015c"+
		"\5\62\32\2\u0147\u0148\7\16\2\2\u0148\u0149\7\35\2\2\u0149\u014a\7\36"+
		"\2\2\u014a\u014b\7\31\2\2\u014b\u0150\7\64\2\2\u014c\u014f\5\60\31\2\u014d"+
		"\u014f\7\64\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3"+
		"\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0154\7\64\2\2\u0154\u0158\7\32\2\2\u0155\u0157\7"+
		"\64\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u0140\3\2"+
		"\2\2\u015b\u0147\3\2\2\2\u015c\27\3\2\2\2\u015d\u0169\5\64\33\2\u015e"+
		"\u0169\5:\36\2\u015f\u0169\5<\37\2\u0160\u0169\5$\23\2\u0161\u0169\5("+
		"\25\2\u0162\u0169\5&\24\2\u0163\u0169\5\32\16\2\u0164\u0165\5\24\13\2"+
		"\u0165\u0166\b\r\1\2\u0166\u0169\3\2\2\2\u0167\u0169\5*\26\2\u0168\u015d"+
		"\3\2\2\2\u0168\u015e\3\2\2\2\u0168\u015f\3\2\2\2\u0168\u0160\3\2\2\2\u0168"+
		"\u0161\3\2\2\2\u0168\u0162\3\2\2\2\u0168\u0163\3\2\2\2\u0168\u0164\3\2"+
		"\2\2\u0168\u0167\3\2\2\2\u0169\31\3\2\2\2\u016a\u016b\b\16\1\2\u016b\u016c"+
		"\7&\2\2\u016c\u016d\b\16\1\2\u016d\u017c\5\32\16\n\u016e\u017c\5\34\17"+
		"\2\u016f\u017c\5H%\2\u0170\u0171\7\35\2\2\u0171\u0172\5\32\16\2\u0172"+
		"\u0173\7\36\2\2\u0173\u017c\3\2\2\2\u0174\u0175\7\"\2\2\u0175\u0176\b"+
		"\16\1\2\u0176\u0177\7\35\2\2\u0177\u0178\5\32\16\2\u0178\u0179\7\36\2"+
		"\2\u0179\u017c\3\2\2\2\u017a\u017c\58\35\2\u017b\u016a\3\2\2\2\u017b\u016e"+
		"\3\2\2\2\u017b\u016f\3\2\2\2\u017b\u0170\3\2\2\2\u017b\u0174\3\2\2\2\u017b"+
		"\u017a\3\2\2\2\u017c\u019d\3\2\2\2\u017d\u017e\f\16\2\2\u017e\u017f\b"+
		"\16\1\2\u017f\u0180\7#\2\2\u0180\u0181\b\16\1\2\u0181\u019c\5\32\16\17"+
		"\u0182\u0183\f\r\2\2\u0183\u0184\b\16\1\2\u0184\u0185\7$\2\2\u0185\u0186"+
		"\b\16\1\2\u0186\u019c\5\32\16\16\u0187\u0188\f\f\2\2\u0188\u0189\b\16"+
		"\1\2\u0189\u018a\7%\2\2\u018a\u018b\b\16\1\2\u018b\u019c\5\32\16\r\u018c"+
		"\u018d\f\13\2\2\u018d\u018e\b\16\1\2\u018e\u018f\7&\2\2\u018f\u0190\b"+
		"\16\1\2\u0190\u019c\5\32\16\f\u0191\u0192\f\t\2\2\u0192\u0193\b\16\1\2"+
		"\u0193\u0194\7*\2\2\u0194\u0195\b\16\1\2\u0195\u019c\5\32\16\n\u0196\u0197"+
		"\f\b\2\2\u0197\u0198\b\16\1\2\u0198\u0199\7+\2\2\u0199\u019a\b\16\1\2"+
		"\u019a\u019c\5\32\16\t\u019b\u017d\3\2\2\2\u019b\u0182\3\2\2\2\u019b\u0187"+
		"\3\2\2\2\u019b\u018c\3\2\2\2\u019b\u0191\3\2\2\2\u019b\u0196\3\2\2\2\u019c"+
		"\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\33\3\2\2"+
		"\2\u019f\u019d\3\2\2\2\u01a0\u01a6\5\24\13\2\u01a1\u01a6\5> \2\u01a2\u01a6"+
		"\5@!\2\u01a3\u01a6\5\36\20\2\u01a4\u01a6\5,\27\2\u01a5\u01a0\3\2\2\2\u01a5"+
		"\u01a1\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2"+
		"\2\2\u01a6\35\3\2\2\2\u01a7\u01a8\7\34\2\2\u01a8\u01a9\7\37\2\2\u01a9"+
		"\u01aa\7\34\2\2\u01aa\37\3\2\2\2\u01ab\u01ac\7\27\2\2\u01ac\u01b4\b\21"+
		"\1\2\u01ad\u01b0\5\32\16\2\u01ae\u01b0\5*\26\2\u01af\u01ad\3\2\2\2\u01af"+
		"\u01ae\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01b3\7\60\2\2\u01b2\u01b1\3"+
		"\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01af\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5!\3\2\2\2\u01b6\u01b7\b\22\1\2\u01b7\u01b8\5N(\2\u01b8"+
		"\u01b9\7\34\2\2\u01b9\u01ba\b\22\1\2\u01ba#\3\2\2\2\u01bb\u01be\5\32\16"+
		"\2\u01bc\u01be\5&\24\2\u01bd\u01bb\3\2\2\2\u01bd\u01bc\3\2\2\2\u01be\u01bf"+
		"\3\2\2\2\u01bf\u01c0\7,\2\2\u01c0\u01c2\5\32\16\2\u01c1\u01c3\7\60\2\2"+
		"\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3%\3\2\2\2\u01c4\u01c9\5"+
		"J&\2\u01c5\u01c6\7\6\2\2\u01c6\u01c9\7\34\2\2\u01c7\u01c9\5D#\2\u01c8"+
		"\u01c4\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01ca\3\2"+
		"\2\2\u01ca\u01cb\5> \2\u01cb\u01d0\3\2\2\2\u01cc\u01cd\7-\2\2\u01cd\u01cf"+
		"\5> \2\u01ce\u01cc\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\'\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\7\f\2\2"+
		"\u01d4\u01d5\b\25\1\2\u01d5\u01d6\7\35\2\2\u01d6\u01d7\5\30\r\2\u01d7"+
		"\u01d8\7\36\2\2\u01d8)\3\2\2\2\u01d9\u01da\b\26\1\2\u01da\u01db\7\7\2"+
		"\2\u01db\u01e0\7\35\2\2\u01dc\u01e1\7\34\2\2\u01dd\u01e1\5H%\2\u01de\u01e1"+
		"\5\36\20\2\u01df\u01e1\5\24\13\2\u01e0\u01dc\3\2\2\2\u01e0\u01dd\3\2\2"+
		"\2\u01e0\u01de\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3"+
		"\7-\2\2\u01e3\u01e4\5\32\16\2\u01e4\u01e5\7\36\2\2\u01e5+\3\2\2\2\u01e6"+
		"\u01e7\b\27\1\2\u01e7\u01e8\7\b\2\2\u01e8\u01e9\7\35\2\2\u01e9\u01ea\7"+
		"\34\2\2\u01ea\u01eb\7\36\2\2\u01eb-\3\2\2\2\u01ec\u01ee\5\60\31\2\u01ed"+
		"\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3\5 \21\2\u01f3"+
		"/\3\2\2\2\u01f4\u01f6\5\4\3\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2"+
		"\u01f6\u01f7\3\2\2\2\u01f7\u01f9\5\30\r\2\u01f8\u01fa\7\60\2\2\u01f9\u01f8"+
		"\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01fd\5\4\3\2\u01fc"+
		"\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\61\3\2\2\2\u01fe\u0200\5\4\3"+
		"\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203"+
		"\5\30\r\2\u0202\u0204\5\4\3\2\u0203\u0202\3\2\2\2\u0203\u0204\3\2\2\2"+
		"\u0204\63\3\2\2\2\u0205\u0206\7\24\2\2\u0206\u0207\b\33\1\2\u0207\u020a"+
		"\7\35\2\2\u0208\u020b\5\32\16\2\u0209\u020b\58\35\2\u020a\u0208\3\2\2"+
		"\2\u020a\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020f\7\36\2\2\u020d"+
		"\u0210\5\62\32\2\u020e\u0210\5 \21\2\u020f\u020d\3\2\2\2\u020f\u020e\3"+
		"\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\7\64\2\2\u0212\u028d\3\2\2\2\u0213"+
		"\u0214\7\24\2\2\u0214\u0215\b\33\1\2\u0215\u0218\7\35\2\2\u0216\u0219"+
		"\5\32\16\2\u0217\u0219\58\35\2\u0218\u0216\3\2\2\2\u0218\u0217\3\2\2\2"+
		"\u0219\u021a\3\2\2\2\u021a\u021d\7\36\2\2\u021b\u021e\5\62\32\2\u021c"+
		"\u021e\5 \21\2\u021d\u021b\3\2\2\2\u021d\u021c\3\2\2\2\u021e\u021f\3\2"+
		"\2\2\u021f\u0220\5\66\34\2\u0220\u028d\3\2\2\2\u0221\u0222\7\24\2\2\u0222"+
		"\u0223\b\33\1\2\u0223\u0226\7\35\2\2\u0224\u0227\5\32\16\2\u0225\u0227"+
		"\58\35\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u0229\7\36\2\2\u0229\u022a\7\31\2\2\u022a\u022f\7\64\2\2\u022b\u0230"+
		"\5\60\31\2\u022c\u022d\5\60\31\2\u022d\u022e\5 \21\2\u022e\u0230\3\2\2"+
		"\2\u022f\u022b\3\2\2\2\u022f\u022c\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232"+
		"\7\64\2\2\u0232\u0233\7\32\2\2\u0233\u028d\3\2\2\2\u0234\u0235\7\24\2"+
		"\2\u0235\u0236\b\33\1\2\u0236\u0239\7\35\2\2\u0237\u023a\5\32\16\2\u0238"+
		"\u023a\58\35\2\u0239\u0237\3\2\2\2\u0239\u0238\3\2\2\2\u023a\u023b\3\2"+
		"\2\2\u023b\u023c\7\36\2\2\u023c\u023d\7\31\2\2\u023d\u0242\7\64\2\2\u023e"+
		"\u0243\5\60\31\2\u023f\u0240\5\60\31\2\u0240\u0241\5 \21\2\u0241\u0243"+
		"\3\2\2\2\u0242\u023e\3\2\2\2\u0242\u023f\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\u0245\7\64\2\2\u0245\u0246\7\32\2\2\u0246\u0247\5\66\34\2\u0247\u028d"+
		"\3\2\2\2\u0248\u0249\7\24\2\2\u0249\u024c\b\33\1\2\u024a\u024d\5\32\16"+
		"\2\u024b\u024d\58\35\2\u024c\u024a\3\2\2\2\u024c\u024b\3\2\2\2\u024d\u024e"+
		"\3\2\2\2\u024e\u0254\7\64\2\2\u024f\u0255\5\62\32\2\u0250\u0252\5 \21"+
		"\2\u0251\u0253\7\60\2\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0255\3\2\2\2\u0254\u024f\3\2\2\2\u0254\u0250\3\2\2\2\u0255\u0256\3\2"+
		"\2\2\u0256\u0257\7\64\2\2\u0257\u028d\3\2\2\2\u0258\u0259\7\24\2\2\u0259"+
		"\u025c\b\33\1\2\u025a\u025d\5\32\16\2\u025b\u025d\58\35\2\u025c\u025a"+
		"\3\2\2\2\u025c\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0264\7\64\2\2"+
		"\u025f\u0265\5\62\32\2\u0260\u0262\5 \21\2\u0261\u0263\7\60\2\2\u0262"+
		"\u0261\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0265\3\2\2\2\u0264\u025f\3\2"+
		"\2\2\u0264\u0260\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\7\64\2\2\u0267"+
		"\u0268\5\66\34\2\u0268\u028d\3\2\2\2\u0269\u026a\7\24\2\2\u026a\u026d"+
		"\b\33\1\2\u026b\u026e\5\32\16\2\u026c\u026e\58\35\2\u026d\u026b\3\2\2"+
		"\2\u026d\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\7\31\2\2\u0270"+
		"\u0275\7\64\2\2\u0271\u0276\5\60\31\2\u0272\u0273\5\60\31\2\u0273\u0274"+
		"\5 \21\2\u0274\u0276\3\2\2\2\u0275\u0271\3\2\2\2\u0275\u0272\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u0278\7\64\2\2\u0278\u0279\7\32\2\2\u0279\u028d\3"+
		"\2\2\2\u027a\u027b\7\24\2\2\u027b\u027e\b\33\1\2\u027c\u027f\5\32\16\2"+
		"\u027d\u027f\58\35\2\u027e\u027c\3\2\2\2\u027e\u027d\3\2\2\2\u027f\u0280"+
		"\3\2\2\2\u0280\u0281\7\31\2\2\u0281\u0286\7\64\2\2\u0282\u0287\5\60\31"+
		"\2\u0283\u0284\5\60\31\2\u0284\u0285\5 \21\2\u0285\u0287\3\2\2\2\u0286"+
		"\u0282\3\2\2\2\u0286\u0283\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\7\64"+
		"\2\2\u0289\u028a\7\32\2\2\u028a\u028b\5\66\34\2\u028b\u028d\3\2\2\2\u028c"+
		"\u0205\3\2\2\2\u028c\u0213\3\2\2\2\u028c\u0221\3\2\2\2\u028c\u0234\3\2"+
		"\2\2\u028c\u0248\3\2\2\2\u028c\u0258\3\2\2\2\u028c\u0269\3\2\2\2\u028c"+
		"\u027a\3\2\2\2\u028d\65\3\2\2\2\u028e\u028f\7\26\2\2\u028f\u0290\b\34"+
		"\1\2\u0290\u0296\7\64\2\2\u0291\u0297\5\62\32\2\u0292\u0294\5 \21\2\u0293"+
		"\u0295\7\60\2\2\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0297\3"+
		"\2\2\2\u0296\u0291\3\2\2\2\u0296\u0292\3\2\2\2\u0297\u02a8\3\2\2\2\u0298"+
		"\u0299\7\26\2\2\u0299\u029a\b\34\1\2\u029a\u029b\7\31\2\2\u029b\u02a2"+
		"\7\64\2\2\u029c\u02a3\5\60\31\2\u029d\u029e\5\60\31\2\u029e\u02a0\5 \21"+
		"\2\u029f\u02a1\7\60\2\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1"+
		"\u02a3\3\2\2\2\u02a2\u029c\3\2\2\2\u02a2\u029d\3\2\2\2\u02a3\u02a4\3\2"+
		"\2\2\u02a4\u02a5\7\64\2\2\u02a5\u02a6\7\32\2\2\u02a6\u02a8\3\2\2\2\u02a7"+
		"\u028e\3\2\2\2\u02a7\u0298\3\2\2\2\u02a8\67\3\2\2\2\u02a9\u02ac\b\35\1"+
		"\2\u02aa\u02ad\5@!\2\u02ab\u02ad\5> \2\u02ac\u02aa\3\2\2\2\u02ac\u02ab"+
		"\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\t\3\2\2\u02af\u02b2\b\35\1\2"+
		"\u02b0\u02b3\5@!\2\u02b1\u02b3\5> \2\u02b2\u02b0\3\2\2\2\u02b2\u02b1\3"+
		"\2\2\2\u02b39\3\2\2\2\u02b4\u02b5\7\5\2\2\u02b5\u02b6\b\36\1\2\u02b6\u02b7"+
		"\7\35\2\2\u02b7\u02b8\5\32\16\2\u02b8\u02b9\7\36\2\2\u02b9\u02ba\7\64"+
		"\2\2\u02ba\u02bb\5\62\32\2\u02bb\u02ce\3\2\2\2\u02bc\u02bd\7\5\2\2\u02bd"+
		"\u02be\b\36\1\2\u02be\u02bf\7\35\2\2\u02bf\u02c0\5\32\16\2\u02c0\u02c1"+
		"\7\36\2\2\u02c1\u02c2\7\31\2\2\u02c2\u02c5\7\64\2\2\u02c3\u02c6\5\60\31"+
		"\2\u02c4\u02c6\7\64\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c4\3\2\2\2\u02c6"+
		"\u02c7\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\3\2"+
		"\2\2\u02c9\u02ca\7\64\2\2\u02ca\u02cb\7\32\2\2\u02cb\u02cc\7\64\2\2\u02cc"+
		"\u02ce\3\2\2\2\u02cd\u02b4\3\2\2\2\u02cd\u02bc\3\2\2\2\u02ce;\3\2\2\2"+
		"\u02cf\u02d1\7\23\2\2\u02d0\u02d2\7\64\2\2\u02d1\u02d0\3\2\2\2\u02d2\u02d3"+
		"\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5"+
		"\u02d6\b\37\1\2\u02d6\u02d7\5\62\32\2\u02d7\u02d9\7\60\2\2\u02d8\u02da"+
		"\7\64\2\2\u02d9\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02d9\3\2\2\2"+
		"\u02db\u02dc\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02e0\7\5\2\2\u02de\u02e1"+
		"\5\32\16\2\u02df\u02e1\58\35\2\u02e0\u02de\3\2\2\2\u02e0\u02df\3\2\2\2"+
		"\u02e1\u02ef\3\2\2\2\u02e2\u02e3\7\23\2\2\u02e3\u02e4\b\37\1\2\u02e4\u02e5"+
		"\5\60\31\2\u02e5\u02e6\7\5\2\2\u02e6\u02e9\7\35\2\2\u02e7\u02ea\5\32\16"+
		"\2\u02e8\u02ea\58\35\2\u02e9\u02e7\3\2\2\2\u02e9\u02e8\3\2\2\2\u02ea\u02eb"+
		"\3\2\2\2\u02eb\u02ec\7\36\2\2\u02ec\u02ed\7\60\2\2\u02ed\u02ef\3\2\2\2"+
		"\u02ee\u02cf\3\2\2\2\u02ee\u02e2\3\2\2\2\u02ef=\3\2\2\2\u02f0\u02f1\b"+
		" \1\2\u02f1\u02f2\7\34\2\2\u02f2\u02f3\b \1\2\u02f3?\3\2\2\2\u02f4\u02f5"+
		"\7\67\2\2\u02f5A\3\2\2\2\u02f6\u02f7\7\13\2\2\u02f7\u0308\7(\2\2\u02f8"+
		"\u02fb\5N(\2\u02f9\u02fb\7\22\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02f9\3\2"+
		"\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fe\7-\2\2\u02fd\u02fa\3\2\2\2\u02fe"+
		"\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0304\3\2"+
		"\2\2\u0301\u02ff\3\2\2\2\u0302\u0305\5N(\2\u0303\u0305\7\22\2\2\u0304"+
		"\u0302\3\2\2\2\u0304\u0303\3\2\2\2\u0305\u0307\3\2\2\2\u0306\u02ff\3\2"+
		"\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309"+
		"\u030b\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u030c\7.\2\2\u030c\u030d\5N("+
		"\2\u030d\u030e\7\'\2\2\u030eC\3\2\2\2\u030f\u0310\7\13\2\2\u0310\u0313"+
		"\7(\2\2\u0311\u0314\5N(\2\u0312\u0314\7\22\2\2\u0313\u0311\3\2\2\2\u0313"+
		"\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0318\7.\2\2\u0316\u0319\5N("+
		"\2\u0317\u0319\7\22\2\2\u0318\u0316\3\2\2\2\u0318\u0317\3\2\2\2\u0319"+
		"\u031a\3\2\2\2\u031a\u031b\7\'\2\2\u031bE\3\2\2\2\u031c\u031d\7\21\2\2"+
		"\u031d\u031e\7\65\2\2\u031e\u031f\5N(\2\u031fG\3\2\2\2\u0320\u0323\7\34"+
		"\2\2\u0321\u0323\5*\26\2\u0322\u0320\3\2\2\2\u0322\u0321\3\2\2\2\u0323"+
		"\u0324\3\2\2\2\u0324\u0325\7 \2\2\u0325\u0326\7\67\2\2\u0326\u032c\7!"+
		"\2\2\u0327\u0328\7 \2\2\u0328\u0329\7\67\2\2\u0329\u032b\7!\2\2\u032a"+
		"\u0327\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2"+
		"\2\2\u032dI\3\2\2\2\u032e\u032c\3\2\2\2\u032f\u0336\7\17\2\2\u0330\u0336"+
		"\7\r\2\2\u0331\u0336\5F$\2\u0332\u0336\5B\"\2\u0333\u0336\7\20\2\2\u0334"+
		"\u0336\7\13\2\2\u0335\u032f\3\2\2\2\u0335\u0330\3\2\2\2\u0335\u0331\3"+
		"\2\2\2\u0335\u0332\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0334\3\2\2\2\u0336"+
		"K\3\2\2\2\u0337\u0338\t\4\2\2\u0338M\3\2\2\2\u0339\u033e\5J&\2\u033a\u033b"+
		"\7\6\2\2\u033b\u033e\7\34\2\2\u033c\u033e\5H%\2\u033d\u0339\3\2\2\2\u033d"+
		"\u033a\3\2\2\2\u033d\u033c\3\2\2\2\u033eO\3\2\2\2fSY_ekt\u0084\u008e\u0095"+
		"\u0097\u00a8\u00aa\u00be\u00c0\u00cd\u00d8\u00e2\u00ec\u00f4\u00f6\u00f8"+
		"\u00fe\u010a\u0110\u0112\u0114\u011b\u0121\u012d\u0132\u0136\u0139\u013e"+
		"\u014e\u0150\u0158\u015b\u0168\u017b\u019b\u019d\u01a5\u01af\u01b2\u01b4"+
		"\u01bd\u01c2\u01c8\u01d0\u01e0\u01ef\u01f5\u01f9\u01fc\u01ff\u0203\u020a"+
		"\u020f\u0218\u021d\u0226\u022f\u0239\u0242\u024c\u0252\u0254\u025c\u0262"+
		"\u0264\u026d\u0275\u027e\u0286\u028c\u0294\u0296\u02a0\u02a2\u02a7\u02ac"+
		"\u02b2\u02c5\u02c7\u02cd\u02d3\u02db\u02e0\u02e9\u02ee\u02fa\u02ff\u0304"+
		"\u0308\u0313\u0318\u0322\u032c\u0335\u033d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}