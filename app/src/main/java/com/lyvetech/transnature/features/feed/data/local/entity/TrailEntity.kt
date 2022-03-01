package com.lyvetech.transnature.features.feed.data.local.entity

import androidx.room.Entity

@Entity
data class TrailEntity(
    val name: String,
    val desc: String,
    val imgUrl: String,
    val startLatitude: Double,
    val startLongitude: Double,
    val endLatitude: Double,
    val endLongitude: Double,
    val distanceInMeters: Int,
    val averageTimeInMillis: Long,
)
