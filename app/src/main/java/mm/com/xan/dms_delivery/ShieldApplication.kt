package mm.com.xan.dms_delivery

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ShieldApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

    companion object {
         lateinit var context: Context
    }
}