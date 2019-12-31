package me.jackgoldsworth.hwk2.bytecode

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
        );
        val methodVisitor = classWriter.visitMethod(
            Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,
            "main",
            "([Ljava/lang/String;)V",
            null,
            null
        )
//        val numVariables = instructions.stream().filter { inst -> inst is VariableInst }.count()
//        instructions.forEach { inst -> inst.apply(methodVisitor) }
//        methodVisitor.visitInsn(Opcodes.RETURN)
//        methodVisitor.visitMaxs(100, numVariables.toInt())
//        methodVisitor.visitEnd()
//        classWriter.visitEnd()
        return classWriter.toByteArray()
    }
}