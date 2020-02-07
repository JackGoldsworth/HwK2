package me.jackgoldsworth.hwk2.domain.expression

import me.jackgoldsworth.hwk2.codegen.ExpressionGenerator
import me.jackgoldsworth.hwk2.domain.Type

class VariableReference(type: Type, val varName: String) : Expression(type) {

    override fun accept(generator: ExpressionGenerator) {
        generator.generate(this)
    }
}