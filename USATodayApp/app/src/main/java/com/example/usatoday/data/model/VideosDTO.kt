package com.example.usatoday.data.model

import com.google.gson.annotations.SerializedName

data class VideosDTO(

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("vidId")
	val vidId: String? = null
)