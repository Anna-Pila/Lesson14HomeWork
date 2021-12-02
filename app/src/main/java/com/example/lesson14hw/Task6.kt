package com.example.lesson14hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Task6 : AppCompatActivity() {
    var count: Int = 0
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task6)
        textView = findViewById<TextView>(R.id.textView)

    }

    fun countClick(view: View) {
        count++
        textView.text = count.toString()
    }
}