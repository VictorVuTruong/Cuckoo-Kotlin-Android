package com.beta.cuckoo.Network.Notifications

import retrofit2.Call
import retrofit2.http.GET

interface GetOrderInCollectionOfLatestNotificationService {
    @GET("/api/v1/cuckooNotifications/getOrderInCollectionOfLatestNotification")
    fun getOrderInCollectionOfLatestNotification(): Call<Any>
}