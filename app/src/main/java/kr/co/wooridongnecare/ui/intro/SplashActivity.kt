package kr.co.wooridongnecare.ui.intro

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kr.co.wooridongnecare.MainActivity
import com.example.care_webapp_kotlin.R
import kr.co.wooridongnecare.util.Preferences

class SplashActivity:AppCompatActivity() {
    companion object {
        private val TAG = SplashActivity::class.java.simpleName
        private const val delayTime = 1500L // 1.5초
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Log.i(TAG, "최초 실행 여부 : ${Preferences.first}")



        val intent = if (Preferences.first.isNotEmpty()) {
            Intent(this, MainActivity::class.java)
        } else {
            Intent(this, IntroActivity::class.java)
        }
        Handler().postDelayed({
            startActivity(intent)
            finish()
        },
            delayTime
        )

    }
}