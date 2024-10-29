package com.chapter.chapterkeep.ui.screen.homeScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.chapter.chapterkeep.R
import com.chapter.chapterkeep.ui.component.BottomBar
import com.chapter.chapterkeep.ui.component.DoubleBackPressToExit
import com.chapter.chapterkeep.ui.component.HeaderLogoWithBtn

@Composable
fun HomeScreen(navController: NavHostController) {
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
        ) {

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    val navController = rememberNavController()
    HomeScreen(navController = navController)
}