package com.demokoin.di

import com.demokoin.model.Car
import org.koin.dsl.module

val demoModule = module {

    factory { Car() }
  //  single { Car() }
}