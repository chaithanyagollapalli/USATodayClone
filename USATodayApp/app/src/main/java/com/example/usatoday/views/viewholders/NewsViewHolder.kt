package com.example.usatoday.views.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.usatoday.data.model.Response
import com.example.usatoday.views.interfaces.ArticleClickListener
import com.example.usatoday.views.interfaces.ShareClickListener
import kotlinx.android.synthetic.main.news_item_layout.view.*


class NewsViewHolder(
    view: View,
    private val articleClickListener: ArticleClickListener,
    private val shareClickListener: ShareClickListener
) :
    RecyclerView.ViewHolder(view) {

    fun setData(response: Response) {

        itemView.apply {
            tvHeadline.text = response.heading
            Glide.with(this).load(response.img).into(ivImage)
            tvDateTime.text = response.time
            tvHeadline.setOnClickListener {
                response.id?.let { articleClickListener.onArticleClick(response) }
            }
            ibShare.setOnClickListener {
                shareClickListener.onShareClick(response)
            }

            ibSave.setOnClickListener {
                ibSave.visibility = View.INVISIBLE
                ibSave2.visibility = View.VISIBLE
                response.id?.let { articleClickListener.onSaveClicked(response) }
            }
        }
    }
}