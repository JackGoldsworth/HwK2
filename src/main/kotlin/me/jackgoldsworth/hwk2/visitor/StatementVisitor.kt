package me.jackgoldsworth.hwk2.visitor

import me.jackgoldsworth.hwk2.domain.Scope
import me.jackgoldsworth.hwk2.domain.statement.PrintStatement
import me.jackgoldsworth.hwk2.domain.statement.Statement
import me.jackgoldsworth.hwk2.domain.statement.VariableStatement
import me.jackgoldsworth.hwk2.parser.HwKBaseVisitor
import me.jackgoldsworth.hwk2.parser.HwKParser

class StatementVisitor(private val scope: Scope) : HwKBaseVisitor<Statement>() {

    private val expVisitor = ExpressionVisitor(scope)

    override fun visitPrint(ctx: HwKParser.PrintContext): Statement {
        val expressionCtx = ctx.expression()
        val expression = expressionCtx.accept(expVisitor)
        return PrintStatement(expression)
    }

    override fun visitVariable(ctx: HwKParser.VariableContext): Statement {
        val varName = ctx.ID()
        val expression = ctx.expression().accept(expVisitor)
        val statement = VariableStatement(varName.text, expression)
        scope.localVariables.add(statement)
        return statement
    }
}