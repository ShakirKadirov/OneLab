package com.example.onelab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.onelab.fragments.FirstFragment
import com.example.onelab.fragments.SecondFragment

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)



        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()


        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment)
            commit()
        }

        val mybtn1 = findViewById<Button>(R.id.btn_first)
        val mybtn2 = findViewById<Button>(R.id.btn_second)


        mybtn1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment)
                commit()
            }
        }

        mybtn2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, secondFragment)
                commit()
            }
        }
    }
//    fun onClickButtonBack(view: View){
//        val intent = Intent(this,SecondActivity::class.java)
//        startActivity(intent)
//    }
}