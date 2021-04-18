package com.example.usatoday.views.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.usatoday.data.model.DataItem
import com.example.usatoday.views.interfaces.SearchArticleClickListener
import kotlinx.android.synthetic.main.news_item_layout.view.*

class SearchViewHolder(
    view: View,
    private val searchArticleClickListener: SearchArticleClickListener
) :
    RecyclerView.ViewHolder(view) {

    fun setData(dataItem: DataItem) {

        itemView.apply {
            tvHeadline.text = dataItem.title
            Glide.with(this).load(dataItem.imageUrl).into(ivImage)
            tvDateTime.text = dataItem.time
            tvHeadline.setOnClickListener {
                searchArticleClickListener.onSearchArticleClick(dataItem)
            }
            ibShare.setOnClickListener {
                searchArticleClickListener.onSearchShareClick(dataItem)
            }

            ibSave.setOnClickListener {
                ibSave.visibility = View.INVISIBLE
                ibSave2.visibility = View.VISIBLE
                searchArticleClickListener.onSearchSaveClicked(dataItem)
            }
        }
    }
}