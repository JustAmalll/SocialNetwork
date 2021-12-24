package dev.amal.socialnetwork.core.presentation.util

import dev.amal.socialnetwork.core.util.Event
import dev.amal.socialnetwork.core.util.UiText

sealed class UiEvent : Event() {
    data class ShowSnackBar(val uiText: UiText) : UiEvent()
    data class Navigate(val route: String) : UiEvent()
    object NavigateUp : UiEvent()
    object OnLogin : UiEvent()
}