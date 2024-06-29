package com.example.dealnow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.dealnow.databinding.FragmentWelcomeBinding
import com.example.fitglow.base.BaseFragment


class WelcomeFragment : BaseFragment <FragmentWelcomeBinding>(FragmentWelcomeBinding::inflate){
  override fun setListener() {
   binding.next1.setOnClickListener {
     findNavController().navigate(R.id.action_welcomeFragment_to_welcome2Fragment)


   }}






  override fun allObserver() {

  }


}


