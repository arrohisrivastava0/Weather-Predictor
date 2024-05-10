package com.example.weatherpredictor

import retrofit2.Call
import retrofit2.http.GET
interface ApiService {
    @GET("0_9e049a7702d24f6c859d899513526b76_1.json") //Json file name
    fun getSensorData(): Call<List<SensorData>>
}