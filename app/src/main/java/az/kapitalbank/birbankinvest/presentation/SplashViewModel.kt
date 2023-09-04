package az.kapitalbank.birbankinvest.presentation

import android.app.Activity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import az.kapitalbank.birbankinvest.authorization_api.AuthorizationMediator
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class SplashViewModel @Inject constructor(private val mediator: AuthorizationMediator) : ViewModel() {

    fun navigateToAuthorization(activity: Activity) {
        viewModelScope.launch {
            //TODO: delete delay in the future
            delay(3000L)
            mediator.navigateToAuthorizationFeature(activity)
        }
    }
}