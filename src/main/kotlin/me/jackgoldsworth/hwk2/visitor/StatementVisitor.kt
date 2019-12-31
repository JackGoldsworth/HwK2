package me.jackgoldsworth.hwk2.visitor

import me.jackgoldsworth.hwk2.domain.Statement
import me.jackgoldsworth.hwk2.parser.HwKBaseVisitor
import me.jackgoldsworth.hwk2.parser.HwKParser

class StatementVisitor : HwKBaseVisitor<Statement>() {

    override fun visitPrint(ctx: HwKParser.PrintContext): Statement {
        val expression = ctx.expression()
        val expVisitor = ExpressionVisitor()
        return expression.accept(expVisitor)
    }
}