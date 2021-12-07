package dev.amal.socialnetwork.presentation.util

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.amal.socialnetwork.domain.models.Post
import dev.amal.socialnetwork.presentation.activity.ActivityScreen
import dev.amal.socialnetwork.presentation.chat.ChatScreen
import dev.amal.socialnetwork.presentation.create_post.CreatePostScreen
import dev.amal.socialnetwork.presentation.edit_profile.EditProfileScreen
import dev.amal.socialnetwork.presentation.login.LoginScreen
import dev.amal.socialnetwork.presentation.main_feed.MainFeedScreen
import dev.amal.socialnetwork.presentation.post_detail.PostDetailScreen
import dev.amal.socialnetwork.presentation.profile.ProfileScreen
import dev.amal.socialnetwork.presentation.register.RegisterScreen
import dev.amal.socialnetwork.presentation.search.SearchScreen
import dev.amal.socialnetwork.presentation.splash.SplashScreen

@ExperimentalMaterialApi
@Composable
fun Navigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.LoginScreen.route,
        modifier = Modifier.fillMaxSize()
    ) {
        composable(Screen.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        composable(Screen.LoginScreen.route) {
            LoginScreen(navController = navController)
        }
        composable(Screen.RegisterScreen.route) {
            RegisterScreen(navController = navController)
        }
        composable(Screen.MainFeedScreen.route) {
            MainFeedScreen(navController = navController)
        }
        composable(Screen.ChatScreen.route) {
            ChatScreen(navController = navController)
        }
        composable(Screen.ActivityScreen.route) {
            ActivityScreen(navController = navController)
        }
        composable(Screen.ProfileScreen.route) {
            ProfileScreen(navController = navController)
        }
        composable(Screen.EditProfileScreen.route) {
            EditProfileScreen(navController = navController)
        }
        composable(Screen.CreatePostScreen.route) {
            CreatePostScreen(navController = navController)
        }
        composable(Screen.SearchScreen.route) {
            SearchScreen(navController = navController)
        }
//        composable(Screen.PersonListScreen.route) {
//            PersonListScreen(navController = navController)
//        }
        composable(Screen.PostDetailScreen.route) {
            PostDetailScreen(
                navController = navController,
                post = Post(
                    username = "Just_Amalll",
                    imageUrl = "",
                    profilePictureUrl = "",
                    description = "Some Random Text Here",
                    likeCount = 17,
                    commentCount = 7
                )
            )
        }
    }
}