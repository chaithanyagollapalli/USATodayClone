package com.example.usatoday.views.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.usatoday.data.model.Response
import com.example.usatoday.views.interfaces.ArticleClickListener
import kotlinx.android.synthetic.main.news_item_layout.view.*

class TopStoriesViewHolder(itemView: View, private val articleClickListener: ArticleClickListener) :
    RecyclerView.ViewHolder(itemView) {


    fun setData(response: Response) {

        itemView.apply {
            tvHeadline.text = response.heading
            tvDateTime.text = response.time
            Glide.with(this).load(response.img).into(ivImage)
            tvHeadline.setOnClickListener {
                response.id?.let { articleClickListener.onArticleClick(response) }
            }
        }

    }


}