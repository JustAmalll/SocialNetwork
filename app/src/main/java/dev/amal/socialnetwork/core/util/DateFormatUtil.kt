package dev.amal.socialnetwork.core.util

import java.text.SimpleDateFormat
import java.util.*

object DateFormatUtil {
    fun timestampToFormattedString(timestamp: Long, pattern: String): String =
        SimpleDateFormat(pattern, Locale.getDefault()).run { format(timestamp) }
}