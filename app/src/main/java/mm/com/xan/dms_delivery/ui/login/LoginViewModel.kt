package mm.com.xan.dms_delivery.ui.login

import androidx.hilt.lifecycle.ViewModelInject
import mm.com.xan.dms_delivery.base.BaseViewModel
import mm.com.xan.dms_delivery.responseHandler.ErrorManager
import mm.com.xan.dms_delivery.responseHandler.ErrorMapper

class LoginViewModel @ViewModelInject constructor(private val errorMapper: ErrorMapper) :
    BaseViewModel() {
    override val errorManager: ErrorManager
        get() = ErrorManager(errorMapper)
}