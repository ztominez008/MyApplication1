package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        findViewById<Button>(R.id.btn_fb).setOnClickListener { fb() }
        findViewById<Button>(R.id.btn_ps).setOnClickListener { ps() }
        findViewById<Button>(R.id.btn_gmail).setOnClickListener { gmail() }
        findViewById<Button>(R.id.btn_google).setOnClickListener { google() }
        findViewById<Button>(R.id.btn_yt).setOnClickListener { yt() }
    }

    private fun fb() {
        val uri = Uri.parse("https://facebook.com/")
        val intent1 = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent1)
    }
    private fun ps() {
        val uri = Uri.parse("https://playstore.com/")
        val intent1 = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent1)
    }
    private fun google() {
        val uri = Uri.parse("https://google.com/")
        val intent1 = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent1)
    }
    private fun gmail(){
        val intent1 = Intent(this, PopupError::class.java)
        startActivity(intent1)
    }
    private fun yt() {
        val intent1 = Intent(this, PopupError::class.java)
        startActivity(intent1)
    }
}

class PopupError {

}
