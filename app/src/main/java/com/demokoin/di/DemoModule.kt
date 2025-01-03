package com.demokoin.di

import com.demokoin.model.Car
import com.demokoin.model.Engine
import com.demokoin.model.Wheel
import com.demokoin.model.interfaces.Main
import org.koin.dsl.module

val demoModule = module {

    //  factory { Car() }
    factory { Wheel() }
    factory { Engine() }
    factory { Car(get(),get()) }
    factory { Main(get(),get()) }
   //factory { Car() }
    //factory { HelloCar(get()) }
}