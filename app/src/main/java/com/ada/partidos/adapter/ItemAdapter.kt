package com.ada.partidos.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ada.partidos.R
import com.ada.partidos.model.Partido

class ItemAdapter(private val context: Context,
                  private val dataset: List<Partido>)
    : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()
{

    class ItemViewHolder(private val view: View):RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val imageView2: ImageView = view.findViewById(R.id.item_image2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
        holder.imageView2.setImageResource(item.imageResourceId2)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}