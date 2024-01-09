package com.mbialowas.widgetsdemo

import android.content.Intent
import android.graphics.Color
import android.net.Uri
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


        val et_input : EditText = findViewById(R.id.et_input)
        var input:String? = null


        // register button
        val btn : Button = findViewById(R.id.btnInput)
        btn.setOnClickListener(){
            // get input from edit Text
            input = et_input.text.toString()

            //Toast.makeText(this,"Hello class, the button was click",Toast.LENGTH_LONG).show()
            //pass the value here
            Toast.makeText(this,"The message was ${et_input.text}",Toast.LENGTH_LONG).show()
        }

        // 1. Intent - redirecting the user to another screen
        val btnResult:Button = findViewById(R.id.btnGoToNextScreen)

        btnResult.setOnClickListener(){
            // intent - goto Next screen
            var intent:Intent = Intent(this,ResultActivity::class.java)
            //startActivity(intent)

            // what about passing parameters(data) to second screen
            intent.putExtra("name",input)
            startActivity(intent)
        }

        // 2. Intent - redirect the user to another app e.g. the web browser to visit a web page
        val btnCNN: Button = findViewById(R.id.btnCNN)

        btnCNN.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://cnn.com"))
            startActivity(intent)
        }


    }
}