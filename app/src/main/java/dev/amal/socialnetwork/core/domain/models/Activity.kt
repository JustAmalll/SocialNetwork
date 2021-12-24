package dev.amal.socialnetwork.core.domain.models

import dev.amal.socialnetwork.feature_activity.domain.ActivityAction

data class Activity(
    val username: String,
    val actionType: ActivityAction,
    val formattedTime: String,
)
