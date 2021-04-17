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

    fun getPopularNews() : LiveData<Resource<List<Response>>>{
        return liveData(Dispatchers.IO) {
            val result = usaTodayRepository.getPopularNews()
            emit(result)
        }
    }

}