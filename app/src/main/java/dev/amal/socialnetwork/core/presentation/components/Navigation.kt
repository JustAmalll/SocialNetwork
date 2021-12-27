package dev.amal.socialnetwork.core.presentation.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import coil.ImageLoader
import coil.annotation.ExperimentalCoilApi
import dev.amal.socialnetwork.core.domain.models.Post
import dev.amal.socialnetwork.core.util.Screen
import dev.amal.socialnetwork.feature_activity.presentation.ActivityScreen
import dev.amal.socialnetwork.feature_auth.presentation.login.LoginScreen
import dev.amal.socialnetwork.feature_auth.presentation.register.RegisterScreen
import dev.amal.socialnetwork.feature_auth.presentation.splash.SplashScreen
import dev.amal.socialnetwork.feature_chat.presentation.chat.ChatScreen
import dev.amal.socialnetwork.feature_post.presentation.create_post.CreatePostScreen
import dev.amal.socialnetwork.feature_profile.presentation.edit_profile.EditProfileScreen
import dev.amal.socialnetwork.feature_profile.presentation.profile.ProfileScreen
import dev.amal.socialnetwork.feature_profile.presentation.search.SearchScreen
import dev.amal.socialnetwork.feature_post.presentation.main_feed.MainFeedScreen
import dev.amal.socialnetwork.feature_post.presentation.post_detail.PostDetailScreen
import kotlinx.coroutines.DelicateCoroutinesApi

@ExperimentalCoilApi
@DelicateCoroutinesApi
@ExperimentalComposeUiApi
@ExperimentalMaterialApi
@Composable
fun Navigation(
    navController: NavHostController,
    scaffoldState: ScaffoldState,
    imageLoader: ImageLoader
) {
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route,
        modifier = Modifier.fillMaxSize()
    ) {
        composable(Screen.SplashScreen.route) {
            SplashScreen(
                onPopBackStack = navController::popBackStack,
                onNavigate = navController::navigate,
            )
        }
        composable(Screen.LoginScreen.route) {
            LoginScreen(
                onNavigate = navController::navigate,
                onLogin = {
                    navController.popBackStack(route = Screen.LoginScreen.route, inclusive = true)
                    navController.navigate(route = Screen.MainFeedScreen.route)
                },
                scaffoldState = scaffoldState
            )
        }
        composable(Screen.RegisterScreen.route) {
            RegisterScreen(
                navController = navController,
                scaffoldState = scaffoldState,
                onPopBackStack = navController::popBackStack
            )
        }
        composable(Screen.MainFeedScreen.route) {
            MainFeedScreen(
                onNavigateUp = navController::navigateUp,
                onNavigate = navController::navigate,
                scaffoldState = scaffoldState,
                imageLoader = imageLoader
            )
        }
        composable(Screen.ChatScreen.route) {
            ChatScreen(navController = navController)
        }
        composable(Screen.ActivityScreen.route) {
            ActivityScreen(
                onNavigateUp = navController::navigateUp,
                onNavigate = navController::navigate,
            )
        }
        composable(Screen.ProfileScreen.route) {
            ProfileScreen(navController = navController)
        }
        composable(Screen.EditProfileScreen.route) {
            EditProfileScreen(navController = navController)
        }
        composable(Screen.CreatePostScreen.route) {
            CreatePostScreen(
                onNavigateUp = navController::navigateUp,
                onNavigate = navController::navigate,
                scaffoldState = scaffoldState,
                imageLoader = imageLoader
            )
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