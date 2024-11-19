package com.chapter.chapterkeep.ui.screen.boardScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.chapter.chapterkeep.R
import com.chapter.chapterkeep.ui.component.Bar.BoardTopBar
import com.chapter.chapterkeep.ui.component.CommonButton
import com.chapter.chapterkeep.ui.component.header.HeaderGreenLogo
import com.chapter.chapterkeep.ui.component.textfield.SearchTextField

@Composable
fun BaekiljangScreen(
    navController: NavHostController
) {
    // 검색창
    var search by remember {
        mutableStateOf("")
    }
    var searchHasFocus by remember {
        mutableStateOf(false)
    }

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
            BoardTopBar(
                navController = navController,
                boardName = stringResource(R.string.baekiljang_board)
            )
            Spacer(Modifier.height(30.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                SearchTextField(
                    search = remember { mutableStateOf(search) },
                    searchHasFocus = remember { mutableStateOf(searchHasFocus) },
                    searchHint = stringResource(R.string.baekiljang_search),
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(10.dp))

                CommonButton(
                    label = stringResource(R.string.search_btn),
                    fontSize = 13
                ) {
                    TODO("검색")
                }
            }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun BaekiljangScreenPreview() {
    val navController = rememberNavController() // NavHostController가 필요합니다.

    BaekiljangScreen(navController = navController)
}