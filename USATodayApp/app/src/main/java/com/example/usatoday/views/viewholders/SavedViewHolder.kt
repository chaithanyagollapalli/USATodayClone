package com.example.usatoday.views.viewholders

import android.view.View
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.usatoday.data.model.Response
import com.example.usatoday.views.interfaces.ArticleClickListener
import com.example.usatoday.views.interfaces.ShareClickListener
import kotlinx.android.synthetic.main.news_item_layout.view.*

class SavedViewHolder(
    view: View,
    private val articleClickListener: ArticleClickListener,
    private val shareClickListener: ShareClickListener
) :
    RecyclerView.ViewHolder(view) {

    fun setData(response: Response) {

        itemView.apply {
            ibSave.isVisible = false
            ibSave2.isVisible = true
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
                response.id?.let { articleClickListener.onSaveClicked(response) }
            }
        }
    }
}