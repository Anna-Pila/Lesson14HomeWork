package com.example.lesson14hw

class SalonMinsk<T : Salon> : AddSalonInMinsk {

    var listSalonMinsk: MutableList<T> = mutableListOf()

    fun addSalonMinsk(salon: T) {
        listSalonMinsk.add(salon)
    }

    override fun addSalonMinskInSingleton(salon: Salon) {
        if (salon.city == City.MINSK) {
            Singleton.variableName = salon
            Singleton.addVarName()
        }
    }
}