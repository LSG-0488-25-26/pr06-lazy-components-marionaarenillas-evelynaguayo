package com.example.lazycomponents.model

// Gat de la API
data class CatItem(
    val id: String,
    val titol: String,
    val text: String,
    val imageUrl: String,
    val tags: List<String>
)