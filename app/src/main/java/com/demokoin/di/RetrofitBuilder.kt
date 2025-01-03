package com.demokoin.di

import com.demokoin.retrofit.ApiService
import com.demokoin.viewmodel.RetrofitViewModel
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

fun provideMoshi() : Moshi = Moshi
    .Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

fun providerApiService(moshi: Moshi) : ApiService =
     Retrofit
         .Builder()
         .run {
             baseUrl(ApiService.Base_URL)
             addConverterFactory(MoshiConverterFactory.create(moshi))
                 .build()
         }.create(ApiService::class.java)


val retrofitBuilderModule = module {
      single { provideMoshi() }
      single { providerApiService(get()) }

    viewModel { RetrofitViewModel(get())}
}