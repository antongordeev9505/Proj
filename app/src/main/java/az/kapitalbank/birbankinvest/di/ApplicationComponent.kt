package az.kapitalbank.birbankinvest.di

import az.kapitalbank.birbankinvest.Application
import az.kapitalbank.birbankinvest.presentation.SplashFragment
import dagger.Component

@Component(modules = [MediatorsModule::class, SplashModule::class])
interface ApplicationComponent : AppDeps {

    fun inject(application: Application)
    fun inject(splashFragment: SplashFragment)

    @Component.Factory
    interface Factory {
        fun create(): ApplicationComponent
    }

    class Initializer private constructor() {
        companion object {
            fun init(): ApplicationComponent = DaggerApplicationComponent
                .factory()
                .create()
        }
    }
}