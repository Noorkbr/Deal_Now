package com.example.dealnow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dealnow.Adapters.CategoryItemAdapter
import com.example.dealnow.Adapters.ListTrendAdapter
import com.example.dealnow.data.ListData
import com.example.dealnow.databinding.FragmentHomeBinding
import com.example.fitglow.base.BaseFragment


class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    private lateinit var categoryItemAdapter: CategoryItemAdapter
    private lateinit var lisTrendAdapter: ListTrendAdapter


    val categoryItem = listOf(
        ListData(R.drawable.categoryx, "Beauty"),
        ListData(R.drawable.fashion, "Fashion"),
        ListData(R.drawable.kids, "Kids"),
        ListData(R.drawable.woman, "Women"),
        ListData(R.drawable.men, "Men"),

        )
    val trendItem = listOf(
        ListData(R.drawable.trendproducts1, "Premium watch"),
        ListData(R.drawable.shoe, "White Shoe"),
        ListData(R.drawable.scart, "Premium Dress"),
        ListData(R.drawable.jacket, "Jacket"),
        ListData(R.drawable.dresswomen, "Party Dress"),

        )

    override fun setListener() {
        setRecycler1Data()
        setRecycler2Data()

    }

    override fun allObserver() {


    }
    private fun setRecycler1Data() {
        categoryItemAdapter = CategoryItemAdapter(categoryItem)
        binding.categoryItemList.adapter = categoryItemAdapter
    }
    private fun setRecycler2Data() {
        lisTrendAdapter = ListTrendAdapter(trendItem)
        binding.trendItemRecycler.adapter = lisTrendAdapter
    }
}