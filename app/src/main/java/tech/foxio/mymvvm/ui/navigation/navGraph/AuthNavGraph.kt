package tech.foxio.mymvvm.ui.navigation.navGraph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import tech.foxio.mymvvm.ui.navigation.ScreenList
import tech.foxio.mymvvm.ui.navigation.AUTH_GRAPH_ROUTE
import androidx.hilt.navigation.compose.hiltViewModel
import tech.foxio.mymvvm.ui.screens.auth.authPermissions.AuthPermissionsScreen
import tech.foxio.mymvvm.ui.screens.auth.login.LoginScreen
import tech.foxio.mymvvm.ui.screens.auth.register.RegisterScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavController
) {
    navigation(startDestination = ScreenList.AuthPermissionsScreen.route, route = AUTH_GRAPH_ROUTE) {
        composable(route = ScreenList.AuthPermissionsScreen.route) {
            AuthPermissionsScreen(navController = navController, hiltViewModel())
        }
        composable(route = ScreenList.LoginScreen.route) {
            LoginScreen(navController = navController, hiltViewModel())
        }
        composable(route = ScreenList.RegisterScreen.route) {
            RegisterScreen(navController = navController, hiltViewModel())
        }
    }
}