package com.example.usatoday.views.interfaces

import com.example.usatoday.data.model.DataItem

interface SearchArticleClickListener {

    fun onSearchArticleClick(dataItem: DataItem)

    fun onSearchShareClick(dataItem: DataItem)

    fun onSearchSaveClicked(dataItem: DataItem)

}