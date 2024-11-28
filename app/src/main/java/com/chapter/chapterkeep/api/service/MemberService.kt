package com.chapter.chapterkeep.api.service

import com.chapter.chapterkeep.api.dto.RequestLoginDto
import com.chapter.chapterkeep.api.dto.ResponseLoginDto
import retrofit2.http.Body
import retrofit2.http.POST

interface MemberService{
    @POST("/login")
    suspend fun postLogin(
        @Body loginRequest: RequestLoginDto
    ): ResponseLoginDto
}