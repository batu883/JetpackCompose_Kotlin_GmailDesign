package com.example.udemy_compose_gmail_10deneme.Componentler

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.udemy_compose_gmail_10deneme.Datalar.DrawerMenuData
import com.example.udemy_compose_gmail_10deneme.GmailApp
import com.example.udemy_compose_gmail_10deneme.ui.theme.Udemy_Compose_Gmail_10denemeTheme

@Composable
fun DrawerMenu(scrollState: ScrollState){

    val listele= listOf(
        DrawerMenuData.Divider,
        DrawerMenuData.AllInBoxes,
        DrawerMenuData.Divider,
        DrawerMenuData.Primary,
        DrawerMenuData.Social,
        DrawerMenuData.Promotions,
        DrawerMenuData.HeaderOne,
        DrawerMenuData.Starred,
        DrawerMenuData.Snoozed,
        DrawerMenuData.Important,
        DrawerMenuData.Sent,
        DrawerMenuData.Schedule,
        DrawerMenuData.Outbox,
        DrawerMenuData.Draft,
        DrawerMenuData.AllMail,
        DrawerMenuData.HeaderTwo,
        DrawerMenuData.Calendar,
        DrawerMenuData.Contacts,
        DrawerMenuData.Divider,
        DrawerMenuData.Settings,
        DrawerMenuData.Help
    )
    Column (Modifier.verticalScroll(scrollState)){
        Text(
            text = "Gmail",
            //color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontSize = 50.sp,
            color = Color.Red,
            modifier = Modifier.padding(20.dp,20.dp,0.dp,10.dp)
        )

        listele.forEach { satir->
            when{
                satir.isDivider->{
                    Divider(modifier = Modifier.padding(top=15.dp,bottom=15.dp))
                }
                satir.isHeader->{
                    Text(text = satir.title!!, fontSize = 15.sp,
                        fontWeight = FontWeight.W100,
                        // color=Red

                        modifier = Modifier.padding(10.dp))
                }
                else -> {
                    DrawerSatirlar(i = satir)
                }
            }
        }
    }





}

@Composable
fun DrawerSatirlar(i: DrawerMenuData) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 10.dp, bottom = 10.dp)) {
        Image(imageVector = i.icon!!, contentDescription =i.title, Modifier.weight(0.5f) )
        Text(text = i.title!!, Modifier.weight(2f))
    }

}


@Preview(showBackground = true)
@Composable
fun PreviewDrawerMenu() {
    Udemy_Compose_Gmail_10denemeTheme() {
        GmailApp()
    }
}