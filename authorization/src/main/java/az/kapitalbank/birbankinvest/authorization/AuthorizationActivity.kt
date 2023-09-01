package az.kapitalbank.birbankinvest.authorization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import az.kapitalbank.birbankinvest.R
import az.kapitalbank.birbankinvest.authorization.di.AuthorizationComponent
import az.kapitalbank.birbankinvest.component_manager.HasComponent
import az.kapitalbank.birbankinvest.component_manager.XInjectionManager

class AuthorizationActivity : AppCompatActivity(), HasComponent<AuthorizationComponent> {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorization)
        XInjectionManager
            .bindComponent(this)
            .inject(this)
    }

    override fun getComponent(): AuthorizationComponent {
        return AuthorizationComponent.Initializer.init()
    }
}