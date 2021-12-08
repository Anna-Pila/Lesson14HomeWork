package com.example.lesson14hw

abstract class Salon(
     private var name: String,
     var city: City,
     var minServicePrice: Double,
     var maxServicePrice: Double
) {
     open fun getName(): String? {
          return "\"" + name + "\""
     }
     open fun setName(name: String?) {
          this.name = name!!
     }
    //оставила для себя
//    open fun info(): String =
//        "Название салона - \"$name\" \nЦеновой диапазон - $minServicePrice - $maxServicePrice BYN "
}