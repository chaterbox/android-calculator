package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //android var
        //text view
        val textView: TextView = findViewById(R.id.textView)
        //button var
        val buttonClear: Button = findViewById(R.id.buttonC)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val buttonPlus: Button = findViewById(R.id.buttonPlus)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val buttonMinus: Button = findViewById(R.id.buttonMinus)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val buttonMulti: Button = findViewById(R.id.buttonMulti)
        val button0: Button = findViewById(R.id.button0)
        val buttonDot: Button = findViewById(R.id.buttonDot)
        val buttonEqual: Button = findViewById(R.id.buttonEqual)
        val buttonDevide: Button = findViewById(R.id.buttonDevide)
        //kotlin var
        //strings
        var num1String = ""
        var num2String = ""
        var op = ' '
        //float
        var answer = 0.0F
        //click functions
        buttonClear.setOnClickListener {
            num1String = ""
            num2String = ""
            textView.text = "0"
        }

        button1.setOnClickListener{
            num1String += "1"
            textView.text = num1String
        }

        button2.setOnClickListener {
            num1String += "2"
            textView.text = num1String
        }

        button3.setOnClickListener {
            num1String += "3"
            textView.text = num1String
        }

        buttonPlus.setOnClickListener {
            num2String = num1String
            num1String = ""
            op = '+'
            textView.text = "+" }

        button4.setOnClickListener {
            num1String += "4"
            textView.text = num1String }

        button5.setOnClickListener {
            num1String += "5"
            textView.text = num1String }

        button6.setOnClickListener {
            num1String += "6"
            textView.text = num1String }

        buttonMinus.setOnClickListener {
            num2String = num1String
            num1String = ""
            op = '-'
            textView.text = "-" }

        button7.setOnClickListener {
            num1String += "7"
            textView.text = num1String
        }

        button8.setOnClickListener {
            num1String += "8"
            textView.text = num1String
        }

        button9.setOnClickListener {
            num1String += "9"
            textView.text = num1String
        }

        buttonMulti.setOnClickListener {
            num2String = num1String
            num1String = ""
            op = '*'
            textView.text = "*"
        }

        button0.setOnClickListener {
            num1String += "0"
            textView.text = num1String
        }

        buttonDot.setOnClickListener {
            num1String += "."
            textView.text = num1String
        }

        buttonEqual.setOnClickListener {
            when(op)
            {
                '+' -> answer = num1String.toFloat() + num2String.toFloat()
                '-' -> answer = num2String.toFloat() - num1String.toFloat()
                '*' -> answer = num1String.toFloat() * num2String.toFloat()
                '/' -> answer = num2String.toFloat() / num1String.toFloat()
            }
            textView.text = answer.toString()
            num1String = answer.toString()
        }

        buttonDevide.setOnClickListener {
            num2String = num1String
            num1String = ""
            op = '/'
            textView.text = "/"
        }
    }
}