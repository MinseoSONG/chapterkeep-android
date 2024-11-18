package com.chapter.chapterkeep.ui.screen.boardScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.chapter.chapterkeep.ui.component.header.HeaderGreenLogo

@Composable
fun BaekiljangScreen(
    navController: NavHostController
) {
    Scaffold(
        topBar = {
            HeaderGreenLogo()
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(20.dp)
        ) {

        }
    }
}