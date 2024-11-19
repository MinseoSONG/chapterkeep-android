package com.chapter.chapterkeep.ui.screen.boardScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.chapter.chapterkeep.ui.component.Bar.BottomBar
import com.chapter.chapterkeep.ui.component.header.HeaderGreenLogo

@Composable
fun BoardScreen(
    navController: NavHostController
) {
    Scaffold(
        topBar = {
            HeaderGreenLogo()
        },
        bottomBar = {
            BottomBar(3, navController)
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

@Preview(showBackground = true)
@Composable
fun BoardScreenPreview() {
    val navController = rememberNavController()

    BoardScreen(navController = navController)
}