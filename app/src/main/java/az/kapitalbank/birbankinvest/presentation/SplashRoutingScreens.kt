package az.kapitalbank.birbankinvest.presentation

import com.github.terrakok.cicerone.androidx.FragmentScreen

object SplashRoutingScreens {
    fun getStartSplashScreen() = FragmentScreen { SplashFragment() }
    fun getRootErrorScreen() = FragmentScreen { ErrorRootFragment() }
}