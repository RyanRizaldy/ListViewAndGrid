package com.example.listviewandgrid


import android.view.LayoutInflater import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class Adapter(private val itemList: List<ItemList.ItemLists>):RecyclerView.Adapter<Adapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_data,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val item = itemList[position]
        holder.judul.text = item.judul
        holder.subJudul.text = item.subjudul
        Glide.with(holder.imageView.context).load(item.imageUrl).into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
    class ViewHolder(@NonNull itemView: View):RecyclerView.ViewHolder(itemView) {
        val imageView : ImageView = itemView.findViewById(R.id.item_image)
        val judul : TextView = itemView.findViewById(R.id.judul)
        val subJudul : TextView = itemView.findViewById(R.id.sub_judul)
    }
}