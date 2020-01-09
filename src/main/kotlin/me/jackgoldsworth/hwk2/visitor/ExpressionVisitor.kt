package me.jackgoldsworth.hwk2.visitor

import me.jackgoldsworth.hwk2.domain.Scope
import me.jackgoldsworth.hwk2.domain.Type
import me.jackgoldsworth.hwk2.domain.expression.Expression
import me.jackgoldsworth.hwk2.domain.expression.Value
import me.jackgoldsworth.hwk2.domain.expression.VariableReference
import me.jackgoldsworth.hwk2.domain.expression.math.Addition
import me.jackgoldsworth.hwk2.domain.expression.math.Division
import me.jackgoldsworth.hwk2.domain.expression.math.Multiply
import me.jackgoldsworth.hwk2.domain.expression.math.Subtraction
import me.jackgoldsworth.hwk2.parser.HwKBaseVisitor
import me.jackgoldsworth.hwk2.parser.HwKParser

class ExpressionVisitor(private val scope: Scope) : HwKBaseVisitor<Expression>() {

    override fun visitVarReference(ctx: HwKParser.VarReferenceContext): Expression {
        val varName = ctx.ID().text
        return VariableReference(
            (scope.getLocalVariable(varName) ?: error("Variable was not found in the scope!")).type, varName
        )
    }

    override fun visitValue(ctx: HwKParser.ValueContext): Expression {
        return Value(Type.getTypeFromValue(ctx.text), ctx.text)
    }

    override fun visitADD(ctx: HwKParser.ADDContext): Expression {
        val firstVal = ctx.expression(0).accept(this)
        val secondVal = ctx.expression(1).accept(this)
        return Addition(Type.INT, firstVal, secondVal)
    }

    override fun visitSUB(ctx: HwKParser.SUBContext): Expression {
        val firstVal = ctx.expression(0).accept(this)
        val secondVal = ctx.expression(1).accept(this)
        return Subtraction(Type.INT, firstVal, secondVal)
    }

    override fun visitMULT(ctx: HwKParser.MULTContext): Expression {
        val firstVal = ctx.expression(0).accept(this)
        val secondVal = ctx.expression(1).accept(this)
        return Multiply(Type.INT, firstVal, secondVal)
    }

    override fun visitDIV(ctx: HwKParser.DIVContext): Expression {
        val firstVal = ctx.expression(0).accept(this)
        val secondVal = ctx.expression(1).accept(this)
        return Division(Type.INT, firstVal, secondVal)
    }
}