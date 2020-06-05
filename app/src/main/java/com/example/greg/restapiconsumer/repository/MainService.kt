package com.example.greg.restapiconsumer.repository

import com.example.greg.restapiconsumer.repository.MainRepository.Companion.API_ENDPOINT
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface MainService {

    @GET(API_ENDPOINT)
    suspend fun getData(
        @Query("api_key") apiKey: String,
        @Query("feedtype") feedType: String,
        @Query("ver") version: String
    ): ResponseBody //todo: replace ResponseBody with actual data model


}