package me.jackgoldsworth.hwk2.bytecode

import me.jackgoldsworth.hwk2.domain.Scope
import me.jackgoldsworth.hwk2.domain.Type
import me.jackgoldsworth.hwk2.domain.expression.Value
import me.jackgoldsworth.hwk2.domain.expression.VariableReference
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
}