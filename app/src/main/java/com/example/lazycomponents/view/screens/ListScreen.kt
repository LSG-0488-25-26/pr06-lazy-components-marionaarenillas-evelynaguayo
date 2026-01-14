package com.example.lazycomponents.view.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lazycomponents.view.components.CatCardItem
import com.example.lazycomponents.viewmodel.CatViewModel

@Composable
fun ListScreen(
    catViewModel: CatViewModel,
    onCatClick: (String) -> Unit
) {
    val cats by catViewModel.cats.observeAsState(initial = emptyList())

    Text(
        text = "Cataas Cats (${cats.size})",
        style = MaterialTheme.typography.headlineSmall,
        modifier = Modifier.padding(16.dp)
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(10.dp),
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 48.dp)
    ) {
        items(cats.size) { index ->
            val cat = cats[index]
            CatCardItem(
                cat = cat,
                onClick = onCatClick
            )
        }
    }
}