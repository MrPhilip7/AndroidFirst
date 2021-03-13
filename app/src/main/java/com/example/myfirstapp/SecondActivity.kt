package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var password = findViewById(R.id.password) as EditText
        var email = findViewById(R.id.email) as EditText
        var warn_password = findViewById(R.id.warn_password) as TextView
        var warn_email = findViewById(R.id.warn_email) as TextView

        serviceEditEmail(email, warn_email)              //wyświetlanie i sprawdzanie poprawności email
        serviceEditPassword(password, warn_password)     //wyświetlanie i sprawdzanie poprawności password

    }
}