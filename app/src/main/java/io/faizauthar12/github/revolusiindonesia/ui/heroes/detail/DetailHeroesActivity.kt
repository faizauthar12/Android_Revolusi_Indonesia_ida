package io.faizauthar12.github.revolusiindonesia.ui.heroes.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import io.faizauthar12.github.revolusiindonesia.data.HeroEntity
import io.faizauthar12.github.revolusiindonesia.databinding.ActivityDetailHeroesBinding
import io.faizauthar12.github.revolusiindonesia.databinding.ContentDetailHeroesBinding

class DetailHeroesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailHeroesBinding
    private lateinit var contentDetail: ContentDetailHeroesBinding

    private var data: HeroEntity? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailHeroesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        contentDetail = binding.contentDetailHeroes
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val hero = intent.extras
        if (hero != null) {
            data = intent.getParcelableExtra(EXTRA_HERO)
            data?.let {
                populateDetailHeroes(it)
            }
        }
    }

    private fun populateDetailHeroes(heroEntity: HeroEntity) {
        supportActionBar?.title = heroEntity.heroName

        contentDetail.tvHeroName.text = heroEntity.heroName
        contentDetail.tvHeroDescription.text = heroEntity.heroDescription
        Glide.with(this)
            .load(heroEntity.heroPicture)
            .into(contentDetail.ivHeroes)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object {
        const val EXTRA_HERO = "extra_hero"
    }
}