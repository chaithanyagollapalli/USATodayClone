package com.example.usatoday.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.usatoday.R
import com.example.usatoday.data.model.DataItem
import kotlinx.android.synthetic.main.activity_article.*

class SearchArticleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_article)

        val dataItem: DataItem = intent.getSerializableExtra("dataItem") as DataItem

        if (dataItem != null) {
            tvArticleHeadline.text = dataItem.title
            tvArticleTime.text = dataItem.time
            Glide.with(ivArticleImage).load(dataItem.imageUrl).into(ivArticleImage)
            tvArticleContent.text = dataItem.content
        }

    }
}