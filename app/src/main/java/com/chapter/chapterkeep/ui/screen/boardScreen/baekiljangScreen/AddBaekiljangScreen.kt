package com.chapter.chapterkeep.ui.screen.boardScreen.baekiljangScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.chapter.chapterkeep.R
import com.chapter.chapterkeep.ui.component.ChangeButtonWithBottom
import com.chapter.chapterkeep.ui.component.header.HeaderGreenLogo
import com.chapter.chapterkeep.ui.navigate.Routes
import com.chapter.chapterkeep.ui.screen.boardScreen.component.detailBoard.AddBoardTopBar

@Composable
fun AddBaekiljangScreen(
    navController: NavHostController
) {
    var isButtonEnabled by remember{
        mutableStateOf(false)
    }
    val thisMonthTitle = stringResource(R.string.addbaekiljang_this_month_title,"가을")

    Scaffold(
        topBar = {
            HeaderGreenLogo()
        },
        bottomBar = {
            ChangeButtonWithBottom(
                label = stringResource(R.string.addbaekiljang_button),
                color = { if (isButtonEnabled) R.color.main_green else R.color.gray_200 },
                fontColor = { if (isButtonEnabled) R.color.white else R.color.gray_700 }
            ) {
                if (isButtonEnabled) {
                    navController.navigate(Routes.Baekiljang.route) {
                        // 현재 페이지 기록 지우기
                    }
                }
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(20.dp)
        ) {
            AddBoardTopBar(stringResource(R.string.addbaekiljang_board))
            Spacer(Modifier.height(10.dp))

            Text(
                text = thisMonthTitle,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(R.color.main_darkgreen)
            )


        }
    }
}

@Preview
@Composable
fun AddBaekiljangPreview(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    AddBaekiljangScreen(navController)
}