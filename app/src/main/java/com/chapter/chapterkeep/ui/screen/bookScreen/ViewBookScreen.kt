package com.chapter.chapterkeep.ui.screen.bookScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.chapter.chapterkeep.ui.screen.bookScreen.component.ViewBookBar

@Composable
fun ViewBookScreen(
    navController: NavHostController
) {
    var bookTitle by remember{ mutableStateOf("책 제목") }
    var bookWriter by remember{ mutableStateOf("글쓴이") }

    Scaffold(
        topBar = {
            HeaderWhiteLogo()
        },
        containerColor = colorResource(R.color.main_darkgreen)
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(start = 20.dp, end = 20.dp, bottom = 20.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource(R.drawable.img_viewbook_background),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 35.dp, horizontal = 30.dp)
                ) {
                    ViewBookBar(
                        image = R.drawable.img_home_book,
                        bookTitle = bookTitle,
                        bookWriter = bookWriter
                    )
                    Spacer(Modifier.height(5.dp))

                    Divider(
                        modifier = Modifier.fillMaxWidth(),
                        thickness = 1.dp,
                        color = colorResource(R.color.gray_400)
                    )


                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewViewBookScreen() {
    ViewBookScreen(navController = rememberNavController())
}