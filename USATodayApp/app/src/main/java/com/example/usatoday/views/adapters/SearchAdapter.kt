package com.example.usatoday.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.usatoday.R
import com.example.usatoday.data.model.DataItem
import com.example.usatoday.views.interfaces.SearchArticleClickListener
import com.example.usatoday.views.viewholders.SearchViewHolder

class SearchAdapter(
    private val list: List<DataItem>,
    private val searchArticleClickListener: SearchArticleClickListener
) : RecyclerView.Adapter<SearchViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.news_item_layout, parent, false)
        return SearchViewHolder(view,searchArticleClickListener)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        val dataItem = list[position]
        holder.setData(dataItem)
    }
}