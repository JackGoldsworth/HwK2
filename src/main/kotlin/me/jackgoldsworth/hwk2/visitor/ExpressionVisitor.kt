package me.jackgoldsworth.hwk2.visitor

import me.jackgoldsworth.hwk2.domain.Scope
import me.jackgoldsworth.hwk2.domain.Type
import me.jackgoldsworth.hwk2.domain.expression.Expression
import me.jackgoldsworth.hwk2.domain.expression.Value
import me.jackgoldsworth.hwk2.domain.expression.VariableReference
import me.jackgoldsworth.hwk2.parser.HwKBaseVisitor
import me.jackgoldsworth.hwk2.parser.HwKParser
import kotlin.math.pow

class ExpressionVisitor(private val scope: Scope) : HwKBaseVisitor<Expression>() {

    override fun visitVarReference(ctx: HwKParser.VarReferenceContext): Expression {
        val varName = ctx.ID().text
        return VariableReference(
            (scope.getLocalVariable(varName) ?: error("Variable was not found in the scope!")).expression.type, varName
        )
    }

    override fun visitValue(ctx: HwKParser.ValueContext): Expression {
        return Value(Type.getTypeFromValue(ctx.text), ctx.text)
    }

    override fun visitADD(ctx: HwKParser.ADDContext): Expression {
        val firstVal = ctx.expression(0).text
        val secondVal = ctx.expression(1).text
        return Value(Type.INT, (firstVal.toInt() + secondVal.toInt()).toString())
    }

    override fun visitSUB(ctx: HwKParser.SUBContext): Expression {
        val firstVal = ctx.expression(0).text
        val secondVal = ctx.expression(1).text
        return Value(Type.INT, (firstVal.toInt() - secondVal.toInt()).toString())
    }

    override fun visitMULT(ctx: HwKParser.MULTContext): Expression {
        val firstVal = ctx.expression(0).text
        val secondVal = ctx.expression(1).text
        return Value(Type.INT, (firstVal.toInt() * secondVal.toInt()).toString())
    }

    override fun visitDIV(ctx: HwKParser.DIVContext): Expression {
        val firstVal = ctx.expression(0).text
        val secondVal = ctx.expression(1).text
        return Value(Type.INT, (firstVal.toInt() / secondVal.toInt()).toString())
    }

    override fun visitEXP(ctx: HwKParser.EXPContext): Expression {
        val firstVal = ctx.expression(0).text
        val secondVal = ctx.expression(1).text
        return Value(Type.INT, firstVal.toDouble().pow(secondVal.toDouble()).toInt().toString())
    }
}