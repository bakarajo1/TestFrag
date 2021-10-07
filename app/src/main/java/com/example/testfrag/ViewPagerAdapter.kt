package com.example.testfrag

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

private val arrayList: ArrayList<Fragment> = ArrayList()

class ViewPagerAdapter(fragmentActivity: Fragment) :

    FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        return RegisterFrag.newInstance(position+1)
    }

    

    override fun getItemCount(): Int {
        return CARD_ITEM_SIZE
    }

    companion object {
         const val CARD_ITEM_SIZE = 3
    }
}