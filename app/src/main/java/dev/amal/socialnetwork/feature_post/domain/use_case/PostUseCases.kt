package dev.amal.socialnetwork.feature_post.domain.use_case

data class PostUseCases(
    val getPostsForFollows: GetPostsForFollowsUseCase,
    val createPostUseCase: CreatePostUseCase
)