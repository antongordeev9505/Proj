package az.kapitalbank.birbankinvest.presentation

import android.app.Activity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import az.kapitalbank.birbankinvest.SplashRoutingScreens.getRootErrorScreen
import az.kapitalbank.birbankinvest.authorization_api.AuthorizationMediator
import az.kapitalbank.birbankinvest.utils.isRooted
import com.github.terrakok.cicerone.Router
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class SplashViewModel @Inject constructor(
    private val mediator: AuthorizationMediator,
    private val router: Router
) : ViewModel() {

    fun navigateFromSplashScreen(activity: Activity) {
        viewModelScope.launch {
            //TODO: delete delay in the future
            delay(3000L)
            if (isRooted(activity)) {
                router.navigateTo(getRootErrorScreen())
            } else {
                mediator.navigateToAuthorizationFeature(activity)
            }
        }
    }
}