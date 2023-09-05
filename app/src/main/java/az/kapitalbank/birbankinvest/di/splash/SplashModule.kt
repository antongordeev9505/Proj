package az.kapitalbank.birbankinvest.di.splash

import az.kapitalbank.birbankinvest.di.splash.viewmodel.SplashViewModelModule
import dagger.Module

@Module(includes = [SplashViewModelModule::class, ScreenNavigationModule::class])
interface SplashModule