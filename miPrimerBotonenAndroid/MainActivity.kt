package com.example.usodelosbotones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.example.usodelosbotones.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val myRequetsCode = 777

    /*private val responseLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){ activity ->
        if (activity == requestCode) {
            if (resultCode == RESULT_OK){
                Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "No :(", Toast.LENGTH_SHORT).show()
            }
        }
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myBtn.setOnClickListener {
            startActivityForResult(Intent(this, ResponseActivity::class.java), myRequetsCode)

            /*val intent = Intent(this, ResponseActivity::class.java)
            responseLauncher.launch(intent)*/
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (myRequetsCode == requestCode) {
            if (resultCode == RESULT_OK){
                Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "No :(", Toast.LENGTH_SHORT).show()
            }
        }
    }
}