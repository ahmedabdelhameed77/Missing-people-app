package com.example.missingpeople

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class sign_up : AppCompatActivity() {
    lateinit var next: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        next=findViewById(R.id.next)
        next.setOnClickListener {
            val Intent=Intent(this,birthday::class.java)
            startActivity(Intent)
            finish()
        }
    }
}