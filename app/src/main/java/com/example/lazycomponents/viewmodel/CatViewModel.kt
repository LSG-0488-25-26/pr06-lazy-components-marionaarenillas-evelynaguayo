package com.example.lazycomponents.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lazycomponents.model.CatItem
import com.example.lazycomponents.repository.CatRepository

class CatViewModel : ViewModel() {

    private val _cats = MutableLiveData<List<CatItem>>()
    val cats: LiveData<List<CatItem>> = _cats

    init {
        // La View s'hi subscriu via observeAsState i es re-renderitza quan canvia
        _cats.value = CatRepository.getCats()
    }

    fun getCatById(id: String): CatItem? {
        return _cats.value?.find { it.id == id }
    }
}
