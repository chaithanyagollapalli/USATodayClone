package com.example.usatoday.data.remote

import com.example.usatoday.data.model.*
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface APIService {

    @GET("allnews")
    suspend fun getAllNews(): List<Response>

    @GET("popular")
    suspend fun getPopularNews(): List<Response>

    @GET("movies")
    suspend fun getAllMoviesNews(): List<Response>

    @GET("finance")
    suspend fun getAllFinanceNews(): List<Response>

    @GET("olympics")
    suspend fun getAllOlympicsNews(): List<Response>

    @GET("tech")
    suspend fun getAllTechNews(): List<Response>

    @GET("destination")
    suspend fun getAllDestinationNews(): List<Response>

    @GET("airline")
    suspend fun getAllAirlineNews(): List<Response>

    @GET("mytopics")
    suspend fun getMyTopics(): List<Response>

    @GET("savednews")
    suspend fun getSavedNews(): List<Response>

    @GET("allsubcategory")
    suspend fun getSubCategoryList(): List<SubCategoryDTO>

    @GET("videos")
    suspend fun getAllVideos(): List<VideosDTO>

    @POST("savetopic/{id}")
    suspend fun saveTopic(@Path("id") id: Int): List<SubCategoryDTO>

    @POST("deltopic/{id}")
    suspend fun delTopic(@Path("id") id: Int): List<SubCategoryDTO>

    @POST("save/{id}")
    suspend fun saveNews(@Path("id") id: Int): List<Response>

    @GET("news")
    suspend fun getSearchResults(@Query("category") category: String): SearchResponse

}