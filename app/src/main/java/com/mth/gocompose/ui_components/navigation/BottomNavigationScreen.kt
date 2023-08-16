package com.mth.gocompose.ui_components.navigation

import com.mth.gocompose.R

/**
 * @Author myothiha
 * Created 16/08/2023 at 12:13 AM.
 **/

sealed class BottomNavigationScreen(
    val title: String,
    val icon: Int,
    val route: String
) {
    object HomeScreen :
        BottomNavigationScreen(title = "Home", icon = R.drawable.ic_like, route = "home_route")

    object ChatScreen : BottomNavigationScreen(
        title = "Chatting",
        icon = R.drawable.ic_comment,
        route = "chat_route"
    )
}