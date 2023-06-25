package tech.foxio.mymvvm.ui.screens.splash

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import tech.foxio.mymvvm.ui.navigation.GUIDE_GRAPH_ROUTE
import tech.foxio.mymvvm.ui.navigation.SPLASH_GRAPH_ROUTE
import tech.foxio.mymvvm.ui.screens.splash.SplashUiState
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
) : ViewModel() {

    var uiState by mutableStateOf(SplashUiState())
        private set

    init {
        viewModelScope.launch(Dispatchers.IO) {
        }
    }
}