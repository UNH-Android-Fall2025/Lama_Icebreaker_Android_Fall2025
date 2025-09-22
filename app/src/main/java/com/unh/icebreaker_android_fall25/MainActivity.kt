package com.unh.icebreaker_android_fall25

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.unh.icebreaker_android_fall25.ui.theme.IcebreakerandroidFall25Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IcebreakerandroidFall25Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                MainScreen(
                    modifier = Modifier.padding(innerPadding),
                    onGetQuestionClicked = { getQuestionsFromFirebase() },
                    onSubmitClicked = { setResponseToFirebase() }
                )
                }
            }
        }
    }
}
private fun getQuestionsFromFirebase(){
    Log.d("IcebreakerF2025","Get from DB")
}

private fun setResponseToFirebase(){
    Log.d("IcebreakerF2025", "Save to DB")
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Goodbye $name!", // Testing Name change
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IcebreakerandroidFall25Theme {
        Greeting("Android")
    }
}