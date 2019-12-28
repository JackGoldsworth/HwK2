package me.jackgoldsworth.hwk2.bytecode.instructions

import me.jackgoldsworth.hwk2.domain.Variable
import me.jackgoldsworth.hwk2.parser.HwKLexer
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

class PrintInst(private val variable: Variable) : Instruction {

    override fun apply(visitor: MethodVisitor) {
        val type = variable.type
        val id = variable.index
        visitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream")
        if (type == HwKLexer.NUMBER) {
            visitor.visitVarInsn(Opcodes.ILOAD, id)
            visitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "I(V)", false)
        } else if (type == HwKLexer.STRING) {
            visitor.visitVarInsn(Opcodes.ALOAD, id)
            visitor.visitMethodInsn(
                Opcodes.INVOKEVIRTUAL,
                "java/io/PrintStream",
                "println",
                "(Ljava/lang/String;)V",
                false
            )
        }
    }
}