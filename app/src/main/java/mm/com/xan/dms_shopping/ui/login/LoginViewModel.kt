package mm.com.xan.dms_shopping.ui.login

import androidx.hilt.lifecycle.ViewModelInject
import mm.com.xan.dms_shopping.base.BaseViewModel
import mm.com.xan.dms_shopping.responseHandler.ErrorManager
import mm.com.xan.dms_shopping.responseHandler.ErrorMapper

class LoginViewModel @ViewModelInject constructor(private val errorMapper: ErrorMapper) :
    BaseViewModel() {
    override val errorManager: ErrorManager
        get() = ErrorManager(errorMapper)
}