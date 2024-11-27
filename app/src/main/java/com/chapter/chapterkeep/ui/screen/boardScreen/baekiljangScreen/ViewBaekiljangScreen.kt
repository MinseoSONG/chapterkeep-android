package com.chapter.chapterkeep.ui.screen.boardScreen.baekiljangScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.chapter.chapterkeep.R
import com.chapter.chapterkeep.ui.screen.boardScreen.component.detailBoard.ViewBoardTopBar

@Composable
fun ViewBaekiljangScreen(
    navController: NavHostController
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ){
        ViewBoardTopBar(stringResource(R.string.baekiljang_board))
    }
}

@Preview
@Composable
fun ViewBaekiljangScreenReview(
) {
    val navController = rememberNavController()
    ViewBaekiljangScreen(navController)
}