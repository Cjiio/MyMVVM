package tech.foxio.mymvvm.ui.navigation.navGraph

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import tech.foxio.mymvvm.ui.navigation.GUIDE_GRAPH_ROUTE
import tech.foxio.mymvvm.ui.navigation.ScreenList
import tech.foxio.mymvvm.ui.screens.guide.GuideScreen

fun NavGraphBuilder.guideNavGraph(
    navController: NavController
) {
    navigation(startDestination = ScreenList.GuideScreen.route, route = GUIDE_GRAPH_ROUTE) {
        composable(route = ScreenList.GuideScreen.route) {
            GuideScreen(navController = navController, hiltViewModel())
        }
    }
}