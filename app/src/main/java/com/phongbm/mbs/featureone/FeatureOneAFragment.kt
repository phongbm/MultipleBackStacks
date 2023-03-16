package com.phongbm.mbs.featureone

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.phongbm.mbs.MainActivity
import com.phongbm.mbs.R
import com.phongbm.mbs.databinding.FragmentFeatureOneABinding

/**
 * Created by PhongBM on 23/02/2023
 */

class FeatureOneAFragment : Fragment() {
    companion object {
        private const val TAG = "FeatureOneAFragment"
    }

    private var _binding: FragmentFeatureOneABinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate()...")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d(TAG, "onCreateView()...")
        _binding = FragmentFeatureOneABinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnB.setOnClickListener {
            findNavController().navigate(R.id.featureOneBFragment)
        }
        binding.btnOpenHome.setOnClickListener {
            (requireActivity() as MainActivity).openHome()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView()...")
        _binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy()...")
    }
}