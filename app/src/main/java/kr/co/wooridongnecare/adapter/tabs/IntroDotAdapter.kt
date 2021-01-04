package kr.co.wooridongnecare.adapter.tabs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.wooridongnecare.ui.intro.FragmentIntro1
import kr.co.wooridongnecare.ui.intro.FragmentIntro2

class IntroDotAdapter(fm: FragmentManager): FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val PAGE_MAX_CNT = 2


    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> FragmentIntro1().newInstance()
            else -> FragmentIntro2().newInstance()
        }
    }

    override fun getCount(): Int {
        return PAGE_MAX_CNT
    }
}