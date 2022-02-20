package com.example.missingpeople

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

    class loginActivity : AppCompatActivity() {
        lateinit var create: TextView
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_login)
            create = findViewById(R.id.create)
            create.setOnClickListener {
                val intent = Intent(this, sign_up::class.java)
                startActivity(intent)
                finish()
            }
        } }
