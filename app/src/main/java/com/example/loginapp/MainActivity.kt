package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginapp.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            if(binding.editTextTextEmailAddress.text.isNullOrBlank() &&
                binding.editTextTextPassword.text.isNullOrBlank()) {
                Toast.makeText(this, "Enter required fields ", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "${binding.editTextTextEmailAddress.text} successfully logged in", Toast.LENGTH_SHORT).show()
            }
        }
    }
}