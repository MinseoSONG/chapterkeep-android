package com.chapter.chapterkeep.screen.loginScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.chapter.chapterkeep.R
import com.chapter.chapterkeep.common.ChangeButton

@Composable
fun SignupScreen_ID(navController: NavHostController) {
    var userID by remember {
        mutableStateOf("")
    }
    var userPassWord by remember{
        mutableStateOf("")
    }

    val isButtonEnabled = userID.isNotEmpty() && userPassWord.isNotEmpty()
    Column(
        modifier = Modifier.fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(160.dp)
                .background(colorResource(id = R.color.main_green)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ){
            Text(
                text = stringResource(id = R.string.app_name),
                color = colorResource(R.color.white),
                fontWeight = FontWeight.Black,
                fontSize = 30.sp
            )
            Text(
                text = stringResource(R.string.app_sub_name),
                color = colorResource(R.color.white),
                fontSize = 15.sp
            )
            Spacer(Modifier.height(13.dp))

            Divider(thickness = 4.dp, color = Color.White)
            Spacer(Modifier.height(13.dp))
        }
        Spacer(Modifier.height(7.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
        ) {
            Text(
                text = stringResource(R.string.signup_id),
                color = colorResource(R.color.gray_600),
                fontSize = 15.sp
            )

        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Bottom
        ){
            ChangeButton(
                label = "다음으로",
                color = {if (isButtonEnabled) R.color.main_green else R.color.gray_400},
                fontColor = {if(isButtonEnabled) R.color.white else R.color.gray_600 }
            ) {
                if (isButtonEnabled){
                    navController.navigate("Signup_nickName")
                }
            }
        }
    }
}