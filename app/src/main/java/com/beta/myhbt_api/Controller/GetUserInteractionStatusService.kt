package com.beta.myhbt_api.Controller

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetUserInteractionStatusService {
    @GET("/api/v1/hbtGramAccountStats/getUserInteractionStatusForUser")
    fun getUserInteractionStatus(@Query("userId") userId: String, @Query("limit") limit: Int): Call<Any>
}