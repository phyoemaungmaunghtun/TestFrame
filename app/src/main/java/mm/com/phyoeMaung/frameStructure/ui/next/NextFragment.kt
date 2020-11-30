package mm.com.phyoeMaung.frameStructure.ui.next

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import mm.com.phyoeMaung.frameStructure.base.BaseFragment
import mm.com.phyoeMaung.frameStructure.databinding.FragNextBinding

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class NextFragment constructor(
) : BaseFragment() {
    private lateinit var nextViewModel: NextFragmentViewModel
    private lateinit var fragNextBinding: FragNextBinding
    override fun initializeViewModel() {
        nextViewModel = ViewModelProvider(this).get(NextFragmentViewModel::class.java)
    }

    override fun observeViewModel() {
    }

    override fun initViewBinding() {
        fragNextBinding = FragNextBinding.inflate(layoutInflater)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return fragNextBinding.root
    }
}