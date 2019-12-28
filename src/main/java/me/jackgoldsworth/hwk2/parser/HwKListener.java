package me.jackgoldsworth.hwk2.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HwKParser}.
 */
public interface HwKListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link HwKParser#compilationUnit}.
     *
     * @param ctx the parse tree
     */
    void enterCompilationUnit(HwKParser.CompilationUnitContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#compilationUnit}.
     *
     * @param ctx the parse tree
     */
    void exitCompilationUnit(HwKParser.CompilationUnitContext ctx);

    /**
     * Enter a parse tree produced by {@link HwKParser#imports}.
     *
     * @param ctx the parse tree
     */
    void enterImports(HwKParser.ImportsContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#imports}.
     *
     * @param ctx the parse tree
     */
    void exitImports(HwKParser.ImportsContext ctx);

    /**
     * Enter a parse tree produced by {@link HwKParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterType(HwKParser.TypeContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitType(HwKParser.TypeContext ctx);

    /**
     * Enter a parse tree produced by {@link HwKParser#print}.
     *
     * @param ctx the parse tree
     */
    void enterPrint(HwKParser.PrintContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#print}.
     *
     * @param ctx the parse tree
     */
    void exitPrint(HwKParser.PrintContext ctx);

    /**
     * Enter a parse tree produced by {@link HwKParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(HwKParser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(HwKParser.StatementContext ctx);

    /**
     * Enter a parse tree produced by {@link HwKParser#variable}.
     *
     * @param ctx the parse tree
     */
    void enterVariable(HwKParser.VariableContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#variable}.
     *
     * @param ctx the parse tree
     */
    void exitVariable(HwKParser.VariableContext ctx);

    /**
     * Enter a parse tree produced by {@link HwKParser#value}.
     *
     * @param ctx the parse tree
     */
    void enterValue(HwKParser.ValueContext ctx);

    /**
     * Exit a parse tree produced by {@link HwKParser#value}.
     *
     * @param ctx the parse tree
     */
    void exitValue(HwKParser.ValueContext ctx);
}