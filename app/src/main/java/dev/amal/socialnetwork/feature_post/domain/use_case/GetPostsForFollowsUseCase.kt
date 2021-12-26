package dev.amal.socialnetwork.feature_post.domain.use_case

import dev.amal.socialnetwork.core.domain.models.Post
import dev.amal.socialnetwork.core.util.Constants
import dev.amal.socialnetwork.core.util.Resource
import dev.amal.socialnetwork.feature_post.domain.repository.PostRepository

class GetPostsForFollowsUseCase(
    private val repository: PostRepository
) {
    suspend operator fun invoke(
        page: Int,
        pageSize: Int = Constants.DEFAULT_PAGE_SIZE
    ): Resource<List<Post>> = repository.getPostsForFollows(page, pageSize)
}