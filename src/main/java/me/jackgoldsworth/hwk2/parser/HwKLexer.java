// Generated from HwK.g4 by ANTLR 4.7.2
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
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, WS = 12, NUMBER = 13, ID = 14, STRING = 15;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
                "T__9", "T__10", "WS", "NUMBER", "ID", "STRING", "DIGIT", "HEX", "LETTER"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'@imp'", "'.'", "'print('", "')'", "'var'", "'='", "'^'", "'*'",
                "'/'", "'-'", "'+'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                "WS", "NUMBER", "ID", "STRING"
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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21r\b\1\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5" +
                    "\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f" +
                    "\3\r\6\rI\n\r\r\r\16\rJ\3\r\3\r\3\16\3\16\6\16Q\n\16\r\16\16\16R\3\17" +
                    "\3\17\3\17\7\17X\n\17\f\17\16\17[\13\17\3\20\3\20\7\20_\n\20\f\20\16\20" +
                    "b\13\20\3\20\3\20\3\21\6\21g\n\21\r\21\16\21h\3\22\3\22\3\22\3\22\5\22" +
                    "o\n\22\3\23\3\23\3`\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f" +
                    "\27\r\31\16\33\17\35\20\37\21!\2#\2%\2\3\2\6\5\2\13\f\17\17\"\"\3\2\62" +
                    ";\5\2\62;C\\c|\4\2C\\c|\2u\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2" +
                    "\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2" +
                    "\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3" +
                    "\2\2\2\3\'\3\2\2\2\5,\3\2\2\2\7.\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r" +
                    ";\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25C\3\2\2\2\27E\3\2\2\2" +
                    "\31H\3\2\2\2\33P\3\2\2\2\35T\3\2\2\2\37\\\3\2\2\2!f\3\2\2\2#j\3\2\2\2" +
                    "%p\3\2\2\2\'(\7B\2\2()\7k\2\2)*\7o\2\2*+\7r\2\2+\4\3\2\2\2,-\7\60\2\2" +
                    "-\6\3\2\2\2./\7r\2\2/\60\7t\2\2\60\61\7k\2\2\61\62\7p\2\2\62\63\7v\2\2" +
                    "\63\64\7*\2\2\64\b\3\2\2\2\65\66\7+\2\2\66\n\3\2\2\2\678\7x\2\289\7c\2" +
                    "\29:\7t\2\2:\f\3\2\2\2;<\7?\2\2<\16\3\2\2\2=>\7`\2\2>\20\3\2\2\2?@\7," +
                    "\2\2@\22\3\2\2\2AB\7\61\2\2B\24\3\2\2\2CD\7/\2\2D\26\3\2\2\2EF\7-\2\2" +
                    "F\30\3\2\2\2GI\t\2\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2" +
                    "\2LM\b\r\2\2M\32\3\2\2\2NQ\5!\21\2OQ\5#\22\2PN\3\2\2\2PO\3\2\2\2QR\3\2" +
                    "\2\2RP\3\2\2\2RS\3\2\2\2S\34\3\2\2\2TY\5%\23\2UX\5%\23\2VX\5!\21\2WU\3" +
                    "\2\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\36\3\2\2\2[Y\3\2\2\2\\" +
                    "`\7$\2\2]_\13\2\2\2^]\3\2\2\2_b\3\2\2\2`a\3\2\2\2`^\3\2\2\2ac\3\2\2\2" +
                    "b`\3\2\2\2cd\7$\2\2d \3\2\2\2eg\t\3\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2" +
                    "hi\3\2\2\2i\"\3\2\2\2jk\7\62\2\2kl\7z\2\2ln\3\2\2\2mo\t\4\2\2nm\3\2\2" +
                    "\2o$\3\2\2\2pq\t\5\2\2q&\3\2\2\2\13\2JPRWY`hn\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}