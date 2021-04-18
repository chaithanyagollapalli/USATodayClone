package com.example.usatoday.views.interfaces

import com.example.usatoday.data.model.SubCategoryDTO

interface SwitchListener {
    fun switchStatus(subCategoryDTO: SubCategoryDTO)
}