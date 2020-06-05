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

    suspend fun getData() = webservice.getData()

    companion object {
        const val API_ENDPOINT = "{your api endpoint}"
        const val BASE_API_URL = "{your api URL}"
    }
}