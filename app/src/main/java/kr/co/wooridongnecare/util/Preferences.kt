package kr.co.wooridongnecare.util

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit

object Preferences {
    private const val FIRST_KEY = "first"
    private lateinit var prefs: SharedPreferences

    fun init(context: Context) {
        prefs = context.getSharedPreferences(context.packageName, Activity.MODE_PRIVATE)
    }
    var first: String // 최초 실행 확인
        get() = prefs.getString(
            FIRST_KEY, "") ?: "" // Null x Empty
        set(value) = prefs.edit(){
            putString(FIRST_KEY, value).apply()
        }
}