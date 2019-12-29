package me.jackgoldsworth.hwk2

import me.jackgoldsworth.hwk2.bytecode.ByteCodeGenerator
import java.io.File

class Compiler {

    fun compile(args: Array<String>) {
        val file = File(args[0])
        val instructions = SyntaxTreeTraverser().getInstructionsFromFile(file.absolutePath)
        val bytes = ByteCodeGenerator().generateByteCode(instructions, file.name.replace(".hwk", ""))
        saveByteCode(file.name, bytes)
    }

    private fun saveByteCode(fileName: String, bytes: ByteArray) {
        File(fileName.replace(".hwk", ".class")).writeBytes(bytes)
    }
}

fun main(args: Array<String>) {
    if (args.isNotEmpty())
        Compiler().compile(args)
}