package com.example.usatoday.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.usatoday.R
import com.example.usatoday.data.model.VideosDTO
import com.example.usatoday.views.viewholders.VideosViewHolder

class VideosAdapter(private val videosList: List<VideosDTO>) :
    RecyclerView.Adapter<VideosViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideosViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.videos_sample_layout, parent, false)
        return VideosViewHolder(view)
    }

    override fun onBindViewHolder(holder: VideosViewHolder, position: Int) {
        val video = videosList[position]
        holder.setData(video)
    }

    override fun getItemCount(): Int {
        return videosList.size
    }
}