package com.mth.gocompose.ui_components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.mth.gocompose.ui.theme.Purple80
import com.mth.gocompose.ui_components.navigation.BottomNavigationScreen
import kotlinx.coroutines.launch

/**
 * @Author myothiha
 * Created 15/08/2023 at 11:46 PM.
 **/

@Composable
fun BottomNavigationView(navController: NavController) {
    val navItemList = mutableListOf(
        BottomNavigationScreen.HomeScreen,
        BottomNavigationScreen.ChatScreen
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()


    val currentDestination = navBackStackEntry?.destination

    AnimatedVisibility(
        enter = slideInVertically(initialOffsetY = { it }),
        exit = slideOutVertically(targetOffsetY = { it }),
        visible = currentDestination?.route != "nav_chatting"
    ) {
        NavigationBar(containerColor = Color.White) {
            navItemList.forEach { item ->
                BottomNavigationItem(
                    screen = item,
                    currentDestination = currentDestination,
                    navController = navController
                )
            }

        }
    }
}

@Composable
fun RowScope.BottomNavigationItem(
    screen: BottomNavigationScreen,
    currentDestination: NavDestination?,
    navController: NavController
) {
    val scope = rememberCoroutineScope()
    NavigationBarItem(
        icon = {
            Icon(
                painter = painterResource(id = screen.icon),
                contentDescription = null
            )
        },
        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = Color.Black,
            unselectedIconColor = Color.Black.copy(0.5f),
            indicatorColor = Purple80.copy(0.8f),
            selectedTextColor = Color.Black,
            unselectedTextColor = Color.Black.copy(0.5f)
        ),
        label = { Text(text = screen.title, fontSize = 12.sp) },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        onClick = {
            scope.launch {
                navController.navigate(screen.route) {
                    popUpTo(navController.graph.findStartDestination().id) {
                        saveState = true
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            }
        }
    )

}