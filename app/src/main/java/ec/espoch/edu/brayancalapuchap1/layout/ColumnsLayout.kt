package ec.espoch.edu.brayancalapuchap1.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Columnas() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(vertical = 36.dp, horizontal = 8.dp)
            .background(color = androidx.compose.ui.graphics.Color.Red)
            .fillMaxSize()
    ) {
        Text(
            text = "Brayan Calapucha",
            modifier = Modifier.padding(vertical = 50.dp, horizontal = 16.dp)
        )
        Text(
            text = "Brian Jungal",
            modifier = Modifier.padding(vertical = 50.dp, horizontal = 16.dp)
        )
        Text(
            text = "Computacion movil PAO6",
            modifier = Modifier.padding(vertical = 50.dp, horizontal = 16.dp)
        )
    }
}