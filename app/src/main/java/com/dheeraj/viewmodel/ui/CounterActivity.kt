package com.dheeraj.viewmodel.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dheeraj.viewmodel.R
import com.dheeraj.viewmodel.viewmodel.CounterViewModel

class CounterActivity : AppCompatActivity() {

    private val counterViewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)
    }
}