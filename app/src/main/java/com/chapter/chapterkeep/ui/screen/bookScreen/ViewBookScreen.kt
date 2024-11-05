package com.chapter.chapterkeep.ui.screen.bookScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.chapter.chapterkeep.R
import com.chapter.chapterkeep.ui.component.header.HeaderWhiteLogo

@Composable
fun ViewBookScreen(
    navController: NavHostController
) {
    Scaffold(
        topBar = {
            HeaderWhiteLogo()
        },
        containerColor = colorResource(R.color.main_darkgreen)
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(20.dp)
        ) {
            Box(

            ){

            }
        }
    }
}