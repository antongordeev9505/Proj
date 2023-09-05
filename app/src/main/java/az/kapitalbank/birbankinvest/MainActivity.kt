package az.kapitalbank.birbankinvest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import az.kapitalbank.birbankinvest.SplashRoutingScreens.getStartSplashScreen
import az.kapitalbank.birbankinvest.component_manager.XInjectionManager
import az.kapitalbank.birbankinvest.di.ApplicationComponent
import com.github.terrakok.cicerone.Command
import com.github.terrakok.cicerone.Forward
import com.github.terrakok.cicerone.Navigator
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Replace
import com.github.terrakok.cicerone.Router
import com.github.terrakok.cicerone.androidx.AppNavigator
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var navigatorHolder: NavigatorHolder

    @Inject
    lateinit var router: Router
    private lateinit var navigator: Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        XInjectionManager
            .findComponent<ApplicationComponent>()
            .inject(this)
        navigator = AppNavigator(this, R.id.fragment_container, supportFragmentManager)

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
        super.onPause()
        navigatorHolder.removeNavigator()
    }
}