package com.galaxe.firstapp

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var tv : TextView
    lateinit var result: TextView
    lateinit var userName : EditText
    lateinit var password : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.title)
        userName = findViewById(R.id.user)
        password = findViewById(R.id.pass)
        result = findViewById(R.id.notification1)

    }
    fun login(v: View){

        if(userName.text.toString() == "admin" && password.text.toString() == "admin123"){
            result.setTextColor(Color.parseColor("#000000"))
            result.visibility = TextView.VISIBLE;
            result.text = "Logged in!"
            //Toast.makeText(this, "Login Success", Toast.LENGTH_LONG).show()

        }
        else{
            result.text = "Incorrect Credentials!"
            result.setTextColor(Color.parseColor("#FF0000"))
            result.visibility = TextView.VISIBLE;
            //Toast.makeText(this, "Login Failed", Toast.LENGTH_LONG).show()
        }

    }


}
