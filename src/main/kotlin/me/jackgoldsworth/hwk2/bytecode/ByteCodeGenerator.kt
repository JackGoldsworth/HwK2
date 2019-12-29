package me.jackgoldsworth.hwk2.bytecode

import me.jackgoldsworth.hwk2.bytecode.instructions.Instruction
import me.jackgoldsworth.hwk2.bytecode.instructions.VariableInst
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes
import java.util.*

class ByteCodeGenerator {

    fun generateByteCode(instructions: Queue<Instruction>, name: String): ByteArray {
        val classWriter = ClassWriter(0)
        classWriter.visit(52, Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER, name, null, "java/lang/Object", null);
        val methodVisitor = classWriter.visitMethod(
            Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,
            "main",
            "([Ljava/lang/String;)V",
            null,
            null
        )
        val numVariables = instructions.stream().filter { inst -> inst is VariableInst }.count()
        instructions.forEach { inst -> inst.apply(methodVisitor) }
        methodVisitor.visitInsn(Opcodes.RETURN)
        methodVisitor.visitMaxs(100, numVariables.toInt())
        methodVisitor.visitEnd()
        classWriter.visitEnd()
        return classWriter.toByteArray()
    }
}