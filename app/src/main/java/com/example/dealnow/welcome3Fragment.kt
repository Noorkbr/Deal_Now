package com.example.dealnow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.dealnow.databinding.FragmentWelcome2Binding
import com.example.dealnow.databinding.FragmentWelcome3Binding
import com.example.fitglow.base.BaseFragment


class welcome3Fragment : BaseFragment<FragmentWelcome3Binding>(FragmentWelcome3Binding::inflate) {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)

        // Set up the toolbar
        val toolbar: androidx.appcompat.widget.Toolbar = binding.prev2
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Handle back navigation
        toolbar.setNavigationOnClickListener {
            activity?.onBackPressed()
        }

        return view
    }


    override fun setListener() {
        binding.next3.setOnClickListener {
            findNavController().navigate(R.id.action_welcome3Fragment_to_loginFragment)


        }
    }

    override fun allObserver() {

    }


}