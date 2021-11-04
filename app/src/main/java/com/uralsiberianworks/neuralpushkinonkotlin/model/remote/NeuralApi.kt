package com.uralsiberianworks.neuralpushkinonkotlin.model.remote

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NeuralApi {
    @GET(Endpoints.MESSAGE)
    suspend fun getMessage(
        @Query("text") text: String?,
        @Query("temp") temp: Double,
        @Query("length") length: Int
    ): Response<MessageResponse>


    @Deprecated("Not in use now")
    @GET(Endpoints.POEM)
    suspend fun getPushkinPoem(
        @Query("name") name: String?,
        @Query("temp") temp: Double,
        @Query("length") length: Int
    ): Response<MessageResponse>
}