package com.example.dicerolled

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceButton: Button = findViewById(R.id.button)
        diceButton.setOnClickListener { rollDice() }


    }

        private fun rollDice(){
            val myFirstDice = Dice(6)
            val diceRoll = myFirstDice.roll()
            val imageView : ImageView = findViewById(R.id.imageView)
            imageView.setImageResource(R.drawable.dice_2)
            when(diceRoll){
                1 -> imageView.setImageResource(R.drawable.dice_1)
                2 -> imageView.setImageResource(R.drawable.dice_2)
                3 -> imageView.setImageResource(R.drawable.dice_3)
                4 -> imageView.setImageResource(R.drawable.dice_4)
                5 -> imageView.setImageResource(R.drawable.dice_5)
                6 -> imageView.setImageResource(R.drawable.dice_6)
            }

        }

    class Dice(val numSides: Int){

        fun roll(): Int {
         return (1..numSides).random()
        }
    }
}