package com.example.usatoday.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.usatoday.R
import com.example.usatoday.data.model.SubCategoryDTO
import com.example.usatoday.viewmodel.USATodayViewModel
import com.example.usatoday.views.adapters.TopicFilterAdapter
import kotlinx.android.synthetic.main.activity_my_topics_filter.*

class MyTopicsFilterActivity : AppCompatActivity(), SwitchListener {

    private val subCategories = mutableListOf<SubCategoryDTO>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_topics_filter)

        pbSuggestedTopics.isVisible = true

        rvSuggestedTopics.layoutManager = LinearLayoutManager(this)
        val topicFilterAdapter = TopicFilterAdapter(subCategories, this)
        rvSuggestedTopics.adapter = topicFilterAdapter

        val usaTodayViewModel = ViewModelProviders.of(this).get(USATodayViewModel::class.java)

        usaTodayViewModel.getSubCategories().observe(this, Observer {
            val result = it.data!!
            subCategories.addAll(result)
            pbSuggestedTopics.isVisible = false;
            topicFilterAdapter.notifyDataSetChanged()
        })

    }

    override fun switchStatus(value: Boolean, position: Int) {
            val usaTodayViewModel = ViewModelProviders.of(this).get(USATodayViewModel::class.java)

    }
}