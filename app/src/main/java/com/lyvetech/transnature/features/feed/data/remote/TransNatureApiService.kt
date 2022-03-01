package com.lyvetech.transnature.features.feed.data.remote

import com.lyvetech.transnature.features.feed.data.remote.dto.TrailDto
import retrofit2.http.GET
import retrofit2.http.Path

interface TransNatureApiService {

    @GET("{trail}")
    suspend fun getSpecificTrail(
        @Path("trail") trail: String
    ): List<TrailDto>

    @GET("/trails")
    suspend fun getAllTrails(): List<TrailDto>

    companion object {
        const val BASE_URL = "http://93.122.176.8100"
    }
}