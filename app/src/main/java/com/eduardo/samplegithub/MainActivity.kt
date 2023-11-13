package com.eduardo.samplegithub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.eduardo.samplegithub.ui.theme.SampleGithubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Nuevo()
        }
    }
}

@Composable
fun Nuevo(){
    Column {
        Text(text = "Hola amigos")
        Button(
            onClick = { /*TODO*/ })
        {
            Icon(imageVector = Icons.Default.CheckCircle, contentDescription = "")
            Text(text = "Iniciar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Nuevo()
}