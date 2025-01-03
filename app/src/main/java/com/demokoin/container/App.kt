package com.demokoin.container

import android.app.Application
import com.demokoin.di.demoModule
import com.demokoin.di.interfaceModule
import com.demokoin.di.retrofitBuilderModule
import com.demokoin.di.viewModelModule
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
           modules(demoModule , interfaceModule, viewModelModule , retrofitBuilderModule)
        }
    }

}