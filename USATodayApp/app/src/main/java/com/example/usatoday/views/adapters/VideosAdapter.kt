package com.example.usatoday.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import com.example.usatoday.R
import com.example.usatoday.data.model.VideosDTO
import com.example.usatoday.views.viewholders.VideoViewHolder
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class VideosAdapter(private val videosList: List<VideosDTO>, private val lifecycle: Lifecycle) :
    RecyclerView.Adapter<VideoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val view: YouTubePlayerView = LayoutInflater.from(parent.context)
            .inflate(R.layout.videos_sample_layout, parent, false) as YouTubePlayerView

        lifecycle.addObserver(view)
        return VideoViewHolder(view)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        holder.setData(videosList[position].vidId);
//        val video = videosList[position]
//        holder.setData(video)
    }

    override fun getItemCount(): Int {
        return videosList.size
    }
}