package com.example.usatoday.data.remote

import com.example.usatoday.data.model.Response
import retrofit2.http.GET

interface APIService {

    @GET("allnews")
    suspend fun getAllNews(): List<Response>

}