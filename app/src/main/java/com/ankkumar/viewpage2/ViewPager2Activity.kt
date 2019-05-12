package com.ankkumar.viewpage2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class ViewPager2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)
        val viewPager = findViewById<ViewPager2>(R.id.view_pager)
        val userList = arrayListOf("Android", "Kotlin", "Java", "XML")
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewPager.adapter = ViewPager2Adapter(userList, supportFragmentManager)
    }

}