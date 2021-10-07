package com.example.testfrag

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    lateinit var viewPager2: ViewPager2
    lateinit var myAdapter: ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        viewPager2=findViewById(R.id.viewpager)

        myAdapter=ViewPagerAdapter(this)

        viewPager2.adapter=myAdapter

*/


    }

   // private fun createCardAdapter(): ViewPagerAdapter? {
  //      return ViewPagerAdapter(this)
  //  }


}