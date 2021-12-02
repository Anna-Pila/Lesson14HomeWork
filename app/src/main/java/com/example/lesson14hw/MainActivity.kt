package com.example.lesson14hw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun task1(view: View) {
        startActivity(Intent(this, Task1::class.java))
    }

    fun task2(view: View) {
        startActivity(Intent(this, Task2::class.java))
    }

    fun task345(view: View) {
        startActivity(Intent(this, Task345::class.java))
    }

    fun task6(view: View) {
        startActivity(Intent(this, Task6::class.java))
    }

    fun task7(view: View) {
        startActivity(Intent(this, Task7::class.java))
    }
}