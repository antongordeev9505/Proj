package az.kapitalbank.birbankinvest.authorization.di

import az.kapitalbank.birbankinvest.authorization.AuthorizationActivity
import az.kapitalbank.birbankinvest.component_manager.XInjectionManager
import dagger.Component

@Component(dependencies = [AuthorizationDeps::class])
interface AuthorizationComponent {

    fun inject(activity: AuthorizationActivity)

    @Component.Factory
    interface Factory {
        fun create(deps: AuthorizationDeps): AuthorizationComponent
    }

    class Initializer private constructor() {
        companion object {
            fun init(): AuthorizationComponent = DaggerAuthorizationComponent
                .factory()
                .create(XInjectionManager.findComponent())
        }
    }
}