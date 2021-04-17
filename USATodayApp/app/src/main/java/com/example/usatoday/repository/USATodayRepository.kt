package com.example.usatoday.repository

import com.example.usatoday.data.model.Response
import com.example.usatoday.data.remote.APIService
import com.example.usatoday.data.remote.Network
import com.example.usatoday.data.remote.Resource
import com.example.usatoday.data.remote.ResponseHandler

class USATodayRepository {

    private val apiClient: APIService = Network.getInstance().create(APIService::class.java)



    private val responseHandler = ResponseHandler()

    suspend fun getAllNews(): Resource<List<Response>> {

        val result = apiClient.getAllNews()

        try {
            return responseHandler.handleSuccess(result)

        } catch (e: Exception) {
            return responseHandler.handleException(e)
        }
    }

    suspend fun getPopularNews(): Resource<List<Response>> {
        val result = apiClient.getPopularNews()
        try {
            return responseHandler.handleSuccess(result)

        } catch (e: Exception) {
            return responseHandler.handleException(e)
        }
    }

}