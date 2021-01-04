package kr.co.wooridongnecare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import android.widget.Toast
import com.example.care_webapp_kotlin.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webAddress :String? = App.WEBADDRESS

        val webSettings = webView.settings
        webSettings.apply {
            javaScriptEnabled = true
            javaScriptCanOpenWindowsAutomatically = false
            useWideViewPort = true
            setSupportMultipleWindows(true)
            useWideViewPort = true // 화면 사이즈 맞추기 허용
            setSupportZoom(true) // 줌허용
            domStorageEnabled = true // 로컬 스토리지 사용 여부를 설정하는 속성으로 팝업창등을 '하루동안 보지 않기' 기능 사용에 필요 -> 자바스크립트 새창도 이걸로 띄우는듯함
//            loadsImagesAutomatically = true
//            allowFileAccess = true
//            userAgentString = "app"

        }
        /* 새창 방지 */
        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()
        /* 새창 방지 */

        webView.loadUrl(webAddress!!)



    }
    var backKeyPressedTime : Long = 0
    override fun onBackPressed() {
        if(webView.canGoBack()) {//뒤로 갈수있다면
            webView.goBack()
        }else{
            if(System.currentTimeMillis() - backKeyPressedTime >= 2000){
                backKeyPressedTime = System.currentTimeMillis()
                showBackPressedPopUp()
            }else{
                finish()
            }
        }
    }
    fun showBackPressedPopUp(){
        Toast.makeText(this,"뒤로가기 버튼 한번더 누르시면 종료됩니다.", Toast.LENGTH_SHORT).show()
    }
}