package com.lyvetech.transnature.features.feed.data.repository

import com.lyvetech.transnature.core.util.Resource
import com.lyvetech.transnature.features.feed.data.local.TransNatureDao
import com.lyvetech.transnature.features.feed.data.remote.TransNatureApiService
import com.lyvetech.transnature.features.feed.data.remote.dto.TrailDto
import com.lyvetech.transnature.features.feed.domain.model.Trail
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class TransNatureRepositoryImpl(
    private val api: TransNatureApiService,
    private val dao: TransNatureDao
) : TransNatureRepository {
    override fun getSearchedTrails(name: String): Flow<Resource<List<Trail>>> = flow {

    }

    override fun getAllTrails(): Flow<Resource<List<Trail>>> {

    }
}