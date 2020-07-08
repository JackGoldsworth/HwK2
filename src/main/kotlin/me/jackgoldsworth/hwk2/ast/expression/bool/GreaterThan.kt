package me.jackgoldsworth.hwk2.ast.expression.bool

import me.jackgoldsworth.hwk2.ast.Type
import me.jackgoldsworth.hwk2.ast.expression.DualExpression
import me.jackgoldsworth.hwk2.ast.expression.Expression
import me.jackgoldsworth.hwk2.backend.ExpressionGenerator

class GreaterThan(val left: Expression, val right: Expression) : Expression(Type.BOOL),
    DualExpression {

    override fun accept(generator: ExpressionGenerator) {
        generator.generate(this)
    }

    override fun getLeftExp(): Expression {
        return left
    }

    override fun getRightExp(): Expression {
        return right
    }
}