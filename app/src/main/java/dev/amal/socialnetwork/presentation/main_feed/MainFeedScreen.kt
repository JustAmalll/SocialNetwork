package dev.amal.socialnetwork.presentation.main_feed

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import dev.amal.socialnetwork.domain.models.Post
import dev.amal.socialnetwork.presentation.components.StandardPost

@Composable
fun MainFeedScreen(
    navController: NavController
) {
    StandardPost(
        post = Post(
            username = "Just_Amalll",
            imageUrl = "",
            profilePictureUrl = "",
            description = "Some Random Text Here",
            likeCount = 213,
            commentCount = 8
        )
    )
}