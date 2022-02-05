package com.example.udemy_compose_gmail_10deneme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.window.Dialog
import com.example.udemy_compose_gmail_10deneme.Componentler.*
import com.example.udemy_compose_gmail_10deneme.ui.theme.Udemy_Compose_Gmail_10denemeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Udemy_Compose_Gmail_10denemeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GmailApp()
                }
            }
        }
    }
}

@Composable
fun GmailApp() {
    val scaff= rememberScaffoldState()
    val corot= rememberCoroutineScope()
    val scroll= rememberScrollState()
    val scroll2= rememberScrollState()
  //  val scroll3= rememberScrollState()
    val open=remember{
       mutableStateOf(false)
    }
    Scaffold(
        scaffoldState = scaff,
        topBar = { HomeAppBar(scaff,corot,open)    },
        drawerContent = { DrawerMenu(scroll)   },
        bottomBar = { BottomBar()             },
        //MailViewList(scroll)
        floatingActionButton = { FloatingButton(scroll2) },

        )

    {
        MailViewList(scroll2)
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Udemy_Compose_Gmail_10denemeTheme() {
        GmailApp()
    }


}