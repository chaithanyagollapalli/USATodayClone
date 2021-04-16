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

    suspend fun getAllMoviesNews(): Resource<List<Response>> {
        val result = apiClient.getAllMoviesNews()

        return try {
            responseHandler.handleSuccess(result)

        } catch (e: Exception) {
            responseHandler.handleException(e)
        }
    }

    suspend fun getAllFinanceNews(): Resource<List<Response>> {
        val result = apiClient.getAllFinanceNews()

        return try {
            responseHandler.handleSuccess(result)

        } catch (e: Exception) {
            responseHandler.handleException(e)
        }
    }

    suspend fun getAllOlympicsNews(): Resource<List<Response>> {
        val result = apiClient.getAllOlympicsNews()

        return try {
            responseHandler.handleSuccess(result)

        } catch (e: Exception) {
            responseHandler.handleException(e)
        }
    }

    suspend fun getAllTechNews(): Resource<List<Response>> {
        val result = apiClient.getAllTechNews()

        return try {
            responseHandler.handleSuccess(result)

        } catch (e: Exception) {
            responseHandler.handleException(e)
        }
    }

    suspend fun getAllDestinationNews(): Resource<List<Response>> {
        val result = apiClient.getAllDestinationNews()

        return try {
            responseHandler.handleSuccess(result)

        } catch (e: Exception) {
            responseHandler.handleException(e)
        }
    }

    suspend fun getAllAirlineNews(): Resource<List<Response>> {
        val result = apiClient.getAllAirlineNews()

        return try {
            responseHandler.handleSuccess(result)

        } catch (e: Exception) {
            responseHandler.handleException(e)
        }
    }

}