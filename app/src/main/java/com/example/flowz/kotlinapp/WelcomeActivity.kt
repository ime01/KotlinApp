package com.example.flowz.kotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ListView
import android.widget.Toast

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        val listView = findViewById<GridView>(R.id.my_list)

        val myArray = arrayOf("CANADA", "AMERICA", "NORWAY", "SPAIN", "GERMANY", "ENGLAND", "SWEEDEN", "ITALY", "FRANCE", "PERU","DENMARK","IRELAND", "ICELAND", "RUSSIA", "FINLAND", "SCOTLAND")

        val myAdapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, myArray)

        listView.adapter = myAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Item Clicked:- $id", Toast.LENGTH_LONG).show()
        }


    }

    }