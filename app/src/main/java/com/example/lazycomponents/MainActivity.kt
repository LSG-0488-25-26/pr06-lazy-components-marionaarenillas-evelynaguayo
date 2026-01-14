package com.example.lazycomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.lazycomponents.navigation.AppNav
import com.example.lazycomponents.viewmodel.CatViewModel

class MainActivity : ComponentActivity() {
    // ViewModel lligat al cicle de vida de l’Activity (MVVM)
    private val catViewModel: CatViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            // Aquí mostrem el NavHost (llista / detall)
            AppNav(catViewModel = catViewModel)
        }
    }
}