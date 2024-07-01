package com.example.dealnow.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.dealnow.data.ListData
import com.example.dealnow.databinding.TrendingItemLayoutBinding

class ListTrendAdapter(private val list: List<ListData>) :
    RecyclerView.Adapter<ListTrendAdapter.WorkoutViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkoutViewHolder {
        return WorkoutViewHolder(
            TrendingItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: WorkoutViewHolder, position: Int) {
        list[position].let {
            holder.binding.apply {
                itemImage.load(it.image)
                exercisesTitle.text = it.name
            }
        }
    }

    inner class WorkoutViewHolder(val binding: TrendingItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)
}
