package com.alhussein.task.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alhussein.task.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
    }
}