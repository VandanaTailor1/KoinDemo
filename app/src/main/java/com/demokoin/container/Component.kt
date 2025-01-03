package com.demokoin.container

import com.demokoin.model.Car
import com.demokoin.model.Engine
import com.demokoin.model.interfaces.Main
import com.demokoin.viewmodel.MainViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.component.inject


class Component : KoinComponent {
    val car: Car by inject()
    val engine : Engine by inject()
    val main : Main by inject()
  //  val car1 : Car = get()
    val mainViewModel : MainViewModel by inject()
}