package com.example.swasthmind

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SuggestionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suggestion)

        val tvMood = findViewById<TextView>(R.id.tvMood)
        val tvSuggestion = findViewById<TextView>(R.id.tvSuggestion)

        val mood = intent.getStringExtra("selectedMood")

        tvMood.text = "Mood Selected: $mood"

        val suggestion = when (mood) {
            "Happy" -> "Keep spreading positivity 🌟"
            "Sad" -> "Try listening to calming music 💛"
            "Neutral" -> "Do something creative today 🎨"
            "Stressed" -> "Take deep breaths and go for a walk 🌿"
            else -> "Take care of yourself ❤️"
        }

        tvSuggestion.text = suggestion
    }
}
