package kr.co.wooridongnecare.ui.intro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.care_webapp_kotlin.R

class FragmentIntro1 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_intro1, container, false)
    }
    fun newInstance(): FragmentIntro1 {
        val args = Bundle()
        val frag = FragmentIntro1()
        frag.arguments = args

        return frag
    }


}