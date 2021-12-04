package com.example.lesson14hw

class WeddingSalon(
    name: String,
    minServicePrice: Double,
    maxServicePrice: Double,
    individualDesign: Boolean,
    var saleOfAccessories: Boolean,
    var saleOfDecorations: Boolean
) : SalonOfTailoring(
    name,
    minServicePrice,
    maxServicePrice,
    individualDesign
) {
//    override fun info(): String {
//        return super.info() + "\nПродажа украшений - ${booleanInString(saleOfAccessories)} \nПродажа декораций - ${
//            booleanInString(
//                saleOfDecorations
//            )
//        }"
//    }
}