package az.kapitalbank.birbankinvest.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import az.kapitalbank.birbankinvest.R
import az.kapitalbank.birbankinvest.databinding.FragmentErrorRootBinding

class ErrorRootFragment : Fragment(R.layout.fragment_error_root) {

    private var _binding: FragmentErrorRootBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentErrorRootBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}