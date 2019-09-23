package com.example.logica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.logica3.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var correctAnswers: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSubmit.setOnClickListener { checkAnswers() }
    }

    private fun checkAnswers() {
        checkAnswer(tvA1, tvB1, tvInputAB1)
        checkAnswer(tvA2, tvB2, tvInputAB2)
        checkAnswer(tvA3, tvB3, tvInputAB3)
        checkAnswer(tvA4, tvB4, tvInputAB4)

        Toast.makeText(this, "$correctAnswers/4 correct", Toast.LENGTH_SHORT).show()
        correctAnswers = 0
    }

    private fun checkAnswer(input1: TextView, input2: TextView, givenAnswer: EditText) {
        val correctAnswer: Boolean = input1.text.toString() == "T" && input2.text.toString() == "T"
        if (correctAnswer == (givenAnswer.text.toString().toUpperCase() == "T")) correctAnswers++
    }

}
