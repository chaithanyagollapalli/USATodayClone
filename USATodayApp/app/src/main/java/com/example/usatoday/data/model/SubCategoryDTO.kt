package com.example.usatoday.data.model

import com.google.gson.annotations.SerializedName

data class SubCategoryDTO(

	@field:SerializedName("catId")
	val catId: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)