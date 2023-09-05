package az.kapitalbank.birbankinvest.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import az.kapitalbank.birbankinvest.di.viewmodel.VMKey
import az.kapitalbank.birbankinvest.di.viewmodel.ViewModelFactory
import az.kapitalbank.birbankinvest.presentation.SplashViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface SplashModule {
    @Binds
    fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    @[Binds IntoMap VMKey(SplashViewModel::class)]
    fun bindLandingFragmentViewModel(splashViewModel: SplashViewModel): ViewModel
}