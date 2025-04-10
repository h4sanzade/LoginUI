package com.materialdesign.loginui

import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout
import kotlin.math.sign

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val iconFb = findViewById<ImageButton>(R.id.facebookicon)
        val iconApple = findViewById<ImageButton>(R.id.iconApple)
        val iconGoogle = findViewById<ImageButton>(R.id.googleIcon)
        val signButton = findViewById<Button>(R.id.signUpButton)
        val emailButton = findViewById<TextInputLayout>(R.id.emailInputLayout)
        iconApple.setOnClickListener {
            Toast.makeText(this, "LOGIN WITH FACEBOOK", Toast.LENGTH_SHORT).show()
        }

        iconFb.setOnClickListener {
            Toast.makeText(this, "LOGIN WITH APPLE", Toast.LENGTH_SHORT).show()
        }
        iconGoogle.setOnClickListener {
            Toast.makeText(this, "LOGIN WITH GOOGLE", Toast.LENGTH_SHORT).show()
        }
        signButton.setOnClickListener {
            val emailText = emailButton.editText?.text.toString()
            Toast.makeText(this, emailText, Toast.LENGTH_SHORT).show()
        }

    }
}