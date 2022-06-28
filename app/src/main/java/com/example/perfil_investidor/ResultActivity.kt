package com.example.perfil_investidor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val name = intent.getStringExtra("username")
        val userName = findViewById<TextView>(R.id.txt_name)
        userName.text = name

        val profile = intent.getStringExtra("userprofile")
        val userProfile = findViewById<TextView>(R.id.txt_finalResult)
        userProfile.text = profile

    }
}