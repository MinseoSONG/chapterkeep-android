package com.chapter.chapterkeep.ui.screen.boardScreen.baekiljangScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.chapter.chapterkeep.R
import com.chapter.chapterkeep.ui.screen.boardScreen.component.detailBoard.ViewBoardInfoBar
import com.chapter.chapterkeep.ui.screen.boardScreen.component.detailBoard.ViewBoardTopBar

@Composable
fun ViewBaekiljangScreen(
    navController: NavHostController
) {
    val title = "떨어지는 잎"
    val image = ""
    val writer = "챕터킵 개발자"
    val date = "2024-07-04"

    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
    ){
        ViewBoardTopBar(stringResource(R.string.baekiljang_board))
        Spacer(Modifier.height(20.dp))

        ViewBoardInfoBar(
            title = title,
            image = image,
            writer = writer,
            date = date,
            navController = navController
        )
    }
}

@Preview
@Composable
fun ViewBaekiljangScreenReview(
) {
    val navController = rememberNavController()
    ViewBaekiljangScreen(navController)
}