package com.beta.cuckoo.Network.Posts

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface CreateNewPostService {
    @POST("/api/v1/cuckooPost")
    @FormUrlEncoded
    fun createNewPost(@Field("content") content: String, @Field("writer") writer: String, @Field("numOfImages") numOfImages: Int): Call<Any>
}