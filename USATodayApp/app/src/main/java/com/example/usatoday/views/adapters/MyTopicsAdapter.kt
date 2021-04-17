package com.example.usatoday.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.usatoday.R
import com.example.usatoday.data.model.Response
import com.example.usatoday.views.viewholders.MyTopicsViewHolder

class MyTopicsAdapter(private val list: List<Response>) :
    RecyclerView.Adapter<MyTopicsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyTopicsViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.news_item_layout, parent, false)
        return MyTopicsViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyTopicsViewHolder, position: Int) {
        val response = list[position]
        holder.setData(response)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}