package com.pseedk.forawea.api

import com.pseedk.forawea.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather/London")
    suspend fun getWeather(): Response<Weather>
}
