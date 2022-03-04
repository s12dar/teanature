package com.lyvetech.transnature.features.feed.domain.usecase

import com.lyvetech.transnature.core.util.Resource
import com.lyvetech.transnature.features.feed.domain.model.Trail
import kotlinx.coroutines.flow.Flow

interface FeedInfoUseCase {

    suspend fun getSearchedTrails(name: String): Flow<Resource<List<Trail>>>

    suspend fun getAllTrails(): Flow<Resource<List<Trail>>>
}