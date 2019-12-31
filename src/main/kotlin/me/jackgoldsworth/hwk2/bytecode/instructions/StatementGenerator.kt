package me.jackgoldsworth.hwk2.bytecode.instructions

import jdk.internal.org.objectweb.asm.MethodVisitor
import me.jackgoldsworth.hwk2.domain.statement.PrintStatement
import me.jackgoldsworth.hwk2.domain.statement.VariableStatement
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