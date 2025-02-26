package com.beta.cuckoo.Network.User

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface SignUpService {
    @POST("/api/v1/users/signup")
    @FormUrlEncoded
    fun signUp(@Field("email") email: String, @Field("password") password: String, @Field("passwordConfirm") passwordConfirm: String, @Field("fullName") fullName: String,
               @Field("avatarURL") avatarURL: String, @Field("coverURL") coverURL: String): Call<Any>
}