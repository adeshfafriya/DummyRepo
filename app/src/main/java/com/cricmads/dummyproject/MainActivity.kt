package com.cricmads.dummyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cricmads.dummyproject.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}