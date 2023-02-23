package com.phongbm.mbs.featuretwo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.phongbm.mbs.MainActivity
import com.phongbm.mbs.databinding.FragmentFeatureTwoBBinding

/**
 * Created by PhongBM on 23/02/2023
 */

class FeatureTwoBFragment : Fragment() {
    private var _binding: FragmentFeatureTwoBBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFeatureTwoBBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnBackA.setOnClickListener {
            findNavController().popBackStack()
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