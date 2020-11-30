package mm.com.phyoeMaung.frameStructure.navigator

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import mm.com.phyoeMaung.frameStructure.R

class AppNavigatorImpl(private val view: View) : AppNavigator {
    override fun navigateTo(screens: Screens, argus: Bundle?) {
        val action = when (screens) {
            Screens.LOGIN -> R.id.action_splashScreen_to_loginScreen
            Screens.Next  -> R.id.action_loginScreen_to_nextScreen
            else -> R.id.splashScreen
        }
        Navigation.findNavController(view).navigate(action, argus)
    }
}