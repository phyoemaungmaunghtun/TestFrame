package mm.com.phyoeMaung.frameStructure.ui.next

import androidx.hilt.lifecycle.ViewModelInject
import mm.com.phyoeMaung.frameStructure.base.BaseViewModel
import mm.com.phyoeMaung.frameStructure.response_handler.ErrorManager
import mm.com.phyoeMaung.frameStructure.response_handler.ErrorMapper

class NextFragmentViewModel @ViewModelInject constructor(private val errorMapper: ErrorMapper) :
    BaseViewModel() {
    override val errorManager: ErrorManager
        get() = ErrorManager(errorMapper)
}