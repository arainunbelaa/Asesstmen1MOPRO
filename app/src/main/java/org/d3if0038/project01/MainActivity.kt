package org.d3if0038.project01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import org.d3if0038.project01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonhitung.setOnClickListener { hitung() }
        binding.buttonreset.setOnClickListener { reset() }
    }

    private fun hitung() {

        //rumus luas alas segitiga = 1/2 * alas * tinggi

        val alas = binding.alasEditText.text.toString()
        if (TextUtils.isEmpty(alas)) {
            Toast.makeText(this, R.string.alas_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val tinggi = binding.tinggiEditText.text.toString()
        if (TextUtils.isEmpty(tinggi)) {
            Toast.makeText(this, R.string.tinggi_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val Alas = alas.toFloat()
        val Tinggi = tinggi.toFloat()
        val hasil = Alas * Tinggi / 2
        binding.hasil.text = getString(R.string.hasil_x, hasil)
    }

    private fun reset(){
        binding.alasEditText.setText("")
        binding.tinggiEditText.setText("")
        binding.hasil.setText("")
    }
}