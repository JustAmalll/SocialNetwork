package dev.amal.socialnetwork.feature_auth.domain.use_case

import dev.amal.socialnetwork.core.util.SimpleResource
import dev.amal.socialnetwork.feature_auth.domain.repository.AuthRepository

class AuthenticateUseCase(
    private val repository: AuthRepository
) {
    suspend operator fun invoke(): SimpleResource = repository.authenticate()
}