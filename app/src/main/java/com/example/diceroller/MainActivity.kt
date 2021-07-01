package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.button)

        rollButton.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        TODO("Not yet implemented")
    }
}

class Dice (private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}