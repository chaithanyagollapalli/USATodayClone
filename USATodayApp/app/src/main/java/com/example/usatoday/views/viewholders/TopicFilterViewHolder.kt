package com.example.usatoday.views.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.usatoday.data.model.SubCategoryDTO
import com.example.usatoday.views.interfaces.SwitchListener
import kotlinx.android.synthetic.main.suggested_topics_item_layout.view.*

class TopicFilterViewHolder(view: View, private val switchListener: SwitchListener) :
    RecyclerView.ViewHolder(view) {

    fun setData(subCategoryDTO: SubCategoryDTO) {

        itemView.apply {
            tvSectionName.text = subCategoryDTO.name;

            ibAddSection.setOnClickListener {
                switchListener.switchStatus(subCategoryDTO)
            }
        }
    }
}