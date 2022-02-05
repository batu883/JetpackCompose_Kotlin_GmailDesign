package com.example.udemy_compose_gmail_10deneme.Datalar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.MeetingRoom
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarData(
    val iconnn: ImageVector,
    val title:String
){
    object Mail: BottomBarData(
        iconnn = Icons.Outlined.Mail,"Mail"
    )
    object Meet: BottomBarData(
        iconnn= Icons.Outlined.MeetingRoom,"Meeting"
    )
}
