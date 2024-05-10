package com.example.weatherpredictor

import retrofit2.Call
import retrofit2.http.GET
interface ApiService {
    @GET("<YOUR_JSON_FILE_NAME>.json") //Json file name
    fun getSensorData(): Call<List<SensorData>>
}