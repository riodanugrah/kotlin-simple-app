package com.dts.appvsga

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dts.appvsga.databinding.ActivityCalculatorBinding

class CalculatorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAdd.setOnClickListener {
            val num1 = binding.editTextNumber1.text.toString().toDoubleOrNull()
            val num2 = binding.editTextNumber2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 + num2
                binding.textViewResult.text = "Hasil: $result"
            } else {
                Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show()
            }
        }

        binding.buttonSubtract.setOnClickListener {
            val num1 = binding.editTextNumber1.text.toString().toDoubleOrNull()
            val num2 = binding.editTextNumber2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 - num2
                binding.textViewResult.text = "Hasil: $result"
            } else {
                Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show()
            }
        }

        binding.buttonMultiply.setOnClickListener {
            val num1 = binding.editTextNumber1.text.toString().toDoubleOrNull()
            val num2 = binding.editTextNumber2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 * num2
                binding.textViewResult.text = "Hasil: $result"
            } else {
                Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show()
            }
        }

        binding.buttonDivide.setOnClickListener {
            val num1 = binding.editTextNumber1.text.toString().toDoubleOrNull()
            val num2 = binding.editTextNumber2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 !=null) {
                if (num1 != 0.0 && num2 != 0.0) {
                    val result = num1 / num2
                    binding.textViewResult.text = "Hasil: $result"
                } else {
                    binding.textViewResult.text = "Hasil tidak ditemukan"
                }
            } else {
                Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show()
            }
        }

        binding.buttonClear.setOnClickListener {
            binding.editTextNumber1.text.clear()
            binding.editTextNumber2.text.clear()
            binding.textViewResult.text = ""
        }
    }
}
