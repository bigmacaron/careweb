package kr.co.wooridongnecare

import android.app.Application
import com.example.care_webapp_kotlin.R
import kr.co.wooridongnecare.util.Preferences

class App: Application() {

    companion object {
        var WEBADDRESS: String? = null
    }
    override fun onCreate(){
        super.onCreate()
        Preferences.init(this)
        WEBADDRESS = resources.getString(
            R.string.web_address
        )
    }


}