package me.jackgoldsworth.hwk2.ast.expression

import me.jackgoldsworth.hwk2.ast.Type
import me.jackgoldsworth.hwk2.backend.ExpressionGenerator

abstract class Expression(val type: Type) {

    abstract fun accept(generator: ExpressionGenerator)
}