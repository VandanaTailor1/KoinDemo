package com.demokoin.model

import android.util.Log

class Car constructor(private val engine: Engine, private val wheel: Wheel) {
     fun getCar(){
         engine.getEngine()
         wheel.getWheel()
         Log.d("222", "getCar: Car")
     }
 }

class Engine {
    fun getEngine() {
        Log.d("222", "getEngine: start engine....")
    }
}

class Wheel {
    fun getWheel() {
        Log.d("222", "getWheel: start wheel...")
    }
}
