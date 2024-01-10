package com.mbialowas.widgetsdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.doOnTextChanged

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv_input : TextView = findViewById(R.id.tvInput)
        tv_input.setBackgroundColor(Color.RED)
        tv_input.text = "Hello Class"
        // or setText
        tv_input.setText("Cheers")

        // register xml control with code
        val et_input : EditText = findViewById(R.id.et_input)

        // get input from edit Text
        val input = et_input.text

        // register button
        val btn : Button = findViewById(R.id.btnInput)
        btn.setOnClickListener(){
            //Toast.makeText(this,"Hello class, the button was click",Toast.LENGTH_LONG).show()
            //pass the value here
            Toast.makeText(this,"The message was ${input}",Toast.LENGTH_LONG).show()
        }

    }
}