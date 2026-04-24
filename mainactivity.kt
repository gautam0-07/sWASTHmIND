package com.example.swasthmind

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMood = findViewById<Button>(R.id.btnMood)
        val btnChatbot = findViewById<Button>(R.id.btnChatbot)

        btnMood.setOnClickListener {
            startActivity(Intent(this, MoodActivity::class.java))
        }

        btnChatbot.setOnClickListener {
            // later
        }
    }
}
