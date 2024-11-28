package com.chapter.chapterkeep.api.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseLoginDto(
    @SerialName("code")
    val code: String,
    @SerialName("message")
    val message: String,
    @SerialName("data")
    val data: LoginData
)

@Serializable
data class LoginData(
    @SerialName("message")
    val message: String
)

@Serializable
data class RequestLoginDto(
    @SerialName("id")
    val id: String,
    @SerialName("password")
    val password: String
)