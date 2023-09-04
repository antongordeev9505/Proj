package az.kapitalbank.birbankinvest.di

import az.kapitalbank.birbankinvest.authorization.AuthorizationMediatorImpl
import az.kapitalbank.birbankinvest.authorization_api.AuthorizationMediator
import dagger.Binds
import dagger.Module

@Module
interface MediatorsModule {

    @Binds
    fun provideAuthorizationMediator(mediator: AuthorizationMediatorImpl): AuthorizationMediator
}