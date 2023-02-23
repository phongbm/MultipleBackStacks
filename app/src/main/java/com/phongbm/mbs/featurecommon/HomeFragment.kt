package com.phongbm.mbs.featurecommon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavGraph
import androidx.navigation.fragment.findNavController
import androidx.navigation.get
import com.phongbm.mbs.MainActivity
import com.phongbm.mbs.R
import com.phongbm.mbs.databinding.FragmentHomeBinding

/**
 * Created by PhongBM on 23/02/2023
 */

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnOpenFeatureOne.setOnClickListener {
            // Default: OneA
            // Config: OneB

            val navGraph = findNavController().graph[R.id.featureOneNav] as NavGraph
            navGraph.setStartDestination(R.id.featureOneBFragment)

            (requireActivity() as MainActivity).openFeatureOne()
        }

        binding.btnOpenFeatureTwo.setOnClickListener {
            (requireActivity() as MainActivity).openFeatureTwo()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}