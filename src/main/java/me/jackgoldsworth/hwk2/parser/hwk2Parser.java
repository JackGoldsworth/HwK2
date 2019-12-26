package me.jackgoldsworth.hwk2.parser;
// Generated from hwk2.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class hwk2Parser extends Parser {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, WHITESPACE = 5, NUMBER = 6, ID = 7, STRING = 8;
    public static final int
            RULE_imports = 0, RULE_type = 1, RULE_statement = 2, RULE_variable = 3;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n \4\2\t\2\4\3\t" +
                    "\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\3\3\3" +
                    "\3\4\3\4\3\5\3\5\3\5\3\5\6\5\34\n\5\r\5\16\5\35\3\5\2\2\6\2\4\6\b\2\3" +
                    "\4\2\b\b\n\n\2\35\2\n\3\2\2\2\4\23\3\2\2\2\6\25\3\2\2\2\b\27\3\2\2\2\n" +
                    "\13\7\3\2\2\13\20\7\t\2\2\f\r\7\4\2\2\r\17\7\t\2\2\16\f\3\2\2\2\17\22" +
                    "\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\3\3\2\2\2\22\20\3\2\2\2\23\24" +
                    "\7\t\2\2\24\5\3\2\2\2\25\26\5\b\5\2\26\7\3\2\2\2\27\30\7\5\2\2\30\31\7" +
                    "\t\2\2\31\33\7\6\2\2\32\34\t\2\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3" +
                    "\2\2\2\35\36\3\2\2\2\36\t\3\2\2\2\4\20\35";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    static {
        RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public hwk2Parser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "imports", "type", "statement", "variable"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'@imp'", "'.'", "'var'", "'='", "' '"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, "WHITESPACE", "NUMBER", "ID", "STRING"
        };
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
    public String getGrammarFileName() {
        return "hwk2.g4";
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
    public ATN getATN() {
        return _ATN;
    }

    public final ImportsContext imports() throws RecognitionException {
        ImportsContext _localctx = new ImportsContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_imports);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(8);
                match(T__0);
                setState(9);
                match(ID);
                setState(14);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__1) {
                    {
                        {
                            setState(10);
                            match(T__1);
                            setState(11);
                            match(ID);
                        }
                    }
                    setState(16);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeContext type() throws RecognitionException {
        TypeContext _localctx = new TypeContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_type);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(17);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(19);
                variable();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VariableContext variable() throws RecognitionException {
        VariableContext _localctx = new VariableContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_variable);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(21);
                match(T__2);
                setState(22);
                match(ID);
                setState(23);
                match(T__3);
                setState(25);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(24);
                            _la = _input.LA(1);
                            if (!(_la == NUMBER || _la == STRING)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                        }
                    }
                    setState(27);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == NUMBER || _la == STRING);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ImportsContext extends ParserRuleContext {
        public ImportsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> ID() {
            return getTokens(hwk2Parser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(hwk2Parser.ID, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_imports;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof hwk2Listener) ((hwk2Listener) listener).enterImports(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof hwk2Listener) ((hwk2Listener) listener).exitImports(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof hwk2Visitor) return ((hwk2Visitor<? extends T>) visitor).visitImports(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TypeContext extends ParserRuleContext {
        public TypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(hwk2Parser.ID, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof hwk2Listener) ((hwk2Listener) listener).enterType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof hwk2Listener) ((hwk2Listener) listener).exitType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof hwk2Visitor) return ((hwk2Visitor<? extends T>) visitor).visitType(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StatementContext extends ParserRuleContext {
        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public VariableContext variable() {
            return getRuleContext(VariableContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof hwk2Listener) ((hwk2Listener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof hwk2Listener) ((hwk2Listener) listener).exitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof hwk2Visitor) return ((hwk2Visitor<? extends T>) visitor).visitStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VariableContext extends ParserRuleContext {
        public VariableContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(hwk2Parser.ID, 0);
        }

        public List<TerminalNode> NUMBER() {
            return getTokens(hwk2Parser.NUMBER);
        }

        public TerminalNode NUMBER(int i) {
            return getToken(hwk2Parser.NUMBER, i);
        }

        public List<TerminalNode> STRING() {
            return getTokens(hwk2Parser.STRING);
        }

        public TerminalNode STRING(int i) {
            return getToken(hwk2Parser.STRING, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variable;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof hwk2Listener) ((hwk2Listener) listener).enterVariable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof hwk2Listener) ((hwk2Listener) listener).exitVariable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof hwk2Visitor) return ((hwk2Visitor<? extends T>) visitor).visitVariable(this);
            else return visitor.visitChildren(this);
        }
    }
}