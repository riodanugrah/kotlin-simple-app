package com.dts.appvsga

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.*

class InternalActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val FILENAME = "namafile.txt"
    }

    private lateinit var buatFile: Button
    private lateinit var ubahFile: Button
    private lateinit var bacaFile: Button
    private lateinit var deleteFile: Button
    private lateinit var textBaca: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_internal)

        buatFile = findViewById(R.id.buttonBuatFile)
        ubahFile = findViewById(R.id.buttonUbahFile)
        bacaFile = findViewById(R.id.buttonBacaFile)
        deleteFile = findViewById(R.id.buttonHapusFile)
        textBaca = findViewById(R.id.textBaca)

        buatFile.setOnClickListener(this)
        ubahFile.setOnClickListener(this)
        bacaFile.setOnClickListener(this)
        deleteFile.setOnClickListener(this)
    }

    private fun buatFile() {
        val isiFile = "Coba Isi Data File Text"
        val file = File(filesDir, FILENAME)
        try {
            file.createNewFile()
            file.writeText(isiFile)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun ubahFile() {
        val ubah = "Update Isi Data File Text"
        val file = File(filesDir, FILENAME)
        try {
            file.writeText(ubah)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun bacaFile() {
        val file = File(filesDir, FILENAME)
        if (file.exists()) {
            val text = file.readText()
            textBaca.text = text
        }
    }

    private fun hapusFile() {
        val file = File(filesDir, FILENAME)
        if (file.exists()) {
            file.delete()
        }
    }

    override fun onClick(v: View) {
        jalankanPerintah(v.id)
    }

    private fun jalankanPerintah(id: Int) {
        when (id) {
            R.id.buttonBuatFile -> buatFile()
            R.id.buttonBacaFile -> bacaFile()
            R.id.buttonUbahFile -> ubahFile()
            R.id.buttonHapusFile -> hapusFile()
        }
    }
}
