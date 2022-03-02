package com.lyvetech.transnature.features.feed.di

import com.lyvetech.transnature.features.feed.data.local.FeedDao
import com.lyvetech.transnature.core.data.local.TransNatureDatabase
import com.lyvetech.transnature.features.feed.data.remote.FeedApiService
import com.lyvetech.transnature.features.feed.data.repository.FeedRepository
import com.lyvetech.transnature.features.feed.data.repository.FeedRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
abstract class FeedModule {

    @Binds
    abstract fun provideTransNatureRepository(
        trailRepositoryImpl: FeedRepositoryImpl
    ): FeedRepository

    @Binds
    abstract fun provideTransNatureUseCase(
    )

    companion object {
        @Provides
        fun provideTransNatureServiceApi(
            retrofit: Retrofit
        ): FeedApiService = retrofit.create(FeedApiService::class.java)

        @Provides
        fun provideTransNatureDao(
            transNatureDatabase: TransNatureDatabase
        ): FeedDao = transNatureDatabase.dao
    }
}