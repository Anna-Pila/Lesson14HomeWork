package com.example.lesson14hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Task2 : AppCompatActivity() {
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task2)
        textView = findViewById(R.id.textView)
        textView.text = myFun()
    }

    data class MyDataClass(
        val number1: Int,
        val number2: Int,
        val myString1: String,
        val myString2: String,
        val myBoolean: Boolean,
        val myDouble: Double
    )

    private fun myFun(): String {
        val myDataClass = MyDataClass((0..100).random(), (5..10).random(), "Моя первая строка", "Моя вторая строка",true, 2.5)
        val n1 = myDataClass.number1
        val n2 = myDataClass.number2
        return "Мое первое число - $n1 \nМое второе число - $n2 \n${myDataClass.myString1} \n${myDataClass.myString2} \nМоя логическая переменная - ${myDataClass.myBoolean} \nМое дробное число - ${myDataClass.myDouble}"
    }
}