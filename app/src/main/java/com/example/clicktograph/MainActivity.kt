package com.example.clicktograph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    //private lateinit var pbClickRate: ProgressBar
    //private lateinit var btnClickMe: Button
    private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pbClickRate : ProgressBar = findViewById(R.id.progressBar)      // Link to Progressbar
        pbClickRate.max = 3

        val tvHelloWorld = findViewById<View>(R.id.tv_1) as TextView
        val btnClickMe = findViewById<View>(R.id.btn_ClickMe) as Button
        btnClickMe.setOnClickListener {
            i++
            if (i >= pbClickRate.max) {
                if (tvHelloWorld.text == "Hello World!") {
                    tvHelloWorld.text = "Hi"
                    Toast.makeText(applicationContext, "Leiste ist voll", Toast.LENGTH_SHORT).show()
                } else {
                    tvHelloWorld.text = "Hello World!"
                    alertDialog()
                }
                i = 0
            }
            pbClickRate.progress = i
        }
    }

    private fun alertDialog() {
        val ad = AlertDialog.Builder(this).create()
        ad.setMessage("Leiste voll")
        ad.show()
    }


}