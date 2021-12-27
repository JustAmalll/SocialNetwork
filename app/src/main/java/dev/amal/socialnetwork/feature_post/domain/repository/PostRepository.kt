package dev.amal.socialnetwork.feature_post.domain.repository

import android.net.Uri
import dev.amal.socialnetwork.core.domain.models.Post
import dev.amal.socialnetwork.core.util.Resource
import dev.amal.socialnetwork.core.util.SimpleResource

interface PostRepository {

    suspend fun getPostsForFollows(page: Int, pageSize: Int): Resource<List<Post>>

    suspend fun createPost(description: String, imageUri: Uri): SimpleResource
}