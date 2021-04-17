package com.example.usatoday.views.mainScreenFragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.usatoday.R
import com.example.usatoday.data.model.Response
import com.example.usatoday.viewmodel.USATodayViewModel
import com.example.usatoday.views.activities.ArticleActivity
import com.example.usatoday.views.adapters.NewsAdapter
import com.example.usatoday.views.interfaces.ArticleClickListener
import kotlinx.android.synthetic.main.fragment_top_stories.*


class TopStoriesFragment : Fragment(), ArticleClickListener {

    val list = mutableListOf<Response>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_top_stories, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        pbTopStories.isVisible = true

        rvTopStories.layoutManager = LinearLayoutManager(activity)
        val newsAdapter = NewsAdapter(list, this)
        rvTopStories.adapter = newsAdapter

        val usaTodayViewModel = ViewModelProviders.of(this).get(USATodayViewModel::class.java)

        usaTodayViewModel.getAllNews().observe(viewLifecycleOwner, Observer {
            val result = it.data!!
            list.addAll(result)
            pbTopStories.isVisible = false
            newsAdapter.notifyDataSetChanged()
        })

    }

    override fun onArticleClick(response: Response) {
        val intent = Intent(activity, ArticleActivity::class.java)
        intent.putExtra("response", response)
        startActivity(intent)

    }

    override fun onSaveClicked(response: Response) {

    }
}