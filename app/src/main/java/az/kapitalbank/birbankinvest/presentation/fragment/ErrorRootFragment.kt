package az.kapitalbank.birbankinvest.presentation.fragment

import androidx.fragment.app.Fragment
import az.kapitalbank.birbankinvest.R
import az.kapitalbank.birbankinvest.core.viewBinding
import az.kapitalbank.birbankinvest.databinding.FragmentErrorRootBinding

class ErrorRootFragment : Fragment(R.layout.fragment_error_root) {

    companion object {
        fun getNewInstance() = ErrorRootFragment()
    }

    private val binding by viewBinding(FragmentErrorRootBinding::bind)
}