package me.jackgoldsworth.hwk2.visitor

import me.jackgoldsworth.hwk2.domain.statement.PrintStatement
import me.jackgoldsworth.hwk2.domain.statement.Statement
import me.jackgoldsworth.hwk2.domain.statement.VariableStatement
import me.jackgoldsworth.hwk2.parser.HwKBaseVisitor
import me.jackgoldsworth.hwk2.parser.HwKParser

class StatementVisitor : HwKBaseVisitor<Statement>() {

    private val expVisitor = ExpressionVisitor()

    override fun visitPrint(ctx: HwKParser.PrintContext): Statement {
        val expressionCtx = ctx.expression()
        val expression = expressionCtx.accept(expVisitor)
        return PrintStatement(expression)
    }

    override fun visitVariable(ctx: HwKParser.VariableContext): Statement {
        val varName = ctx.ID()
        val expression = ctx.expression().accept(expVisitor)
        return VariableStatement(varName.text, expression)
    }
}