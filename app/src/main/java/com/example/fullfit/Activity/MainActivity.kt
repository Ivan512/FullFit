package com.example.fullfit.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.fullfit.Adapter.MyPagerAdapter
import com.example.fullfit.Logic.Exercise
import com.example.fullfit.Logic.ISet
import com.example.fullfit.Logic.Strength
import com.example.fullfit.R
import com.example.fullfit.Logic.Workout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        viewpager.adapter = fragmentAdapter

        tabs.setupWithViewPager(viewpager)

        val pullup: ISet = Strength("PullUp", 60, 15.0, 10)
        val squeezing: ISet = Strength("Squeez", 60, 0.0, 15)
        val jumping: ISet = Strength("Jumping", 60, 0.0, 25)

        val MyExerc = Exercise("My Exerc", arrayListOf(pullup, pullup, pullup, pullup), 120)
        val SqueezEx = Exercise("Squeez", arrayListOf(squeezing, squeezing, squeezing), 120)
        val JumpEx = Exercise("Jump", arrayListOf(jumping, jumping, jumping), 120)

        val work = Workout("Workout",arrayListOf(MyExerc, SqueezEx, JumpEx), 5)

    }

    fun setConten(){
        setContentView(R.layout.fragment_second)
    }
}
