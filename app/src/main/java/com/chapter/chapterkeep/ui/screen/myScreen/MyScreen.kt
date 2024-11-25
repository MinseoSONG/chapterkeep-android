package com.chapter.chapterkeep.ui.screen.myScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.chapter.chapterkeep.ui.component.Bar.BottomBar
import com.chapter.chapterkeep.ui.component.header.HeaderGreenLogo
import com.chapter.chapterkeep.ui.navigate.Routes
import com.chapter.chapterkeep.ui.screen.myScreen.component.MyProfileRow

@Composable
fun MyScreen(
    navController: NavHostController
) {
    var userName by remember{
        mutableStateOf("책 먹는 하마")
    }

    var writeAccount by remember{
        mutableStateOf(8)
    }
    
    Scaffold(
        topBar = {
            HeaderGreenLogo()
        },
        bottomBar = {
            BottomBar(4, navController)
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(20.dp)
                .padding(paddingValues)
        ) {
            MyProfileRow(
                userName = userName,
                writeAccount = writeAccount,
                logoutOnClick = {
                    navController.navigate(Routes.Login.route){
                        popUpTo(Routes.Login.route){
                            inclusive = true
                        }
                    }
                },
                deleteOnClick = {
                    navController.navigate(Routes.Login.route){
                        popUpTo(Routes.Login.route){
                            inclusive = true
                        }
                    }
                }
            )
        }
    }
}

@Preview
@Composable
fun MyPreview(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()
    MyScreen(navController)
}