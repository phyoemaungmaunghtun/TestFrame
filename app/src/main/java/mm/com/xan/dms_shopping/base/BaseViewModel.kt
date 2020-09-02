package mm.com.xan.dms_shopping.base

import androidx.lifecycle.ViewModel
import mm.com.xan.dms_shopping.responseHandler.ErrorManager

abstract class BaseViewModel : ViewModel() {
    abstract val errorManager: ErrorManager
}