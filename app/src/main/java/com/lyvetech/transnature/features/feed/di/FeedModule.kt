package com.lyvetech.transnature.features.feed.di

import android.app.Application
import androidx.room.Room
import com.lyvetech.transnature.core.data.local.TransNatureDatabase
import com.lyvetech.transnature.features.feed.data.local.FeedDao
import com.lyvetech.transnature.features.feed.data.remote.FeedApiService
import com.lyvetech.transnature.features.feed.data.repository.FeedRepository
import com.lyvetech.transnature.features.feed.data.repository.FeedRepositoryImpl
import com.lyvetech.transnature.features.feed.domain.usecase.GetAllTrailsUseCase
import com.lyvetech.transnature.features.feed.domain.usecase.GetSearchedTrailsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object FeedModule {

    @Provides
    @Singleton
    fun provideTransNatureServiceApi(): FeedApiService {
        return Retrofit.Builder()
            .baseUrl(FeedApiService.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(FeedApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideTransNatureDatabase(app: Application): TransNatureDatabase {
        return Room.databaseBuilder(
            app,
            TransNatureDatabase::class.java, "transnature_db"
        ).fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideTransNatureDao(
        transNatureDatabase: TransNatureDatabase
    ): FeedDao = transNatureDatabase.dao

    @Provides
    @Singleton
    fun provideFeedRepository(
        apiService: FeedApiService,
        dao: FeedDao
    ): FeedRepository {
        return FeedRepositoryImpl(apiService, dao)
    }

    @Provides
    @Singleton
    fun providesAllTrailsUseCase(
        repository: FeedRepository
    ): GetAllTrailsUseCase {
        return GetAllTrailsUseCase(repository)
    }

    @Provides
    @Singleton
    fun providesSearchedTrailsUseCase(
        repository: FeedRepository
    ): GetSearchedTrailsUseCase {
        return GetSearchedTrailsUseCase(repository)
    }
}
