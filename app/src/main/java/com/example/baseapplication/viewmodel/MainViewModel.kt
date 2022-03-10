package com.example.baseapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.baseapplication.repository.RetrofitRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val retrofitRepository: RetrofitRepository
): ViewModel() {

    fun getStuff(){
        viewModelScope.launch(Dispatchers.IO) {
            retrofitRepository.getSomething()
        }
    }
}