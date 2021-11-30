package com.example.topnews.api

import com.example.topnews.domain.data.News
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface NewsApi {
    companion object {
        const val BASE_URL = "https://api.nytimes.com/svc/topstories/v2/"
        const val ACCESS_KEY = "GirMSAG07vxCgsEzzABVNJyV7JQBg6CS"
    }

    @GET("{section}.json")
    suspend fun getNewsApi(
     @Path("section") section: String = "home",
     @Query("api-key") apiKey: String = ACCESS_KEY
    ): News
}