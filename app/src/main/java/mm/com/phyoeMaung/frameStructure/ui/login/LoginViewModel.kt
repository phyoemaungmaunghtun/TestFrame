package mm.com.phyoeMaung.frameStructure.ui.login

import androidx.hilt.lifecycle.ViewModelInject
import mm.com.phyoeMaung.frameStructure.base.BaseViewModel
import mm.com.phyoeMaung.frameStructure.responseHandler.ErrorManager
import mm.com.phyoeMaung.frameStructure.responseHandler.ErrorMapper

class LoginViewModel @ViewModelInject constructor(private val errorMapper: ErrorMapper) :
    BaseViewModel() {
    override val errorManager: ErrorManager
        get() = ErrorManager(errorMapper)
}