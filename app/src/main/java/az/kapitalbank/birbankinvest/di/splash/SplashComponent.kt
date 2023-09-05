package az.kapitalbank.birbankinvest.di.splash

import az.kapitalbank.birbankinvest.MainActivity
import az.kapitalbank.birbankinvest.di.MediatorsModule
import az.kapitalbank.birbankinvest.presentation.SplashFragment
import dagger.Component

@Component(modules = [MediatorsModule::class, SplashModule::class])
interface SplashComponent {

    fun inject(activity: MainActivity)
    fun inject(splashFragment: SplashFragment)

    @Component.Factory
    interface Factory {
        fun create(): SplashComponent
    }

    class Initializer private constructor() {
        companion object {
            fun init(): SplashComponent = DaggerSplashComponent
                .factory()
                .create()
        }
    }
}