package az.kapitalbank.birbankinvest.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import az.kapitalbank.birbankinvest.R
import az.kapitalbank.birbankinvest.presentation.routing.SplashRoutingScreens.getStartSplashScreen
import az.kapitalbank.birbankinvest.component_manager.HasComponent
import az.kapitalbank.birbankinvest.component_manager.XInjectionManager
import az.kapitalbank.birbankinvest.di.splash.SplashComponent
import com.github.terrakok.cicerone.Navigator
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import com.github.terrakok.cicerone.androidx.AppNavigator
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasComponent<SplashComponent> {

    @Inject
    lateinit var navigatorHolder: NavigatorHolder

    @Inject
    lateinit var router: Router
    private var navigator: Navigator = AppNavigator(this, R.id.fragment_container, supportFragmentManager)

    override fun getComponent() = SplashComponent.Initializer.init()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        XInjectionManager
            .bindComponent(this)
            .inject(this)
        installSplashScreen()
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            router.navigateTo(getStartSplashScreen())
        }
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    public override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }
}