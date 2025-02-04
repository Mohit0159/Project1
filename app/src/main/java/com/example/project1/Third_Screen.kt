package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Third_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //text view
        var textsignup:TextView?=null

        textsignup=findViewById(R.id.tvsigin)


        textsignup?.setOnClickListener {
            var intent=Intent(this,SecondScreen::class.java)
            startActivity(intent)
            Toast.makeText(this, "Switched to SignUp Page", Toast.LENGTH_SHORT).show()
            finish()
        }

    }
}