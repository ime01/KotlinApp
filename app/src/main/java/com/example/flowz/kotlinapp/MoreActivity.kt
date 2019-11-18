package com.example.flowz.kotlinapp

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context

import android.graphics.Color
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.app.NotificationCompat
import android.view.MenuItem
import android.widget.Button
import android.widget.PopupMenu



class MoreActivity : AppCompatActivity() {

    var CHANNEL_ID_ANDROID = "myCHANNEL"
    var CHANNEL_NAME = "my_Android_Channel"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more)

        val bckgrd = findViewById<ConstraintLayout>(R.id.background)

        val btnnotify = findViewById<Button>(R.id.Notification)

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

        btnnotify.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){

                val imp = NotificationManager.IMPORTANCE_HIGH
                val mNotificationChannel = NotificationChannel(CHANNEL_ID_ANDROID, CHANNEL_NAME, imp)

                val notificationBuilder: Notification.Builder = Notification.Builder(this, CHANNEL_ID_ANDROID )
                        .setSmallIcon(R.drawable.ic_launcher_background)
                        .setContentTitle("Simple Notification...")
                        .setContentText("This is a simple Notification example!!....")
                        .setPriority(Notification.PRIORITY_DEFAULT)

                val notificationManager : NotificationManager = this.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                notificationManager.createNotificationChannel(mNotificationChannel)

                notificationManager.notify(0, notificationBuilder.build())
            }
            else
            {
                val notificationBuilder2: NotificationCompat.Builder = NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.ic_launcher_background)
                        .setContentTitle("Simple Notification...")
                        .setContentText("This is Simple Notification example!!...")
                val notificationManager: NotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                notificationManager.notify(0, notificationBuilder2.build())


            }
        }

    }

}
