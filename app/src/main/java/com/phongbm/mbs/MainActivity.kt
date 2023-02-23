package com.phongbm.mbs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.phongbm.mbs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.mainNavHostFragment) as NavHostFragment
        val navController = navHostFragment.navController

        binding.bottomNavigation.setupWithNavController(navController)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    fun openHome() {
        binding.bottomNavigation.selectedItemId = R.id.featureCommonNav
    }

    fun openFeatureOne() {
        binding.bottomNavigation.selectedItemId = R.id.featureOneNav
    }

    fun openFeatureTwo() {
        binding.bottomNavigation.selectedItemId = R.id.featureTwoNav
    }
}