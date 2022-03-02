package com.lyvetech.transnature.core.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.lyvetech.transnature.features.feed.data.local.Converters
import com.lyvetech.transnature.features.feed.data.local.FeedDao
import com.lyvetech.transnature.features.feed.data.local.entity.TrailEntity

@Database(
    entities = [TrailEntity::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class TransNatureDatabase : RoomDatabase() {
    abstract val dao: FeedDao
}