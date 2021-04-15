package com.example.usatoday.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Response(

	@field:SerializedName("vid")
	val vid: String? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("heading")
	val heading: String? = null,

	@field:SerializedName("subCatId")
	val subCatId: Int? = null,

	@field:SerializedName("reporterId")
	val reporterId: Int? = null,

	@field:SerializedName("ranking")
	val ranking: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("time")
	val time: String? = null,

	@field:SerializedName("desc")
	val desc: String? = null
)