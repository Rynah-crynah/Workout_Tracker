package com.example.workout_log

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.workout_log.databinding.ActivityLoginBinding
import com.example.workout_log.databinding.ActivitySignupBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignupActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
        binding.btnSignup.setOnClickListener {
            validate_Signup()
        }
        binding.btnLogin2.setOnClickListener {
            var intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

        }
    fun validate_Signup(){
        var firstName = binding.etFirstName.text.toString()
        var lastName = binding.etLastName.text.toString()
        var email = binding.etYourEmail.text.toString()
        var password = binding.etPassword.text.toString()
        var confirmPassword = binding.etConfirmPassword.text.toString()

        if (firstName.isBlank()) {
            binding.tilFirstName.error = getString(R.string.firstName_required)
        }

        if (lastName.isBlank()) {
            binding.tilLastName.error = getString(R.string.lastName_required)
        }

        if (email.isBlank()) {
            binding.tilYourEmail.error = getString(R.string.email_required)
        }

        if (password.isBlank()) {
            binding.tilPassword.error = getString(R.string.password_required)

        }

        if (confirmPassword.isBlank()) {
            binding.tilConfirmPassword.error = getString(R.string.confirmPassword_required)

        }
    }

    }

