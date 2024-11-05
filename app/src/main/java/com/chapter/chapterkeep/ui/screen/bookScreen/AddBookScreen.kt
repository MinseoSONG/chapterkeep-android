package com.chapter.chapterkeep.ui.screen.bookScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.chapter.chapterkeep.ui.component.header.HeaderGreenLogo
import com.chapter.chapterkeep.ui.screen.bookScreen.component.AddBookInfo
import com.chapter.chapterkeep.ui.screen.bookScreen.component.AddBookStar

@Composable
fun AddBookScreen(
    navController: NavHostController
) {
    var isbn by remember{mutableStateOf("")}
    var book_title by remember { mutableStateOf("책 제목") }
    var book_writer by remember { mutableStateOf("글쓴이") }

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
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                AddBookInfo(
                    isbn = isbn,
                    onIsbnChange = {isbn = it},
                    bookTitle = book_title,
                    bookWriter = book_writer,
                    onIsbnSubmit = {
                        TODO("ISBN 확인")
                    },
                    onImageClick = {
                        TODO("책 이미지 등록")
                    },
                    onSearchClick = {
                        TODO("ISBN 조회하는 웹 페이지로 이동")
                    }
                )
                Spacer(modifier = Modifier.height(20.dp))

                AddBookStar()
                Spacer(modifier = Modifier.height(20.dp))


            }
        }
    }
}