package tech.foxio.mymvvm.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import tech.foxio.mymvvm.ui.navigation.navGraph.guideNavGraph
import tech.foxio.mymvvm.ui.navigation.navGraph.authNavGraph
import tech.foxio.mymvvm.ui.navigation.navGraph.splashNavGraph
import tech.foxio.mymvvm.ui.navigation.ROOT_GRAPH_ROUTE
import tech.foxio.mymvvm.ui.navigation.SPLASH_GRAPH_ROUTE

@Composable
fun StartNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = SPLASH_GRAPH_ROUTE,
        route = ROOT_GRAPH_ROUTE
    ) {
        authNavGraph(navController = navController)
        guideNavGraph(navController = navController)
        splashNavGraph(navController = navController)
    }
}