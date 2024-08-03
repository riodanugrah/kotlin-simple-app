package com.dts.appvsga

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dts.appvsga.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonInput.setOnClickListener {
            startActivity(Intent(this, InputActivity::class.java))
        }

        binding.buttonCalculator.setOnClickListener {
            startActivity(Intent(this, CalculatorActivity::class.java))
        }

        binding.buttonListView.setOnClickListener {
            startActivity(Intent(this, ListViewActivity::class.java))
        }

        binding.buttonInternal.setOnClickListener {
            startActivity(Intent(this, InternalActivity::class.java))
        }

        binding.buttonAbout.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }
    }
}
