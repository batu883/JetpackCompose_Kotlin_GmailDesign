package com.example.udemy_compose_gmail_10deneme.Componentler

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.udemy_compose_gmail_10deneme.Datalar.BottomBarData

@Composable
fun BottomBar(){
    val listele= listOf(BottomBarData.Mail,   BottomBarData.Meet)
    BottomNavigation() {
        listele.forEach {
                x->
            BottomNavigationItem(selectedContentColor = Color.Black,
                modifier = Modifier.background(color= Color.White),
                selected = false, onClick = { /*TODO*/ },
                // { Icon(imageVector = x.icon, contentDescription = x.title) },
                icon = { Icon(imageVector = x.iconnn, contentDescription =x.title ) },
                label = { Text(text = x.title) },
            )
        }
    }
}