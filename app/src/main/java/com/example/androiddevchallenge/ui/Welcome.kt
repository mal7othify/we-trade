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
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
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
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.R
import java.util.Locale

@Composable
fun Welcome(navController: NavController) {
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
    Image(
        modifier = Modifier.fillMaxSize(),
        imageVector = ImageVector.vectorResource(R.drawable.welcome_bg),
        contentDescription = null,
        contentScale = ContentScale.FillBounds
    )
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            imageVector = ImageVector.vectorResource(R.drawable.logo),
            contentDescription = null,
            modifier = Modifier.padding(bottom = 32.dp)
        )
        Row(
            modifier = Modifier.align(Alignment.BottomCenter).fillMaxWidth()
                .padding(bottom = 32.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = {},
                colors = ButtonDefaults.buttonColors(MaterialTheme.colors.primary),
                modifier = Modifier.requiredWidth((screenWidth / 2) - 16.dp)
                    .padding(bottom = 32.dp, end = 8.dp).height(48.dp)
            ) {
                Text(
                    text = "Get started".toUpperCase(Locale.ROOT),
                    color = MaterialTheme.colors.onPrimary
                )
            }
            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { navController.navigate("login") },
                border = BorderStroke(
                    1.dp,
                    color = MaterialTheme.colors.primary
                ),
                colors = ButtonDefaults.buttonColors(Color.Transparent),
                modifier = Modifier.requiredWidth((screenWidth / 2) - 16.dp)
                    .padding(bottom = 32.dp).height(48.dp)
            ) {
                Text(
                    text = "Log in".toUpperCase(Locale.ROOT),
                    color = MaterialTheme.colors.primary
                )
            }
        }
    }
}
