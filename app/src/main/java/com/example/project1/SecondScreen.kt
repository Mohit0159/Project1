package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondScreen : AppCompatActivity() {
    var btnSignup: Button? = null

    //edittext
    var etfullname: EditText? = null
    var etemail: EditText? = null
    var etpass: EditText?=null
    var etconfpass:EditText?=null
    //textview
    var tvsigin: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //find views
        btnSignup = findViewById(R.id.btsignUp)
        etfullname = findViewById(R.id.etenternames2)
        etemail = findViewById(R.id.etphones2)
        etpass=findViewById(R.id.etpasswords2)
        etconfpass=findViewById(R.id.etconfirmpasss2)

        btnSignup?.setOnClickListener {
            if (TextUtils.isEmpty(etfullname?.text.toString())) // check if user have not entered then ask for enter
            {
                Toast.makeText(this, "Enter Your Name", Toast.LENGTH_LONG).show()
            } else {
                var intent = Intent(this, Third_Screen::class.java)
                startActivity(intent)
                Toast.makeText(this, "Sign Up Successfully", Toast.LENGTH_SHORT).show()
                finish()
            }

            btnSignup?.setOnClickListener {
                if (TextUtils.isEmpty(etemail?.text.toString())) // check if user have not entered then ask for enter
                {
                    Toast.makeText(this, "Enter Email Id", Toast.LENGTH_LONG).show()
                } else {
                    if (Patterns.EMAIL_ADDRESS.matcher(etemail?.text.toString())
                            .matches()
                    ) { // using EMAIL_ADREES matcher
                        var intent = Intent(this, Third_Screen::class.java)
                        startActivity(intent)
                        Toast.makeText(this, "Sign in Successfully", Toast.LENGTH_SHORT).show()

                    } else {
                        Toast.makeText(this, "Enter valid Email address !", Toast.LENGTH_LONG)
                            .show()
                    }
                }
            }

        }

        btnSignup?.setOnClickListener {
            if (TextUtils.isEmpty(etpass?.text.toString())) // check if user have not entered then ask for enter
            {
                Toast.makeText(this, "Enter Password ", Toast.LENGTH_LONG).show()
            } else {
                var intent = Intent(this, Third_Screen::class.java)
                startActivity(intent)
                Toast.makeText(this, "Sign Up Successfully", Toast.LENGTH_SHORT).show()
                finish()
            }
        }

        btnSignup?.setOnClickListener {
            if (TextUtils.isEmpty(etconfpass?.text.toString())) // check if user have not entered then ask for enter
            {
                Toast.makeText(this, "Enter confirm", Toast.LENGTH_LONG).show()
            } else {
                var intent = Intent(this, Third_Screen::class.java)
                startActivity(intent)
                Toast.makeText(this, "Sign Up Successfully", Toast.LENGTH_SHORT).show()
                finish()
            }
        }

        tvsigin = findViewById(R.id.tvsigin)
        tvsigin?.setOnClickListener {
            var intent = Intent(this, Third_Screen::class.java)
            startActivity(intent)
            Toast.makeText(this, "Switched to Sign in page", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}

