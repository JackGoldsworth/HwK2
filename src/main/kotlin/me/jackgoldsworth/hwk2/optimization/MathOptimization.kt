package me.jackgoldsworth.hwk2.optimization

import me.jackgoldsworth.hwk2.ast.expression.Value
import me.jackgoldsworth.hwk2.ast.expression.math.*
import me.jackgoldsworth.hwk2.ast.function.scope.Scope
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

class MathOptimization {

    fun optimizeAddition(methodVisitor: MethodVisitor, expression: Addition, scope: Scope): Boolean {
        val values = getValues(expression)
        if (values != null) {
            val rightValue = values.second
            val leftValue = values.first
            if (leftValue == -rightValue || rightValue == -leftValue) {
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, 0)
                return true
            }
        }
        return false
    }

    fun optimizeSubtraction(methodVisitor: MethodVisitor, expression: Subtraction, scope: Scope): Boolean {
        val values = getValues(expression)
        if (values != null) {
            val rightValue = values.second
            val leftValue = values.first
            if (leftValue == rightValue) {
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, 0)
                return true
            }
        }
        return false
    }

    fun optimizeMultiplication(methodVisitor: MethodVisitor, expression: Multiply, scope: Scope): Boolean {
        val values = getValues(expression)
        if (values != null) {
            val rightValue = values.second
            val leftValue = values.first
            if (rightValue == 0 || leftValue == 0) {
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, 0)
                return true
            } else if (rightValue == 1 || leftValue == 1) {
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, if (leftValue == 1) rightValue else leftValue)
                return true
            }
        }
        return false
    }

    fun optimizeDivision(methodVisitor: MethodVisitor, expression: Division, scope: Scope): Boolean {
        val values = getValues(expression)
        if (values != null) {
            if (values.second == 1) {
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, values.first)
                return true
            }
        }
        return false
    }

    private fun getValues(expression: ArithmeticExpression): Pair<Int, Int>? {
        var rightValue: Int? = null
        var leftValue: Int? = null
        if (expression.left is Value) {
            leftValue = expression.left.value.toInt()
        }
        if (expression.right is Value) {
            rightValue = expression.right.value.toInt()
        }
        if (rightValue != null && leftValue != null) {
            return Pair(leftValue, rightValue)
        }
        return null
    }
}