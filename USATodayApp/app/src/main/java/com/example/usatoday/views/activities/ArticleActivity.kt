package com.example.usatoday.views.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.navArgs
import com.bumptech.glide.Glide
import com.example.usatoday.R
import com.example.usatoday.data.model.Response
import com.example.usatoday.views.fragments.ArticleFragmentArgs
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_article.*

class ArticleActivity : AppCompatActivity() {

    val args: ArticleFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)

        val gson = Gson()
        val response = gson.fromJson<Response>(args.response, Response::class.java)

        tvArticleHeadline.text = response.heading
        Glide.with(ivArticleImage).load(response.img).into(ivArticleImage)
        tvArticleContent.text = response.desc

    }
}