package com.example.layout

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bmicalculatoractivity : AppCompatActivity() {
    lateinit var btnsendmoney: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmicalculatoractivity)
        btnsendmoney= findViewById(R.id.btnsendmoney)
        btnsendmoney.setOnClickListener {
       val intent=Intent(this,SendMoneyActivity::class.java)
            startActivity(intent)
        }
    }
}