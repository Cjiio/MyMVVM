package tech.foxio.mymvvm.ui.screens.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import tech.foxio.mymvvm.ui.navigation.GUIDE_GRAPH_ROUTE
import tech.foxio.mymvvm.ui.navigation.SPLASH_GRAPH_ROUTE
import tech.foxio.mymvvm.ui.components.NoNetwork

@Composable
fun SplashScreen(
    navController: NavController,
    viewModel: SplashViewModel = hiltViewModel()
) {
    val uiState = viewModel.uiState

    if (uiState.offline) {
        NoNetwork()
    } else {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {
            item {
                Button(
                    onClick = {
                        navController.navigate(GUIDE_GRAPH_ROUTE) {
                            popUpTo(SPLASH_GRAPH_ROUTE) {
                                inclusive = true
                            }
                        }
                    }
                ) {

                }
            }
            items(5) {
                Text(text = "Hello World")
            }
        }
    }
}