package com.example.flowz.kotlinapp


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextClock
import android.widget.TimePicker
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tClock = findViewById<TextClock>(R.id.textClock)

        val timePicker = findViewById<TimePicker>(R.id.timePicker)

        tClock.setOnClickListener {
            Toast.makeText(this, "This is a TextClock", Toast.LENGTH_SHORT).show()
        }

        timePicker.setOnTimeChangedListener { view, hourOfDay, minute ->
            Toast.makeText(this, "Time $hourOfDay:$minute", Toast.LENGTH_SHORT).show()
        }


         myButton.setOnClickListener{
             intent = Intent( this, WelcomeActivity::class.java)
        startActivity(intent)
    }

        button_two.setOnClickListener{
           val myIntent = Intent( this, MoreActivity::class.java)
            startActivity(myIntent)
        }

    }
}
