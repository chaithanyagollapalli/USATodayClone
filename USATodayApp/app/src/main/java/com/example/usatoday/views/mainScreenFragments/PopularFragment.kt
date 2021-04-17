package com.example.usatoday.views.mainScreenFragments

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.usatoday.R
import com.example.usatoday.data.model.Response
import com.example.usatoday.viewmodel.USATodayViewModel
import com.example.usatoday.views.adapters.PopularAdapter
import kotlinx.android.synthetic.main.fragment_popular.*
import kotlinx.android.synthetic.main.fragment_top_stories.*

class PopularFragment : Fragment() {
    private val list = mutableListOf<Response>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_popular, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        rvPopularStories.layoutManager = LinearLayoutManager(activity)
        val popularAdapter = PopularAdapter(list)
        rvPopularStories.adapter = popularAdapter


        val usaTodayViewModel = ViewModelProviders.of(this).get(USATodayViewModel::class.java)

        usaTodayViewModel.getPopularNews().observe(viewLifecycleOwner, Observer {
            val result = it.data!!
            list.addAll(result)
            popularAdapter.notifyDataSetChanged()
        })


    }

    companion object {

        fun newInstance() =
            PopularFragment().apply {

            }
    }
}