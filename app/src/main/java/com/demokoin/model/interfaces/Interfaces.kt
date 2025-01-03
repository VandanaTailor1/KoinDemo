package com.demokoin.model.interfaces

import android.util.Log


interface DemoOne {
    fun getDemoOne()
}

class DemoImpl : DemoOne , DemoTwo{
    override fun getDemoOne() {
        Log.d("222", "getDemoOne: This is demo one ")
    }

    override fun getDemoTwo() {
        Log.d("222", "getDemoTwo: This is demo two .....")
    }
}

class Main(private val demoOne: DemoOne ,private val demoTwo: DemoTwo) {
    fun getDemo() {
        demoOne.getDemoOne()
        demoTwo.getDemoTwo()
    }
}

interface DemoTwo{
     fun getDemoTwo()
}