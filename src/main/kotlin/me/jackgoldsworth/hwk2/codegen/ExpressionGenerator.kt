package me.jackgoldsworth.hwk2.codegen

import me.jackgoldsworth.hwk2.domain.Type
import me.jackgoldsworth.hwk2.domain.expression.Value
import me.jackgoldsworth.hwk2.domain.expression.VariableReference
import me.jackgoldsworth.hwk2.domain.expression.math.*
import me.jackgoldsworth.hwk2.domain.scope.Scope
import me.jackgoldsworth.hwk2.domain.statement.FunctionStatement
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

class ExpressionGenerator(private val methodVisitor: MethodVisitor, private val scope: Scope) {

    /**
     * Puts values onto the stack.
     */
    fun generate(value: Value) {
        val valueVal = value.value
        if (value.type === Type.INT) {
            methodVisitor.visitIntInsn(Opcodes.BIPUSH, Integer.valueOf(valueVal))
        } else if (value.type === Type.STRING) {
            methodVisitor.visitLdcInsn(valueVal)
        }
    }

    /**
     * Puts variable values onto the stack.
     */
    fun generate(variable: VariableReference) {
        val varName = variable.varName
        val index = scope.getIndexOfLocalVariable(varName)
            ?: throw IndexOutOfBoundsException("Variable ${variable.varName} index was not found!")
        if (variable.type == Type.INT) {
            methodVisitor.visitVarInsn(Opcodes.ILOAD, index)
        } else if (variable.type == Type.STRING) {
            methodVisitor.visitVarInsn(Opcodes.ALOAD, index)
        }
    }

    fun generate(functionCall: FunctionStatement) {
        val description = Type.getMethodDescription(functionCall.parameters, functionCall.type)
        methodVisitor.visitMethodInsn(
            Opcodes.INVOKESTATIC,
            "example", // TODO: Make owner dynamic.
            functionCall.name,
            description,
            false
        )
    }

    fun generate(addition: Addition) {
        evaluateExpressions(addition)
        methodVisitor.visitInsn(Opcodes.IADD)
    }

    fun generate(subtraction: Subtraction) {
        evaluateExpressions(subtraction)
        methodVisitor.visitInsn(Opcodes.ISUB)
    }

    fun generate(multiply: Multiply) {
        evaluateExpressions(multiply)
        methodVisitor.visitInsn(Opcodes.IMUL)
    }

    fun generate(division: Division) {
        evaluateExpressions(division)
        methodVisitor.visitInsn(Opcodes.IDIV)
    }

    private fun evaluateExpressions(expression: ArithmeticExpression) {
        expression.left.accept(this)
        expression.right.accept(this)
    }
}