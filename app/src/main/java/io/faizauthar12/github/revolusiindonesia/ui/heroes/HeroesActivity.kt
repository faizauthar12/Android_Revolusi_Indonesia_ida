package io.faizauthar12.github.revolusiindonesia.ui.heroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.faizauthar12.github.revolusiindonesia.R
import io.faizauthar12.github.revolusiindonesia.databinding.ActivityHeroesBinding

class HeroesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHeroesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHeroesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}