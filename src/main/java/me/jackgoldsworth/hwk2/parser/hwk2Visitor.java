package me.jackgoldsworth.hwk2.parser;
// Generated from hwk2.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link hwk2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface hwk2Visitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link hwk2Parser#imports}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitImports(hwk2Parser.ImportsContext ctx);

    /**
     * Visit a parse tree produced by {@link hwk2Parser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitType(hwk2Parser.TypeContext ctx);

    /**
     * Visit a parse tree produced by {@link hwk2Parser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatement(hwk2Parser.StatementContext ctx);

    /**
     * Visit a parse tree produced by {@link hwk2Parser#variable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVariable(hwk2Parser.VariableContext ctx);
}