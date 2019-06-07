package com.example.fullfit.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.fullfit.Activity.FourthFragment
import com.example.fullfit.Activity.HomeFragment
import com.example.fullfit.Activity.SecondFragment
import com.example.fullfit.Activity.ThirdFragment

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            else -> {
                return FourthFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 4
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "First Tab"
            1 -> "Second Tab"
            2 -> "Third Tab"
            else -> {
                return "Fourth Tab"
            }
        }
    }

}