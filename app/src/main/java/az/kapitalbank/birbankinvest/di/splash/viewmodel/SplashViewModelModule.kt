package az.kapitalbank.birbankinvest.di.splash.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import az.kapitalbank.birbankinvest.core_utils.di.FeatureScope
import az.kapitalbank.birbankinvest.presentation.viewmodel.SplashViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface SplashViewModelModule {
    @Binds
    @FeatureScope
    fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    @[Binds IntoMap VMKey(SplashViewModel::class)]
    @FeatureScope
    fun bindLandingFragmentViewModel(splashViewModel: SplashViewModel): ViewModel
}