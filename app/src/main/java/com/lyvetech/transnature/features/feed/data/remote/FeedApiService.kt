package com.lyvetech.transnature.features.feed.data.remote

import com.lyvetech.transnature.features.feed.data.remote.dto.TrailDto
import com.lyvetech.transnature.features.feed.domain.model.Trail
import retrofit2.http.GET
import retrofit2.http.Path

interface FeedApiService {

    @GET("{trail}")
    suspend fun getSearchedTrails(
        @Path("trail") trail: String
    ): List<TrailDto>

    @GET("/trails")
    suspend fun getAllTrails(): List<TrailDto>

    companion object {
        const val BASE_URL = "http://93.122.176.8100"
    }
}