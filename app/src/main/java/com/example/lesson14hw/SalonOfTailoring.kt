package com.example.lesson14hw

open class SalonOfTailoring(
    name: String,
    minServicePrice: Double,
    maxServicePrice: Double,
    var individualDesign: Boolean
) : Salon(name, minServicePrice, maxServicePrice) {
//    override fun info(): String {
//        return super.info() + "\nСоздание индивидуального дизайна - ${booleanInString(individualDesign)}"
//    }
}