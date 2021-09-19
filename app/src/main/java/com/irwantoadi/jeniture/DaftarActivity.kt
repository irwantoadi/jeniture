package com.irwantoadi.jeniture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class DaftarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        val btn_daftar: ImageButton = findViewById(R.id.btn_daftar)
        btn_daftar.setOnClickListener {
            Toast.makeText(this@DaftarActivity, "Pendaftaran Berhasil", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}