package com.phongbm.mbs.featuretwo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.phongbm.mbs.MainActivity
import com.phongbm.mbs.R
import com.phongbm.mbs.databinding.FragmentFeatureTwoABinding

/**
 * Created by PhongBM on 23/02/2023
 */

class FeatureTwoAFragment : Fragment() {
    private var _binding: FragmentFeatureTwoABinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFeatureTwoABinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnOpenB.setOnClickListener {
            findNavController().navigate(R.id.featureTwoBFragment)
        }
        binding.btnOpenHome.setOnClickListener {
            (requireActivity() as MainActivity).openHome()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}