package com.example.greg.restapiconsumer.viewmodel

import androidx.lifecycle.*
import com.example.greg.restapiconsumer.repository.MainRepository
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val repo = MainRepository()

    private val dataText = MutableLiveData<String>()

    fun getDataText() : LiveData<String> {
        viewModelScope.launch {
            dataText.value = repo.getData()
        }
        return dataText
    }
}