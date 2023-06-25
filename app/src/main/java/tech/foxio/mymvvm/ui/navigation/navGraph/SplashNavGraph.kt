package tech.foxio.mymvvm.ui.navigation.navGraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import tech.foxio.mymvvm.ui.navigation.ScreenList
import androidx.hilt.navigation.compose.hiltViewModel
import tech.foxio.mymvvm.ui.navigation.SPLASH_GRAPH_ROUTE
import tech.foxio.mymvvm.ui.screens.splash.SplashScreen

fun NavGraphBuilder.splashNavGraph(
    navController: NavController
) {
    navigation(startDestination = ScreenList.SplashScreen.route, route = SPLASH_GRAPH_ROUTE) {
        composable(route = ScreenList.SplashScreen.route) {
            SplashScreen(navController = navController, hiltViewModel())
        }
    }
}