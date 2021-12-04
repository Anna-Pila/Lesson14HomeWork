package com.example.lesson14hw

class BeautySalon(
    name: String,
    minServicePrice: Double,
    maxServicePrice: Double,
    var type: TypeOfBeauty,
) : Salon(name, minServicePrice, maxServicePrice) {
//    override fun info(): String {
//        return super.info() + "\nПредоставляемые услуги - ${type.nType}"
//    }
}