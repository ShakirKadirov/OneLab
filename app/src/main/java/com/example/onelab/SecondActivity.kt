package com.example.onelab

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private var counter = 0
    private lateinit var counterTextView: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt("counter")
        }

        counterTextView = findViewById(R.id.counterTextView)

        updateCounter()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt("counter", counter)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        counter++

        updateCounter()
    }

    private fun updateCounter() {
        counterTextView.text = counter.toString()
    }
}