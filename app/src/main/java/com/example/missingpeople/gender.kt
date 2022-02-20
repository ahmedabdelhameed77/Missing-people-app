package com.example.missingpeople

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class gender : AppCompatActivity() {
    lateinit var next: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gender)
        next = findViewById(R.id.next)
        next.setOnClickListener {
            val Intent = Intent(this, mobile_phone::class.java)
            startActivity(Intent)
            finish()
        }
    }
}