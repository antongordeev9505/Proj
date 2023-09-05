package az.kapitalbank.birbankinvest.di.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import az.kapitalbank.birbankinvest.presentation.SplashViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface SplashViewModelModule {
    @Binds
    fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    @[Binds IntoMap VMKey(SplashViewModel::class)]
    fun bindLandingFragmentViewModel(splashViewModel: SplashViewModel): ViewModel
}