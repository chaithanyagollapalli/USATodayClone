package com.example.usatoday.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.usatoday.R
import com.example.usatoday.data.model.Response
import com.example.usatoday.views.interfaces.ArticleClickListener
import com.example.usatoday.views.interfaces.ShareClickListener
import com.example.usatoday.views.viewholders.TopStoriesViewHolder
import com.example.usatoday.views.viewholders.NewsViewHolder

class NewsAdapter(
    private val list: List<Response>,
    private val articleClickListener: ArticleClickListener,
    private val shareClickListener: ShareClickListener
) : RecyclerView.Adapter<TopStoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopStoriesViewHolder {
    private val articleClickListener: ArticleClickListener
) :
    RecyclerView.Adapter<NewsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.news_item_layout, parent, false)
        return NewsViewHolder(view, articleClickListener, shareClickListener)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val response = list[position]
        holder.setData(response)
    }
}