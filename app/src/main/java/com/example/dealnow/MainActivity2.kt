package com.example.dealnow

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.DifferentialMotionFlingController
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.replace
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.dealnow.databinding.ActivityMain2Binding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity() {

    private lateinit var bottomNavigationView : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnItemSelectedListener { menuItem ->

            when(menuItem.itemId){
                R.id.homeFragment2 -> {
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.wishlistFragment2 -> {
                    replaceFragment(WishlistFragment())
                    true
                }
                R.id.cartFragment2 -> {
                    replaceFragment(CartFragment())
                    true
                }
                R.id.searchFragment2 -> {
                    replaceFragment(SearchFragment())
                    true
                }
                R.id.settingFragment2 -> {
                    replaceFragment(SettingFragment())
                    true
                }
                else -> false
            }


        }
        replaceFragment(HomeFragment())

    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView2, fragment).commit()

    }
}
