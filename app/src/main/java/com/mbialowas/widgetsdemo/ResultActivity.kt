package com.mbialowas.widgetsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // receive data
        val bundle:Bundle? = intent.extras
        val name: Any? = bundle?.get("name")
        var tvREsult: TextView? = null

        tvREsult = findViewById<TextView>(R.id.tvResult)
        tvREsult.text = "Congratulations ${name.toString()}, you made it to your destination!"

        Toast.makeText(this,"Your name is: ${name.toString()}",Toast.LENGTH_LONG).show()
    }
}