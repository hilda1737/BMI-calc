package com.example.layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
        lateinit var btnBmI :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBmI=findViewById(R.id.btnBMI)
        btnBmI.setOnClickListener {
            val intent=Intent(this,bmicalculatoractivity::class.java)
            startActivity(intent)


            }

        }


}