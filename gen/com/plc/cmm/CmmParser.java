// Generated from /home/mohadeseh/Desktop/UT/Compiler/c--/src/com/plc/cmm/Cmm.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, VAR_DATA_TYPES=2, IF=3, ENDIF=4, MAIN=5, DO=6, RETURN=7, GET=8, 
		SET=9, APPEND=10, SIZE=11, TRUE=12, FALSE=13, FPTR=14, DISPLAY=15, INT=16, 
		STRING=17, STRUCT=18, BOOL=19, LIST=20, VOID=21, WHILE=22, PLUS=23, EQUAL=24, 
		ASSIGN=25, NOTEQUAL=26, BEGIN=27, END=28, SEMICOLON=29, LPAREN=30, RPAREN=31, 
		INTEGER=32, NAME=33, WS=34;
	public static final int
		RULE_program = 0, RULE_func_dec = 1, RULE_struct_dec = 2, RULE_struct_body = 3, 
		RULE_main = 4, RULE_getter_setter = 5, RULE_declaration = 6, RULE_argument = 7, 
		RULE_statement = 8, RULE_ifstmt = 9, RULE_display = 10, RULE_assignstmt = 11, 
		RULE_expression = 12, RULE_term = 13, RULE_identifier = 14, RULE_integer = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "func_dec", "struct_dec", "struct_body", "main", "getter_setter", 
			"declaration", "argument", "statement", "ifstmt", "display", "assignstmt", 
			"expression", "term", "identifier", "integer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, "'if'", "'endif'", "'main()'", "'do'", "'return'", 
			"'get'", "'set'", "'append'", "'size'", "'true'", "'false'", "'fptr'", 
			"'display'", "'int'", "'string'", "'struct'", "'bool'", "'list'", "'void'", 
			"'while'", "'+'", "'=='", "'='", "'!='", "'begin'", "'end'", "';'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "VAR_DATA_TYPES", "IF", "ENDIF", "MAIN", "DO", "RETURN", 
			"GET", "SET", "APPEND", "SIZE", "TRUE", "FALSE", "FPTR", "DISPLAY", "INT", 
			"STRING", "STRUCT", "BOOL", "LIST", "VOID", "WHILE", "PLUS", "EQUAL", 
			"ASSIGN", "NOTEQUAL", "BEGIN", "END", "SEMICOLON", "LPAREN", "RPAREN", 
			"INTEGER", "NAME", "WS"
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

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<Func_decContext> func_dec() {
			return getRuleContexts(Func_decContext.class);
		}
		public Func_decContext func_dec(int i) {
			return getRuleContext(Func_decContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Struct_decContext> struct_dec() {
			return getRuleContexts(Struct_decContext.class);
		}
		public Struct_decContext struct_dec(int i) {
			return getRuleContext(Struct_decContext.class,i);
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
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR_DATA_TYPES) | (1L << STRUCT) | (1L << VOID))) != 0)) {
				{
				setState(35);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(32);
					func_dec();
					}
					break;
				case 2:
					{
					setState(33);
					declaration();
					}
					break;
				case 3:
					{
					setState(34);
					struct_dec();
					}
					break;
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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

	public static class Func_decContext extends ParserRuleContext {
		public Token a;
		public TerminalNode VAR_DATA_TYPES() { return getToken(CmmParser.VAR_DATA_TYPES, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public List<TerminalNode> NAME() { return getTokens(CmmParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(CmmParser.NAME, i);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode RETURN() { return getToken(CmmParser.RETURN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Struct_decContext> struct_dec() {
			return getRuleContexts(Struct_decContext.class);
		}
		public Struct_decContext struct_dec(int i) {
			return getRuleContext(Struct_decContext.class,i);
		}
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public Func_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunc_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunc_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_decContext func_dec() throws RecognitionException {
		Func_decContext _localctx = new Func_decContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func_dec);
		int _la;
		try {
			int _alt;
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_DATA_TYPES:
				enterOuterAlt(_localctx, 1);
				{
				int a;
				setState(43);
				match(VAR_DATA_TYPES);
				setState(44);
				((Func_decContext)_localctx).a = match(NAME);
				setState(45);
				match(LPAREN);
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(46);
						argument();
						setState(47);
						match(T__0);
						}
						} 
					}
					setState(53);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				{
				setState(54);
				argument();
				}
				setState(55);
				match(RPAREN);
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BEGIN:
					{
					setState(56);
					match(BEGIN);
					setState(60);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(57);
							declaration();
							}
							} 
						}
						setState(62);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DISPLAY) | (1L << NAME))) != 0)) {
						{
						{
						setState(63);
						statement();
						}
						}
						setState(68);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==STRUCT) {
						{
						{
						setState(69);
						struct_dec();
						}
						}
						setState(74);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(75);
					match(RETURN);
					setState(76);
					match(NAME);
					setState(77);
					match(END);
					}
					break;
				case RETURN:
					{
					setState(78);
					match(RETURN);
					setState(79);
					match(NAME);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				System.out.println("FunctionDec: "+(((Func_decContext)_localctx).a!=null?((Func_decContext)_localctx).a.getText():null));
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				int a;
				setState(85);
				match(VOID);
				setState(86);
				((Func_decContext)_localctx).a = match(NAME);
				setState(87);
				match(LPAREN);
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(88);
						argument();
						setState(89);
						match(T__0);
						}
						} 
					}
					setState(95);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				{
				setState(96);
				argument();
				}
				setState(97);
				match(RPAREN);
				setState(123);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR_DATA_TYPES:
				case IF:
				case DISPLAY:
				case STRUCT:
				case NAME:
					{
					setState(101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(98);
						declaration();
						}
						break;
					case 2:
						{
						setState(99);
						statement();
						}
						break;
					case 3:
						{
						setState(100);
						struct_dec();
						}
						break;
					}
					}
					break;
				case BEGIN:
					{
					setState(103);
					match(BEGIN);
					setState(107);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(104);
							declaration();
							}
							} 
						}
						setState(109);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DISPLAY) | (1L << NAME))) != 0)) {
						{
						{
						setState(110);
						statement();
						}
						}
						setState(115);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==STRUCT) {
						{
						{
						setState(116);
						struct_dec();
						}
						}
						setState(121);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(122);
					match(END);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				System.out.println("FunctionDec: "+(((Func_decContext)_localctx).a!=null?((Func_decContext)_localctx).a.getText():null));
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

	public static class Struct_decContext extends ParserRuleContext {
		public Token a;
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public TerminalNode NAME() { return getToken(CmmParser.NAME, 0); }
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<Struct_bodyContext> struct_body() {
			return getRuleContexts(Struct_bodyContext.class);
		}
		public Struct_bodyContext struct_body(int i) {
			return getRuleContext(Struct_bodyContext.class,i);
		}
		public Struct_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStruct_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStruct_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStruct_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_decContext struct_dec() throws RecognitionException {
		Struct_decContext _localctx = new Struct_decContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_struct_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a;
			setState(130);
			match(STRUCT);
			setState(131);
			((Struct_decContext)_localctx).a = match(NAME);
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(132);
				match(BEGIN);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VAR_DATA_TYPES || _la==STRUCT) {
					{
					{
					setState(133);
					struct_body();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				match(END);
				}
				break;
			case VAR_DATA_TYPES:
			case STRUCT:
				{
				setState(140);
				struct_body();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			System.out.println("StructDec: "+(((Struct_decContext)_localctx).a!=null?((Struct_decContext)_localctx).a.getText():null));
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

	public static class Struct_bodyContext extends ParserRuleContext {
		public Token a;
		public List<TerminalNode> NAME() { return getTokens(CmmParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(CmmParser.NAME, i);
		}
		public TerminalNode VAR_DATA_TYPES() { return getToken(CmmParser.VAR_DATA_TYPES, 0); }
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public Getter_setterContext getter_setter() {
			return getRuleContext(Getter_setterContext.class,0);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStruct_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStruct_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStruct_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_struct_body);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				int a;
				setState(149);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR_DATA_TYPES:
					{
					setState(146);
					match(VAR_DATA_TYPES);
					}
					break;
				case STRUCT:
					{
					{
					setState(147);
					match(STRUCT);
					setState(148);
					match(NAME);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(151);
				((Struct_bodyContext)_localctx).a = match(NAME);
				System.out.println("VarDec: "+(((Struct_bodyContext)_localctx).a!=null?((Struct_bodyContext)_localctx).a.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(156);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR_DATA_TYPES:
					{
					setState(153);
					match(VAR_DATA_TYPES);
					}
					break;
				case STRUCT:
					{
					{
					setState(154);
					match(STRUCT);
					setState(155);
					match(NAME);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(158);
				((Struct_bodyContext)_localctx).a = match(NAME);
				System.out.println("VarDec: "+(((Struct_bodyContext)_localctx).a!=null?((Struct_bodyContext)_localctx).a.getText():null));
				setState(160);
				match(LPAREN);
				setState(161);
				argument();
				setState(162);
				match(RPAREN);
				setState(163);
				getter_setter();
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(CmmParser.MAIN, 0); }
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 8, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(MAIN);
			setState(168);
			match(BEGIN);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR_DATA_TYPES || _la==STRUCT) {
				{
				{
				setState(169);
				declaration();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DISPLAY) | (1L << NAME))) != 0)) {
				{
				{
				setState(175);
				statement();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
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
		public List<TerminalNode> BEGIN() { return getTokens(CmmParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(CmmParser.BEGIN, i);
		}
		public TerminalNode SET() { return getToken(CmmParser.SET, 0); }
		public List<TerminalNode> END() { return getTokens(CmmParser.END); }
		public TerminalNode END(int i) {
			return getToken(CmmParser.END, i);
		}
		public TerminalNode GET() { return getToken(CmmParser.GET, 0); }
		public TerminalNode RETURN() { return getToken(CmmParser.RETURN, 0); }
		public TerminalNode NAME() { return getToken(CmmParser.NAME, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(BEGIN);
			setState(184);
			match(SET);
			System.out.println("Setter");
			setState(186);
			match(BEGIN);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR_DATA_TYPES) | (1L << IF) | (1L << DISPLAY) | (1L << STRUCT) | (1L << NAME))) != 0)) {
				{
				setState(189);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR_DATA_TYPES:
				case STRUCT:
					{
					setState(187);
					declaration();
					}
					break;
				case IF:
				case DISPLAY:
				case NAME:
					{
					setState(188);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(END);
			setState(195);
			match(GET);
			System.out.println("Getter");
			setState(197);
			match(RETURN);
			setState(198);
			match(NAME);
			setState(199);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Token a;
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public List<TerminalNode> NAME() { return getTokens(CmmParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(CmmParser.NAME, i);
		}
		public TerminalNode VAR_DATA_TYPES() { return getToken(CmmParser.VAR_DATA_TYPES, 0); }
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
		enterRule(_localctx, 12, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a;
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_DATA_TYPES:
				{
				setState(202);
				match(VAR_DATA_TYPES);
				}
				break;
			case STRUCT:
				{
				{
				setState(203);
				match(STRUCT);
				setState(204);
				match(NAME);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(207);
			((DeclarationContext)_localctx).a = match(NAME);
			setState(208);
			match(SEMICOLON);
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
		public List<TerminalNode> NAME() { return getTokens(CmmParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(CmmParser.NAME, i);
		}
		public TerminalNode VAR_DATA_TYPES() { return getToken(CmmParser.VAR_DATA_TYPES, 0); }
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
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
		enterRule(_localctx, 14, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a;
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_DATA_TYPES:
				{
				setState(212);
				match(VAR_DATA_TYPES);
				}
				break;
			case STRUCT:
				{
				{
				setState(213);
				match(STRUCT);
				setState(214);
				match(NAME);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(217);
			((ArgumentContext)_localctx).a = match(NAME);
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

	public static class StatementContext extends ParserRuleContext {
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public DisplayContext display() {
			return getRuleContext(DisplayContext.class,0);
		}
		public AssignstmtContext assignstmt() {
			return getRuleContext(AssignstmtContext.class,0);
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
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				ifstmt();
				}
				break;
			case DISPLAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				display();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				assignstmt();
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

	public static class IfstmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(CmmParser.EQUAL, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public TerminalNode ENDIF() { return getToken(CmmParser.ENDIF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(IF);
			setState(226);
			match(LPAREN);
			setState(227);
			identifier();
			setState(228);
			match(EQUAL);
			setState(229);
			integer();
			setState(230);
			match(RPAREN);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << DISPLAY) | (1L << NAME))) != 0)) {
				{
				{
				setState(231);
				statement();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(ENDIF);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 20, RULE_display);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(DISPLAY);
			setState(240);
			match(LPAREN);
			setState(241);
			term();
			setState(242);
			match(RPAREN);
			setState(243);
			match(SEMICOLON);
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

	public static class AssignstmtContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CmmParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public AssignstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAssignstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAssignstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAssignstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignstmtContext assignstmt() throws RecognitionException {
		AssignstmtContext _localctx = new AssignstmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(NAME);
			setState(246);
			match(ASSIGN);
			setState(247);
			expression();
			setState(248);
			match(SEMICOLON);
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
		public TerminalNode PLUS() { return getToken(CmmParser.PLUS, 0); }
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
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				term();
				setState(252);
				match(PLUS);
				setState(253);
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
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				identifier();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				integer();
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
		public TerminalNode NAME() { return getToken(CmmParser.NAME, 0); }
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
		enterRule(_localctx, 28, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(NAME);
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
		enterRule(_localctx, 30, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u010c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\64"+
		"\n\3\f\3\16\3\67\13\3\3\3\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\3\7\3"+
		"C\n\3\f\3\16\3F\13\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3S\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3^\n\3\f\3\16\3a\13\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3h\n\3\3\3\3\3\7\3l\n\3\f\3\16\3o\13\3\3\3\7\3r\n"+
		"\3\f\3\16\3u\13\3\3\3\7\3x\n\3\f\3\16\3{\13\3\3\3\5\3~\n\3\3\3\3\3\5\3"+
		"\u0082\n\3\3\4\3\4\3\4\3\4\3\4\7\4\u0089\n\4\f\4\16\4\u008c\13\4\3\4\3"+
		"\4\5\4\u0090\n\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0098\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u009f\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a8\n\5\3\6\3\6\3"+
		"\6\7\6\u00ad\n\6\f\6\16\6\u00b0\13\6\3\6\7\6\u00b3\n\6\f\6\16\6\u00b6"+
		"\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00c0\n\7\f\7\16\7\u00c3\13"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u00d0\n\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\5\t\u00da\n\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u00e2"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00eb\n\13\f\13\16\13\u00ee"+
		"\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0102\n\16\3\17\3\17\5\17\u0106\n\17\3\20\3\20\3"+
		"\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\2\u011b"+
		"\2\'\3\2\2\2\4\u0081\3\2\2\2\6\u0083\3\2\2\2\b\u00a7\3\2\2\2\n\u00a9\3"+
		"\2\2\2\f\u00b9\3\2\2\2\16\u00cb\3\2\2\2\20\u00d5\3\2\2\2\22\u00e1\3\2"+
		"\2\2\24\u00e3\3\2\2\2\26\u00f1\3\2\2\2\30\u00f7\3\2\2\2\32\u0101\3\2\2"+
		"\2\34\u0105\3\2\2\2\36\u0107\3\2\2\2 \u0109\3\2\2\2\"&\5\4\3\2#&\5\16"+
		"\b\2$&\5\6\4\2%\"\3\2\2\2%#\3\2\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'("+
		"\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\5\n\6\2+\3\3\2\2\2,-\b\3\1\2-.\7\4\2\2"+
		"./\7#\2\2/\65\7 \2\2\60\61\5\20\t\2\61\62\7\3\2\2\62\64\3\2\2\2\63\60"+
		"\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3"+
		"\2\2\289\5\20\t\29R\7!\2\2:>\7\35\2\2;=\5\16\b\2<;\3\2\2\2=@\3\2\2\2>"+
		"<\3\2\2\2>?\3\2\2\2?D\3\2\2\2@>\3\2\2\2AC\5\22\n\2BA\3\2\2\2CF\3\2\2\2"+
		"DB\3\2\2\2DE\3\2\2\2EJ\3\2\2\2FD\3\2\2\2GI\5\6\4\2HG\3\2\2\2IL\3\2\2\2"+
		"JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\t\2\2NO\7#\2\2OS\7\36\2\2"+
		"PQ\7\t\2\2QS\7#\2\2R:\3\2\2\2RP\3\2\2\2ST\3\2\2\2TU\b\3\1\2U\u0082\3\2"+
		"\2\2VW\b\3\1\2WX\7\27\2\2XY\7#\2\2Y_\7 \2\2Z[\5\20\t\2[\\\7\3\2\2\\^\3"+
		"\2\2\2]Z\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\5"+
		"\20\t\2c}\7!\2\2dh\5\16\b\2eh\5\22\n\2fh\5\6\4\2gd\3\2\2\2ge\3\2\2\2g"+
		"f\3\2\2\2h~\3\2\2\2im\7\35\2\2jl\5\16\b\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2"+
		"\2mn\3\2\2\2ns\3\2\2\2om\3\2\2\2pr\5\22\n\2qp\3\2\2\2ru\3\2\2\2sq\3\2"+
		"\2\2st\3\2\2\2ty\3\2\2\2us\3\2\2\2vx\5\6\4\2wv\3\2\2\2x{\3\2\2\2yw\3\2"+
		"\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|~\7\36\2\2}g\3\2\2\2}i\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\b\3\1\2\u0080\u0082\3\2\2\2\u0081,\3\2\2\2\u0081V\3"+
		"\2\2\2\u0082\5\3\2\2\2\u0083\u0084\b\4\1\2\u0084\u0085\7\24\2\2\u0085"+
		"\u008f\7#\2\2\u0086\u008a\7\35\2\2\u0087\u0089\5\b\5\2\u0088\u0087\3\2"+
		"\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0090\7\36\2\2\u008e\u0090\5"+
		"\b\5\2\u008f\u0086\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\b\4\1\2\u0092\7\3\2\2\2\u0093\u0097\b\5\1\2\u0094\u0098\7\4\2\2"+
		"\u0095\u0096\7\24\2\2\u0096\u0098\7#\2\2\u0097\u0094\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7#\2\2\u009a\u00a8\b\5\1\2\u009b"+
		"\u009f\7\4\2\2\u009c\u009d\7\24\2\2\u009d\u009f\7#\2\2\u009e\u009b\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7#\2\2\u00a1"+
		"\u00a2\b\5\1\2\u00a2\u00a3\7 \2\2\u00a3\u00a4\5\20\t\2\u00a4\u00a5\7!"+
		"\2\2\u00a5\u00a6\5\f\7\2\u00a6\u00a8\3\2\2\2\u00a7\u0093\3\2\2\2\u00a7"+
		"\u009e\3\2\2\2\u00a8\t\3\2\2\2\u00a9\u00aa\7\7\2\2\u00aa\u00ae\7\35\2"+
		"\2\u00ab\u00ad\5\16\b\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b4\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u00b3\5\22\n\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00b8\7\36\2\2\u00b8\13\3\2\2\2\u00b9\u00ba\7\35\2\2\u00ba"+
		"\u00bb\7\13\2\2\u00bb\u00bc\b\7\1\2\u00bc\u00c1\7\35\2\2\u00bd\u00c0\5"+
		"\16\b\2\u00be\u00c0\5\22\n\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\36\2\2\u00c5\u00c6\7\n\2\2\u00c6"+
		"\u00c7\b\7\1\2\u00c7\u00c8\7\t\2\2\u00c8\u00c9\7#\2\2\u00c9\u00ca\7\36"+
		"\2\2\u00ca\r\3\2\2\2\u00cb\u00cf\b\b\1\2\u00cc\u00d0\7\4\2\2\u00cd\u00ce"+
		"\7\24\2\2\u00ce\u00d0\7#\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\7#\2\2\u00d2\u00d3\7\37\2\2\u00d3\u00d4\b\b"+
		"\1\2\u00d4\17\3\2\2\2\u00d5\u00d9\b\t\1\2\u00d6\u00da\7\4\2\2\u00d7\u00d8"+
		"\7\24\2\2\u00d8\u00da\7#\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\7#\2\2\u00dc\u00dd\b\t\1\2\u00dd\21\3\2\2\2"+
		"\u00de\u00e2\5\24\13\2\u00df\u00e2\5\26\f\2\u00e0\u00e2\5\30\r\2\u00e1"+
		"\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\23\3\2\2"+
		"\2\u00e3\u00e4\7\5\2\2\u00e4\u00e5\7 \2\2\u00e5\u00e6\5\36\20\2\u00e6"+
		"\u00e7\7\32\2\2\u00e7\u00e8\5 \21\2\u00e8\u00ec\7!\2\2\u00e9\u00eb\5\22"+
		"\n\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7\6"+
		"\2\2\u00f0\25\3\2\2\2\u00f1\u00f2\7\21\2\2\u00f2\u00f3\7 \2\2\u00f3\u00f4"+
		"\5\34\17\2\u00f4\u00f5\7!\2\2\u00f5\u00f6\7\37\2\2\u00f6\27\3\2\2\2\u00f7"+
		"\u00f8\7#\2\2\u00f8\u00f9\7\33\2\2\u00f9\u00fa\5\32\16\2\u00fa\u00fb\7"+
		"\37\2\2\u00fb\31\3\2\2\2\u00fc\u0102\5\34\17\2\u00fd\u00fe\5\34\17\2\u00fe"+
		"\u00ff\7\31\2\2\u00ff\u0100\5\34\17\2\u0100\u0102\3\2\2\2\u0101\u00fc"+
		"\3\2\2\2\u0101\u00fd\3\2\2\2\u0102\33\3\2\2\2\u0103\u0106\5\36\20\2\u0104"+
		"\u0106\5 \21\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\35\3\2\2"+
		"\2\u0107\u0108\7#\2\2\u0108\37\3\2\2\2\u0109\u010a\7\"\2\2\u010a!\3\2"+
		"\2\2\37%\'\65>DJR_gmsy}\u0081\u008a\u008f\u0097\u009e\u00a7\u00ae\u00b4"+
		"\u00bf\u00c1\u00cf\u00d9\u00e1\u00ec\u0101\u0105";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}