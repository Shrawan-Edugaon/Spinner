package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spin = findViewById<Spinner>(R.id.spinId) as Spinner

        val fruits = arrayOf("Apple","Orange","Lime","Grapes","Strawberry","Kiwi","Mango")
        val ArrayAdp = ArrayAdapter(this@MainActivity,android.R.layout.simple_spinner_dropdown_item,fruits)
        spin.adapter = ArrayAdp
    }
}