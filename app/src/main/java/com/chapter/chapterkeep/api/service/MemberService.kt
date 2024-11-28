package com.chapter.chapterkeep.api.service

import com.chapter.chapterkeep.api.dto.request.RequestLoginDto
import com.chapter.chapterkeep.api.dto.request.RequestSignUpDto
import com.chapter.chapterkeep.api.dto.response.ResponseCheckIdDto
import com.chapter.chapterkeep.api.dto.response.ResponseLoginDto
import com.chapter.chapterkeep.api.dto.response.ResponseSignUpDto
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface MemberService {
    @POST("/login")
    suspend fun postLogin(
        @Body loginRequest: RequestLoginDto
    ): ResponseLoginDto

    @POST("/signup")
    suspend fun postSignUp(
        @Body signUpRequest: RequestSignUpDto
    ): ResponseSignUpDto

    @GET("/check-id")
    suspend fun getCheckId(
        @Query("id") id: String
    ): ResponseCheckIdDto
}

