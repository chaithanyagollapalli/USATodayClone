package com.example.usatoday.views.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.usatoday.data.model.Response
import kotlinx.android.synthetic.main.popular_item_layout.view.*

class PopularViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun setData(popularResponse: Response) {
        itemView.apply {
            tvRanking.text = popularResponse.ranking.toString()
            tvTitle.text = popularResponse.heading
            tvTime.text = popularResponse.time

        }
    }
}