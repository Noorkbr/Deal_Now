package com.example.dealnow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.dealnow.databinding.FragmentRegisterBinding
import com.example.fitglow.base.BaseFragment


class registerFragment : BaseFragment<FragmentRegisterBinding>(FragmentRegisterBinding::inflate) {
    override fun setListener() {
        binding.createbtn.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_startedFragment)

        }
        binding.backlogin.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)

        }

    }

    override fun allObserver() {

    }

}