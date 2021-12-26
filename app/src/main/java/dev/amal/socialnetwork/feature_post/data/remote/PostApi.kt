package dev.amal.socialnetwork.feature_post.data.remote

import dev.amal.socialnetwork.core.domain.models.Post
import retrofit2.http.GET
import retrofit2.http.Query

interface PostApi {

    @GET("/api/post/get")
    suspend fun getPostsForFollows(
        @Query("page") page: Int,
        @Query("pageSize") pageSize: Int
    ): List<Post>

    companion object {
        const val BASE_URL = "http://192.168.1.6:8080/"
    }
}