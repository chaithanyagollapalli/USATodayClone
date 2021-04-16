package com.example.usatoday.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.usatoday.data.model.Response
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

}