package me.jackgoldsworth.hwk2.visitor

import me.jackgoldsworth.hwk2.domain.Type
import me.jackgoldsworth.hwk2.domain.expression.Expression
import me.jackgoldsworth.hwk2.domain.expression.Value
import me.jackgoldsworth.hwk2.domain.expression.VariableReference
import me.jackgoldsworth.hwk2.parser.HwKBaseVisitor
import me.jackgoldsworth.hwk2.parser.HwKParser

class ExpressionVisitor : HwKBaseVisitor<Expression>() {

    override fun visitVarReference(ctx: HwKParser.VarReferenceContext): Expression {
        val varName = ctx.ID().text
        return VariableReference(Type.getTypeFromValue(varName), varName) // TODO
    }

    override fun visitValue(ctx: HwKParser.ValueContext): Expression {
        return Value(Type.getTypeFromValue(ctx.text), ctx.text)
    }
}