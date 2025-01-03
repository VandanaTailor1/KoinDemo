package com.demokoin.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.demokoin.retrofit.ApiService
import kotlinx.coroutines.launch


class RetrofitViewModel constructor(private val apiService : ApiService) : ViewModel() {

    suspend fun getPost() = viewModelScope.launch {
        apiService.getPost()
    }

}