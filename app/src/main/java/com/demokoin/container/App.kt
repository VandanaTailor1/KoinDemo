package com.demokoin.container

import android.app.Application
import com.demokoin.di.demoModule
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(demoModule)
        }
    }

}