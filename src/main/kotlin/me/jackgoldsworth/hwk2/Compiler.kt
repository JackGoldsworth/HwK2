package me.jackgoldsworth.hwk2

import me.jackgoldsworth.hwk2.bytecode.ByteCodeGenerator
import me.jackgoldsworth.hwk2.domain.CompilationUnit
import me.jackgoldsworth.hwk2.parser.HwKLexer
import me.jackgoldsworth.hwk2.parser.HwKParser
import me.jackgoldsworth.hwk2.visitor.CompilationVisitor
import org.antlr.v4.runtime.ANTLRFileStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

class Compiler {

    /**
     * This parses a file and gets the instructions from it.
     */
    fun getCompilationUnit(path: String): CompilationUnit {
        val stream: CharStream = ANTLRFileStream(path)
        val lexer = HwKLexer(stream)
        val tokenStream = CommonTokenStream(lexer)
        val parser = HwKParser(tokenStream)
        val splitStr = path.split('\\')
        val visitor = CompilationVisitor(splitStr[splitStr.size - 1])
        return parser.compilationUnit().accept(visitor)
    }

    fun compile(args: Array<String>) {
        val file = File(args[0])
        val compilationUnit = getCompilationUnit(file.absolutePath)
        saveByteCode(compilationUnit)
    }

    private fun saveByteCode(compilationUnit: CompilationUnit) {
        val generator = ByteCodeGenerator()
        val bytes = generator.generateByteCode(compilationUnit)
        File(compilationUnit.fileName.replace(".hwk", ".class")).writeBytes(bytes)
    }
}

fun main(args: Array<String>) {
    if (args.isNotEmpty())
        Compiler().compile(args)
}