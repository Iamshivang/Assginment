package com.example.assginment.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.assginment.R
import com.example.assginment.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fcv) as NavHostFragment
        navController = navHostFragment.navController

        val gender= "male"

        if(gender== "male"){

            bottomNav = binding.bnv2
            bottomNav.setupWithNavController(navController)
            bottomNav.visibility= View.VISIBLE
            binding.bnv.visibility= View.GONE

        }else{

            bottomNav = binding.bnv
            bottomNav.setupWithNavController(navController)
            bottomNav.visibility= View.VISIBLE
            binding.bnv2.visibility= View.GONE
        }
    }
}