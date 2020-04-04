package me.jackgoldsworth.hwk2.codegen

import me.jackgoldsworth.hwk2.domain.Type
import me.jackgoldsworth.hwk2.domain.expression.Value
import me.jackgoldsworth.hwk2.domain.expression.VariableReference
import me.jackgoldsworth.hwk2.domain.function.Function
import me.jackgoldsworth.hwk2.domain.scope.Scope
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

class FunctionGenerator(private val classWriter: ClassWriter) {

    fun generate(function: Function) {
        val name = function.name
        val description = Type.getMethodDescription(function.parameters, function.returnType)
        val scope = function.scope
        val methodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, name, description, null, null)
        methodVisitor.visitCode()

        val generator = StatementGenerator(methodVisitor, ExpressionGenerator(methodVisitor, scope), scope)
        function.statement.forEach { it.accept(generator) }
        generateReturnExpression(function, methodVisitor, scope)
        methodVisitor.visitMaxs(-1, -1)
        methodVisitor.visitEnd()
    }

    private fun generateReturnExpression(function: Function, methodVisitor: MethodVisitor, scope: Scope) {
        val expression = function.expression
        if(expression == null) {
            methodVisitor.visitInsn(Opcodes.RETURN)
        }
        else if(expression is VariableReference) {
            val varName = expression.varName
            val index = scope.getIndexOfLocalVariable(varName) ?: error("Variable $varName was not found")
            if(expression.type === Type.STRING) {
                methodVisitor.visitVarInsn(Opcodes.ALOAD, index)
                methodVisitor.visitInsn(Opcodes.ARETURN)
            } else if(expression.type === Type.INT) {
                methodVisitor.visitVarInsn(Opcodes.ILOAD, index)
                methodVisitor.visitInsn(Opcodes.IRETURN)
            }
        } else if(expression is Value) {
            val valueVal = expression.value
            if (expression.type === Type.INT) {
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, Integer.valueOf(valueVal))
                methodVisitor.visitInsn(Opcodes.IRETURN)
            } else if (expression.type === Type.STRING) {
                methodVisitor.visitLdcInsn(valueVal)
                methodVisitor.visitInsn(Opcodes.ARETURN)
            }
        }
    }
}