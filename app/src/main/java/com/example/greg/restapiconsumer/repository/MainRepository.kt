package com.example.greg.restapiconsumer.repository

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainRepository {

    private val webservice: MainService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_API_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(MainService::class.java)
    }

    suspend fun getData() = webservice.getData("DEMO_KEY", "json", "1.0")

    companion object {
        //TODO replace with your API values
        /**
         * Example API values from NASA https://api.nasa.gov/
         */
        const val API_ENDPOINT = "/insight_weather/"
        const val BASE_API_URL = "https://api.nasa.gov?api_key=DEMO_KEY&feedtype=json&ver=1.0"
    }
}