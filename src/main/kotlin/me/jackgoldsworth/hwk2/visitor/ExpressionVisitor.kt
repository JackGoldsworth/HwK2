package me.jackgoldsworth.hwk2.visitor

import me.jackgoldsworth.hwk2.ast.Type
import me.jackgoldsworth.hwk2.ast.expression.Expression
import me.jackgoldsworth.hwk2.ast.expression.Value
import me.jackgoldsworth.hwk2.ast.expression.VariableReference
import me.jackgoldsworth.hwk2.ast.expression.bool.AndExpression
import me.jackgoldsworth.hwk2.ast.expression.bool.EqualsExpression
import me.jackgoldsworth.hwk2.ast.expression.math.Addition
import me.jackgoldsworth.hwk2.ast.expression.math.Division
import me.jackgoldsworth.hwk2.ast.expression.math.Multiply
import me.jackgoldsworth.hwk2.ast.expression.math.Subtraction
import me.jackgoldsworth.hwk2.ast.function.ParameterCall
import me.jackgoldsworth.hwk2.ast.function.scope.Scope
import me.jackgoldsworth.hwk2.ast.statement.FunctionStatement
import me.jackgoldsworth.hwk2.parser.HwKBaseVisitor
import me.jackgoldsworth.hwk2.parser.HwKParser

class ExpressionVisitor(private val scope: Scope) : HwKBaseVisitor<Expression>() {

    override fun visitVarReference(ctx: HwKParser.VarReferenceContext): Expression {
        val varName = ctx.ID().text
        return VariableReference(
            (scope.getLocalVariable(varName) ?: error("Variable was not found in the scope!")).type, varName
        )
    }

    override fun visitFUNC(ctx: HwKParser.FUNCContext): Expression {
        val name = ctx.functionCall().ID().text
        val params = mutableListOf<ParameterCall>()
        ctx.functionCall().funcArgs().expression().forEach {
            params.add(ParameterCall(it.accept(this)))
        }
        return FunctionStatement(
            name,
            params,
            scope.functions[name]?.returnType ?: error("Function $name could not be found.")
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

    override fun visitAND(ctx: HwKParser.ANDContext): Expression {
        val firstVal = ctx.expression(0).accept(this)
        val secondVal = ctx.expression(1).accept(this)
        return AndExpression(firstVal, secondVal)
    }

    override fun visitEQUALS(ctx: HwKParser.EQUALSContext): Expression {
        val firstVal = ctx.expression(0).accept(this)
        val secondVal = ctx.expression(1).accept(this)
        return EqualsExpression(firstVal, secondVal)
    }
}