package com.example.a1410yuk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var result = 0

        UP.setOnClickListener()
        {
            result++
            resultText.text = "$result"
        }
        DOWN.setOnClickListener()
        {
            result--
            resultText.text = "$result"
        }
        reset.setOnClickListener()
        {
            result = 0
            resultText.text = "$result"
        }
    }
}