package mm.com.xan.dms_shopping.utilities

import android.util.Log
import mm.com.xan.dms_shopping.delivery.BuildConfig

class Log {
    companion object INSTANCE {

        fun d(tag: String, massage: String) {
            if (BuildConfig.DEBUG) {
                Log.d(tag, massage)
            }
        }

        fun i(tag: String, massage: String) {
            if (BuildConfig.DEBUG) {
                Log.i(tag, massage)
            }
        }

        fun v(tag: String, massage: String) {
            if (BuildConfig.DEBUG) {
                Log.v(tag, massage)
            }
        }

        fun e(tag: String, massage: String) {
            if (BuildConfig.DEBUG) {
                Log.e(tag, massage)
            }
        }

        fun json(tag: String, massage: String) {
            if (BuildConfig.DEBUG) {
                Log.i(tag, massage)
            }
        }
    }
}