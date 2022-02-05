package com.example.udemy_compose_gmail_10deneme.Datalar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ManageAccounts
import androidx.compose.material.icons.filled.PersonAdd
import androidx.compose.material.icons.filled.PersonAddAlt
import androidx.compose.material.icons.outlined.ManageAccounts
import androidx.compose.material.icons.outlined.PersonAdd
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector


sealed class DialogBoxDatas(
    val userName:String?=null,
    val userMail:String?=null,
    val unreadMessage:Int?=null,
    val icon:ImageVector?=null,
    val header:String?=null,
    val isUser:Boolean=false

){
    object user1:DialogBoxDatas(userName = "Kadir Batuhan Demir",userMail = "batudemir98@hotmail.com", isUser = true, unreadMessage = 35)
    object  user2:DialogBoxDatas(userName = "Özge Doğan", userMail = "ozgedogan@hotmail.com", isUser = true, unreadMessage = 578)
    object addAccount:DialogBoxDatas(header = "Add Another Account",
        icon =Icons.Outlined.PersonAdd )
    object manageAccount:DialogBoxDatas(header = "Manage Accounts on This Device",
        icon =Icons.Outlined.ManageAccounts )
}
