package com.chapter.chapterkeep.ui.screen.bookScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.chapter.chapterkeep.R
import com.chapter.chapterkeep.ui.component.CommonButton
import com.chapter.chapterkeep.ui.component.header.HeaderGreenLogo
import com.chapter.chapterkeep.ui.component.textfield.GrayTextField
import com.chapter.chapterkeep.ui.screen.bookScreen.component.AddBookTitle

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
                Row(
                    modifier = Modifier. fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.Bottom
                ) {
                    AddBookTitle(R.string.addbook_selectbook_title)

                    Text(
                        text = stringResource(R.string.addbook_selectbook_isbn_search),
                        color = colorResource(R.color.gray_800),
                        fontSize = 10.sp,
                        textDecoration = TextDecoration.Underline
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, top = 15.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_addbook),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(end = 20.dp)
                            .size(62.dp, 100.dp)
                            .clickable {
                                TODO("책 이미지 등록")
                            }
                    )

                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(45.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            GrayTextField(
                                value = isbn,
                                onValueChange = {isbn = it},
                                placeholder = stringResource(R.string.addbook_selectbook_isbn),
                                keyboardType = KeyboardType.Number,
                                imeAction = ImeAction.Done,
                                shape = 12,
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(end = 15.dp)
                            )

                            CommonButton(
                                label = stringResource(R.string.addbook_selectbook_isbn_submit),
                                fontSize = 13,
                                modifier = Modifier.padding(3.dp)
                            ) {
                                TODO("ISBN 확인")
                            }
                        }
                        Spacer(Modifier.height(10.dp))

                        Text(
                            text = book_title,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.padding(bottom = 5.dp)
                        )

                        Text(
                            text = book_writer,
                            fontSize = 12.sp,
                            color = colorResource(R.color.gray_700)
                        )
                    }
                }
            }
        }
    }
}