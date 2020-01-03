package me.jackgoldsworth.hwk2.bytecode

import me.jackgoldsworth.hwk2.domain.statement.PrintStatement
import me.jackgoldsworth.hwk2.domain.statement.VariableStatement
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

class StatementGenerator(
    private val methodVisitor: MethodVisitor,
    private val expressionGenerator: ExpressionGenerator
) {

    fun generate(print: PrintStatement) {
        val expression = print.expression
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;")
        expression.accept(expressionGenerator)
        val type = expression.type
        methodVisitor.visitMethodInsn(
            Opcodes.INVOKEVIRTUAL,
            "java/io/PrintStream",
            "println",
            "(${type.descriptor})V",
            false
        )
    }

    fun generate(variable: VariableStatement) {

    }
}

//override fun apply(visitor: org.objectweb.asm.MethodVisitor) {
//    when (variable.type) {
//        HwKLexer.NUMBER -> {
//            val value = Integer.valueOf(variable.textVal)
//            visitor.visitIntInsn(Opcodes.BIPUSH, value)
//            visitor.visitVarInsn(Opcodes.ISTORE, variable.index)
//        }
//        HwKLexer.STRING -> {
//            visitor.visitLdcInsn(variable.textVal)
//            visitor.visitVarInsn(Opcodes.ASTORE, variable.index)
//        }
//        HwKLexer.ID -> {
//            if (variable.otherVar!!.type == HwKLexer.STRING) {
//                visitor.visitVarInsn(Opcodes.ALOAD, variable.otherVar.index)
//                visitor.visitVarInsn(Opcodes.ASTORE, variable.index)
//            } else if (variable.otherVar.type == HwKLexer.NUMBER) {
//                visitor.visitVarInsn(Opcodes.ILOAD, variable.otherVar.index)
////                    visitor.visitIntInsn(Opcodes.BIPUSH, 5) Temporary code to stop optimizations.
////                    visitor.visitInsn(Opcodes.IMUL)
//                visitor.visitVarInsn(Opcodes.ISTORE, variable.index)
//            }
//        }
//    }
//}
//}