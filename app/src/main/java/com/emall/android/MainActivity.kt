package com.emall.android

import android.annotation.SuppressLint
import android.os.Bundle
import com.ashokvarma.bottomnavigation.BottomNavigationBar
import com.ashokvarma.bottomnavigation.BottomNavigationItem
import com.emall.base.TestActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : TestActivity() {

    @SuppressLint("MissingSuperCall")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBottomNavigationBar.addItem(BottomNavigationItem(R.drawable.home_nav_icon_gray, "Home"))
                .addItem(BottomNavigationItem(R.drawable.classify_nav_icon_gray, "Books"))
                .addItem(BottomNavigationItem(R.drawable.program_nav_icon, ""))
                .addItem(BottomNavigationItem(R.drawable.special_nav_icon_gray, "Movies & TV"))
                .addItem(BottomNavigationItem(R.drawable.me_nav_icon_gray, "Games"))
                .initialise()

        mBottomNavigationBar
                .setMode(BottomNavigationBar.MODE_FIXED)

        mBottomNavigationBar
                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_RIPPLE)
    }
}
