package com.example.workout_log

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignupActivity : AppCompatActivity() {
    lateinit var etFisrtName: TextInputEditText
    lateinit var tilFirstName: TextInputLayout
    lateinit var etLastName: TextInputEditText
    lateinit var tilLastName: TextInputLayout
    lateinit var etYourEmail: TextInputEditText
    lateinit var tilYourEmail: TextInputLayout
    lateinit var etPassword: TextInputEditText
    lateinit var tilPassword: TextInputLayout
    lateinit var etConfirmPassword: TextInputEditText
    lateinit var tilConfirmPassword: TextInputLayout
    lateinit var btnSignup: Button
    lateinit var btnLogin2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        etFisrtName=findViewById(R.id.etFirstName)
        tilFirstName=findViewById(R.id.tilFirstName)
        etLastName=findViewById(R.id.etLastName)
        tilLastName=findViewById(R.id.tilLastName)
        etYourEmail=findViewById(R.id.etYourEmail)
        tilYourEmail=findViewById(R.id.tilYourEmail)
        etPassword=findViewById(R.id.etPassword)
        tilPassword=findViewById(R.id.tilPassword)
        etConfirmPassword=findViewById(R.id.etConfirmPassword)
        tilConfirmPassword=findViewById(R.id.tilConfirmPassword)
//        btnLogin2=findViewById(R.id.btnLogin2)
        btnSignup=findViewById(R.id.btnSignup)
        btnSignup.setOnClickListener {
            validate_Signup()
        }
        btnLogin2=findViewById(R.id.btnLogin2)
        btnLogin2.setOnClickListener {
            var intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

        }
    fun validate_Signup(){
        var firstName = etFisrtName.text.toString()
        var lastName = etLastName.text.toString()
        var email = etYourEmail.text.toString()
        var password = etPassword.text.toString()
        var confirmPassword = etConfirmPassword.text.toString()

        if (firstName.isBlank()) {
            tilFirstName.error = getString(R.string.firstName_required)
        }

        if (lastName.isBlank()) {
            tilLastName.error = getString(R.string.lastName_required)
        }

        if (email.isBlank()) {
            tilYourEmail.error = getString(R.string.email_required)
        }

        if (password.isBlank()) {
            tilPassword.error = getString(R.string.password_required)

        }

        if (confirmPassword.isBlank()) {
            tilConfirmPassword.error = getString(R.string.confirmPassword_required)

        }
    }

    }

