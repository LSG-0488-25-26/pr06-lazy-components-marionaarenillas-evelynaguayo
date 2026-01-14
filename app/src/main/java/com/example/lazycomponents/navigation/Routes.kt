package com.example.lazycomponents.navigation

sealed class Routes(val route: String) {
    data object List : Routes("list")
    data object Detail : Routes("detail/{catId}") {
        fun createRoute(catId: String) = "detail/$catId"
    }
}