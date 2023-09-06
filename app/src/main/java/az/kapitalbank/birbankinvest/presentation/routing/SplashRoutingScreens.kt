package az.kapitalbank.birbankinvest.presentation.routing

import az.kapitalbank.birbankinvest.presentation.fragment.ErrorRootFragment
import az.kapitalbank.birbankinvest.presentation.fragment.SplashFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

object SplashRoutingScreens {
    fun getStartSplashScreen() = FragmentScreen { SplashFragment.getNewInstance() }
    fun getRootErrorScreen() = FragmentScreen { ErrorRootFragment.getNewInstance() }
}