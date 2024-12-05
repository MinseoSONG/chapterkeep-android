package com.chapter.chapterkeep.api.service

import com.chapter.chapterkeep.api.dto.response.ResponseBaekiljangDto
import retrofit2.Response
import retrofit2.http.GET

interface PostService {
    @GET("/post/essay")
    suspend fun getBaekiljang(): Response<ResponseBaekiljangDto>
}