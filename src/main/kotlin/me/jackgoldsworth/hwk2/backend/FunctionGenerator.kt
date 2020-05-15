package me.jackgoldsworth.hwk2.backend

import me.jackgoldsworth.hwk2.ast.Type
import me.jackgoldsworth.hwk2.ast.function.Function
import me.jackgoldsworth.hwk2.ast.function.scope.Scope
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

class FunctionGenerator(private val classWriter: ClassWriter) {

    fun generate(function: Function) {
        val name = function.name
        val description = Type.getMethodDescription(function.parameters, function.returnType)
        val scope = function.scope
        val methodVisitor =
            classWriter.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, name, description, null, null)
        methodVisitor.visitCode()

        val generator = StatementGenerator(
            methodVisitor,
            ExpressionGenerator(methodVisitor, scope), scope
        )
        function.statement.forEach { it.accept(generator) }
        generateReturnExpression(function, methodVisitor, scope)
        methodVisitor.visitMaxs(100, function.scope.localVariables.size)
        methodVisitor.visitEnd()
    }

    private fun generateReturnExpression(function: Function, methodVisitor: MethodVisitor, scope: Scope) {
        val expression = function.expression
        if (expression == null) {
            methodVisitor.visitInsn(Opcodes.RETURN)
        } else {
            expression.accept(ExpressionGenerator(methodVisitor, scope))
            if (function.returnType == Type.STRING) {
                methodVisitor.visitInsn(Opcodes.ARETURN)
            } else {
                methodVisitor.visitInsn(Opcodes.IRETURN)
            }
        }
    }
}