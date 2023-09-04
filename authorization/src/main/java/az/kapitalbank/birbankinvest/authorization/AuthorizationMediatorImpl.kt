package az.kapitalbank.birbankinvest.authorization

import android.app.Activity
import android.content.Intent
import az.kapitalbank.birbankinvest.authorization_api.AuthorizationMediator
import javax.inject.Inject

class AuthorizationMediatorImpl @Inject constructor(): AuthorizationMediator {

    override fun navigateToAuthorizationFeature(activity: Activity) {
        val intent = Intent(activity, AuthorizationActivity::class.java)
        activity.startActivity(intent)
    }
}