package com.example.pullRequests

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pullRequests.databinding.ItemNewBinding

class NewAdapter : RecyclerView.Adapter<NewAdapter.ViewHolder>() {

    class ViewHolder(private val views: ItemNewBinding) : RecyclerView.ViewHolder(views.root) {
        fun bind() {}
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        ItemNewBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
    )

    override fun getItemCount() = 10

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }
}