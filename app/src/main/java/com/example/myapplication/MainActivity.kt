package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et_User_Name=  findViewById<EditText>(R.id.et_User_Name)
        val et_password= findViewById<EditText>(R.id.et_password)
        val btn_login= findViewById<Button>(R.id.btn_login)

        btn_login.setOnClickListener {
            val status=if(et_User_Name.text.toString().equals("Username")
                    &&et_password.text.toString().equals("1234")) "Logged In Successfully" else "Fail LogIn"
            Toast.makeText(this,status,Toast.LENGTH_SHORT)
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }


    }

}


