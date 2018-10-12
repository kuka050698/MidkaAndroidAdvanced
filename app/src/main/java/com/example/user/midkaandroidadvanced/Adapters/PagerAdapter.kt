package com.example.user.midkaandroidadvanced.Adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.user.midkaandroidadvanced.Fragments.DoneFragment
import com.example.user.midkaandroidadvanced.Fragments.TodoFragment

class PagerAdapter(fragmentManager:FragmentManager?) : FragmentPagerAdapter(fragmentManager){
    private val tab = 2
    override fun getItem(p0: Int): Fragment? {
        return when (p0) {
            0 ->TodoFragment.newInstance()
            1 -> DoneFragment.newInstance()
            else -> null
        }

    }

    override fun getCount(): Int {
        return tab
    }

}