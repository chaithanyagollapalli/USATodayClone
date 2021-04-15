package com.example.usatoday.views

import android.app.Application
import com.example.usatoday.repository.USATodayRepository

class USATodayApplication : Application() {

    val usaTodayRepository by lazy {
        USATodayRepository()
    }

}