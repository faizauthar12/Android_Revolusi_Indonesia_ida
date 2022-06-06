package io.faizauthar12.github.revolusiindonesia.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import io.faizauthar12.github.revolusiindonesia.R
import io.faizauthar12.github.revolusiindonesia.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        val navView: BottomNavigationView = binding.navView

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        // passing each menu ID as a aset of Ids because each
        // menu should be considered as top level destinations.
        val appbarConfiguration = AppBarConfiguration.Builder(
            R.id.heroesFragment, R.id.sejarahFragment, R.id.laguFragment, R.id.pancasilaFragment
        ).build()
        setupActionBarWithNavController(navController, appbarConfiguration)
        navView.setupWithNavController(navController)
    }
}