package com.example.usatoday.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.usatoday.data.model.Response
import com.example.usatoday.data.model.SubCategoryDTO
import com.example.usatoday.data.model.VideosDTO
import com.example.usatoday.data.remote.Resource
import com.example.usatoday.repository.USATodayRepository
import kotlinx.coroutines.Dispatchers

class USATodayViewModel() : ViewModel() {

    private val usaTodayRepository = USATodayRepository()

    fun getAllNews(): LiveData<Resource<List<Response>>> {

        return liveData(Dispatchers.IO) {
            val result = usaTodayRepository.getAllNews()
            emit(result)
        }
    }

    fun getAllMoviesNews(): LiveData<Resource<List<Response>>> {

        return liveData(Dispatchers.IO) {
            val result = usaTodayRepository.getAllMoviesNews()
            emit(result)
        }
    }

    fun getAllFinanceNews(): LiveData<Resource<List<Response>>> {

        return liveData(Dispatchers.IO) {
            val result = usaTodayRepository.getAllFinanceNews()
            emit(result)
        }
    }

    fun getAllOlympicsNews(): LiveData<Resource<List<Response>>> {

        return liveData(Dispatchers.IO) {
            val result = usaTodayRepository.getAllOlympicsNews()
            emit(result)
        }
    }

    fun getAllTechNews(): LiveData<Resource<List<Response>>> {

        return liveData(Dispatchers.IO) {
            val result = usaTodayRepository.getAllTechNews()
            emit(result)
        }
    }

    fun getSavedNews(): LiveData<Resource<List<Response>>> {

        return liveData(Dispatchers.IO) {
            val result = usaTodayRepository.getSavedNews()
            emit(result)
        }
    }

    fun getAllDestinationNews(): LiveData<Resource<List<Response>>> {

        return liveData(Dispatchers.IO) {
            val result = usaTodayRepository.getAllDestinationNews()
            emit(result)
        }
    }

    fun getAllAirlineNews(): LiveData<Resource<List<Response>>> {

        return liveData(Dispatchers.IO) {
            val result = usaTodayRepository.getAllAirlineNews()
            emit(result)
        }
    }

    fun getMyTopics(): LiveData<Resource<List<Response>>> {

        return liveData(Dispatchers.IO) {
            val result = usaTodayRepository.getMyTopics()
            emit(result)
        }
    }

    fun getSubCategories(): LiveData<Resource<List<SubCategoryDTO>>> {

        return liveData(Dispatchers.IO) {
            val result = usaTodayRepository.getAllSubCategory()
            emit(result)
        }
    }

    fun getAllVideos(): LiveData<Resource<List<VideosDTO>>> {
        return liveData(Dispatchers.IO) {
            val result = usaTodayRepository.getAllVideos()
            emit(result)
        }
    }

    fun saveTopic(id: Int): LiveData<Resource<List<SubCategoryDTO>>> {
        return liveData(Dispatchers.IO) {
            val result = usaTodayRepository.saveTopic(id)
            emit(result)
        }
    }

    fun delTopic(id: Int): LiveData<Resource<List<SubCategoryDTO>>> {
        return liveData(Dispatchers.IO) {
            val result = usaTodayRepository.delTopic(id)
            emit(result)
        }
    }

    fun saveNews(id: Int): LiveData<Resource<List<Response>>> {
        return liveData(Dispatchers.IO) {
            val result = usaTodayRepository.saveNews(id)
            emit(result)
        }
    }

    fun removeNews(id: Int): LiveData<Resource<List<Response>>> {
        return liveData(Dispatchers.IO) {
            val result = usaTodayRepository.removeNews(id)
            emit(result)
        }
    }

    fun removeAllSaved(): LiveData<Resource<List<Response>>> {
        return liveData(Dispatchers.IO) {
            val result = usaTodayRepository.removeAllSaved()
            emit(result)
        }
    }

    fun getPopularNews(): LiveData<Resource<List<Response>>> {
        return liveData(Dispatchers.IO) {
            val result = usaTodayRepository.getPopularNews()
            emit(result)
        }
    }

}