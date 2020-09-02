package mm.com.xan.dms_delivery.utilities

import android.app.Dialog
import mm.com.xan.dms_delivery.base.BaseActivity
import javax.inject.Inject

class DialogUtil @Inject
constructor(private val context: BaseActivity) {
        fun setDialog(string: String) {
            val dialog = Dialog(context)
            dialog.setTitle(string)
            dialog.show()
        }
}