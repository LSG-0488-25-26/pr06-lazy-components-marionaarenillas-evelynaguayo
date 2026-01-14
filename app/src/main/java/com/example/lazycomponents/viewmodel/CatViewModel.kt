package com.example.lazycomponents.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lazycomponents.model.CatItem
import com.example.lazycomponents.repository.CatRepository

// Guarda l'estat de la llista en un LiveData
// La vista es subscriu i actualitza sola quan canvia

class CatViewModel : ViewModel() {
    private val _cats = MutableLiveData<List<CatItem>>()
    val cats: LiveData<List<CatItem>> = _cats

    init {
        // Carreguem la llista simulada (manual)
        _cats.value = CatRepository.getCats()
    }

    // Busquem l'objecte complet a partir del ID
    fun getCatById(id: String): CatItem? {
        return _cats.value?.find { it.id == id }
    }
}