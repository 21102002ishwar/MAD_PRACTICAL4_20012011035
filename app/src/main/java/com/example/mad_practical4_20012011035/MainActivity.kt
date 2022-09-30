package com.example.mad_practical4_20012011035;

import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonBrowse = findViewById<Button>(R.id.button_browse)
        buttonBrowse.setOnClickListener {
            Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://uvpce.guni.ac.in")).apply {
                startActivity(this)
            }
        }

        val buttonCAll = findViewById<Button>(R.id.button_call)
        buttonCAll.setOnClickListener {
            Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel: 9903763302")).apply {
                startActivity(this)
            }
        }

        val buttonContact = findViewById<Button>(R.id.button_contact)
        buttonContact.setOnClickListener {
            Intent(Intent.ACTION_VIEW).setType(ContactsContract.Contacts.CONTENT_TYPE).apply {
                startActivity(this)
            }
        }

        val buttonCallLog = findViewById<Button>(R.id.button_callLog)
        buttonCallLog.setOnClickListener {
            Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).apply {
                startActivity(this)
            }

            val buttonGallery = findViewById<Button>(R.id.button_gallery)
            buttonGallery.setOnClickListener {
                Intent(MediaStore.ACTION_IMAGE_CAPTURE).apply {
                    startActivity(this)
                }
            }

            val buttonCamera = findViewById<Button>(R.id.button_camera)
            buttonCamera.setOnClickListener {
                Intent(MediaStore.ACTION_IMAGE_CAPTURE).apply {
                    startActivity(this)
                }
            }

            val buttonAlarm = findViewById<Button>(R.id.button_alarm)
            buttonAlarm.setOnClickListener {
                Intent(AlarmClock.ACTION_SHOW_ALARMS).apply { startActivity(this) }
            }


        }
    }
}

//start activity

// camera
//Intent(media)