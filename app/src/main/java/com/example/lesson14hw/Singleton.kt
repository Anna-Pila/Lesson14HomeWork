package com.example.lesson14hw

object Singleton {
    init {
        println("Singleton class invoked.")
    }

    lateinit var variableName: Salon
    val listSalonSingleton: MutableList<Salon> = mutableListOf()

    fun addVarName() {
        listSalonSingleton.add(variableName)
    }

    fun printVarName(i:Int): Salon {
        return listSalonSingleton[i]
    }
}