package com.example.weatherpredictor

data class SensorData(
    val temperature: Double,
    val humidity: Double,
    val EventProcessedUtcTime: String,
    val PartitionId: Int,
    val EventEnqueuedUtcTime: String,
    val IoTHub: IoTHub
)
