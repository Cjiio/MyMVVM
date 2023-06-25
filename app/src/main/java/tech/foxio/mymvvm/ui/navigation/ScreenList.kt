package tech.foxio.mymvvm.ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector

const val ROOT_GRAPH_ROUTE = "root"
const val SPLASH_GRAPH_ROUTE = "splash"
const val GUIDE_GRAPH_ROUTE = "guide"
const val AUTH_GRAPH_ROUTE = "auth"

sealed class ScreenList(
    val route: String,
    val title: Int? = null,
    val selectedIcon: ImageVector? = null,
    val unselectedIcon: ImageVector? = null,

    ) {
    object SplashScreen : ScreenList("SplashScreen")
    object GuideScreen : ScreenList("GuideScreen")
    object AuthPermissionsScreen : ScreenList("AuthPermissionsScreen")
    object LoginScreen : ScreenList("LoginScreen")
    object RegisterScreen : ScreenList("RegisterScreen")
}