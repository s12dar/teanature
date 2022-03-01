package com.lyvetech.transnature.features.feed.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.lyvetech.transnature.features.feed.data.local.entity.TrailEntity

@Dao
interface TrailDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTrails(trails: List<TrailEntity>)

    @Query("DELETE FROM TrailEntity WHERE name IN(:trails)")
    suspend fun deleteTrails(trails: List<String>)

    @Query("SELECT * FROM TrailEntity WHERE name LIKE '%' || :trail || '%'")
    suspend fun getSearchedTrails(trail: String): List<TrailEntity>
}