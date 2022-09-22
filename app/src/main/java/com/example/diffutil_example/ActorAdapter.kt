package com.example.diffutil_example

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.diffutil_example.databinding.ItemActorBinding

class ActorAdapter(initActorsList: List<Actor>) : RecyclerView.Adapter<ActorAdapter.ViewHolder>() {

    private val actors = mutableListOf<Actor>()

    init {
        actors.addAll(initActorsList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_actor, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = actors.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(actor = actors[position])
    }

    fun swap(actors: List<Actor>) {
        val diffCallback = ActorDiffCallback(this.actors, actors)
        val diffResult = DiffUtil.calculateDiff(diffCallback)

        this.actors.clear()
        this.actors.addAll(actors)
        diffResult.dispatchUpdatesTo(this)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val name: TextView = itemView.findViewById(R.id.actor_name)
        private val image: ImageView = itemView.findViewById(R.id.imgActor)
        fun bind(actor: Actor) {
            name.text = actor.name
            Glide.with(this.itemView).load(actor.image).into(image);
        }
    }
}