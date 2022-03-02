package com.lyvetech.transnature.features.feed.data.repository

import com.lyvetech.transnature.core.util.Resource
import com.lyvetech.transnature.features.feed.data.local.FeedDao
import com.lyvetech.transnature.features.feed.data.remote.FeedApiService
import com.lyvetech.transnature.features.feed.domain.model.Trail
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FeedRepositoryImpl(
    private val api: FeedApiService,
    private val dao: FeedDao
) : FeedRepository {
    override fun getSearchedTrails(name: String): Flow<Resource<List<Trail>>> = flow {

    }

    override fun getAllTrails(): Flow<Resource<List<Trail>>> {

    }
}