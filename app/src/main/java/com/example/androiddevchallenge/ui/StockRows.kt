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

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.Stocks
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun StockRows() {
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
    Text(
        text = "Positions",
        style = typography.subtitle1,
        color = MaterialTheme.colors.onSurface,
        modifier = Modifier.fillMaxWidth().padding(top = 32.dp, bottom = 32.dp),
        textAlign = TextAlign.Center
    )
    Stocks.forEach { stock ->
        Divider()
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp).fillMaxWidth(),
        ) {
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.padding(end = 16.dp)
            ) {
                Text(
                    text = stock.price,
                    style = typography.body1,
                    color = MaterialTheme.colors.onSurface
                )
                Text(text = stock.percent, color = stock.color, style = typography.body1)
            }
            Column(Modifier.requiredWidth(screenWidth - 150.dp)) {
                Text(
                    text = stock.name,
                    style = typography.h3,
                    color = MaterialTheme.colors.onSurface
                )
                Text(
                    text = stock.company,
                    style = typography.body1,
                    color = MaterialTheme.colors.onSurface
                )
            }
            Image(
                imageVector = ImageVector.vectorResource(stock.image),
                contentDescription = null,
                modifier = Modifier.size(56.dp),
            )
        }
    }
    Spacer(Modifier.requiredHeight(56.dp))
}
