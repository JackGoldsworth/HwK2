package me.jackgoldsworth.hwk2.domain

import me.jackgoldsworth.hwk2.parser.HwKParser

enum class Type(val descriptor: String) {
    INT("I"),
    STRING("Ljava/lang/String;"),
    VOID("");

    companion object {
        fun getTypeFromName(context: HwKParser.TypeContext?): Type {
            if (context == null) return VOID
            val typeName = context.text
            if (typeName == "java/lang/String") return STRING
            return Type.valueOf(typeName)
        }

        fun getTypeFromValue(value: String): Type {
            if (value.isEmpty()) return VOID
            return if (value.toIntOrNull() === null) STRING else INT
        }
    }
}