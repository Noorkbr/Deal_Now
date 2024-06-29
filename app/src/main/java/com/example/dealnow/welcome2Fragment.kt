package com.example.dealnow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.dealnow.databinding.FragmentWelcome2Binding
import com.example.dealnow.databinding.FragmentWelcomeBinding
import com.example.fitglow.base.BaseFragment


class welcome2Fragment : BaseFragment<FragmentWelcome2Binding>(FragmentWelcome2Binding::inflate) {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)

        // Set up the toolbar
        val toolbar: androidx.appcompat.widget.Toolbar = binding.prev1
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Handle back navigation
        toolbar.setNavigationOnClickListener {
            activity?.onBackPressed()
        }

        return view
    }



    override fun setListener() {
        binding.next2.setOnClickListener {
            findNavController().navigate(R.id.action_welcome2Fragment_to_welcome3Fragment)


        }
    }

    override fun allObserver() {

    }


}