package az.kapitalbank.birbankinvest.di.splash

import az.kapitalbank.birbankinvest.core_utils.di.FeatureScope
import az.kapitalbank.birbankinvest.di.MediatorsModule
import az.kapitalbank.birbankinvest.di.splash.viewmodel.SplashViewModelModule
import az.kapitalbank.birbankinvest.presentation.MainActivity
import az.kapitalbank.birbankinvest.presentation.fragment.SplashFragment
import dagger.Component

@Component(modules = [
    MediatorsModule::class,
    SplashViewModelModule::class,
    ScreenNavigationModule::class
])
@FeatureScope
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