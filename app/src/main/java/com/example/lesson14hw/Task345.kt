package com.example.lesson14hw

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Task345 : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var textView1: TextView
    private lateinit var textView2: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task345)
        val helpMyself = Hospital(
            "ПоМоГи СеБе СаМ",
            485,
            1545.25,
            smokingArea = true,
            guestRoom = false,
            15,
            97
        )
        val myDataClassEx = MyDataClass( (5..10).random(),(5..10).random(),(5..10).random(),(5..10).random())
        val sumU = Util(myDataClassEx)
        textView = findViewById(R.id.textView)
        textView.text = helpMyself.info()
        textView1 = findViewById(R.id.textView1)
        textView1.text = myDataClassEx.myFun()
        textView2 = findViewById(R.id.textView2)
        textView2.text = "Вызов метода из Util "+sumU.sum().toString()+" \nВызов метода из файла " + myDataClassEx.sum()

    }

    //сделала наследование обычных стандартных классов чтобы попробовать и чтобы было

    open class Building(
        private val name: String,
        private val countPremises: Int,
        private val square: Double,
        private val smokingArea: Boolean
    ) {
        open fun info(): String {
            return "Название - $name \nКоличество помещений - $countPremises \nОбщая площадь - $square мКв\nНаличие места для курения - $smokingArea"
        }
    }

    open class Hospital(
        name: String,
        countPremises: Int,
        square: Double,
        smokingArea: Boolean,
        val guestRoom: Boolean,
        private val countDoctor: Int,
        private val countNurses: Int
    ) :
        Building(name, countPremises, square, smokingArea) {
        override fun info(): String {
            return super.info() + "\n Наличие гостевой комнаты: $guestRoom \nКоличество врачей - $countDoctor \nКоличество мед.сестер - $countNurses"
        }
    }

    interface IDataCLass {
        val number1: Int
        val number2: Int
        val number3: Int
        val number4: Int
    }

    data class MyDataClass(
        override var number1: Int,
        override var number2: Int,
        override var number3: Int,
        override var number4: Int
    ) : IDataCLass {
        fun myFun():String {
            return "$number1, $number2, $number3, $number4"
        }
    }

    class Util(var num: MyDataClass) {
        fun sum(): Int {
            return (num.component1() +
                    num.component2() +
                    num.component3() +
                    num.component4())
        }
    }
}