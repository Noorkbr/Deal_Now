package com.example.dealnow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isEmpty
import androidx.navigation.fragment.findNavController
import com.example.dealnow.databinding.FragmentLoginBinding
import com.example.fitglow.base.BaseFragment



class loginFragment : BaseFragment<FragmentLoginBinding>(FragmentLoginBinding::inflate) {



    override fun setListener() {

        binding.loginbtn.setOnClickListener {

                findNavController().navigate(R.id.action_loginFragment_to_startedFragment)

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
}