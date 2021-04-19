package com.example.usatoday.views.mainScreenFragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.usatoday.R
import com.example.usatoday.data.model.Response
import com.example.usatoday.viewmodel.USATodayViewModel
import com.example.usatoday.views.activities.ArticleActivity
import com.example.usatoday.views.activities.SettingActivity
import com.example.usatoday.views.adapters.NewsAdapter
import com.example.usatoday.views.adapters.SavedAdapter
import com.example.usatoday.views.interfaces.ArticleClickListener
import com.example.usatoday.views.interfaces.ShareClickListener
import kotlinx.android.synthetic.main.fragment_saved.*


class SavedFragment : Fragment(), ArticleClickListener, ShareClickListener {

    val list = mutableListOf<Response>()
    lateinit var savedAdapter: SavedAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_saved, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        pbSaved.isVisible = true
        animationView.isVisible = false

        rvSaved.layoutManager = LinearLayoutManager(activity)
        savedAdapter = SavedAdapter(list, this, this)
        rvSaved.adapter = savedAdapter

        val usaTodayViewModel = ViewModelProviders.of(this).get(USATodayViewModel::class.java)

        usaTodayViewModel.getSavedNews().observe(viewLifecycleOwner, Observer {
            val result = it.data!!
            if (result.isEmpty()) {
                animationView.isVisible = true
            }
            list.addAll(result)
            pbSaved.isVisible = false;
            savedAdapter.notifyDataSetChanged()
        })

        ivDeleteSaved.setOnClickListener {

            usaTodayViewModel.removeAllSaved()
            usaTodayViewModel.getSavedNews().observe(viewLifecycleOwner, Observer {
                list.clear()
                val result = it.data!!
                Toast.makeText(context, "Removed", Toast.LENGTH_SHORT).show()
                savedAdapter.notifyDataSetChanged()
                animationView.isVisible = true
            })
        }

        ivSettingsSaved.setOnClickListener {
            val intent = Intent(activity, SettingActivity::class.java)
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

        usaTodayViewModel.removeNews(response.id!!).observe(viewLifecycleOwner, Observer {
            val result = it.data!!
            if (result.isEmpty()) {
                animationView.isVisible = true
            }
            list.addAll(result)
            pbSaved.isVisible = false;
            savedAdapter.notifyDataSetChanged()
        })
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