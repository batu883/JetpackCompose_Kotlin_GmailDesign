package com.example.udemy_compose_gmail_10deneme.Componentler

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.udemy_compose_gmail_10deneme.Datalar.DialogBoxDatas
import com.example.udemy_compose_gmail_10deneme.GmailApp
import com.example.udemy_compose_gmail_10deneme.R

import com.example.udemy_compose_gmail_10deneme.ui.theme.Udemy_Compose_Gmail_10denemeTheme

@Composable
fun AccountsDialog(openDialog:MutableState<Boolean>){
    Dialog(onDismissRequest = { openDialog.value=false},
        properties = DialogProperties(dismissOnClickOutside = false)
    ) {
    DialogBox(openDialog=openDialog)
    }
}


@Composable
fun DialogBox(openDialog: MutableState<Boolean>) {
    Card(backgroundColor = Color.White) {
        Column {
        val userList= listOf(DialogBoxDatas.user1,DialogBoxDatas.user2,
        DialogBoxDatas.addAccount,DialogBoxDatas.manageAccount)
       // val manageList= listOf(DialogBoxDatas.addAccount,DialogBoxDatas.manageAccount)

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {


                IconButton(onClick = { openDialog.value=false }) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "Close")
                }
                Image(
                    painter = painterResource(id = R.drawable.google), contentDescription = "",
                    modifier = Modifier
                        .weight(2f)
                        .size(50.dp)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 10.dp)

            ) {
                Image(painter = painterResource(id = R.drawable.gmail3), contentDescription ="Gmail",
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                        .background(color = Color.Gray)

                )
                Column(modifier = Modifier
                    .weight(2f)
                    .padding(start = 10.dp, bottom = 16.dp)) {
                    Text(text = "Tutorials EU", fontWeight = FontWeight.Bold)
                    Text(text = "tutorials@eucom")
                }
                Column(modifier = Modifier.padding(end = 15.dp)) {
                    Text(text = "99+", fontWeight = FontWeight.Light)
                }
            }
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){
                Card(modifier=Modifier.requiredWidth(150.dp),
                    shape = RoundedCornerShape(70.dp),
                    border = BorderStroke(1.dp, Color.LightGray)) {

                    Text(text = "Google Account", textAlign = TextAlign.Center,
                    modifier = Modifier.padding(8.dp)
                    )
                }

            }
            Divider(modifier = Modifier.padding(top = 15.dp, bottom = 10.dp))
            
            userList.forEach { 
                x->
                if (x.isUser==true){
                    DialogBoxUserSatir(d = x)
                }
                else{
                    DialogBoxSettingsSatır(d = x)
                }

            }
            Divider(modifier = Modifier.padding(top = 15.dp, bottom = 10.dp))
            Row(modifier=Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically) {

                Text(text = "Privacy Policy")

                Card(shape = CircleShape,           //FOR BLACK DOTT
                    backgroundColor = Color.Black,
                modifier = Modifier.size(5.dp)) {      }
                Text(text = "Privacy Policy")
            }
        }
    }
}



@Composable
fun DialogBoxUserSatir(d:DialogBoxDatas){

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 25.dp, top = 10.dp, start = 5.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier
                .size(30.dp)
                .fillMaxHeight()
                .clip(CircleShape)
                ,
            backgroundColor = Color.DarkGray
        ) {

            Text(
                text = d.userName!![0].toString(),
                textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                modifier = Modifier.padding(top = 3.dp)
            )
        }
        Column(
            modifier = Modifier
                .padding(5.dp)
                .weight(2f)
        ) {
            Text(text = d.userName!!, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text = d.userMail!!, fontSize = 14.sp, fontWeight = FontWeight.ExtraLight )
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,modifier = Modifier.padding(end = 15.dp)
        
        ) {
            Text(text = d.unreadMessage.toString()+"+")
        }
    }

}




@Composable
fun DialogBoxSettingsSatır(d: DialogBoxDatas){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 5.dp, top = 10.dp, start = 5.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

            IconButton(onClick = { /*TODO*/ },modifier = Modifier.padding(top = 4.dp)) {
                Image(imageVector = d.icon!!, contentDescription = "")
            }

        Column(
            modifier = Modifier
                .padding(5.dp)
                .weight(2f)
        ) {
            Text(text = d.header!!, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            //Text(text = d.userMail!!, fontSize = 14.sp, fontWeight = FontWeight.ExtraLight )
        }

    }

}









@SuppressLint("UnrememberedMutableState")
@Preview(showBackground = true)
@Composable
fun PreviewDialogBox() {
    Udemy_Compose_Gmail_10denemeTheme() {
        DialogBox(openDialog = mutableStateOf(false))
    }


}