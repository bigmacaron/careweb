package kr.co.wooridongnecare.ui.intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import com.example.care_webapp_kotlin.R
import kr.co.wooridongnecare.adapter.tabs.IntroDotAdapter
import kotlinx.android.synthetic.main.activity_intro.*
import kotlin.system.exitProcess

class IntroActivity : AppCompatActivity() {

    companion object {
        private val TAG = IntroActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val pagerAdapter =
            IntroDotAdapter(
                supportFragmentManager
            )
        viewpager_intro.adapter = pagerAdapter

        tab_indicator.setupWithViewPager(viewpager_intro)
    }

    override fun onBackPressed() {
        ActivityCompat.finishAffinity(this)
        exitProcess(0)
    }
}