package com.demokoin.viewmodel

import android.util.Log

interface Test {
    fun getTest()
}

class TestImp : Test {
    override fun getTest() {
        Log.d("222", "getTest: Hey ViewModel......")
    }
}