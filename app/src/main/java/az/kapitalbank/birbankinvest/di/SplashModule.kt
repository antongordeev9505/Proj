package az.kapitalbank.birbankinvest.di

import az.kapitalbank.birbankinvest.di.viewmodel.SplashViewModelModule
import dagger.Module

@Module(includes = [SplashViewModelModule::class, ScreenNavigationModule::class])
interface SplashModule