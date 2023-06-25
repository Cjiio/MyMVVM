package tech.foxio.mymvvm.ui.screens.auth.authPermissions

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import tech.foxio.mymvvm.ui.screens.auth.authPermissions.AuthPermissionsUiState
import javax.inject.Inject

@HiltViewModel
class AuthPermissionsViewModel @Inject constructor(
) : ViewModel() {

    var uiState by mutableStateOf(AuthPermissionsUiState())
        private set

    init {
        viewModelScope.launch(Dispatchers.IO) {
        }
    }
}