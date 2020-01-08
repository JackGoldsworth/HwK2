package me.jackgoldsworth.hwk2.domain.expression.math

import me.jackgoldsworth.hwk2.bytecode.ExpressionGenerator
import me.jackgoldsworth.hwk2.domain.Type
import me.jackgoldsworth.hwk2.domain.expression.Expression

class Multiply(type: Type, left: Expression, right: Expression) : ArithmeticExpression(type, left, right) {

    override fun accept(generator: ExpressionGenerator) {
        generator.generate(this)
    }
}