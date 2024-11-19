package com.chapter.chapterkeep.ui.screen.boardScreen.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chapter.chapterkeep.R


@Composable
fun BoardTypeBox(
    title: String
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = title,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.main_green)
        )
        Spacer(Modifier.height(20.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    width = 1.dp,
                    color = colorResource(R.color.gray_600)
                ),
        ){
            BoardTypeRow(stringResource(R.string.board_genre))
            BoardTypeRow(stringResource(R.string.board_oneline))
            BoardTypeRow(stringResource(R.string.board_baekiljang))
            BoardTypeRow(stringResource(R.string.board_free))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BoardTypePreview() {
    BoardTypeBox(
        title = "게시판"
    )
}