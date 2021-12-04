package com.example.lesson14hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Lesson15Home : AppCompatActivity() {
    private lateinit var generateTV: TextView
    private lateinit var outputTV: TextView
    private lateinit var generateButton: Button
    private lateinit var addButton: Button
    private lateinit var outButton: Button
    private lateinit var previousButton: Button
    private lateinit var nextButton: Button
    private lateinit var deleteButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson15_home)
        generateButton = findViewById(R.id.generate_button)
        addButton = findViewById(R.id.add_button)
        outButton = findViewById(R.id.out_button)
        previousButton = findViewById(R.id.previous_button)
        nextButton = findViewById(R.id.next_button)
        deleteButton = findViewById(R.id.delete_button)
        generateTV = findViewById(R.id.textView)
        outputTV = findViewById(R.id.textView2)
        var n: Int = 0
        var i: Int = 0
        val mySalonW = WeddingSalon(
            "Салон Одежды", 10.5, 1120.5,
            individualDesign = true,
            saleOfAccessories = false,
            saleOfDecorations = false
        )
        val mySalonB = BeautySalon("Салон Бьюти", 10.5, 1120.5, TypeOfBeauty.MAKEUP)
        val mySalonC = CarSalon(
            TypeOfCarSalon.DOMESTIC,
            "Хёндай",
            152.0,
            4523697.2,
            maintenance = true,
            vehicleTesting = false
        )
        val listSalon = listOf<Salon>(mySalonW, mySalonB, mySalonC)
        generateButton.setOnClickListener {
            n = (listSalon.indices).random()
            generateTV.text = information(listSalon[n])
        }
        addButton.setOnClickListener {
            Singleton.variableName = listSalon[n]
            Singleton.addVarName()
        }

        outButton.setOnClickListener {
            if (Singleton.list.size == 0) {
                outputTV.text = "Лист пустой"
            } else {
                i = 0
                val mySingletonElement = Singleton.printVarName(i)
                outputTV.text = information(mySingletonElement)
            }
        }

        nextButton.setOnClickListener {
            i++
            if (!previousButton.isClickable) {
                previousButton.isClickable = true
                deleteButton.isClickable = true
            }
            if (i == Singleton.list.size) {
                outputTV.text = "Конец"
                nextButton.isClickable = false
                deleteButton.isClickable = false
            } else {
                val mySingletonElement = Singleton.printVarName(i)
                outputTV.text = information(mySingletonElement)
            }
        }

        previousButton.setOnClickListener {
            i--
            if (!nextButton.isClickable) {
                nextButton.isClickable = true
                deleteButton.isClickable = true
            }
            if (i < 0) {
                outputTV.text = "Начало"
                previousButton.isClickable = false
                deleteButton.isClickable = false
            } else {
                val mySingletonElement = Singleton.printVarName(i)
                outputTV.text = information(mySingletonElement)
            }
        }

        deleteButton.setOnClickListener {
            Singleton.list.removeAt(i)
            i--
            if (i < 0) {
                outputTV.text = "Начало"
                previousButton.isClickable = false
                deleteButton.isClickable = false
            } else{
                val mySingletonElement = Singleton.printVarName(i)
                outputTV.text = information(mySingletonElement)
            }
        }
    }
}