package com.phongbm.mbs.featurecommon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.phongbm.mbs.R
import com.phongbm.mbs.databinding.FragmentLoginBinding

/**
 * Created by PhongBM on 23/02/2023
 */

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnOpenHome.setOnClickListener {
            val navOptions = NavOptions.Builder()
                .setPopUpTo(R.id.featureCommonNav, true)
                .build()
            findNavController().navigate(R.id.homeFragment, null, navOptions)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}