package com.example.usatoday.data.remote

import com.example.usatoday.data.model.Response
import retrofit2.http.GET

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

}