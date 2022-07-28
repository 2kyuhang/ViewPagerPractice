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

        //이건 탭 레이아웃을 쓰기 위해 넣어주는 것!!
       tab.setupWithViewPager(mainViewPager)

    }
}

//뷰페이저 화면 좌우
//탭 레이아웃 카테코리 칸 화면 좌우
//프레그먼트 화면안에 화면