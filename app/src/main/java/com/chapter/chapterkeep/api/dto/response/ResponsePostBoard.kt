package com.chapter.chapterkeep.api.dto.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponsePostBoard(
    @SerialName("code")
    val code: String,
    @SerialName("message")
    val message: String,
    @SerialName("data")
    val data: GetPostBoardData
)

@Serializable
data class GetPostBoardData(
    @SerialName("rentalCountRecommendResDtoList")
    val rentalCountRecommendResDtoList: List<RentalCountRecommendResDto>,
    @SerialName("essayPostResDtoList")
    val essayPostResDtoList: List<EssayPostResDto>
)

@Serializable
data class RentalCountRecommendResDto(
    @SerialName("title")
    val title: String,
    @SerialName("department")
    val department: String,
    @SerialName("rentalCount")
    val rentalCount: Long,
    @SerialName("library_url")
    val library_url: String,
)

@Serializable
data class EssayPostResDto(
    @SerialName("nickname")
    val nickname: String,
    @SerialName("profileUrl")
    val profileUrl: String,
    @SerialName("anonymous")
    val anonymous: Boolean,
    @SerialName("postId")
    val postId: Long,
    @SerialName("postTitle")
    val postTitle: String,
    @SerialName("likesCount")
    val likesCount: Long
)