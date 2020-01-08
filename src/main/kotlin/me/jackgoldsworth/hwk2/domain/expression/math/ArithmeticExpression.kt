package me.jackgoldsworth.hwk2.domain.expression.math

import me.jackgoldsworth.hwk2.domain.Type
import me.jackgoldsworth.hwk2.domain.expression.Expression

abstract class ArithmeticExpression(type: Type, val left: Expression, val right: Expression) : Expression(type)