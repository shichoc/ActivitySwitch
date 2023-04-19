package com.example.activityswitch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var button = findViewById<Button>(R.id.button2)
        button.setOnClickListener({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })    }
}