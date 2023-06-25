package tech.foxio.mymvvm.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import tech.foxio.mymvvm.navigation.StartNavGraph
import tech.foxio.mymvvm.ui.theme.MyMVVMTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMVVMTheme {
                navController = rememberNavController()
                StartNavGraph(navController = navController)
            }
        }
    }
}