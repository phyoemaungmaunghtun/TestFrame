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
import mm.com.phyoeMaung.frameStructure.utilities.Log.INSTANCE.d

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class LoginFragment constructor(
    private val someString: String
) : BaseFragment() {
    private lateinit var loginViewModel: LoginViewModel
    private lateinit var fragLoginBinding: FragLoginBinding
    override fun initializeViewModel() {
        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
    }

    override fun observeViewModel() {
    }

    override fun initViewBinding() {
        fragLoginBinding = FragLoginBinding.inflate(layoutInflater)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        d("Some String ", someString)
        return fragLoginBinding.root
    }
}