package me.jackgoldsworth.hwk2.domain.scope

import me.jackgoldsworth.hwk2.bytecode.ImportGenerator

class Import(val fileLoc: String) {

    fun accept(generator: ImportGenerator) {
        generator.generate(this)
    }
}