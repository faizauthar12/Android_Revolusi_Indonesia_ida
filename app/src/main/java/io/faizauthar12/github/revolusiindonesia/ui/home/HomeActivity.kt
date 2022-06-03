package io.faizauthar12.github.revolusiindonesia.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.faizauthar12.github.revolusiindonesia.databinding.ActivityHomeBinding
import io.faizauthar12.github.revolusiindonesia.ui.heroes.HeroesActivity
import io.faizauthar12.github.revolusiindonesia.ui.lagu.LaguActivity
import io.faizauthar12.github.revolusiindonesia.ui.pancasila.PancasilaActivity
import io.faizauthar12.github.revolusiindonesia.ui.sejarah.SejarahActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ibPahlawan.setOnClickListener {
            Intent(this, HeroesActivity::class.java).apply {
                startActivity(this)
            }
        }

        binding.ibSejarah.setOnClickListener {
            Intent(this, SejarahActivity::class.java).apply {
                startActivity(this)
            }
        }

        binding.ibLagu.setOnClickListener {
            Intent(this, LaguActivity::class.java).apply {
                startActivity(this)
            }
        }

        binding.ibPancasila.setOnClickListener {
            Intent(this, PancasilaActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}