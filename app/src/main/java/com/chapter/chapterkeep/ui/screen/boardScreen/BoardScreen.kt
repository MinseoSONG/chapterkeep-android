package com.chapter.chapterkeep.ui.screen.boardScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.chapter.chapterkeep.R
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
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(R.drawable.img_board_bg),
                contentDescription = null,
                modifier = Modifier
                    .size(
                        width = (LocalConfiguration.current.screenWidthDp / 2).dp, // 화면의 절반 크기
                        height = 200.dp
                    )
                    .align(Alignment.TopEnd),
                contentScale = ContentScale.Crop
            )
        }
        
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