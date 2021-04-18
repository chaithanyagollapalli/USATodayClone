package com.example.usatoday.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.usatoday.R
import com.example.usatoday.data.model.VideosDTO
import com.example.usatoday.viewmodel.USATodayViewModel
import com.example.usatoday.views.adapters.VideosAdapter
import kotlinx.android.synthetic.main.activity_videos.*

class VideosActivity : AppCompatActivity() {

    private val videosList = mutableListOf<VideosDTO>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videos)

        pbVideos.isVisible = true

        rvVideos.layoutManager = LinearLayoutManager(this)
        val videosAdapter = VideosAdapter(videosList, this.lifecycle)
        rvVideos.adapter = videosAdapter

        val usaTodayViewModel = ViewModelProviders.of(this).get(USATodayViewModel::class.java)

        usaTodayViewModel.getAllVideos().observe(this, Observer {
            val result = it.data!!
            videosList.addAll(result)
            pbVideos.isVisible = false;
            videosAdapter.notifyDataSetChanged()
        })
    }
}