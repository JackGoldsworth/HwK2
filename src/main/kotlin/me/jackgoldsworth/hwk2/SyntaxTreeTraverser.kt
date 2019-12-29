package me.jackgoldsworth.hwk2

import me.jackgoldsworth.hwk2.bytecode.instructions.Instruction
import me.jackgoldsworth.hwk2.parser.HwKLexer
import me.jackgoldsworth.hwk2.parser.HwKParser
import org.antlr.v4.runtime.ANTLRFileStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import java.util.*

class SyntaxTreeTraverser {

    /**
     * This parses a file and gets the instructions from it.
     */
    fun getInstructionsFromFile(path: String): Queue<Instruction> {
        val stream: CharStream = ANTLRFileStream(path)
        val lexer = HwKLexer(stream)
        val tokenStream = CommonTokenStream(lexer)
        val parser = HwKParser(tokenStream)
        val listener = HwKTreeWalkListener()
        parser.addParseListener(listener)
        parser.compilationUnit()
        return listener.instructions
    }
}