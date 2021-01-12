package com.example.lab_w1_d1_intro_part1andpart2

import android.R.attr.button
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var btnPressed = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(v: View?) {
        when (btnPressed) {
            false -> {
                tv_myText.text = "Goodbye darkness"
                btnPressed = true
            }
            true -> {
                tv_myText.text = "Hello World"
                btnPressed = false
            }
        }
    }
}
