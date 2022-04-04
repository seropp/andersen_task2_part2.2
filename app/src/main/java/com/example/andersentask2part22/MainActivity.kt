package com.example.andersentask2part22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andersentask2part22.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvAct.text = count.toString()

        if(savedInstanceState != null){
            count = savedInstanceState.getInt("KEY")
            binding.tvAct.text = count.toString()
        }


        binding.btnAct.setOnClickListener {
            count += 1
            binding.tvAct.text = count.toString()
        }


    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("KEY", count);
        super.onSaveInstanceState(outState)
    }
}