package com.example.missingpeople

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class mobile_phone : AppCompatActivity() {
    lateinit var next: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobile_phone)
        next = findViewById(R.id.next)
        next.setOnClickListener {
            val Intent = Intent(this, choossepassword::class.java)
            startActivity(Intent)
            finish()
        }
    }
}