package me.jackgoldsworth.hwk2.parser;// Generated from hwk2.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link hwk2Parser}.
 */
public interface hwk2Listener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link hwk2Parser#imports}.
     *
     * @param ctx the parse tree
     */
    void enterImports(hwk2Parser.ImportsContext ctx);

    /**
     * Exit a parse tree produced by {@link hwk2Parser#imports}.
     *
     * @param ctx the parse tree
     */
    void exitImports(hwk2Parser.ImportsContext ctx);

    /**
     * Enter a parse tree produced by {@link hwk2Parser#type}.
     *
     * @param ctx the parse tree
     */
    void enterType(hwk2Parser.TypeContext ctx);

    /**
     * Exit a parse tree produced by {@link hwk2Parser#type}.
     *
     * @param ctx the parse tree
     */
    void exitType(hwk2Parser.TypeContext ctx);

    /**
     * Enter a parse tree produced by {@link hwk2Parser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(hwk2Parser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link hwk2Parser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(hwk2Parser.StatementContext ctx);

    /**
     * Enter a parse tree produced by {@link hwk2Parser#variable}.
     *
     * @param ctx the parse tree
     */
    void enterVariable(hwk2Parser.VariableContext ctx);

    /**
     * Exit a parse tree produced by {@link hwk2Parser#variable}.
     *
     * @param ctx the parse tree
     */
    void exitVariable(hwk2Parser.VariableContext ctx);
}