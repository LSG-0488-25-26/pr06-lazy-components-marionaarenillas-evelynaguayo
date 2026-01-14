package com.example.lazycomponents.repository

import com.example.lazycomponents.model.CatItem

object CatRepository {

    fun getCats(): List<CatItem> {
        return listOf(

            CatItem(
                id = "cat_1",
                titol = "Gat aleatori 1",
                text = "Imatge aleatòria de gat.",
                imageUrl = "https://cataas.com/cat?type=medium",
                tags = listOf("random")
            ),

            CatItem(
                id = "cat_2",
                titol = "Gat aleatori 2",
                text = "Una altra imatge aleatòria de gat.",
                imageUrl = "https://cataas.com/cat?type=medium",
                tags = listOf("random")
            ),

            CatItem(
                id = "cat_3",
                titol = "Gat amb text 1",
                text = "Gat amb text sobre la imatge.",
                imageUrl = "https://cataas.com/cat/says/Hola?type=medium",
                tags = listOf("text")
            ),

            CatItem(
                id = "cat_4",
                titol = "Gat amb text 2",
                text = "Gat amb un missatge curt.",
                imageUrl = "https://cataas.com/cat/says/Bon%20dia?type=medium",
                tags = listOf("text")
            ),

            CatItem(
                id = "cat_5",
                titol = "Gat amb text 3",
                text = "Imatge de gat amb text personalitzat.",
                imageUrl = "https://cataas.com/cat/says/Cute%20cat?type=medium",
                tags = listOf("text")
            ),

            CatItem(
                id = "cat_6",
                titol = "Gat aleatori 3",
                text = "Imatge aleatòria de gat.",
                imageUrl = "https://cataas.com/cat?type=medium",
                tags = listOf("random")
            ),

            CatItem(
                id = "cat_7",
                titol = "Gat aleatori 4",
                text = "Una altra imatge aleatòria de gat.",
                imageUrl = "https://cataas.com/cat?type=medium",
                tags = listOf("random")
            ),

            CatItem(
                id = "cat_8",
                titol = "Gat amb text 4",
                text = "Gat amb text senzill.",
                imageUrl = "https://cataas.com/cat/says/Hello!%20%F0%9F%90%B1?type=medium",
                tags = listOf("text")
            )
        )
    }
}