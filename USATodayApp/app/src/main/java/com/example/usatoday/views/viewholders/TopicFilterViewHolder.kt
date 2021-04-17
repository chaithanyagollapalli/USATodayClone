package com.example.usatoday.views.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.usatoday.data.model.SubCategoryDTO
import com.example.usatoday.views.SwitchListener
import kotlinx.android.synthetic.main.suggested_topics_item_layout.view.*

class TopicFilterViewHolder(view: View) :
    RecyclerView.ViewHolder(view) {

    fun setData(subCategoryDTO: SubCategoryDTO, switchListener: SwitchListener) {

        itemView.apply {
            tvSectionName.text = subCategoryDTO.name;

            if (scSection.isActivated) {
                switchListener.switchStatus(true, adapterPosition)
            } else {
                switchListener.switchStatus(false, adapterPosition)
            }
        }
    }
}