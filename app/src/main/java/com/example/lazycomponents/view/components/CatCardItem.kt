package com.example.lazycomponents.view.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.lazycomponents.model.CatItem

@Composable
fun CatCardItem(
    cat: CatItem,
    onClick: (String) -> Unit
) {
    Card(
        shape = RoundedCornerShape(14.dp),
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick(cat.id) }
            .padding(6.dp)
    ) {
        Column(modifier = Modifier.padding(10.dp)) {

            AsyncImage(
                model = cat.imageUrl,
                contentDescription = cat.titol,
                placeholder = painterResource(android.R.drawable.ic_menu_gallery),
                error = painterResource(android.R.drawable.ic_delete),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp)
            )

            Text(
                text = cat.titol,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 8.dp)
            )

            Text(
                text = cat.text,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}