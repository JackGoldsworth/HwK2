package me.jackgoldsworth.hwk2.ast.expression.math

import me.jackgoldsworth.hwk2.ast.Type
import me.jackgoldsworth.hwk2.ast.expression.Expression

abstract class ArithmeticExpression(type: Type, val left: Expression, val right: Expression) : Expression(type)