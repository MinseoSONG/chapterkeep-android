package com.chapter.chapterkeep.ui.screen.bookScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.chapter.chapterkeep.R
import com.chapter.chapterkeep.ui.component.header.HeaderWhiteLogo

@Composable
fun ViewBookScreen(
    navController: NavHostController
) {
    Scaffold(
        topBar = {
            HeaderWhiteLogo()
        },
        containerColor = colorResource(R.color.main_darkgreen)
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(20.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ){
                Image(
                    painter = painterResource(R.drawable.img_viewbook_background),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewViewBookScreen() {
    ViewBookScreen(navController = rememberNavController())
}