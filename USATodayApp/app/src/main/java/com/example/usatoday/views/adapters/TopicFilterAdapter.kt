package com.example.usatoday.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.usatoday.R
import com.example.usatoday.data.model.SubCategoryDTO
import com.example.usatoday.views.interfaces.SwitchListener
import com.example.usatoday.views.viewholders.TopicFilterViewHolder

class TopicFilterAdapter(
    private val subCategories: List<SubCategoryDTO>,
    private val switchListener: SwitchListener
) :
    RecyclerView.Adapter<TopicFilterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopicFilterViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.suggested_topics_item_layout, parent, false)
        return TopicFilterViewHolder(view)
    }

    override fun onBindViewHolder(holder: TopicFilterViewHolder, position: Int) {
        val subCategory = subCategories[position]
        holder.setData(subCategory, switchListener)
    }

    override fun getItemCount(): Int {
        return subCategories.size
    }
}