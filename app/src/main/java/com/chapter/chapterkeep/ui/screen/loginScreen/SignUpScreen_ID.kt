package com.chapter.chapterkeep.ui.screen.loginScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.chapter.chapterkeep.R
import com.chapter.chapterkeep.model.Routes
import com.chapter.chapterkeep.ui.component.ChangeButton
import com.chapter.chapterkeep.ui.component.CommonButton
import com.chapter.chapterkeep.ui.component.HeaderSection
import com.chapter.chapterkeep.ui.component.LimitTextField
import com.chapter.chapterkeep.ui.component.PassWordTextField

const val PASSWORD_MIN_LENGTH = 8
const val PASSWORD_MAX_LENGTH = 16
val PASSWORD_REGEX = Regex("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@\$!%*?&])[A-Za-z\\d@\$!%*?&]{$PASSWORD_MIN_LENGTH,$PASSWORD_MAX_LENGTH}\$")

@Composable
fun SignUpScreen_ID(
    navController: NavHostController,
    viewModel: SignUpViewModel
) {
    val userID by viewModel::userID
    val userPassWord by viewModel::userPassword
    val userCheckPassWord by viewModel::userCheckPassword

    val isButtonEnabled = viewModel.isIDInfoValid

    Scaffold(
        topBar = { HeaderSection() },
        bottomBar = {
            ChangeButton(
                label = stringResource(R.string.next_button),
                color = { if (isButtonEnabled) R.color.main_green else R.color.gray_400 },
                fontColor = { if (isButtonEnabled) R.color.white else R.color.gray_600 }
            ) {
                if (isButtonEnabled) {
                    navController.navigate(Routes.Signup_NickName.route)
                }
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(20.dp)
        ) {
            Text(
                text = stringResource(R.string.signup_id),
                color = colorResource(R.color.gray_600),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(Modifier.height(10.dp))

            LimitTextField(
                value = userID,
                onValueChange = { viewModel.updateUserId(it) },
                label = stringResource(R.string.id),
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done,
                maxLength = 10
            )
            Spacer(Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = if (viewModel.isIDAvailable) stringResource(R.string.signup_id_possible) else stringResource(R.string.signup_id_impossible),
                    color = colorResource(R.color.gray_600),
                    fontSize = 13.sp
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    CommonButton(
                        label = stringResource(R.string.check)
                    ) {
                        viewModel.checkIDAvailability()
                    }
                }
            }
            Spacer(Modifier.height(27.dp))


            Text(
                text = stringResource(R.string.signup_password),
                color = colorResource(R.color.gray_600),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(Modifier.height(10.dp))

            PassWordTextField(
                value = userPassWord,
                onValueChange = { viewModel.updateUserPassword(it) },
                label = stringResource(R.string.password),
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next
            )
            Spacer(Modifier.height(10.dp))

            PassWordTextField(
                value = userCheckPassWord,
                onValueChange = { viewModel.updateUserCheckPassword(it) }, // 수정된 부분
                label = stringResource(R.string.checkpassword),
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            )
            Spacer(Modifier.height(10.dp))

            if(!isAblePassword(userPassWord)){
                Text(
                    text = stringResource(R.string.signup_password_incorrect),
                    fontSize = 13.sp,
                    color = colorResource(R.color.gray_600)
                )
            }
            else if (!viewModel.isPasswordMatching) {
                Text(
                    text = stringResource(R.string.signup_password_notsame),
                    fontSize = 13.sp,
                    color = colorResource(R.color.gray_600)
                )
            }

        }

    }
}

fun isAblePassword(password: String): Boolean{
    return PASSWORD_REGEX.matches(password)
}