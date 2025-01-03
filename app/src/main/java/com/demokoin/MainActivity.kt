package com.demokoin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.demokoin.container.Component


class MainActivity : AppCompatActivity() {

    // Inject HelloPrinter
    //  private val helloCar: HelloCar by inject()
    //    private val car : Car by inject()
    private val component = Component()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.car.getCar()
        component.main.getDemo()
        component.mainViewModel.getTest()

    }
}