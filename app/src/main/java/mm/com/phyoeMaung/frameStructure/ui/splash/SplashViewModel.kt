package mm.com.phyoeMaung.frameStructure.ui.splash

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import mm.com.phyoeMaung.frameStructure.base.BaseViewModel
import mm.com.phyoeMaung.frameStructure.remote.models.TestResponseModel
import mm.com.phyoeMaung.frameStructure.repository.DataRepository
import mm.com.phyoeMaung.frameStructure.repository.Resource
import mm.com.phyoeMaung.frameStructure.response_handler.ErrorManager
import mm.com.phyoeMaung.frameStructure.response_handler.ErrorMapper
import mm.com.phyoeMaung.frameStructure.utilities.Event

class SplashViewModel @ViewModelInject constructor(
    private val dataRepository: DataRepository,
    private val errorMapper: ErrorMapper
) :
    BaseViewModel() {

    override val errorManager: ErrorManager
        get() = ErrorManager(errorMapper)

    private val _newsLiveData = MutableLiveData<Resource<TestResponseModel>>()
    val newsLiveData: LiveData<Resource<TestResponseModel>> get() = _newsLiveData

    private val showToastPrivate = MutableLiveData<Event<Any>>()
    val showToast: LiveData<Event<Any>> get() = showToastPrivate

    fun showToastMessage(errorCode: Int) {
        val error = errorManager.getError(errorCode)
        showToastPrivate.value = Event(error.description)
    }

    fun callApi() {
        _newsLiveData.value = Resource.Loading()
        viewModelScope.launch {
            _newsLiveData.value = dataRepository.requestNews() as Resource<TestResponseModel>
        }
    }

}