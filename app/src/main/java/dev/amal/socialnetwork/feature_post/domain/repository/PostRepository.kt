package dev.amal.socialnetwork.feature_post.domain.repository

import dev.amal.socialnetwork.core.domain.models.Post
import dev.amal.socialnetwork.core.util.Resource

interface PostRepository {

    suspend fun getPostsForFollows(page: Int, pageSize: Int): Resource<List<Post>>
}