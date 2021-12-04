package com.example.lesson14hw

class SpecialClothesSalon (
    name: String,
    minServicePrice: Double,
    maxServicePrice: Double,
    individualDesign: Boolean,
    var type: TypeSpecialClothes
) : SalonOfTailoring(
    name,
    minServicePrice,
    maxServicePrice,
    individualDesign
){
//    override fun info(): String {
//        return super.info() + "Тип - ${type.nType}"
//    }
}