package com.lyvetech.transnature.features.feed.domain.usecase

import com.lyvetech.transnature.core.util.Resource
import com.lyvetech.transnature.features.feed.data.repository.FeedRepository
import com.lyvetech.transnature.features.feed.domain.model.Trail
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class FeedInfoUseCaseImpl @Inject constructor(
    private val feedRepository: FeedRepository
) : FeedInfoUseCase {
    override suspend fun getSearchedTrails(name: String): Flow<Resource<List<Trail>>> {
        if (name.isBlank()) {
            return flow { }
        }

        return feedRepository.getSearchedTrails(name)
    }

    override suspend fun getAllTrails(): Flow<Resource<List<Trail>>> {
        return feedRepository.getAllTrails()
    }

}