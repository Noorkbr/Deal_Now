package com.example.dealnow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isEmpty
import androidx.navigation.fragment.findNavController
import com.example.dealnow.databinding.FragmentLoginBinding
import com.example.fitglow.base.BaseFragment


class loginFragment : BaseFragment<FragmentLoginBinding>(FragmentLoginBinding::inflate) {

    override fun setListener() {

        with(binding) {
            loginbtn.setOnClickListener {
                phoneNumberEdittext.isEmpty()
                passwordEdittext.isEmpty()

                if (!phoneNumberEdittext.isEmpty() && !passwordEdittext.isEmpty()) {
                    val user = LoginUser(
                        phoneNumberEdittext.text.toString(),
                        passwordEdittext.text.toString()
                    )

                    userLoginValidation(user)
                }

            }

        }


        binding.signupbtn.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)

        }

        binding.forgetbtn.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_forgotpassFragment)

        }


    }

    override fun allObserver() {

    }

    private fun userLoginValidation(user: LoginUser) {

        if (user.phoneNumber.length == 11) {
            if (user.password.length >= 8) {
                findNavController().navigate(R.id.action_loginFragment_to_startedFragment)
                /*  viewModel.login(loginUser)*/
            } else {
                Toast.makeText(context, "enter correct password", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(context, "enter correct phone/password", Toast.LENGTH_SHORT).show()
        }
    }

}



