package me.jackgoldsworth.hwk2.codegen

import me.jackgoldsworth.hwk2.domain.CompilationUnit
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes

class ByteCodeGenerator {

    fun generateByteCode(compilationUnit: CompilationUnit): ByteArray {
        val classWriter = ClassWriter(0)
        classWriter.visit(
            52,
            Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER,
            compilationUnit.fileName.replace(".hwk", ""),
            null,
            "java/lang/Object",
            null
        )
        val methodVisitor = classWriter.visitMethod(
            Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,
            "main",
            "([Ljava/lang/String;)V",
            null,
            null
        )
        val statementGenerator = StatementGenerator(
            methodVisitor,
            ExpressionGenerator(methodVisitor, compilationUnit.scope),
            compilationUnit.scope
        )
        val functionGenerator = FunctionGenerator(classWriter)
        compilationUnit.functions.forEach { it.accept(functionGenerator) }
        compilationUnit.statements.forEach { it.accept(statementGenerator) }
        methodVisitor.visitInsn(Opcodes.RETURN)
        methodVisitor.visitMaxs(100, compilationUnit.scope.localVariables.size)
        methodVisitor.visitEnd()
        classWriter.visitEnd()
        return classWriter.toByteArray()
    }
}