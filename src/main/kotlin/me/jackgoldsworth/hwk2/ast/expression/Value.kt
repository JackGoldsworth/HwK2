package me.jackgoldsworth.hwk2.ast.expression

import me.jackgoldsworth.hwk2.ast.Type
import me.jackgoldsworth.hwk2.backend.ExpressionGenerator

class Value(type: Type, val value: String) : Expression(type) {

    override fun accept(generator: ExpressionGenerator) {
        generator.generate(this)
    }
}