package com.ankkumar.viewpage2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPager2Adapter(private val userList: ArrayList<String>, fragmentManger: FragmentManager): FragmentStateAdapter(fragmentManger) {

    override fun getItem(position: Int): Fragment {
        return ViewPager2Fragment.getInstance(userList[position])
    }

    override fun getItemCount(): Int {
        return userList.size
    }

}