package com.example.usatoday.data.remote

import com.example.usatoday.data.model.Response
import com.example.usatoday.data.model.SubCategoryDTO
import com.example.usatoday.data.model.VideosDTO
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface APIService {

    @GET("allnews")
    suspend fun getAllNews(): List<Response>

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

}