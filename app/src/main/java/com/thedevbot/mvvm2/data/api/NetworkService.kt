package com.thedevbot.mvvm2.data.api

import com.thedevbot.mvvm2.data.model.TopHeadlinesResponse
import com.thedevbot.mvvm2.utils.AppConstant.API_KEY
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface NetworkService {

    @Headers("X-Api-Key: $API_KEY", "User-Agent: ABC")
    @GET("top-headlines")
    suspend fun getTopHeadlines(@Query("country") country: String): TopHeadlinesResponse

}
