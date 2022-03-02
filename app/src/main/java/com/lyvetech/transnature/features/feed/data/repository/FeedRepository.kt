package com.lyvetech.transnature.features.feed.data.repository

import com.lyvetech.transnature.core.util.Resource
import com.lyvetech.transnature.features.feed.domain.model.Trail
import kotlinx.coroutines.flow.Flow

interface FeedRepository {

    fun getSearchedTrails(name: String): Flow<Resource<List<Trail>>>

    fun getAllTrails(): Flow<Resource<List<Trail>>>
}