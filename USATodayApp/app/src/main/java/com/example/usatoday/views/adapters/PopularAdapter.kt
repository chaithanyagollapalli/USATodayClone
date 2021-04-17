package com.example.usatoday.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.usatoday.R
import com.example.usatoday.data.model.Response
import com.example.usatoday.views.interfaces.ArticleClickListener
import com.example.usatoday.views.interfaces.ShareClickListener
import com.example.usatoday.views.viewholders.PopularViewHolder

class PopularAdapter(
    private val popularList: List<Response>,
    private val articleClickListener: ArticleClickListener,
    private val shareClickListener: ShareClickListener
) :
    RecyclerView.Adapter<PopularViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.popular_item_layout, parent, false)
        return PopularViewHolder(view, articleClickListener, shareClickListener)
    }

    override fun getItemCount(): Int {
        return popularList.size
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val popularResponse = popularList[position]
        holder.setData(popularResponse)
    }
}