package com.example.usatoday.views.mainScreenFragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.usatoday.R
import com.example.usatoday.data.model.Response
import com.example.usatoday.viewmodel.USATodayViewModel
import com.example.usatoday.views.activities.MyTopicsFilterActivity
import com.example.usatoday.views.activities.ArticleActivity
import com.example.usatoday.views.activities.SettingActivity
import com.example.usatoday.views.adapters.NewsAdapter
import com.example.usatoday.views.interfaces.ArticleClickListener
import com.example.usatoday.views.interfaces.ShareClickListener
import kotlinx.android.synthetic.main.fragment_my_topics.*

class MyTopicsFragment : Fragment(), ArticleClickListener, ShareClickListener {

    private val list = mutableListOf<Response>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_topics, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        animationViewMyTopics.isVisible = false
        pbMyTopics.isVisible = true

        initClickListener()

        rvMyTopics.layoutManager = LinearLayoutManager(activity)
        val newsAdapter = NewsAdapter(list, this, this)
        rvMyTopics.adapter = newsAdapter

        val usaTodayViewModel = ViewModelProviders.of(this).get(USATodayViewModel::class.java)

        usaTodayViewModel.getMyTopics().observe(viewLifecycleOwner, Observer {
            val result = it.data!!
            if (result.isEmpty()) {
                animationViewMyTopics.isVisible = true
            }
            list.addAll(result)
            pbMyTopics.isVisible = false;
            newsAdapter.notifyDataSetChanged()
        })

        ivSettingsMyTopics.setOnClickListener {
            val intent = Intent(activity, SettingActivity::class.java)
            startActivity(intent)
        }
    }

    private fun initClickListener() {
        ivFilterMyTopics.setOnClickListener {
            val intent = Intent(context, MyTopicsFilterActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onArticleClick(response: Response) {
        val intent = Intent(activity, ArticleActivity::class.java)
        intent.putExtra("response", response)
        startActivity(intent)
    }

    override fun onSaveClicked(response: Response) {
        val usaTodayViewModel = ViewModelProviders.of(this).get(USATodayViewModel::class.java)

        usaTodayViewModel.saveNews(response.id!!).observe(viewLifecycleOwner, Observer {
            val result = it.data!!
        })

        Toast.makeText(context, "Saved..", Toast.LENGTH_SHORT).show()
    }

    override fun onShareClick(response: Response) {
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, response.heading.toString() + "\n" + "\n" + response.img)
            type = "text/plain"
        }

        val shareIntent = Intent.createChooser(sendIntent, null)
        startActivity(shareIntent)
    }

}