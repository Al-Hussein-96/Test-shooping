package com.alhussein.task.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alhussein.task.R
import com.alhussein.task.data.Profile

class ProfileAdapter : RecyclerView.Adapter<ProfileAdapter.ViewHolder>() {

    var data = listOf<Profile>()
        set(value) {
            field = value
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size


    class ViewHolder private constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val title: TextView = itemView.findViewById(R.id.title_profile)
        private val image: ImageView = itemView.findViewById(R.id.image_profile)


        fun bind(item: Profile) {
            title.text = item.title.toString()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater
                    .inflate(R.layout.item_profile, parent, false)

                return ViewHolder(view)
            }
        }
    }
}