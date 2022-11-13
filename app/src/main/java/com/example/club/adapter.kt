package com.example.club

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter(val listClub:ArrayList<DataClub>) :RecyclerView.Adapter<adapter.ClubViewHolder>(){

    var itemKlik : ((DataClub) -> Unit)? = null

    class ClubViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val namaClub : TextView = itemView.findViewById(R.id.namaClub)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClubViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.model, parent, false)
        return ClubViewHolder(view)
    }

    override fun onBindViewHolder(holder: ClubViewHolder, position: Int) {
        val club = listClub[position]
        holder.namaClub.text = club.nama

        holder.itemView.setOnClickListener {
            itemKlik?.invoke(club)
        }
    }

    override fun getItemCount(): Int {
        return listClub.size
    }
}