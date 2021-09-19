package com.irwantoadi.jeniture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn_masuk: ImageButton = findViewById(R.id.btn_sumbit)
        val link_register: TextView = findViewById(R.id.link_belum_punya_akun)
        btn_masuk.setOnClickListener {
            var intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        link_register.setOnClickListener {
            var intent = Intent(this@LoginActivity, DaftarActivity::class.java)
            startActivity(intent)
        }
    }
}