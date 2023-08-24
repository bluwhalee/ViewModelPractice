package com.example.viewmodelpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding :ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.textView.text = viewModel.num.toString()
        binding.button.setOnClickListener{
            viewModel.add()
            binding.textView.text = viewModel.num.toString()
        }

    }
}