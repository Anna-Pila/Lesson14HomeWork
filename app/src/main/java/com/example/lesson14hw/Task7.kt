package com.example.lesson14hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Task7 : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task7)
        textView = findViewById(R.id.textView)
    }

    fun create(view: View) {
        val myDataClassEx = Task345.MyDataClass(
            (5..10).random(),
            (20..45).random(),
            (5..50).random(),
            (70..98).random()
        )
        textView = findViewById(R.id.textView)
        textView.text = myDataClassEx.myFun()
    }
}