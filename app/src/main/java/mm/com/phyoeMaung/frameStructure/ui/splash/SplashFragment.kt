package mm.com.phyoeMaung.frameStructure.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import mm.com.phyoeMaung.frameStructure.base.BaseFragment
import mm.com.phyoeMaung.frameStructure.databinding.FragSplashBinding
import mm.com.phyoeMaung.frameStructure.navigator.AppNavigator
import mm.com.phyoeMaung.frameStructure.navigator.Screens
import mm.com.phyoeMaung.frameStructure.remote.models.TestResponseModel
import mm.com.phyoeMaung.frameStructure.repository.Resource
import mm.com.phyoeMaung.frameStructure.utilities.observe
import mm.com.phyoeMaung.frameStructure.utilities.provideNavigator
import mm.com.phyoeMaung.frameStructure.utilities.toGone
import mm.com.phyoeMaung.frameStructure.utilities.toVisible

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class SplashFragment constructor(
) : BaseFragment() {
    private lateinit var splashViewModel: SplashViewModel
    private lateinit var fragSplashBinding: FragSplashBinding
    private lateinit var navigator: AppNavigator
    private val splashLoadingTime = 3000
    override fun initializeViewModel() {
        splashViewModel = ViewModelProvider(this).get(SplashViewModel::class.java)
    }


    override fun initViewBinding() {
        fragSplashBinding = FragSplashBinding.inflate(layoutInflater)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragSplashBinding.loading.toVisible()
        Handler(Looper.getMainLooper()).postDelayed({
            fragSplashBinding.loading.toGone()
            navigate(requireView())
        }, splashLoadingTime.toLong())
        return fragSplashBinding.root
    }

    private fun navigate(it: View) {
        navigator = it.provideNavigator() //  it's a sample passing data via bundle
        navigator.navigateTo(Screens.LOGIN, null)
    }

    override fun observeViewModel() {
        observe(splashViewModel.newsLiveData, ::handleNewsList)
        //observeToast(splashViewModel.showToast)
    }

    /*private fun observeToast(event: LiveData<Event<Any>>) {
        fragSplashBinding.parent.showToast(this, event, Snackbar.LENGTH_LONG)
    }*/

    /*private fun showLoadingView() {
        fragSplashBinding.progressBar.toVisible()
    }*/

    private fun handleNewsList(newsModel: Resource<TestResponseModel>) {
        when (newsModel) {
            //is Resource.Loading -> showLoadingView()
            is Resource.Success -> newsModel.data?.let {
                bindListData(newsModel = it)
                //fragSplashBinding.progressBar.toGone()
            }
            is Resource.DataError -> {
                //fragSplashBinding.progressBar.toGone()
                newsModel.errorCode?.let { splashViewModel.showToastMessage(it) }
            }
        }

    }

    private fun bindListData(newsModel: TestResponseModel) {
    }

}