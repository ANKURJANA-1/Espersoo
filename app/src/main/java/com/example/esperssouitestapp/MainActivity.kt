package com.example.esperssouitestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val etInput: EditText by lazy { findViewById<EditText>(R.id.etInput) }
         val btClick: Button by lazy { findViewById<Button>(R.id.btClick) }
         val tvDisplay: TextView by lazy { findViewById<TextView>(R.id.tvDisplay) }
         //val etInput: EditText by lazy { findViewById<EditText>(R.id.etInput) }
         val etEmail: EditText by lazy { findViewById<EditText>(R.id.etEmail) }
         val etPassword: EditText by lazy { findViewById<EditText>(R.id.etPassword) }
         //val btClick: Button by lazy { findViewById<Button>(R.id.btClick) }
         //val tvDisplay: TextView by lazy { findViewById<TextView>(R.id.tvDisplay) }



        btClick.setOnClickListener(View.OnClickListener {
            var inputName:String=etInput.text.toString()
            var inputPassword:String=etEmail.text.toString()
            var inputEmail:String=etPassword.text.toString()
            tvDisplay.text=(inputName+inputEmail+inputPassword)
            startActivity(Intent(applicationContext,MainActivity2::class.java))
        })


    }
}