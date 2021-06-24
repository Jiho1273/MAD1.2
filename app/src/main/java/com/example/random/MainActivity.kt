package com.example.random

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll : Button = findViewById(R.id.btnRoll)

        btnRoll.setOnClickListener(){
            val randomInt = (1..6).random()

            val lblResult : TextView = findViewById(R.id.lblResult)
            lblResult.text = randomInt.toString()
        }
    }
}