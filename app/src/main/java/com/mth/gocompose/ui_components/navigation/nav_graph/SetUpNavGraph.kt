package com.mth.gocompose.ui_components.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mth.gocompose.ui_components.ChatScreen
import com.mth.gocompose.ui_components.HomeScreen
import com.mth.gocompose.ui_components.navigation.BottomNavigationScreen

/**
 * @Author myothiha
 * Created 16/08/2023 at 12:28 AM.
 **/

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavigationScreen.HomeScreen.route
    ) {
        composable(BottomNavigationScreen.HomeScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(BottomNavigationScreen.ChatScreen.route) {
            ChatScreen(navController = navController)
        }

    }
}