package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var btnSignup:Button?=null
    var btnSignin:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnSignup=findViewById(R.id.btnsignups1)
        btnSignup?.setOnClickListener{
            var intent = Intent(this, SecondScreen::class.java)
            startActivity(intent)
            Toast.makeText(this, "Switching to Sign Up Page", Toast.LENGTH_SHORT).show()

        }
        btnSignin=findViewById(R.id.btsignins1)
        btnSignin?.setOnClickListener{
            var intent = Intent(this, Third_Screen::class.java)
            startActivity(intent)
            Toast.makeText(this, "Switching to Sign In Page", Toast.LENGTH_SHORT).show()
        }
    }
}