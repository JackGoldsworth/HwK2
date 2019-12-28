package me.jackgoldsworth.hwk2.bytecode.instructions

import org.objectweb.asm.MethodVisitor

interface Instruction {
    fun apply(visitor: MethodVisitor)
}