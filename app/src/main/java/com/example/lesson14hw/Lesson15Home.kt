package com.example.lesson14hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Lesson15Home : AppCompatActivity() {
    private lateinit var generateTV: TextView
    private lateinit var outputTV: TextView
    private lateinit var addButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson15_home)
        addButton = findViewById(R.id.add_button)
        generateTV = findViewById(R.id.textView)
        outputTV = findViewById(R.id.textView2)
        var n: Int = 0
        var j: Int = 0
        var str: String? = "Салоны Минска \n"
        outputTV.text = str
        if (Singleton.listSalonSingleton.size > 0) {
            for (i in 0 until Singleton.listSalonSingleton.size) {
                val mySingletonElement = Singleton.printVarName(i)
                outputTV.append(information(mySingletonElement))
            }
        }

        val mySalonW = WeddingSalon(
            "Салон Одежды", City.MINSK, 10.5, 1120.5,
            individualDesign = true,
            saleOfAccessories = false,
            saleOfDecorations = false
        )
        val mySalonB = BeautySalon("Салон Бьюти", City.BREST, 10.5, 1120.5, TypeOfBeauty.MAKEUP)
        val mySalonBSh = BeautySalon("БарберШоп", City.MINSK, 10.5, 1120.5, TypeOfBeauty.BEARD_CUT)
        val mySalonC = CarSalon(
            TypeOfCarSalon.DOMESTIC,
            "Хёндай",
            City.MOGILEV,
            152.0,
            4523697.2,
            maintenance = true,
            vehicleTesting = false
        )

        val salonsMinsk = SalonMinsk<Salon>()
        salonsMinsk.addSalonMinsk(mySalonW)
        salonsMinsk.addSalonMinsk(mySalonB)
        salonsMinsk.addSalonMinsk(mySalonBSh)
        salonsMinsk.addSalonMinsk(mySalonC)


        addButton.setOnClickListener {
            n = (salonsMinsk.listSalonMinsk.indices).random()
            generateTV.text = information(salonsMinsk.listSalonMinsk[n])
            salonsMinsk.addSalonMinskInSingleton(salonsMinsk.listSalonMinsk[n])
            outputTV.text = Singleton.listSalonSingleton.size.toString()
            if (Singleton.listSalonSingleton.size > j) {
                val mySingletonElement = Singleton.printVarName(j)
                str += information(mySingletonElement) + "\n"
                j++
            }
            outputTV.text = str
        }
    }
}