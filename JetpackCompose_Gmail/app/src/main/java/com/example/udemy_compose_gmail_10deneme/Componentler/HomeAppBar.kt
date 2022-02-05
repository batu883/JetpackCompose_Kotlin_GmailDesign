package com.example.udemy_compose_gmail_10deneme.Componentler

import android.app.Dialog
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.udemy_compose_gmail_10deneme.GmailApp
import com.example.udemy_compose_gmail_10deneme.ui.theme.Udemy_Compose_Gmail_10denemeTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import com.example.udemy_compose_gmail_10deneme.R

@Composable
fun HomeAppBar(scaffoldState: ScaffoldState,
               scope: CoroutineScope,
                openDialog: MutableState<Boolean>){

    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)){
        Card(elevation = 15.dp, modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            //.padding(end=5.dp),
            ,
            shape = RoundedCornerShape(20.dp)
        ) {

            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(end = 10.dp)) {

                IconButton(onClick = { scope.launch { scaffoldState.drawerState.open() } }) {
                    Icon(
                        Icons.Default.Menu,"Menü",
                        modifier = Modifier.padding(10.dp))
                }




                Text(text = "Maillere Hoşgeldiniz",
                    Modifier
                        .padding(start = 5.dp)
                        .weight(1f))
                Image(painter = painterResource(id = R.drawable.gmail3), contentDescription ="Gmail",
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                        .background(color = Color.Gray)
                        .clickable {
                            openDialog.value = true
                        }//OPEN_DİALOGGG
                )
                if (openDialog.value){
                    AccountsDialog(openDialog)
                }
            }

        }




    }

}

@Preview(showBackground = true)
@Composable
fun DefaultHomeAppBar() {
    Udemy_Compose_Gmail_10denemeTheme() {
        GmailApp()
    }
}