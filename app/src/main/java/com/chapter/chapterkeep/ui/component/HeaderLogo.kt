package com.chapter.chapterkeep.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.chapter.chapterkeep.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeaderLogo() {
    TopAppBar(
        title = {
            Image(
                painter = painterResource(id = R.drawable.img_chapterkeep_whitelogo_text),
                contentDescription = "로고 이미지",
                modifier = Modifier
                    .size(width = 102.dp, height = 18.dp)
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Transparent)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeaderLogoWithBtn(
    label: Int,
    image: Int,
    onClick: ()-> Unit
) {
    TopAppBar(
        title = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_chapterkeep_whitelogo_text),
                    contentDescription = "로고 이미지",
                    modifier = Modifier
                        .size(width = 102.dp, height = 18.dp)
                )

                CommonButtonWithVector(
                    label = label,
                    image = image
                ) {
                    TODO("책장 공개 비공개")
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Transparent)
    )
}