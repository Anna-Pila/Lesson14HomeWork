package com.example.lesson14hw

object Singleton {
    init {
        println("Singleton class invoked.")
    }

    lateinit var variableName: Salon
    val list: MutableList<Salon> = mutableListOf()

    fun addVarName() {
        list.add(variableName)
    }

    fun printVarName(i:Int): Salon {
        return list[i]
    }
}