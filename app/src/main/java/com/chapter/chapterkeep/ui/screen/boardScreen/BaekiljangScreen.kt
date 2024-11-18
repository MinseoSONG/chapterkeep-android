package com.chapter.chapterkeep.ui.screen.boardScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.chapter.chapterkeep.R
import com.chapter.chapterkeep.ui.component.Bar.BoardTopBar
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
            BoardTopBar(
                navController = navController,
                boardName = stringResource(R.string.baekiljang_board)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BaekiljangScreenPreview() {
    val navController = rememberNavController() // NavHostController가 필요합니다.

    BaekiljangScreen(navController = navController)
}