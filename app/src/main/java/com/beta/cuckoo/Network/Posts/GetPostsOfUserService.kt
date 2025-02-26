package com.beta.cuckoo.Network.Posts

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetPostsOfUserService {
    @GET("/api/v1/cuckooPost")
    fun getPostsOfUser(@Query("writer") userId: String): Call<Any>
}