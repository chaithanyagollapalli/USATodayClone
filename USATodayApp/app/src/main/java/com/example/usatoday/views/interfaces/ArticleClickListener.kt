package com.example.usatoday.views.interfaces

import com.example.usatoday.data.model.Response


interface ArticleClickListener {

    fun onArticleClick(response: Response)

    fun onSaveClicked(response: Response)

}