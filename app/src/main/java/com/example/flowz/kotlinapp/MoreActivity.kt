package com.example.flowz.kotlinapp

import com.example.flowz.kotlinapp.R



import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.MenuItem
import android.widget.Button
import android.widget.PopupMenu

class MoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more)

        val bckgrd = findViewById<ConstraintLayout>(R.id.background)

        val btn = findViewById<Button>(R.id.d_button)

        btn.setOnClickListener {

            val popMenu =  PopupMenu(this, btn)

            popMenu.menuInflater.inflate(R.menu.pop_menu, popMenu.menu)

            popMenu.setOnMenuItemClickListener(object : PopupMenu.OnMenuItemClickListener{
                override fun onMenuItemClick(item: MenuItem?): Boolean {

                    when(item!!.itemId){
                        R.id.green -> bckgrd.setBackgroundColor(Color.parseColor("#00FF00"))
                        R.id.red -> bckgrd.setBackgroundColor(Color.parseColor("#FF0000"))
                        R.id.blue -> bckgrd.setBackgroundColor(Color.parseColor("#0000FF"))
                    }
                    return true
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }
            })
            popMenu.show()

        }
    }
}
