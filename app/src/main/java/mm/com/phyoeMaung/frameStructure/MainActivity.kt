package mm.com.phyoeMaung.frameStructure

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import dagger.hilt.android.AndroidEntryPoint
import mm.com.phyoeMaung.frameStructure.base.BaseActivity
@AndroidEntryPoint
class MainActivity : BaseActivity() {
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navController: NavController
    override fun initializeViewModel() {
    }

    override fun observeViewModel() {
    }

    override fun initViewBinding() {
        setContentView(R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initNavigationController()
    }

    private fun initNavigationController() {
        navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
    }
}