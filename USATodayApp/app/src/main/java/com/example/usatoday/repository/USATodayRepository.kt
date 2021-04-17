package com.example.usatoday.repository

import com.example.usatoday.data.model.Response
import com.example.usatoday.data.model.SubCategoryDTO
import com.example.usatoday.data.model.VideosDTO
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

    suspend fun getMyTopics(): Resource<List<Response>> {
        val result = apiClient.getMyTopics()

        return try {
            responseHandler.handleSuccess(result)

        } catch (e: Exception) {
            responseHandler.handleException(e)
        }
    }

    suspend fun getSavedNews(): Resource<List<Response>> {
        val result = apiClient.getSavedNews()

        return try {
            responseHandler.handleSuccess(result)

        } catch (e: Exception) {
            responseHandler.handleException(e)
        }
    }

    suspend fun getAllSubCategory(): Resource<List<SubCategoryDTO>> {
        val result = apiClient.getSubCategoryList()

        return try {
            responseHandler.handleSuccess(result)

        } catch (e: Exception) {
            responseHandler.handleException(e)
        }
    }

    suspend fun getAllVideos(): Resource<List<VideosDTO>> {
        val result = apiClient.getAllVideos()

        return try {
            responseHandler.handleSuccess(result)

        } catch (e: Exception) {
            responseHandler.handleException(e)
        }
    }

    suspend fun saveTopic(id: Int): Resource<List<SubCategoryDTO>> {
        val result = apiClient.saveTopic(id)

        return try {
            responseHandler.handleSuccess(result)

        } catch (e: Exception) {
            responseHandler.handleException(e)
        }
    }

    suspend fun delTopic(id: Int): Resource<List<SubCategoryDTO>> {
        val result = apiClient.delTopic(id)

        return try {
            responseHandler.handleSuccess(result)

        } catch (e: Exception) {
            responseHandler.handleException(e)
        }
    }

}