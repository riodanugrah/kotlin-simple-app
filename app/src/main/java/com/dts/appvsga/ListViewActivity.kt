package com.dts.appvsga

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dts.appvsga.databinding.ActivityListviewBinding

class ListViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val items = listOf(
            "Apel", "Pisang", "Ceri", "Kurma", "Strawberry",
            "Semangka", "Anggur", "Melon", "Kiwi", "Lemon",
            "Mangga", "Pepaya", "Nanas", "Jambu", "Durian",
            "Manggis", "Sirsak", "Rambutan", "Salak", "Belimbing")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        binding.listView.adapter = adapter

        binding.listView.setOnItemClickListener { _, _, position, _ ->
            val item = items[position]
            Toast.makeText(this, item, Toast.LENGTH_SHORT).show()
        }
    }
}
