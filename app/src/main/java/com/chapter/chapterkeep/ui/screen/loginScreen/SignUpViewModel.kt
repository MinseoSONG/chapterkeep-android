package com.chapter.chapterkeep.ui.screen.loginScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class SignUpViewModel : ViewModel(){
    var userID by mutableStateOf("")
    var userPassword by mutableStateOf("")
    var userCheckPassword by mutableStateOf("")
    var userNickName by mutableStateOf("")
    var userMyself by mutableStateOf("")
    var isIDAvailable by mutableStateOf(true)
    var isNickNameAvailable by mutableStateOf(true)

    val isPasswordMatching: Boolean
        get() = userPassword == userCheckPassword

    val isIDInfoValid: Boolean
        get() = userID.isNotEmpty() && userPassword.isNotEmpty() && isPasswordMatching

    val isNickNameInfoValid: Boolean
        get() = userNickName.isNotEmpty() && userMyself.isNotEmpty()

    fun updateUserId(id: String) {
        userID = id
    }

    fun updateUserPassword(password: String) {
        userPassword = password
    }

    fun updateUserCheckPassword(checkpassword: String){
        userCheckPassword = checkpassword
    }

    fun checkIDAvailability() {
        // 실제 서버 통신 로직 추가
        // 예시: userID를 서버로 보내서 중복 여부 확인 후, isIDAvailable 값을 업데이트
        isIDAvailable = userID != "ab" // 예시로 임의의 ID "existingID"는 중복 처리
    }

    fun checkNickNameAvailability() {
        // 실제 서버 통신 로직 추가
        // 예시: userNickName를 서버로 보내서 중복 여부 확인 후, isNickNameAvailable 값을 업데이트
        isNickNameAvailable = userNickName != "abcd" // 예시로 임의의 닉네임 "existingNickName"은 중복 처리
    }
}