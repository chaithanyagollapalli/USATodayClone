package com.example.usatoday.data.model

import com.google.gson.annotations.SerializedName

data class VideosDTO(

	@field:SerializedName("vidTitle")
	val vidTitle: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("vidUrl")
	val vidUrl: String? = null,

	@field:SerializedName("vidId")
	val vidId: String? = null
)