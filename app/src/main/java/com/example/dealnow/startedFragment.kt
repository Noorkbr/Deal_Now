package com.example.dealnow

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dealnow.databinding.FragmentStartedBinding
import com.example.fitglow.base.BaseFragment


class startedFragment : BaseFragment<FragmentStartedBinding>(FragmentStartedBinding::inflate) {


    override fun setListener() {
        binding.getstartedbtn.setOnClickListener {
            startActivity(Intent(requireContext(), MainActivity2::class.java))
            requireActivity().finish()
        }
    }

    override fun allObserver() {

    }


}



