package me.jackgoldsworth.hwk2.domain.scope

import me.jackgoldsworth.hwk2.codegen.ImportGenerator

class Import(val fileLoc: String) {

    fun accept(generator: ImportGenerator) {
        generator.generate(this)
    }
}