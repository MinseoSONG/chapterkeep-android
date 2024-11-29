package com.chapter.chapterkeep.api.service

import com.chapter.chapterkeep.api.dto.request.RequestLoginDto
import com.chapter.chapterkeep.api.dto.response.ResponseCheckIdDto
import com.chapter.chapterkeep.api.dto.response.ResponseLoginDto
import com.chapter.chapterkeep.api.dto.response.ResponseSignUpDto
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Query

interface MemberService {
    @POST("/login")
    suspend fun postLogin(
        @Body loginRequest: RequestLoginDto
    ): ResponseLoginDto

    @Multipart
    @POST("/signup")
    suspend fun postSignUp(
        @Part("info") info: RequestBody
    ): ResponseSignUpDto

    @GET("/check-id")
    suspend fun getCheckId(
        @Query("id") id: String
    ): ResponseCheckIdDto
}

