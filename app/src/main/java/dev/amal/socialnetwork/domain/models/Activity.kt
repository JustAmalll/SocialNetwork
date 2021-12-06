package dev.amal.socialnetwork.domain.models

import dev.amal.socialnetwork.domain.util.ActivityAction

data class Activity(
    val username: String,
    val actionType: ActivityAction,
    val formattedTime: String,
)
