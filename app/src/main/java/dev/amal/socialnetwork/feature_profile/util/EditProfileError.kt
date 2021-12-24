package dev.amal.socialnetwork.feature_profile.util

sealed class EditProfileError : Error() {
    object FieldEmpty : EditProfileError()
}
