package com.azzam.catatan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(HomeFragment.newInstance(), true)
    }

        fun replaceFragment(fragment: Fragment, itransition:Boolean ){
            val fragmentTransition = supportFragmentManager.beginTransaction()

            if (itransition) {
                fragmentTransition.setCustomAnimations(
                    android.R.anim.slide_out_right,
                    android.R.anim.slide_in_left
                )
            }
            fragmentTransition.replace(R.id.frame_layout,fragment).addToBackStack(fragment.javaClass.simpleName).commit()
    }
}