package com.demokoin.di

import com.demokoin.model.interfaces.DemoImpl
import com.demokoin.model.interfaces.DemoOne
import com.demokoin.model.interfaces.DemoTwo
import com.demokoin.model.interfaces.Main
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module

val interfaceModule = module {

    //It is not recomend way
      factory { DemoImpl() as DemoOne }

    // That one
    factory<DemoOne> { DemoImpl() }

    //factory  { DemoImpl() } bind  DemoOne::class
    factory { DemoImpl() } binds arrayOf(DemoOne::class, DemoTwo::class)
    factory { Main(get(),get()) }
}