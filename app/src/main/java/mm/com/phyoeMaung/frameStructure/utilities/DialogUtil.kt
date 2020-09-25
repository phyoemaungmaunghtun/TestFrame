package mm.com.phyoeMaung.frameStructure.utilities

import android.app.Dialog
import mm.com.phyoeMaung.frameStructure.base.BaseActivity
import javax.inject.Inject

class DialogUtil @Inject
constructor(private val context: BaseActivity) {
        fun setDialog(string: String) {
            val dialog = Dialog(context)
            dialog.setTitle(string)
            dialog.show()
        }
}