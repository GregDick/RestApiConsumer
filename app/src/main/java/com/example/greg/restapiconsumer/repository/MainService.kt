package com.example.greg.restapiconsumer.repository

import com.example.greg.restapiconsumer.repository.MainRepository.Companion.API_ENDPOINT
import retrofit2.http.GET

interface MainService {

    @GET(API_ENDPOINT)
    suspend fun getData(): String //todo: replace with return data type


}