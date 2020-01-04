package me.jackgoldsworth.hwk2.domain.expression

import me.jackgoldsworth.hwk2.bytecode.ExpressionGenerator
import me.jackgoldsworth.hwk2.domain.Type

class Value(type: Type, val value: String) : Expression(type) {

    override fun accept(generator: ExpressionGenerator) {
        generator.generate(this)
    }
}