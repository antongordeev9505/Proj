package az.kapitalbank.birbankinvest.di.splash

import az.kapitalbank.birbankinvest.core.di.FeatureScope
import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import dagger.Module
import dagger.Provides

@Module
internal class ScreenNavigationModule {
    private val cicerone: Cicerone<Router> = Cicerone.create()

    @Provides
    @FeatureScope
    fun provideRouter(): Router {
        return cicerone.router
    }

    @Provides
    @FeatureScope
    fun provideNavigatorHolder(): NavigatorHolder {
        return cicerone.getNavigatorHolder()
    }

}