package mm.com.phyoeMaung.frameStructure.navigator

import android.os.Bundle


// Update enum for more screen adding

enum class Screens {
    LOGIN,
    Next
}

interface AppNavigator {
    fun navigateTo(screens: Screens, argus: Bundle?)
}