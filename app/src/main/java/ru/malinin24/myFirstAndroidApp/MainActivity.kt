package ru.malinin24.myFirstAndroidApp

import android.os.Bundle
import android.text.Layout
import android.util.DisplayMetrics
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.marginLeft
import androidx.core.view.marginRight


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b1: Button = findViewById(R.id.button1)
        val b2: Button = findViewById(R.id.button2)
        val b3: Button = findViewById(R.id.button3)

        b1.setOnClickListener{
            Log.e(getString(R.string.logTag), getString(R.string.btn1LogText))
        }

        b2.setOnClickListener{
            Log.e(getString(R.string.logTag), getString(R.string.btn2LogText))
        }

        b3.setOnClickListener{
            Log.e(getString(R.string.logTag), getString(R.string.btn3LogText))
        }
    }
}