package com.example.basiccalculator


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.example.basiccalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        binding.calculateButton.setOnClickListener {
            val inputField = binding.ResultTextView
            val number = inputField.text.toString().trim()
            if (number.isEmpty()) {
                inputField.error = "Missing number"
                return@setOnClickListener
            }
            binding.ResultTextView.text = "$number 69"
        }
    }

    fun R(view: View) {
        val inputField = binding.ResultTextView
        val number = inputField.text.toString().trim()
        if (number.isEmpty()) {
            inputField.error = "Missing number"
            return
        }
        binding.ResultTextView.text = "$number 69"
    }






}




