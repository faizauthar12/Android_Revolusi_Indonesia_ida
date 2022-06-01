package io.faizauthar12.github.revolusiindonesia.ui.heroes

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import io.faizauthar12.github.revolusiindonesia.data.HeroEntity
import io.faizauthar12.github.revolusiindonesia.databinding.ActivityHeroesBinding
import io.faizauthar12.github.revolusiindonesia.ui.heroes.detail.DetailHeroesActivity

class HeroesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHeroesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHeroesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // ViewModel
        val viewModel = ViewModelProvider(this).get(HeroesViewModel::class.java)
        val heroes = viewModel.getHeroes()

        // Heroes Adapter
        val heroesAdapter = HeroesAdapter()
        heroesAdapter.setHero(heroes)

        // move to detail
        heroesAdapter.onItemClickCallback = object : HeroesAdapter.OnItemClickCallback {
            override fun onItemClicked(hero: HeroEntity) {
                Intent(this@HeroesActivity, DetailHeroesActivity::class.java).apply {
                    putExtra(DetailHeroesActivity.EXTRA_HERO, hero)
                    startActivity(this)
                }
            }
        }

        // Recycleview
        with(binding.rvHero) {
            layoutManager = LinearLayoutManager(context)

            setHasFixedSize(true)

            adapter = heroesAdapter
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}