package com.example.lesson14hw

 abstract class Salon(
    var name: String,
    var minServicePrice: Double,
    var maxServicePrice: Double
) {
     //оставила для себя
//    open fun info(): String =
//        "Название салона - \"$name\" \nЦеновой диапазон - $minServicePrice - $maxServicePrice BYN "
}