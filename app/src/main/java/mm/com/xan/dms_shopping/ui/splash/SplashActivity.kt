package mm.com.xan.dms_shopping.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_splash.*
import mm.com.xan.dms_shopping.base.BaseActivity
import mm.com.xan.dms_shopping.delivery.databinding.ActivitySplashBinding
import mm.com.xan.dms_shopping.remote.models.TestResponseModel
import mm.com.xan.dms_shopping.repository.Resource
import mm.com.xan.dms_shopping.ui.login.LoginActivity
import mm.com.xan.dms_shopping.utilities.*

@AndroidEntryPoint
class SplashActivity : BaseActivity() {

    private lateinit var splashViewModel: SplashViewModel

    private lateinit var activitySplashBinding: ActivitySplashBinding

    override fun initViewBinding() {
        activitySplashBinding = ActivitySplashBinding.inflate(layoutInflater)
        val view = activitySplashBinding.root
        setContentView(view)
    }

    override fun initializeViewModel() {
        splashViewModel = ViewModelProvider(this).get(SplashViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        splashViewModel.callApi()
        button.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }

    override fun observeViewModel() {
        observe(splashViewModel.newsLiveData, ::handleNewsList)
        observeToast(splashViewModel.showToast)
    }

    private fun observeToast(event: LiveData<Event<Any>>) {
        activitySplashBinding.parent.showToast(this, event, Snackbar.LENGTH_LONG)
    }

    private fun showLoadingView() {
        activitySplashBinding.progressBar.toVisible()
    }

    private fun handleNewsList(newsModel: Resource<TestResponseModel>) {
        when (newsModel) {
            is Resource.Loading -> showLoadingView()
            is Resource.Success -> newsModel.data?.let {
                bindListData(newsModel = it)
                activitySplashBinding.progressBar.toGone()
            }
            is Resource.DataError -> {
                activitySplashBinding.progressBar.toGone()
                newsModel.errorCode?.let { splashViewModel.showToastMessage(it) }
            }
        }

    }

    private fun bindListData(newsModel: TestResponseModel) {
    }


}