package com.nepplus.viewpagerpractice.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.nepplus.viewpagerpractice.fragment.BirthFragment
import com.nepplus.viewpagerpractice.fragment.NameFragment
import com.nepplus.viewpagerpractice.fragment.PhoneFragment

class MainViewPagerAdapter(
    fm : FragmentManager
) : FragmentStatePagerAdapter(fm){

    //몇장짜리 ViewPager인지?
    override fun getCount(): Int {
        return 3
    }

    //각 페이지에 뭐 보여줄건지?
    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> NameFragment()
            1 -> BirthFragment()
            else -> PhoneFragment()

        }
    }

}