package dev.amal.socialnetwork.feature_auth.domain.models

import dev.amal.socialnetwork.core.util.SimpleResource
import dev.amal.socialnetwork.feature_auth.presentation.util.AuthError

data class RegisterResult(
    val emailError: AuthError? = null,
    val usernameError: AuthError? = null,
    val passwordError: AuthError? = null,
    val result: SimpleResource? = null
)
