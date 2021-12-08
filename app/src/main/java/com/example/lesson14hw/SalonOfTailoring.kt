package com.example.lesson14hw

open class SalonOfTailoring(
    name: String,
    city: City,
    minServicePrice: Double,
    maxServicePrice: Double,
    var individualDesign: Boolean
) : Salon(name, city, minServicePrice, maxServicePrice) {
//    override fun info(): String {
//        return super.info() + "\nСоздание индивидуального дизайна - ${booleanInString(individualDesign)}"
//    }
}