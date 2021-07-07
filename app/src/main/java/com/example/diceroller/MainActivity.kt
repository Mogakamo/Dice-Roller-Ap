package com.example.diceroller

<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

=======
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the results
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
>>>>>>> cdeb595f5ab26e83e823db66d6253bb2e68e7fc8
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

<<<<<<< HEAD
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll"

        rollButton.setOnClickListener{
            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        }
    }

=======
        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    /**
     * Roll the dice and update the screen with the result
     *
     */
    private fun rollDice() {
        //create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        //update the screen with the dice roll
        val diceImage: ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_2)
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
>>>>>>> cdeb595f5ab26e83e823db66d6253bb2e68e7fc8
}