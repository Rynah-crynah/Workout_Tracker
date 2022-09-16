package com.example.workout_log.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.workout_log.Api_Client
import com.example.workout_log.Api_Interface
import com.example.workout_log.R
import com.example.workout_log.databinding.ActivityLoginBinding
import com.example.workout_log.models.Login_Request
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.btnLogin.setOnClickListener {
            validae_Login()
        }

        binding.tvSignup.setOnClickListener {
            var intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

    }
    fun validae_Login() {
        var email = binding.etEmail.text.toString()
        var password = binding.etPassword.text.toString()
        var error = false

        if (email.isBlank()) {
            binding.tilEmail.error = getString(R.string.email_required)
            error = true
        }

        if (password.isBlank()) {
            binding.tilEmail.error = getString(R.string.password_required)
            error = true

        }
        if (!error) {
//            var loginRequest = Login_Requestuest(email, password)

        }

//        fun makeLoginRequest(loginRequest: LoginRequest){
//            var apiClient = Api_Client.buildApiClient(Api_Interface::class.java)
//            val request = apiClient.login(loginRequest)
//
//            request.enqueue(object :callback<Login_Response> {
//                override fun onResponse(call: Call<Login_Response>, response: Response>)
//                if(response.isSuccessful){
//
//
//                }
//            }

        }
    }


//}