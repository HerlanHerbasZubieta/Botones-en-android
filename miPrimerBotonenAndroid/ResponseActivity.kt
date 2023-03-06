package com.example.usodelosbotones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.usodelosbotones.databinding.ActivityMainBinding
import com.example.usodelosbotones.databinding.ActivityResponseBinding

class ResponseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResponseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResponseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            setResult(RESULT_OK)
            finish()
        }

        binding.btn2.setOnClickListener {
            setResult(RESULT_CANCELED)
            finish()
        }


    }
}