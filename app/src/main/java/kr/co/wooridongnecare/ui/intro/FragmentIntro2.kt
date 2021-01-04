package kr.co.wooridongnecare.ui.intro

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kr.co.wooridongnecare.MainActivity
import com.example.care_webapp_kotlin.R
import kr.co.wooridongnecare.util.Preferences
import kotlinx.android.synthetic.main.fragment_intro2.view.*

class FragmentIntro2 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_intro2, container, false)
        view.btn_start.setOnClickListener {
            Preferences.first = "OK"
            intent()
        }
        return view
    }
    fun newInstance(): FragmentIntro2 {
        val args = Bundle()
        val frag = FragmentIntro2()
        frag.arguments = args

        return frag
    }
    private fun intent() {
        val intent = Intent(context, MainActivity::class.java)
//        val intent = Intent(context, TutorialActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
    }
}