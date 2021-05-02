package com.example.mymotionlayout.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mymotionlayout.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fcv_main, MainFragment.newInstance("", ""))
            .commit()
    }
}