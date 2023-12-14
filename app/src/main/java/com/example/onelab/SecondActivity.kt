package com.example.onelab

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
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


        // Activity Lifecycle
        Log.d("SecondActivity", "onCreate")
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

    // Activity Lifecycle
    override fun onStart() {
        super.onStart()
        Log.d("SecondActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SecondActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SecondActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SecondActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy")
    }



    // Buttons

    fun onClickButtontoMain(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}