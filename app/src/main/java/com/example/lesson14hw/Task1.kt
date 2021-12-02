package com.example.lesson14hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Task1 : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task1)
        val arr = IntArray(20)
        arr[0] = 0
        arr[1] = 1
        for (i in 2 until arr.size) {
            arr[i] = arr[i - 1] + arr[i - 2]
        }
        textView = findViewById(R.id.textView)
        textView.text = arr[0].toString()
        for (i in 1 until arr.size) {
            textView.append("\n" + arr[i].toString())
        }
    }
}