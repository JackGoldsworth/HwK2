package me.jackgoldsworth.hwk2.ast.expression

interface DualExpression {

    fun getLeftExp(): Expression
    fun getRightExp(): Expression
}