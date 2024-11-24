package com.chapter.chapterkeep.ui.screen.boardScreen.component.detailBoard

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
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chapter.chapterkeep.R
import com.chapter.chapterkeep.ui.component.textfield.CommonTextField

@Composable
fun AddBoardTitleTextField(
    title:String
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ){
        Text(
            text = stringResource(R.string.addboard_title),
            color = colorResource(R.color.gray_700),
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(8.dp))

        CommonTextField(
            value = title,
            onValueChange = {},
            label = stringResource(R.string.addboard_title_textfield),
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Next,
            shape = 8
        )
    }
}

@Preview
@Composable
fun AddBoardTitlePreview() {
    AddBoardTitleTextField("")
}