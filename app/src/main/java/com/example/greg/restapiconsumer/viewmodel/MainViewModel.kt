package com.example.greg.restapiconsumer.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.greg.restapiconsumer.repository.MainRepository
import kotlinx.coroutines.launch
import okhttp3.ResponseBody

class MainViewModel : ViewModel() {

    private val repo = MainRepository()

    private val dataText = MutableLiveData<ResponseBody>()

    fun getDataText() : LiveData<ResponseBody> { //todo: replace ResponseBody with actual data model
        viewModelScope.launch {
            dataText.value = repo.getData()
        }
        return dataText
    }
}