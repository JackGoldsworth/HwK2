package me.jackgoldsworth.hwk2.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HwKLexer extends Lexer {
	static {
		RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, WS = 7, NUMBER = 8, ID = 9,
			STRING = 10;
	public static String[] channelNames = {
			"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
			"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[]{
				"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "WS", "NUMBER", "ID",
				"STRING", "DIGIT", "HEX", "LETTER"
		};
	}

	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[]{
				null, "'@imp'", "'.'", "'print('", "')'", "'var'", "'='"
		};
	}

	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeSymbolicNames() {
		return new String[]{
				null, null, null, null, null, null, null, "WS", "NUMBER", "ID", "STRING"
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


	public HwKLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "HwK.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public String[] getChannelNames() {
		return channelNames;
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f_\b\1\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
					"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4" +
					"\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\6\b\65\n\b\r\b\16" +
					"\b\66\3\b\3\b\3\t\3\t\6\t=\n\t\r\t\16\t>\3\n\3\n\3\n\7\nD\n\n\f\n\16\n" +
					"G\13\n\3\13\3\13\3\13\7\13L\n\13\f\13\16\13O\13\13\3\13\3\13\3\f\6\fT" +
					"\n\f\r\f\16\fU\3\r\3\r\3\r\3\r\5\r\\\n\r\3\16\3\16\2\2\17\3\3\5\4\7\5" +
					"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\2\31\2\33\2\3\2\6\5\2\13\f\17\17" +
					"\"\"\3\2\62;\5\2\62;C\\c|\4\2C\\c|\2c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2" +
					"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2" +
					"\23\3\2\2\2\2\25\3\2\2\2\3\35\3\2\2\2\5\"\3\2\2\2\7$\3\2\2\2\t+\3\2\2" +
					"\2\13-\3\2\2\2\r\61\3\2\2\2\17\64\3\2\2\2\21<\3\2\2\2\23@\3\2\2\2\25H" +
					"\3\2\2\2\27S\3\2\2\2\31W\3\2\2\2\33]\3\2\2\2\35\36\7B\2\2\36\37\7k\2\2" +
					"\37 \7o\2\2 !\7r\2\2!\4\3\2\2\2\"#\7\60\2\2#\6\3\2\2\2$%\7r\2\2%&\7t\2" +
					"\2&\'\7k\2\2\'(\7p\2\2()\7v\2\2)*\7*\2\2*\b\3\2\2\2+,\7+\2\2,\n\3\2\2" +
					"\2-.\7x\2\2./\7c\2\2/\60\7t\2\2\60\f\3\2\2\2\61\62\7?\2\2\62\16\3\2\2" +
					"\2\63\65\t\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2" +
					"\2\678\3\2\2\289\b\b\2\29\20\3\2\2\2:=\5\27\f\2;=\5\31\r\2<:\3\2\2\2<" +
					";\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\22\3\2\2\2@E\5\33\16\2AD\5\33" +
					"\16\2BD\5\27\f\2CA\3\2\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\24" +
					"\3\2\2\2GE\3\2\2\2HM\7$\2\2IL\5\33\16\2JL\5\27\f\2KI\3\2\2\2KJ\3\2\2\2" +
					"LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7$\2\2Q\26\3\2\2" +
					"\2RT\t\3\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\30\3\2\2\2WX\7\62" +
					"\2\2XY\7z\2\2Y[\3\2\2\2Z\\\t\4\2\2[Z\3\2\2\2\\\32\3\2\2\2]^\t\5\2\2^\34" +
					"\3\2\2\2\f\2\66<>CEKMU[\3\b\2\2";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}