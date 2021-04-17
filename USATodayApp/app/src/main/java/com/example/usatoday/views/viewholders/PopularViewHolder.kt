package com.example.usatoday.views.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.usatoday.data.model.Response
import com.example.usatoday.views.interfaces.ArticleClickListener
import com.example.usatoday.views.interfaces.ShareClickListener
import kotlinx.android.synthetic.main.news_item_layout.view.*
import kotlinx.android.synthetic.main.popular_item_layout.view.*

class PopularViewHolder(
    itemView: View,
    private val articleClickListener: ArticleClickListener,
    private val shareClickListener: ShareClickListener
) :
    RecyclerView.ViewHolder(itemView) {

    fun setData(popularResponse: Response) {
        itemView.apply {
            tvRanking.text = popularResponse.ranking.toString()
            tvTitle.text = popularResponse.heading
            tvTime.text = popularResponse.time

            tvTitle.setOnClickListener {
                articleClickListener.onArticleClick(popularResponse)
            }

            ivShare.setOnClickListener {
                shareClickListener.onShareClick(popularResponse)
            }

        }
    }
}