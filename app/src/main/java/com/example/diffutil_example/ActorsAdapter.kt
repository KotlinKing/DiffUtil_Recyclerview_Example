package com.example.diffutil_example

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import com.bumptech.glide.Glide
import com.example.diffutil_example.databinding.ItemActorBinding

class ActorsAdapter : RecyclerView.Adapter<ActorsAdapter.ActorsViewHolder>() {

    private val diffUtilItemCallback = object : DiffUtil.ItemCallback<Actor>() {
        override fun areItemsTheSame(oldItem: Actor, newItem: Actor): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Actor, newItem: Actor): Boolean {
            return oldItem == newItem
        }
    }

    private val listDiffer = AsyncListDiffer(this, diffUtilItemCallback)

    private lateinit var binding: ItemActorBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorsViewHolder {
        binding = ItemActorBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ActorsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ActorsViewHolder, position: Int) {
        holder.bind(listDiffer.currentList[position])
    }

    override fun getItemCount(): Int {
        return listDiffer.currentList.size
    }

    fun submitList(list: List<Actor>) {
        listDiffer.submitList(list)
    }

    class ActorsViewHolder constructor(private val binding: ItemActorBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Actor) {
            binding.actorName.text = item.name
            Glide.with(this.itemView).load(item.image).into(binding.imgActor)
        }
    }
}