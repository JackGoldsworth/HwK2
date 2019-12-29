// Generated from HwK.g4 by ANTLR 4.7.2
package me.jackgoldsworth.hwk2.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HwKParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface HwKVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link HwKParser#compilationUnit}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCompilationUnit(HwKParser.CompilationUnitContext ctx);

    /**
     * Visit a parse tree produced by {@link HwKParser#imports}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitImports(HwKParser.ImportsContext ctx);

    /**
     * Visit a parse tree produced by {@link HwKParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitType(HwKParser.TypeContext ctx);

    /**
     * Visit a parse tree produced by {@link HwKParser#print}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrint(HwKParser.PrintContext ctx);

    /**
     * Visit a parse tree produced by {@link HwKParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatement(HwKParser.StatementContext ctx);

    /**
     * Visit a parse tree produced by {@link HwKParser#variable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVariable(HwKParser.VariableContext ctx);

    /**
     * Visit a parse tree produced by {@link HwKParser#value}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValue(HwKParser.ValueContext ctx);
}