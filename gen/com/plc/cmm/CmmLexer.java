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
		T__0=1, IF=2, ENDIF=3, DISPLAY=4, INT=5, PLUS=6, EQUAL=7, ASSIGN=8, NOTEQUAL=9, 
		BEGIN=10, END=11, SEMICOLON=12, LPAREN=13, RPAREN=14, INTEGER=15, NAME=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "IF", "ENDIF", "DISPLAY", "INT", "PLUS", "EQUAL", "ASSIGN", "NOTEQUAL", 
			"BEGIN", "END", "SEMICOLON", "LPAREN", "RPAREN", "INTEGER", "NAME", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main()'", "'if'", "'endif'", "'display'", "'int'", "'+'", "'=='", 
			"'='", "'!='", "'begin'", "'end'", "';'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "IF", "ENDIF", "DISPLAY", "INT", "PLUS", "EQUAL", "ASSIGN", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23n\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\7\20^\n\20\f\20\16\20a\13\20\3\21\6\21d\n\21"+
		"\r\21\16\21e\3\22\6\22i\n\22\r\22\16\22j\3\22\3\22\2\2\23\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"\3\2\5\3\2\62;\3\2c|\5\2\13\f\17\17\"\"\2p\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5,\3\2\2\2\7"+
		"/\3\2\2\2\t\65\3\2\2\2\13=\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21F\3\2\2\2"+
		"\23H\3\2\2\2\25K\3\2\2\2\27Q\3\2\2\2\31U\3\2\2\2\33W\3\2\2\2\35Y\3\2\2"+
		"\2\37[\3\2\2\2!c\3\2\2\2#h\3\2\2\2%&\7o\2\2&\'\7c\2\2\'(\7k\2\2()\7p\2"+
		"\2)*\7*\2\2*+\7+\2\2+\4\3\2\2\2,-\7k\2\2-.\7h\2\2.\6\3\2\2\2/\60\7g\2"+
		"\2\60\61\7p\2\2\61\62\7f\2\2\62\63\7k\2\2\63\64\7h\2\2\64\b\3\2\2\2\65"+
		"\66\7f\2\2\66\67\7k\2\2\678\7u\2\289\7r\2\29:\7n\2\2:;\7c\2\2;<\7{\2\2"+
		"<\n\3\2\2\2=>\7k\2\2>?\7p\2\2?@\7v\2\2@\f\3\2\2\2AB\7-\2\2B\16\3\2\2\2"+
		"CD\7?\2\2DE\7?\2\2E\20\3\2\2\2FG\7?\2\2G\22\3\2\2\2HI\7#\2\2IJ\7?\2\2"+
		"J\24\3\2\2\2KL\7d\2\2LM\7g\2\2MN\7i\2\2NO\7k\2\2OP\7p\2\2P\26\3\2\2\2"+
		"QR\7g\2\2RS\7p\2\2ST\7f\2\2T\30\3\2\2\2UV\7=\2\2V\32\3\2\2\2WX\7*\2\2"+
		"X\34\3\2\2\2YZ\7+\2\2Z\36\3\2\2\2[_\t\2\2\2\\^\t\2\2\2]\\\3\2\2\2^a\3"+
		"\2\2\2_]\3\2\2\2_`\3\2\2\2` \3\2\2\2a_\3\2\2\2bd\t\3\2\2cb\3\2\2\2de\3"+
		"\2\2\2ec\3\2\2\2ef\3\2\2\2f\"\3\2\2\2gi\t\4\2\2hg\3\2\2\2ij\3\2\2\2jh"+
		"\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\b\22\2\2m$\3\2\2\2\6\2_ej\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}