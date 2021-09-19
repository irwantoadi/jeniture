package com.irwantoadi.jeniture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageButton
import android.widget.Toast

class WelcomeActivity : AppCompatActivity() {
    lateinit var btn_masuk : ImageButton
    lateinit var btn_daftar : ImageButton
    var doubleBackToExitOnce : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        btn_masuk = findViewById(R.id.btn_login)
        btn_daftar = findViewById(R.id.btn_daftar)

        btn_masuk.setOnClickListener {
            var intent = Intent(this@WelcomeActivity, LoginActivity::class.java)
            startActivity(intent)
        }
        btn_daftar.setOnClickListener {
            var intent = Intent(this@WelcomeActivity, DaftarActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        if (doubleBackToExitOnce){
            super.onBackPressed()
            return
        }

        this.doubleBackToExitOnce = true;

        Toast.makeText(this, "Tekan satu kali lagi untuk keluar", Toast.LENGTH_SHORT).show()

        Handler().postDelayed({
            kotlin.run { doubleBackToExitOnce = false }
        }, 2000)
    }
}