package com.example.flowz.kotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.widget.*
import kotlinx.android.synthetic.main.activity_more.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        val listView = findViewById<GridView>(R.id.my_list)

        val myArray = arrayOf("CANADA", "AMERICA", "NORWAY", "SPAIN", "GERMANY", "ENGLAND", "SWEEDEN", "ITALY", "FRANCE", "PERU", "DENMARK", "IRELAND", "ICELAND", "RUSSIA", "FINLAND", "SCOTLAND")

        val myAdapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, myArray)

        listView.adapter = myAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Item Clicked:- $id", Toast.LENGTH_LONG).show()
        }

        val marquee = findViewById<TextView>(R.id.hello)
        val button3 = findViewById<Button>(R.id.button)

        button3.setOnClickListener {
            marquee.text = " Hello world, this is a text Marquee trial, therefore this is a very long sentence on one line, showing what a text marquee does..."
            marquee.setSingleLine()
            marquee.ellipsize = TextUtils.TruncateAt.MARQUEE
            marquee.marqueeRepeatLimit = -1
            marquee.isSelected = true


        }
    }

    }