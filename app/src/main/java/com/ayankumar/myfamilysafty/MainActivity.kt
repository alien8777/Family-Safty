package com.ayankumar.myfamilysafty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import androidx.fragment.app.Fragment
import com.ayankumar.myfamilysafty.Fragments.DashBoardFragment
import com.ayankumar.myfamilysafty.Fragments.GuardFragment
import com.ayankumar.myfamilysafty.Fragments.HomeFragment
import com.ayankumar.myfamilysafty.Fragments.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomBar = findViewById<BottomNavigationView>(R.id.btmnavigationView)
        bottomBar.setOnItemSelectedListener {
            when(it.itemId)
            {
                R.id.nav_guard -> inflateFragment(GuardFragment.newInstance())
                R.id.nav_home -> inflateFragment(HomeFragment.newInstance())
                R.id.nav_dashboard -> inflateFragment(DashBoardFragment.newInstance())
                R.id.nav_profile -> inflateFragment(ProfileFragment.newInstance())
            }
            true
        }
        bottomBar.selectedItemId = R.id.nav_home
    }

    private fun inflateFragment(fragment : Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }
}