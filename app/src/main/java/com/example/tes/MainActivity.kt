package com.example.tes

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<TextInputEditText>(R.id.etName)
        val btnSayHello = findViewById<Button>(R.id.btnSayHello)
        val tvGreeting = findViewById<TextView>(R.id.tvGreeting)

        btnSayHello.setOnClickListener {
            val name = etName.text.toString().trim()

            if (name.isNotEmpty()) {
                tvGreeting.text = "Hello, $name! 👋"

                tvGreeting.alpha = 0f
                tvGreeting.visibility = View.VISIBLE
                tvGreeting.animate().alpha(1f).setDuration(500).start()

            } else {
                etName.error = "Nama tidak boleh kosong"
            }
        }
    }
}