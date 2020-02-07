package me.jackgoldsworth.hwk2.codegen

import me.jackgoldsworth.hwk2.domain.Type
import me.jackgoldsworth.hwk2.domain.function.Function
import org.objectweb.asm.ClassWriter
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
        methodVisitor.visitInsn(Opcodes.RETURN)
        methodVisitor.visitMaxs(-1, -1)
        methodVisitor.visitEnd()
    }
}