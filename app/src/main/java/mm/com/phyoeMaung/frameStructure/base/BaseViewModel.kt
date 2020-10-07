package mm.com.phyoeMaung.frameStructure.base

import androidx.lifecycle.ViewModel
import mm.com.phyoeMaung.frameStructure.response_handler.ErrorManager

abstract class BaseViewModel : ViewModel() {
    abstract val errorManager: ErrorManager
}