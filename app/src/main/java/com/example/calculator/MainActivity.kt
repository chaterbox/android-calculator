package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //text view
        val textView: TextView = findViewById(R.id.textView)
        //button var
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val buttonPlus: Button = findViewById(R.id.buttonPlus)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val buttonMinus: Button = findViewById(R.id.buttonMinus)
        //click functions
        button1.setOnClickListener{ textView.text = "1" }

        button2.setOnClickListener { textView.text = "2" }

        button3.setOnClickListener { textView.text = "3" }

        buttonPlus.setOnClickListener { textView.text = "+" }

        button4.setOnClickListener { textView.text = "4" }

        button5.setOnClickListener { textView.text = "5" }

        button6.setOnClickListener { textView.text = "6" }

        buttonMinus.setOnClickListener { textView.text = "-" }
    }

}
