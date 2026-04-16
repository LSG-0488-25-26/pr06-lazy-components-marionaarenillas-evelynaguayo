package com.example.lazycomponents.repository

import com.example.lazycomponents.model.CatItem

// Simulem la resposta de la API de Cataas creant els elements manualment.
// Les URLs apunten a imatges reals de https://cataas.com
object CatRepository {

    fun getCats(): List<CatItem> {
        return listOf(
            CatItem(
                id = "gat_siames",
                titol = "Gat Siamès",
                text = "Raça originària d'Àsia del Sud-est. Coneguda per la vocalització i personalitat extrovertida. Té uns ulls de color blau intens.",
                imageUrl = "https://cataas.com/cat/says/Siames",
                tags = listOf("asiàtic", "vocalitzador", "extrovertit")
            ),
            CatItem(
                id = "gat_persa",
                titol = "Gat Persa",
                text = "Raça de pèl llarg originària de Pèrsia. Gat tranquil i afectuós. Destaca pel seu morro curt i pla i el seu caràcter pacífic.",
                imageUrl = "https://cataas.com/cat/says/Persa",
                tags = listOf("pèl llarg", "tranquil", "morro pla")
            ),
            CatItem(
                id = "gat_maine_coon",
                titol = "Maine Coon",
                text = "Una de les races domèstiques més grans del món. Originari d'Amèrica del Nord. Caràcter social i juganer.",
                imageUrl = "https://cataas.com/cat/says/Maine%20Coon",
                tags = listOf("gran", "sociable", "nord-americà")
            ),
            CatItem(
                id = "gat_bengali",
                titol = "Gat Bengalí",
                text = "Raça molt activa amb un pelatge tacat semblant al d'un lleopard. Altament intel·ligent i necessita molta estimulació.",
                imageUrl = "https://cataas.com/cat/says/Bengali",
                tags = listOf("tacat", "actiu", "intel·ligent")
            ),
            CatItem(
                id = "gat_britanic",
                titol = "Britànic de Pèl Curt",
                text = "Gat arrodonit i calmat, molt popular al Regne Unit. Cos compacte i pèl dens. Afectuós però independent.",
                imageUrl = "https://cataas.com/cat/says/Britanic",
                tags = listOf("rodó", "calmat", "britànic")
            ),
            CatItem(
                id = "gat_abissini",
                titol = "Gat Abissini",
                text = "Raça esvelta i molt activa d'origen africà. Pelatge tic (agouti) característic. Molt curiosos i jugadors.",
                imageUrl = "https://cataas.com/cat/says/Abissini",
                tags = listOf("esvelt", "actiu", "africà")
            ),
            CatItem(
                id = "gat_noruec",
                titol = "Noruec de Bosc",
                text = "Gat nòrdic de pèl llarg i dens, adaptat al fred escandinau. Robust i bon caçador. Amigable amb tota la família.",
                imageUrl = "https://cataas.com/cat/says/Noruec",
                tags = listOf("nòrdic", "pèl llarg", "robust")
            ),
            CatItem(
                id = "gat_ragdoll",
                titol = "Gat Ragdoll",
                text = "Raça gran i molt dòcil, coneguda pels seus ulls blaus. Tendeix a relaxar-se completament quan se'l agafa.",
                imageUrl = "https://cataas.com/cat/says/Ragdoll",
                tags = listOf("dòcil", "gran", "ulls blaus")
            )
        )
    }
}
