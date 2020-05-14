package me.jackgoldsworth.hwk2.ast.function.scope

import me.jackgoldsworth.hwk2.backend.ImportGenerator

class Import(val fileLoc: String) {

    fun accept(generator: ImportGenerator) {
        generator.generate(this)
    }
}