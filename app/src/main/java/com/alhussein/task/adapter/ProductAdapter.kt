package com.alhussein.task.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alhussein.task.R
import com.alhussein.task.data.Product

class ProductAdapter : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    var data = listOf<Product>()
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


        fun bind(item: Product) {

        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater
                    .inflate(R.layout.item_body_image, parent, false)

                return ViewHolder(view)
            }
        }
    }
}