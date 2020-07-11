package me.jackgoldsworth.hwk2.backend

import me.jackgoldsworth.hwk2.ast.Type
import me.jackgoldsworth.hwk2.ast.expression.DualExpression
import me.jackgoldsworth.hwk2.ast.expression.Value
import me.jackgoldsworth.hwk2.ast.expression.VariableReference
import me.jackgoldsworth.hwk2.ast.expression.bool.AndExpression
import me.jackgoldsworth.hwk2.ast.expression.bool.GreaterThan
import me.jackgoldsworth.hwk2.ast.expression.math.Addition
import me.jackgoldsworth.hwk2.ast.expression.math.Division
import me.jackgoldsworth.hwk2.ast.expression.math.Multiply
import me.jackgoldsworth.hwk2.ast.expression.math.Subtraction
import me.jackgoldsworth.hwk2.ast.function.scope.Scope
import me.jackgoldsworth.hwk2.ast.statement.FunctionStatement
import me.jackgoldsworth.hwk2.optimization.MathOptimization
import org.objectweb.asm.Label
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

class ExpressionGenerator(private val methodVisitor: MethodVisitor, private val scope: Scope) {

    private val mathOptimizer = MathOptimization()

    /**
     * Puts values onto the stack.
     */
    fun generate(value: Value) {
        val valueVal = value.value
        if (value.type === Type.INT) {
            methodVisitor.visitIntInsn(Opcodes.BIPUSH, Integer.valueOf(valueVal))
        } else if (value.type === Type.STRING) {
            methodVisitor.visitLdcInsn(valueVal)
        } else if (value.type === Type.BOOL) {
            if (valueVal == "false") {
                methodVisitor.visitInsn(Opcodes.ICONST_0)
            } else {
                methodVisitor.visitInsn(Opcodes.ICONST_1)
            }
        }
    }

    /**
     * Puts variable values onto the stack.
     */
    fun generate(variable: VariableReference) {
        val varName = variable.varName
        val index = scope.getIndexOfLocalVariable(varName)
            ?: throw IndexOutOfBoundsException("Variable ${variable.varName} index was not found!")
        if (variable.type === Type.INT || variable.type === Type.BOOL) {
            methodVisitor.visitVarInsn(Opcodes.ILOAD, index)
        } else if (variable.type === Type.STRING) {
            methodVisitor.visitVarInsn(Opcodes.ALOAD, index)
        }
    }

    fun generate(functionCall: FunctionStatement) {
        functionCall.parameters.forEach {
            it.expression.accept(this)
        }
        methodVisitor.visitMethodInsn(
            Opcodes.INVOKESTATIC,
            "example", // TODO: Make owner dynamic.
            functionCall.name,
            scope.functions[functionCall.name]?.description,
            false
        )
    }

    fun generate(andExpression: AndExpression) {
        evaluateExpressions(andExpression)
        val trueLabel = Label()
        val endLabel = Label()
        methodVisitor.visitJumpInsn(Opcodes.IF_ICMPEQ,trueLabel)
        methodVisitor.visitInsn(Opcodes.ICONST_0)
        methodVisitor.visitJumpInsn(Opcodes.GOTO, endLabel)
        methodVisitor.visitLabel(trueLabel)
        methodVisitor.visitInsn(Opcodes.ICONST_1)
        methodVisitor.visitLabel(endLabel)
    }

    fun generate(addition: Addition) {
        if (!mathOptimizer.optimizeAddition(methodVisitor, addition, scope)) {
            evaluateExpressions(addition)
            methodVisitor.visitInsn(Opcodes.IADD)
        }
    }

    fun generate(subtraction: Subtraction) {
        if (!mathOptimizer.optimizeSubtraction(methodVisitor, subtraction, scope)) {
            evaluateExpressions(subtraction)
            methodVisitor.visitInsn(Opcodes.ISUB)
        }
    }

    fun generate(multiply: Multiply) {
        if (!mathOptimizer.optimizeMultiplication(methodVisitor, multiply, scope)) {
            evaluateExpressions(multiply)
            methodVisitor.visitInsn(Opcodes.IMUL)
        }
    }

    fun generate(division: Division) {
        if (!mathOptimizer.optimizeDivision(methodVisitor, division, scope)) {
            evaluateExpressions(division)
            methodVisitor.visitInsn(Opcodes.IDIV)
        }
    }

    private fun evaluateExpressions(expression: DualExpression) {
        expression.getLeftExp().accept(this)
        expression.getRightExp().accept(this)
    }
}