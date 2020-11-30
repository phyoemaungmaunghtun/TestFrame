package mm.com.phyoeMaung.frameStructure.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import mm.com.phyoeMaung.frameStructure.base.BaseFragment
import mm.com.phyoeMaung.frameStructure.databinding.FragLoginBinding
import mm.com.phyoeMaung.frameStructure.navigator.AppNavigator
import mm.com.phyoeMaung.frameStructure.navigator.Screens
import mm.com.phyoeMaung.frameStructure.remote.models.TestPoc
import mm.com.phyoeMaung.frameStructure.remote.models.TestResponseModel
import mm.com.phyoeMaung.frameStructure.repository.Resource
import mm.com.phyoeMaung.frameStructure.utilities.observe
import mm.com.phyoeMaung.frameStructure.utilities.provideNavigator

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class LoginFragment constructor(
) : BaseFragment() {
    private lateinit var loginViewModel: LoginViewModel
    private lateinit var fragLoginBinding: FragLoginBinding
    lateinit var navigator: AppNavigator
    override fun initializeViewModel() {
        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
    }

    override fun observeViewModel() {
        observe(loginViewModel.newsLiveData, ::handleNewsList)
        //observeToast(splashViewModel.showToast)
    }

    override fun initViewBinding() {
        fragLoginBinding = FragLoginBinding.inflate(layoutInflater)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        with(fragLoginBinding){
            btnNext.setOnClickListener {
                loginViewModel.callApi()
                /*navigator = it.provideNavigator()
                navigator.navigateTo(Screens.Next, null)*/
            }
        }

        return fragLoginBinding.root
    }

    private fun handleNewsList(newsModel: Resource<TestPoc>) {
        when (newsModel) {
            //is Resource.Loading -> showLoadingView()
            is Resource.Success -> newsModel.data?.let {
               // bindListData(newsModel = it)
                //fragSplashBinding.progressBar.toGone()
            }
            is Resource.DataError -> {
                //fragSplashBinding.progressBar.toGone()
                //newsModel.errorCode?.let { splashViewModel.showToastMessage(it) }
            }
        }

    }
}