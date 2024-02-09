package com.nash.warioone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var playing = "true"
    lateinit var spamButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
                //THREE SECONDS OR YOU LOSE
                var num = 0
        spamButton = findViewById(R.id.spamButton)
        spamButton.setOnClickListener {
            if (playing == "true") {
                num++
                when(num){
                    0 -> spamButton.setText("SPAM!")
                    1 -> spamButton.setText("STAN!")
                    2 -> spamButton.setText("5P4M!")
                    3 -> spamButton.setText("#%@&!")
                    4 -> spamButton.setText("666")
                    5 -> spamButton.setText("9+10!")
                    6 -> spamButton.setText("♝♔♕♝")
                    7 -> spamButton.setText("SPAM!")
                    8 -> spamButton.setText("|   ")
                    9 -> spamButton.setText(" |  ")
                    10 -> spamButton.setText("  | ")
                    11 -> spamButton.setText("   |")
                    12 -> spamButton.setText("|||||")

                    13 -> {
                        spamButton.setText("GG!")
                        playing = "won"
                        Toast.makeText(this, "yo win", Toast.LENGTH_LONG)
                            .show()
                    }
                    else -> {
                        playing = "won"
                    }
                }
            }
        }
    }
}