package com.example.usatoday.views.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.usatoday.data.model.VideosDTO
import kotlinx.android.synthetic.main.videos_sample_layout.view.*

class VideosViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun setData(videosDTO: VideosDTO){
        itemView.apply {
            wvVideos.settings.javaScriptEnabled = true
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                wvVideos.webChromeClient
            }

            tvVideos.text = videosDTO.vidTitle
        }
    }

}