package io.faizauthar12.github.revolusiindonesia.ui.heroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import io.faizauthar12.github.revolusiindonesia.R
import io.faizauthar12.github.revolusiindonesia.databinding.ActivityHeroesBinding

class HeroesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHeroesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHeroesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // ViewModel
        val viewModel = ViewModelProvider(this).get(HeroesViewModel::class.java)
        val heroes = viewModel.getHeroes()

        // Heroes Adapter
        val heroesAdapter = HeroesAdapter()

        // Recycleview
        with(binding.rvHero) {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

            setHasFixedSize(true)

            adapter = heroesAdapter
        }
    }
}