package com.example.udemy_compose_gmail_10deneme.Componentler

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.udemy_compose_gmail_10deneme.Datalar.MailData
import com.example.udemy_compose_gmail_10deneme.GmailApp
import com.example.udemy_compose_gmail_10deneme.ui.theme.Udemy_Compose_Gmail_10denemeTheme

@Composable
fun MailViewList(scrollState: ScrollState)
{
    val liste= listOf(
        MailData.MailOne,
         MailData.MailTwo,
        MailData.MailThree,
        MailData.MailFour,
        MailData.MailFive,
        MailData.MailSix,
        MailData.MailSeven,
        MailData.MailEight,
        MailData.MailNine,
        MailData.MailTen,

    )
    Column(Modifier.verticalScroll(scrollState)) {
        liste.forEach {
                abc->
            MailTekSatir(m = abc)
            Divider()
        }
    }
}




@Composable
fun MailTekSatir(m: MailData) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 55.dp,top=10.dp, start = 5.dp)
    ) {
        Card(
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape),
            backgroundColor = Color.DarkGray
        ) {

            Text(
                text = m.userName[0].toString(),
                textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                modifier = Modifier.padding(top = 10.dp)
            )
        }
        Column(
            modifier = Modifier
                .padding(5.dp)
                .weight(2f)
        ) {
            Text(text = m.userName, fontSize = 22.sp, fontWeight = FontWeight.Bold)
            Text(text = m.subject, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text(text = m.body)
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally,
             verticalArrangement = Arrangement.SpaceEvenly


        ) {
            Text(text = "21:10",modifier = Modifier)
            IconButton(
                onClick = { /*TODO*/ }, modifier = Modifier
                    .size(60.dp)
                    .padding(top = 18.dp)
            )
            {
                Icon(
                    imageVector = Icons.Outlined.StarOutline, contentDescription = "Starr",
                    )
            }
        }
    }
    }






@Preview(showBackground = true)
@Composable
fun PreviewMaiViewList() {
    Udemy_Compose_Gmail_10denemeTheme() {
        GmailApp()
    }
}