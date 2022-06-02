package io.faizauthar12.github.revolusiindonesia.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.faizauthar12.github.revolusiindonesia.R
import io.faizauthar12.github.revolusiindonesia.databinding.ActivityHomeBinding
import io.faizauthar12.github.revolusiindonesia.databinding.ContentHomeBinding
import io.faizauthar12.github.revolusiindonesia.ui.heroes.HeroesActivity
import io.faizauthar12.github.revolusiindonesia.ui.sejarah.SejarahActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var contentHome: ContentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        contentHome = binding.contentHome
        setSupportActionBar(binding.toolbar)

        contentHome.ibPahlawan.setOnClickListener {
            Intent(this, HeroesActivity::class.java).apply {
                startActivity(this)
            }
        }

        contentHome.ibSejarah.setOnClickListener {
            Intent(this, SejarahActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}