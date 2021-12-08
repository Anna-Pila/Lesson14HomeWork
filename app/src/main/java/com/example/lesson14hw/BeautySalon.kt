package com.example.lesson14hw

class BeautySalon(
    name: String,
    city: City,
    minServicePrice: Double,
    maxServicePrice: Double,
    var type: TypeOfBeauty,
) : Salon(name, city, minServicePrice, maxServicePrice) {
//    override fun info(): String {
//        return super.info() + "\nПредоставляемые услуги - ${type.nType}"
//    }
}