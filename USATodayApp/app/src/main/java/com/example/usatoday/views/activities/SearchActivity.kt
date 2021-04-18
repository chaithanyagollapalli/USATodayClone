package com.example.usatoday.views.activities

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.usatoday.R
import com.example.usatoday.data.model.DataItem
import com.example.usatoday.viewmodel.USATodayViewModel
import com.example.usatoday.views.adapters.SearchAdapter
import com.example.usatoday.views.interfaces.SearchArticleClickListener
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : AppCompatActivity(), SearchArticleClickListener {

    val list = mutableListOf<DataItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        rvSearchBar.layoutManager = LinearLayoutManager(this)
        val searchAdapter = SearchAdapter(list, this)
        rvSearchBar.adapter = searchAdapter

        val usaTodayViewModel = ViewModelProviders.of(this).get(USATodayViewModel::class.java)

        etSearch.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val category = s.toString()
                usaTodayViewModel.getSearchResults(category).observe(this@SearchActivity, Observer {
                    list.clear()
                    val result = it.data!!
                    val dataItemList: List<DataItem> = result.data as List<DataItem>
                    list.addAll(dataItemList)
                    searchAdapter.notifyDataSetChanged()
                })
            }
        })


    }

    override fun onSearchArticleClick(dataItem: DataItem) {
        val intent = Intent(this, SearchArticleActivity::class.java)
        intent.putExtra("dataItem", dataItem)
        startActivity(intent)
    }

    override fun onSearchShareClick(dataItem: DataItem) {

    }

    override fun onSearchSaveClicked(dataItem: DataItem) {
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, dataItem.title + "\n" + "\n" + dataItem.readMoreUrl)
            type = "text/plain"
        }

        val shareIntent = Intent.createChooser(sendIntent, null)
        startActivity(shareIntent)
    }
}