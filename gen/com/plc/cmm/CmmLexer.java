// Generated from /home/mohadeseh/Desktop/UT/Compiler/c--/src/com/plc/cmm/Cmm.g4 by ANTLR 4.9.2
package com.plc.cmm;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR_DATA_TYPES=1, IF=2, ENDIF=3, MAIN=4, DO=5, RETURN=6, GET=7, SET=8, 
		APPEND=9, SIZE=10, TRUE=11, FALSE=12, FPTR=13, DISPLAY=14, INT=15, STRING=16, 
		STRUCT=17, BOOL=18, LIST=19, VOID=20, WHILE=21, PLUS=22, EQUAL=23, ASSIGN=24, 
		NOTEQUAL=25, BEGIN=26, END=27, SEMICOLON=28, LPAREN=29, RPAREN=30, INTEGER=31, 
		NAME=32, WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VAR_DATA_TYPES", "IF", "ENDIF", "MAIN", "DO", "RETURN", "GET", "SET", 
			"APPEND", "SIZE", "TRUE", "FALSE", "FPTR", "DISPLAY", "INT", "STRING", 
			"STRUCT", "BOOL", "LIST", "VOID", "WHILE", "PLUS", "EQUAL", "ASSIGN", 
			"NOTEQUAL", "BEGIN", "END", "SEMICOLON", "LPAREN", "RPAREN", "INTEGER", 
			"NAME", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'if'", "'endif'", "'main()'", "'do'", "'return'", "'get'", 
			"'set'", "'append'", "'size'", "'true'", "'false'", "'fptr'", "'display'", 
			"'int'", "'string'", "'struct'", "'bool'", "'list'", "'void'", "'while'", 
			"'+'", "'=='", "'='", "'!='", "'begin'", "'end'", "';'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VAR_DATA_TYPES", "IF", "ENDIF", "MAIN", "DO", "RETURN", "GET", 
			"SET", "APPEND", "SIZE", "TRUE", "FALSE", "FPTR", "DISPLAY", "INT", "STRING", 
			"STRUCT", "BOOL", "LIST", "VOID", "WHILE", "PLUS", "EQUAL", "ASSIGN", 
			"NOTEQUAL", "BEGIN", "END", "SEMICOLON", "LPAREN", "RPAREN", "INTEGER", 
			"NAME", "WS"
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00e6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\5\2K\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \7 \u00d6\n \f \16 \u00d9\13"+
		" \3!\6!\u00dc\n!\r!\16!\u00dd\3\"\6\"\u00e1\n\"\r\"\16\"\u00e2\3\"\3\""+
		"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#\3\2\5\3\2\62;\3\2c|\5\2\13\f\17\17\"\"\2\u00ec\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3J\3\2\2\2\5L\3\2\2\2\7O\3\2\2"+
		"\2\tU\3\2\2\2\13\\\3\2\2\2\r_\3\2\2\2\17f\3\2\2\2\21j\3\2\2\2\23n\3\2"+
		"\2\2\25u\3\2\2\2\27z\3\2\2\2\31\177\3\2\2\2\33\u0085\3\2\2\2\35\u008a"+
		"\3\2\2\2\37\u0092\3\2\2\2!\u0096\3\2\2\2#\u009d\3\2\2\2%\u00a4\3\2\2\2"+
		"\'\u00a9\3\2\2\2)\u00ae\3\2\2\2+\u00b3\3\2\2\2-\u00b9\3\2\2\2/\u00bb\3"+
		"\2\2\2\61\u00be\3\2\2\2\63\u00c0\3\2\2\2\65\u00c3\3\2\2\2\67\u00c9\3\2"+
		"\2\29\u00cd\3\2\2\2;\u00cf\3\2\2\2=\u00d1\3\2\2\2?\u00d3\3\2\2\2A\u00db"+
		"\3\2\2\2C\u00e0\3\2\2\2EK\5\37\20\2FK\5!\21\2GK\5#\22\2HK\5\'\24\2IK\5"+
		"%\23\2JE\3\2\2\2JF\3\2\2\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\4\3\2\2\2LM"+
		"\7k\2\2MN\7h\2\2N\6\3\2\2\2OP\7g\2\2PQ\7p\2\2QR\7f\2\2RS\7k\2\2ST\7h\2"+
		"\2T\b\3\2\2\2UV\7o\2\2VW\7c\2\2WX\7k\2\2XY\7p\2\2YZ\7*\2\2Z[\7+\2\2[\n"+
		"\3\2\2\2\\]\7f\2\2]^\7q\2\2^\f\3\2\2\2_`\7t\2\2`a\7g\2\2ab\7v\2\2bc\7"+
		"w\2\2cd\7t\2\2de\7p\2\2e\16\3\2\2\2fg\7i\2\2gh\7g\2\2hi\7v\2\2i\20\3\2"+
		"\2\2jk\7u\2\2kl\7g\2\2lm\7v\2\2m\22\3\2\2\2no\7c\2\2op\7r\2\2pq\7r\2\2"+
		"qr\7g\2\2rs\7p\2\2st\7f\2\2t\24\3\2\2\2uv\7u\2\2vw\7k\2\2wx\7|\2\2xy\7"+
		"g\2\2y\26\3\2\2\2z{\7v\2\2{|\7t\2\2|}\7w\2\2}~\7g\2\2~\30\3\2\2\2\177"+
		"\u0080\7h\2\2\u0080\u0081\7c\2\2\u0081\u0082\7n\2\2\u0082\u0083\7u\2\2"+
		"\u0083\u0084\7g\2\2\u0084\32\3\2\2\2\u0085\u0086\7h\2\2\u0086\u0087\7"+
		"r\2\2\u0087\u0088\7v\2\2\u0088\u0089\7t\2\2\u0089\34\3\2\2\2\u008a\u008b"+
		"\7f\2\2\u008b\u008c\7k\2\2\u008c\u008d\7u\2\2\u008d\u008e\7r\2\2\u008e"+
		"\u008f\7n\2\2\u008f\u0090\7c\2\2\u0090\u0091\7{\2\2\u0091\36\3\2\2\2\u0092"+
		"\u0093\7k\2\2\u0093\u0094\7p\2\2\u0094\u0095\7v\2\2\u0095 \3\2\2\2\u0096"+
		"\u0097\7u\2\2\u0097\u0098\7v\2\2\u0098\u0099\7t\2\2\u0099\u009a\7k\2\2"+
		"\u009a\u009b\7p\2\2\u009b\u009c\7i\2\2\u009c\"\3\2\2\2\u009d\u009e\7u"+
		"\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2"+
		"\7e\2\2\u00a2\u00a3\7v\2\2\u00a3$\3\2\2\2\u00a4\u00a5\7d\2\2\u00a5\u00a6"+
		"\7q\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7n\2\2\u00a8&\3\2\2\2\u00a9\u00aa"+
		"\7n\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7v\2\2\u00ad"+
		"(\3\2\2\2\u00ae\u00af\7x\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7k\2\2\u00b1"+
		"\u00b2\7f\2\2\u00b2*\3\2\2\2\u00b3\u00b4\7y\2\2\u00b4\u00b5\7j\2\2\u00b5"+
		"\u00b6\7k\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7g\2\2\u00b8,\3\2\2\2\u00b9"+
		"\u00ba\7-\2\2\u00ba.\3\2\2\2\u00bb\u00bc\7?\2\2\u00bc\u00bd\7?\2\2\u00bd"+
		"\60\3\2\2\2\u00be\u00bf\7?\2\2\u00bf\62\3\2\2\2\u00c0\u00c1\7#\2\2\u00c1"+
		"\u00c2\7?\2\2\u00c2\64\3\2\2\2\u00c3\u00c4\7d\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		"\u00c6\7i\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\66\3\2\2\2\u00c9"+
		"\u00ca\7g\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7f\2\2\u00cc8\3\2\2\2\u00cd"+
		"\u00ce\7=\2\2\u00ce:\3\2\2\2\u00cf\u00d0\7*\2\2\u00d0<\3\2\2\2\u00d1\u00d2"+
		"\7+\2\2\u00d2>\3\2\2\2\u00d3\u00d7\t\2\2\2\u00d4\u00d6\t\2\2\2\u00d5\u00d4"+
		"\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"@\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dc\t\3\2\2\u00db\u00da\3\2\2\2"+
		"\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00deB\3"+
		"\2\2\2\u00df\u00e1\t\4\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\b\""+
		"\2\2\u00e5D\3\2\2\2\7\2J\u00d7\u00dd\u00e2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}