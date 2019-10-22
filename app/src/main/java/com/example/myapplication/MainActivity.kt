package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_img)

        val rollButton: Button = findViewById(R.id.button2);
        rollButton.setOnClickListener { rollDice() }
        }

    private fun rollDice(){
        val randomInt = Random().nextInt( 6 ) + 1

        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

 /*     val randomInt2 = Random().nextInt( 6 ) + 1
        val resultText2: TextView = findViewById(R.id.tv_number2)
        resultText2.text = randomInt2.toString()

        val randomInt3 = Random().nextInt( 6 ) + 1
        val resultText3: TextView = findViewById(R.id.tv_number3)
        resultText3.text = randomInt3.toString() */
    }

}
