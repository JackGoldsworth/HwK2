package me.jackgoldsworth.hwk2.parser;

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
public class HwKParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, WS = 7, NUMBER = 8, ID = 9,
            STRING = 10;
    public static final int
            RULE_compilationUnit = 0, RULE_imports = 1, RULE_type = 2, RULE_print = 3,
            RULE_statement = 4, RULE_variable = 5, RULE_value = 6;

    private static String[] makeRuleNames() {
        return new String[]{
                "compilationUnit", "imports", "type", "print", "statement", "variable",
                "value"
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
    public ATN getATN() {
        return _ATN;
    }

    public HwKParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class CompilationUnitContext extends ParserRuleContext {
        public TerminalNode EOF() {
            return getToken(HwKParser.EOF, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_compilationUnit;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterCompilationUnit(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitCompilationUnit(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitCompilationUnit(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CompilationUnitContext compilationUnit() throws RecognitionException {
        CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_compilationUnit);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(17);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__0 || _la == T__4) {
                    {
                        {
                            setState(14);
                            statement();
                        }
                    }
                    setState(19);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(20);
                match(EOF);
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
        public List<TerminalNode> ID() {
            return getTokens(HwKParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(HwKParser.ID, i);
        }

        public ImportsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_imports;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterImports(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitImports(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitImports(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ImportsContext imports() throws RecognitionException {
        ImportsContext _localctx = new ImportsContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_imports);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(22);
                match(T__0);
                setState(23);
                match(ID);
                setState(28);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__1) {
                    {
                        {
                            setState(24);
                            match(T__1);
                            setState(25);
                            match(ID);
                        }
                    }
                    setState(30);
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

    public static class TypeContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(HwKParser.ID, 0);
        }

        public TypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TypeContext type() throws RecognitionException {
        TypeContext _localctx = new TypeContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_type);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(31);
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

    public static class PrintContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(HwKParser.ID, 0);
        }

        public PrintContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_print;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterPrint(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitPrint(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitPrint(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PrintContext print() throws RecognitionException {
        PrintContext _localctx = new PrintContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_print);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(33);
                match(T__2);
                setState(34);
                match(ID);
                setState(35);
                match(T__3);
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

    public static class StatementContext extends ParserRuleContext {
        public VariableContext variable() {
            return getRuleContext(VariableContext.class, 0);
        }

        public ImportsContext imports() {
            return getRuleContext(ImportsContext.class, 0);
        }

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_statement);
        try {
            setState(39);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__4:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(37);
                    variable();
                }
                break;
                case T__0:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(38);
                    imports();
                }
                break;
                default:
                    throw new NoViableAltException(this);
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

    public static class VariableContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(HwKParser.ID, 0);
        }

        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public VariableContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variable;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterVariable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitVariable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitVariable(this);
            else return visitor.visitChildren(this);
        }
    }

    public final VariableContext variable() throws RecognitionException {
        VariableContext _localctx = new VariableContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_variable);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(41);
                match(T__4);
                setState(42);
                match(ID);
                setState(43);
                match(T__5);
                setState(44);
                value();
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

    public static class ValueContext extends ParserRuleContext {
        public List<TerminalNode> NUMBER() {
            return getTokens(HwKParser.NUMBER);
        }

        public TerminalNode NUMBER(int i) {
            return getToken(HwKParser.NUMBER, i);
        }

        public List<TerminalNode> STRING() {
            return getTokens(HwKParser.STRING);
        }

        public TerminalNode STRING(int i) {
            return getToken(HwKParser.STRING, i);
        }

        public ValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_value;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).enterValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof HwKListener) ((HwKListener) listener).exitValue(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof HwKVisitor) return ((HwKVisitor<? extends T>) visitor).visitValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ValueContext value() throws RecognitionException {
        ValueContext _localctx = new ValueContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_value);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(47);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(46);
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
                    setState(49);
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

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f\66\4\2\t\2\4\3" +
                    "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2\25" +
                    "\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\4\3\4\3\5\3" +
                    "\5\3\5\3\5\3\6\3\6\5\6*\n\6\3\7\3\7\3\7\3\7\3\7\3\b\6\b\62\n\b\r\b\16" +
                    "\b\63\3\b\2\2\t\2\4\6\b\n\f\16\2\3\4\2\n\n\f\f\2\62\2\23\3\2\2\2\4\30" +
                    "\3\2\2\2\6!\3\2\2\2\b#\3\2\2\2\n)\3\2\2\2\f+\3\2\2\2\16\61\3\2\2\2\20" +
                    "\22\5\n\6\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24" +
                    "\26\3\2\2\2\25\23\3\2\2\2\26\27\7\2\2\3\27\3\3\2\2\2\30\31\7\3\2\2\31" +
                    "\36\7\13\2\2\32\33\7\4\2\2\33\35\7\13\2\2\34\32\3\2\2\2\35 \3\2\2\2\36" +
                    "\34\3\2\2\2\36\37\3\2\2\2\37\5\3\2\2\2 \36\3\2\2\2!\"\7\13\2\2\"\7\3\2" +
                    "\2\2#$\7\5\2\2$%\7\13\2\2%&\7\6\2\2&\t\3\2\2\2\'*\5\f\7\2(*\5\4\3\2)\'" +
                    "\3\2\2\2)(\3\2\2\2*\13\3\2\2\2+,\7\7\2\2,-\7\13\2\2-.\7\b\2\2./\5\16\b" +
                    "\2/\r\3\2\2\2\60\62\t\2\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2" +
                    "\63\64\3\2\2\2\64\17\3\2\2\2\6\23\36)\63";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}