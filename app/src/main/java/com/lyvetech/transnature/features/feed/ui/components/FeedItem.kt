package com.lyvetech.transnature.features.feed.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.lyvetech.transnature.features.feed.domain.model.Trail

@Composable
fun FeedItem(
    trail: Trail,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
            .clickable { },
        elevation = 10.dp
    ) {
        Column {
            Text(text = trail.name, style = typography.h6)
            Text(text = trail.desc, style = typography.caption)
        }
    }
}