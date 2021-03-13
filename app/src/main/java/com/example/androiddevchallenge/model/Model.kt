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
package com.example.androiddevchallenge.model

import androidx.compose.ui.graphics.Color
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.data.Stock

val Stocks = listOf(
    Stock(
        "$7,918",
        "-0.54%",
        "ALK",
        "Alaska Air Group, Inc.",
        R.drawable.home_alk,
        Color(0xFFD93C19)
    ),
    Stock(
        "$1,293",
        "+4.18%",
        "BA",
        "Boeing Co.",
        R.drawable.home_ba,
        Color(0xFF39A844)
    ),
    Stock(
        "$893.50",
        "-0.54%",
        "DAL",
        "Delta Airlines Inc.",
        R.drawable.home_dal,
        Color(0xFFD93C19)
    ),
    Stock(
        "$12,301",
        "+2.51%",
        "EXPE",
        "Expedia Group Inc.",
        R.drawable.home_exp,
        Color(0xFF39A844)
    ),
    Stock(
        "$12,301",
        "+1.38%",
        "EADSY",
        "Airbus SE",
        R.drawable.home_eadsy,
        Color(0xFF39A844)
    ),
    Stock(
        "$8,521",
        "+1.56%",
        "JBLU",
        "Jetblue Airways Corp.",
        R.drawable.home_jblu,
        Color(0xFF39A844)
    ),
    Stock(
        "$521",
        "+2.75%",
        "MAR",
        "Marriott International Inc.",
        R.drawable.home_mar,
        Color(0xFF39A844)
    ),
    Stock(
        "$5,481",
        "+0.14%",
        "CCL",
        "Carnival Corp",
        R.drawable.home_ccl,
        Color(0xFF39A844)
    ),
    Stock(
        "$9,184",
        "+1.69%",
        "RCL",
        "Royal Caribbean Cruises",
        R.drawable.home_rcl,
        Color(0xFF39A844)
    ),
    Stock(
        "$654",
        "+3.23%",
        "TRVL",
        "Travelocity Inc.",
        R.drawable.home_trvl,
        Color(0xFF39A844)
    )
)
