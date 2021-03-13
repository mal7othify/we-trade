/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidthIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.typography

data class summaryItems(val title: String, val icon: ImageVector? = null)

@Composable
fun SummaryRow() {
    val items = listOf(
        summaryItems("Week", Icons.Default.ExpandMore),
        summaryItems("EFTs"),
        summaryItems("Stocks"),
        summaryItems("Funds")
    )
    Row(
        modifier = Modifier.horizontalScroll(rememberScrollState())
            .padding(end = 8.dp)
    ) {
        items.forEach { item ->
            Card(
                elevation = 0.dp,
                border = BorderStroke(width = 1.dp, color = MaterialTheme.colors.onBackground),
                backgroundColor = Color.Transparent,
                modifier = Modifier.padding(8.dp).requiredWidthIn(min = 90.dp),
                shape = MaterialTheme.shapes.medium,
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(4.dp).requiredHeight(40.dp)
                ) {
                    Text(
                        text = item.title,
                        style = typography.body1,
                        modifier = Modifier.fillMaxWidth().align(Alignment.CenterVertically)
                    )
                    if (item.icon != null) {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = null,
                            tint = MaterialTheme.colors.onBackground,
                            modifier = Modifier.size(16.dp).align(Alignment.CenterVertically)
                        )
                    }
                }
            }
        }
    }
}
