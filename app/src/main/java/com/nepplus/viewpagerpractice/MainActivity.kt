package com.nepplus.viewpagerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.viewpagerpractice.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mPagerAdpter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPagerAdpter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mPagerAdpter

        tab.setupWithViewPager(mainViewPager)

    }
}