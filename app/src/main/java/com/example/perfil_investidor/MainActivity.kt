package com.example.perfil_investidor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startQuiz(view: View){
        val input = findViewById<EditText>(R.id.input_name)
        val name = input.text.toString()

        if(name != "") {
            val intent = Intent(this, QuizActivity::class.java).apply {
                putExtra("name", name)
            }
            startActivity(intent)
        } else {
            val nameAlert = "Insira teu nome:"
            val duration = Toast.LENGTH_LONG

            val toast = Toast.makeText(applicationContext, nameAlert, duration)
            toast.show()
        }

    }



}