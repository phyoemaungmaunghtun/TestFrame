package mm.com.xan.dms_shopping.ui.login

import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import mm.com.xan.dms_shopping.base.BaseActivity
import mm.com.xan.dms_shopping.delivery.R
import mm.com.xan.dms_shopping.delivery.databinding.ActivityLoginBinding
import mm.com.xan.dms_shopping.factory.MainFragmentFactory
import javax.inject.Inject

@AndroidEntryPoint
class LoginActivity : BaseActivity() {

    @Inject
    lateinit var fragmentFactory: MainFragmentFactory

    private lateinit var activityLoginBinding: ActivityLoginBinding

    override fun initializeViewModel() {
    }

    override fun observeViewModel() {
    }

    override fun initViewBinding() {
        activityLoginBinding = ActivityLoginBinding.inflate(layoutInflater)
        val view = activityLoginBinding.root
        setContentView(view)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.fragmentFactory = fragmentFactory
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, LoginFragment::class.java, null)
            .commit()
    }
}