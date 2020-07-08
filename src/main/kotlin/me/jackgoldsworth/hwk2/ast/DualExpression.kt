package me.jackgoldsworth.hwk2.ast

import me.jackgoldsworth.hwk2.ast.expression.Expression

interface DualExpression {

    fun getLeftExp(): Expression
    fun getRightExp(): Expression
}