package com.demokoin.di

import com.demokoin.viewmodel.MainViewModel
import com.demokoin.viewmodel.Test
import com.demokoin.viewmodel.TestImp
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

val viewModelModule = module {
     factory { TestImp() } bind  Test::class

    viewModel {
        MainViewModel(get())
    }
}