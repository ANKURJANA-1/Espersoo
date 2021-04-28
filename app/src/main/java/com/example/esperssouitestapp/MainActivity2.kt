package com.example.esperssouitestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tvDisplay1: TextView by lazy { findViewById<TextView>(R.id.tvDisplay1) }


        tvDisplay1.text="aaa"

    }
}