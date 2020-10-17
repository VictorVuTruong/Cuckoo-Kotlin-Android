package com.beta.myhbt_api.Controller

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetAllHBTGramPostLikesService {
    @GET("/api/v1/hbtGramPostLike")
    fun getPostLikes(@Query("postId") postId: String): Call<Any>
}