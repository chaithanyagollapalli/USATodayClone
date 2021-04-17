package com.example.usatoday.views.mainScreenFragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.usatoday.R
import com.example.usatoday.data.model.Response
import com.example.usatoday.viewmodel.USATodayViewModel
import com.example.usatoday.views.activities.ArticleActivity
import com.example.usatoday.views.adapters.TopStoriesAdapter
import com.example.usatoday.views.interfaces.ArticleClickListener
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_top_stories.*


class TopStoriesFragment : Fragment(), ArticleClickListener {

    val list = mutableListOf<Response>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_top_stories, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        rvTopStories.layoutManager = LinearLayoutManager(activity)
        val topStoriesAdapter = TopStoriesAdapter(list, this)
        rvTopStories.adapter = topStoriesAdapter


        val usaTodayViewModel = ViewModelProviders.of(this).get(USATodayViewModel::class.java)

        usaTodayViewModel.getAllNews().observe(this, Observer {
            val result = it.data!!
            list.addAll(result)
            topStoriesAdapter.notifyDataSetChanged()
        })


//        AllCategoriesFragment allCategoriesFragment = new AllCategoriesFragment();
//            getActivity().getSupportFragmentManager().beginTransaction().add(R.id.nav_host_fragment, allCategoriesFragment, "AllCategoriesFragment")
//                    .addToBackStack(null)
//                    .commit();


    }


    companion object {
        fun newInstance() =
            TopStoriesFragment().apply {

            }
    }

    override fun onArticleClick(response: Response) {

        val gson = Gson()
        val myJson = gson.toJson(response)

//        val action = TopStoriesFragmentDirections.actionTopStoriesFragmentToArticleFragment(myJson)
//        findNavController().navigate(action)

        val intent = Intent(activity, ArticleActivity::class.java)
        intent.putExtra("response", myJson)
        startActivity(intent)

    }
}