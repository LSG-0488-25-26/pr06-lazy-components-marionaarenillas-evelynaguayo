package com.example.lazycomponents.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.lazycomponents.view.screens.DetailScreen
import com.example.lazycomponents.view.screens.ListScreen
import com.example.lazycomponents.viewmodel.CatViewModel


// Funció composable encarregada de gestionar la navegació de l'aplicació.
@Composable
fun AppNav(catViewModel: CatViewModel) {

    // Controlador de navegació que manté l'estat de la navegació
    val navController = rememberNavController()

    // contenidor que defineix totes les rutes de l'app
    NavHost(
        navController = navController,
        startDestination = Routes.List.route // Pantalla inicial
    ) {

        // Ruta del llistat principal
        composable(Routes.List.route) {

            // Mostrem la pantalla de llista
            ListScreen(
                catViewModel = catViewModel,

                // Quan es fa clic en un element, naveguem al detall
                onCatClick = { catId ->
                    navController.navigate(
                        Routes.Detail.createRoute(catId)
                    )
                }
            )
        }

        // Ruta de la pantalla de detall amb paràmetre (catId)
        composable(
            route = Routes.Detail.route,
            arguments = listOf(
                navArgument("catId") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->

            // Recuperem l'id del gat passat per la ruta
            val catId = backStackEntry.arguments?.getString("catId") ?: ""

            // Mostrem la pantalla de detall
            DetailScreen(
                catViewModel = catViewModel,
                catId = catId,

                // Acció per tornar enrere
                onBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}