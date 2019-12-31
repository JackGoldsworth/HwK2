package me.jackgoldsworth.hwk2.domain.expression

import me.jackgoldsworth.hwk2.bytecode.ExpressionGenerator
import me.jackgoldsworth.hwk2.domain.Type

abstract class Expression(val type: Type) {

    abstract fun accept(generator: ExpressionGenerator)
}