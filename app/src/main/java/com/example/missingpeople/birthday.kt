package com.example.missingpeople

import android.app.DatePickerDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.util.*

class birthday : AppCompatActivity() {
    lateinit var next: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday)

        next=findViewById(R.id.next)
        next.setOnClickListener {
            val Intent= Intent(this,gender::class.java)
            startActivity(Intent)
            finish()
        }

       }
}


