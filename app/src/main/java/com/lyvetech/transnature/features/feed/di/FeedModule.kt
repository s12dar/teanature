package com.lyvetech.transnature.features.feed.di

import com.lyvetech.transnature.features.feed.data.local.TransNatureDao
import com.lyvetech.transnature.features.feed.data.local.TransNatureDatabase
import com.lyvetech.transnature.features.feed.data.remote.TransNatureApiService
import com.lyvetech.transnature.features.feed.data.repository.TransNatureRepository
import com.lyvetech.transnature.features.feed.data.repository.TransNatureRepositoryImpl
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
        trailRepositoryImpl: TransNatureRepositoryImpl
    ): TransNatureRepository

    @Binds
    abstract fun provideTransNatureUseCase(
    )

    companion object {
        @Provides
        fun provideTransNatureServiceApi(
            retrofit: Retrofit
        ): TransNatureApiService = retrofit.create(TransNatureApiService::class.java)

        @Provides
        fun provideTransNatureDao(
            transNatureDatabase: TransNatureDatabase
        ): TransNatureDao = transNatureDatabase.dao
    }
}