package mm.com.xan.dms_delivery.base

import androidx.lifecycle.ViewModel
import mm.com.xan.dms_delivery.responseHandler.ErrorManager

abstract class BaseViewModel : ViewModel() {
    abstract val errorManager: ErrorManager
}