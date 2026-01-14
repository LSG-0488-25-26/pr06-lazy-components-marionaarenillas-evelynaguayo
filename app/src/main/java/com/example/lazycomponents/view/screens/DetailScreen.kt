package com.example.lazycomponents.view.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.lazycomponents.viewmodel.CatViewModel

// Pantalla de detall: Rebem un id per paràmetre i busquem l’objecte complet al ViewModel
@Composable
fun DetailScreen(
    catViewModel: CatViewModel,
    catId: String,
    onBack: () -> Unit
) {
    val cat = catViewModel.getCatById(catId)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (cat == null) {
            Text("No s’ha trobat el gat amb id=$catId")
            Button(onClick = onBack, modifier = Modifier.padding(top = 16.dp)) {
                Text("Tornar")
            }
            return
        }

        Text(
            text = cat.titol,
            style = MaterialTheme.typography.headlineSmall
        )

        AsyncImage(
            model = cat.imageUrl,
            contentDescription = cat.titol,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(top = 12.dp)
        )

        Text(
            text = cat.text,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(top = 12.dp)
        )

        Text(
            text = "Tags: ${cat.tags.joinToString()}",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(top = 8.dp)
        )

        Button(
            onClick = onBack,
            modifier = Modifier.padding(top = 18.dp)
        ) {
            Text("Tornar a la llista")
        }
    }
}
