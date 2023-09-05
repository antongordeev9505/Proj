package az.kapitalbank.birbankinvest.utils

import android.content.Context
import android.os.Build
import android.provider.Settings
import java.io.File

fun isRooted(context: Context): Boolean {
    val isEmulator = isEmulator(context)
    val buildTags = Build.TAGS
    return if (!isEmulator && buildTags != null && buildTags.contains("test-keys")) {
        true
    } else {
        var file = File("/system/app/Superuser.apk")
        if (file.exists()) {
            true
        } else {
            file = File("/system/xbin/su")
            !isEmulator && file.exists()
        }
    }
}

private fun isEmulator(context: Context): Boolean {
    val androidId = Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
    return "sdk" == Build.PRODUCT || "google_sdk" == Build.PRODUCT || androidId == null
}