package me.jackgoldsworth.hwk2.ast.expression.math

import me.jackgoldsworth.hwk2.ast.Type
import me.jackgoldsworth.hwk2.ast.expression.Expression
import me.jackgoldsworth.hwk2.backend.ExpressionGenerator

class Subtraction(type: Type, left: Expression, right: Expression) : ArithmeticExpression(type, left, right) {

    override fun accept(generator: ExpressionGenerator) {
        generator.generate(this)
    }
}