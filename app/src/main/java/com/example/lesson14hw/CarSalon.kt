package com.example.lesson14hw

open class CarSalon(
    var type: TypeOfCarSalon,
    name: String,
    city: City,
    minServicePrice: Double,
    maxServicePrice: Double,
    var maintenance: Boolean,
    var vehicleTesting: Boolean
) : Salon(name, city, minServicePrice, maxServicePrice) {
//    override fun info(): String {
//        return "${type.nType} \n" + super.info() + "\nНаличие услуги технического обслуживания - ${
//            booleanInString(
//                maintenance
//            )
//        } " +
//                "\nТестдрайв автомобиля - ${booleanInString(vehicleTesting)}"
//    }
}