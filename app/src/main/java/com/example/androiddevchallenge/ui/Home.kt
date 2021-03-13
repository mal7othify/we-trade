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
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.typography
import java.util.Locale

@Composable
fun Home() {
    val topBarItems = listOf("Account", "Watchlist", "profile")
    Column(modifier = Modifier.verticalScroll(rememberScrollState()).fillMaxSize()) {
        Column(modifier = Modifier.background(MaterialTheme.colors.background).padding(16.dp)) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(top = 64.dp, bottom = 8.dp)
                    .align(Alignment.CenterHorizontally)
            ) {
                topBarItems.forEach { item ->
                    Button(
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        onClick = {},
                        elevation = ButtonDefaults.elevation(0.dp),
                    ) {
                        Text(
                            text = item.toUpperCase(Locale.ROOT)
                        )
                    }
                }
            }
            Text(
                "Balance",
                style = typography.subtitle1,
                modifier = Modifier.fillMaxWidth().padding(top = 16.dp, bottom = 8.dp),
                textAlign = TextAlign.Center
            )
            Text(
                "$73,589.01",
                style = typography.h1,
                modifier = Modifier.fillMaxWidth().padding(top = 16.dp, bottom = 16.dp),
                textAlign = TextAlign.Center
            )
            Text(
                "+412.35 today",
                style = typography.subtitle1,
                color = Color(0xFF39A844),
                modifier = Modifier.fillMaxWidth().padding(top = 8.dp, bottom = 16.dp),
                textAlign = TextAlign.Center
            )
            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { },
                colors = ButtonDefaults.buttonColors(MaterialTheme.colors.primary),
                modifier = Modifier.fillMaxWidth().height(48.dp)
            ) {
                Text("Transact".toUpperCase(Locale.ROOT))
            }
            Spacer(modifier = Modifier.padding(16.dp))
            SummaryRow()
            Image(
                modifier = Modifier.fillMaxWidth().padding(bottom = 32.dp),
                imageVector = ImageVector.vectorResource(R.drawable.home_illos),
                contentDescription = null,
                contentScale = ContentScale.FillBounds
            )
        }
        Column(modifier = Modifier.background(MaterialTheme.colors.surface)) {
            StockRows()
        }
    }
}
