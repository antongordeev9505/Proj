package az.kapitalbank.birbankinvest

import az.kapitalbank.birbankinvest.presentation.ErrorRootFragment
import az.kapitalbank.birbankinvest.presentation.SplashFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

object SplashRoutingScreens {
    fun getStartSplashScreen() = FragmentScreen { SplashFragment() }
    fun getRootErrorScreen() = FragmentScreen { ErrorRootFragment() }
}