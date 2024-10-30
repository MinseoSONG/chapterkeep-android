package com.chapter.chapterkeep.ui.screen.homeScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.chapter.chapterkeep.R
import com.chapter.chapterkeep.ui.component.BookShelf
import com.chapter.chapterkeep.ui.component.BottomBar
import com.chapter.chapterkeep.ui.component.DoubleBackPressToExit
import com.chapter.chapterkeep.ui.component.ProfileBar
import com.chapter.chapterkeep.ui.component.header.HeaderLogoWithBtn

@Composable
fun HomeScreen(
    navController: NavHostController,
    viewModel: HomeViewModel
) {
    val userNickName by viewModel::userNickName
    val userMyself by viewModel::userMyself
    val userBookCount by viewModel::userBookCount

    DoubleBackPressToExit()
    Scaffold(
        topBar = {
            HeaderLogoWithBtn(
                label = R.string.home_open_button,
                image = R.drawable.outline_lock_open_24
            ) {
                TODO("책장 공개 비공개")
            }
        },
        bottomBar = {
            BottomBar(2, navController)
        },
        containerColor = colorResource(R.color.main_green).copy(alpha = 0.7f)
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(20.dp)
        ) {
            ProfileBar(navController, userNickName, userMyself, userBookCount)
            Spacer(Modifier.height(20.dp))

            LazyColumn {
                item {
                    BookShelf()
                }
            }
        }
    }
}