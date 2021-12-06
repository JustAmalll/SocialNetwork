package dev.amal.socialnetwork.presentation.profile

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.amal.socialnetwork.R
import dev.amal.socialnetwork.domain.models.Activity
import dev.amal.socialnetwork.domain.util.ActivityAction
import dev.amal.socialnetwork.domain.util.DateFormatUtil
import dev.amal.socialnetwork.presentation.activity.ActivityItem
import dev.amal.socialnetwork.presentation.components.StandardToolbar
import dev.amal.socialnetwork.presentation.profile.components.BannerSection
import dev.amal.socialnetwork.presentation.ui.theme.SpaceExtraLarge
import dev.amal.socialnetwork.presentation.ui.theme.SpaceMedium
import kotlin.random.Random

@Composable
fun ProfileScreen(
    navController: NavController
) {
    val bannerHeight = (LocalConfiguration.current.screenWidthDp / 2.5f).dp
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        StandardToolbar(
            navController = navController,
            modifier = Modifier.fillMaxWidth(),
            title = {
                Text(
                    text = stringResource(id = R.string.your_activity),
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.onBackground
                )
            }
        )
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            item {
                BannerSection(

                )
            }
        }
    }
}