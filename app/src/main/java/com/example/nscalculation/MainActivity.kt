package com.example.nscalculation

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val numText = findViewById<EditText>(R.id.editTextNumber)
        val resultText = findViewById<TextView>(R.id.textView)
        val options = arrayOf("2", "8", "16")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
        spinner.adapter = adapter
        numText.doAfterTextChanged {
            var selected = spinner.selectedItem.toString()
            if(selected=="2"){
                val numtxt = numText.text.toString().toInt()
                resultText.text = Integer.toBinaryString(numtxt)
            }
            if(selected=="8"){
                val numtxt = numText.text.toString().toInt()
                resultText.text = Integer.toOctalString(numtxt)
            }
            if(selected=="16"){
                val numtxt = numText.text.toString().toInt()
                resultText.text = Integer.toHexString(numtxt)
            }
        }

    }
}