package com.example.myfirstapp

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

fun serviceEditPassword(password: EditText, warn_password: TextView) {
    password.run {
        addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (length() == 0) warn_password.visibility = TextView.INVISIBLE
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (length() <= 6) {
                    warn_password.setText("Password is too short")
                    warn_password.visibility = TextView.VISIBLE
                } else {
                    warn_password.setText("Almomst ready")
                    warn_password.visibility = TextView.VISIBLE
                }
            }
        })
    }
}
    fun serviceEditEmail(email: EditText, warn_email: TextView) {
        email.run {
            addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                    if (length() == 0) warn_email.visibility = TextView.INVISIBLE
                }

                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    warn_email.setText("Incorrect email")
                    for (i: Char in email.text) {
                        if (i == '@') {
                            warn_email.setText("Correct email")
                            warn_email.visibility = TextView.VISIBLE
                        }
                    }
                    warn_email.visibility = TextView.VISIBLE
                }

            })
        }
    }
