package com.example.lesson14hw

open class CarSalon(
    var type: TypeOfCarSalon,
    name: String,
    minServicePrice: Double,
    maxServicePrice: Double,
    var maintenance: Boolean,
    var vehicleTesting: Boolean
) : Salon(name, minServicePrice, maxServicePrice) {
//    override fun info(): String {
//        return "${type.nType} \n" + super.info() + "\nНаличие услуги технического обслуживания - ${
//            booleanInString(
//                maintenance
//            )
//        } " +
//                "\nТестдрайв автомобиля - ${booleanInString(vehicleTesting)}"
//    }
}