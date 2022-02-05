package com.example.udemy_compose_gmail_10deneme.Componentler

import androidx.compose.foundation.ScrollState
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp


@Composable
fun FloatingButton(scrollState: ScrollState) {
    if (scrollState.value>1000){
        ExtendedFloatingActionButton(text = { Text(text = "Compose") }, onClick = { /*TODO*/ },
        icon = { Icon(imageVector = Icons.Default.Edit, contentDescription = "Edit") },
            backgroundColor = Color.LightGray
            )
    }else{
        FloatingActionButton(onClick = { /*TODO*/ }, backgroundColor = Color.LightGray)
        {
            Icon(imageVector = Icons.Default.Edit, contentDescription ="Edit")
        }
    }
}