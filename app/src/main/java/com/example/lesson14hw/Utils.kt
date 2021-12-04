package com.example.lesson14hw

fun booleanInString(myBoolean: Boolean): String {
    return if (myBoolean) {
        "Да"
    } else {
        "Нет"
    }
}

fun stringInBoolean(myString: String): Boolean {
    return myString == "Да"
}

fun (CarSalon).infoU(): String {
    return "Название салона - \"$name\" \nЦеновой диапазон - $minServicePrice - $maxServicePrice BYN \n" +
            "Тестдрайв автомобиля - ${booleanInString(vehicleTesting)}"
}

fun (SalonOfTailoring).infoU(): String {
    return "Название салона - \"$name\" \nЦеновой диапазон - $minServicePrice - $maxServicePrice BYN \n" +
            "Создание индивидуального дизайна - ${booleanInString(individualDesign)}"
}

fun (BeautySalon).infoU(): String {
    return "Название салона - \"$name\" \nЦеновой диапазон - $minServicePrice - $maxServicePrice BYN \n" +
            "Предоставляемые услуги - ${type.nType}"
}

fun (WeddingSalon).infoU(): String {
    return "Название салона - \"$name\" \nЦеновой диапазон - $minServicePrice - $maxServicePrice BYN \n" +
            "Создание индивидуального дизайна - ${booleanInString(individualDesign)}\n" +
            "Продажа украшений - ${booleanInString(saleOfAccessories)} \n" +
            "Продажа декораций - ${
                booleanInString(
                    saleOfDecorations
                )
            }"
}

fun (SpecialClothesSalon).infoU(): String {
    return "Название салона - \"$name\" \nЦеновой диапазон - $minServicePrice - $maxServicePrice BYN \n" +
            "Создание индивидуального дизайна - ${booleanInString(individualDesign)}\n" +
            "Тип - ${type.nType}"
}

fun (Any).information(something:Salon):String {
    if(something is CarSalon){
        return  something.infoU()
    }
    if(something is SalonOfTailoring){
        return something.infoU()
    }
    if(something is BeautySalon){
        return something.infoU()
    }
    if(something is WeddingSalon){
        return something.infoU()
    }
    if(something is SpecialClothesSalon){
        return something.infoU()
    }
    return "что-то не так"
}
