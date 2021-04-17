package com.example.usatoday.views.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.usatoday.R
import com.example.usatoday.data.model.Response
import kotlinx.android.synthetic.main.activity_article.*

class ArticleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)

        val response: Response = intent.getSerializableExtra("response") as Response

        tvArticleHeadline.text = response.heading
        tvArticleTime.text = response.time
        Glide.with(ivArticleImage).load(response.img).into(ivArticleImage)
        tvArticleContent.text = response.desc

    }
}