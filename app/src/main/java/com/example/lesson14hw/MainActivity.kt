package com.example.lesson14hw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var task: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        task = findViewById(R.id.task)
        task.setOnClickListener{
            startActivity(Intent(this, Lesson15Home::class.java))
        }
    }
}