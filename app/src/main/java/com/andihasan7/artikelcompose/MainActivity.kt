package com.andihasan7.artikelcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andihasan7.artikelcompose.ui.theme.ArtikelComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtikelComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    ArtikelComposeImage(title = getString(R.string.title),
                        subTitle = getString(R.string.sub_title),
                        detail = getString(R.string.detail))
                }
            }
        }
    }
}

@Composable
fun ArtikelComposeText(title: String, subTitle: String, detail: String) {

    Column {
        Text(text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
        )

        Text(text = subTitle,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp),
            textAlign = Justify
        )

        Text(text = detail,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp),
            textAlign = Justify
        )
    }
}

@Composable
fun ArtikelComposeImage(title: String, subTitle: String, detail: String) {

    val image = painterResource(id = R.drawable.compose_background)
    Column {
        Image(painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
        )
        ArtikelComposeText(title = title, subTitle = subTitle, detail = detail,
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ArtikelComposePreview() {
    ArtikelComposeTheme {
        ArtikelComposeImage(title = "Judul", subTitle = "subtitle", detail = "detail")
    }
}