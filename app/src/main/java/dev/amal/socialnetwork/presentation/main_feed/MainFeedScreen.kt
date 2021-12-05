package dev.amal.socialnetwork.presentation.main_feed

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.amal.socialnetwork.domain.models.Post
import dev.amal.socialnetwork.presentation.components.StandardPost

@Composable
fun MainFeedScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        StandardPost(
            post = Post(
                username = "Just_Amalll",
                imageUrl = "",
                profilePictureUrl = "",
                description = "Some Random Text Here",
                likeCount = 17,
                commentCount = 7
            ),
            onPostClick = {
//                navController.navigate(Screen.PostDetailScreen.route)
            }
        )
    }
}