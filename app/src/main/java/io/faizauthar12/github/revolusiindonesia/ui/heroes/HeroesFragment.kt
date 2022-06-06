package io.faizauthar12.github.revolusiindonesia.ui.heroes

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import io.faizauthar12.github.revolusiindonesia.data.HeroEntity
import io.faizauthar12.github.revolusiindonesia.databinding.FragmentHeroesBinding
import io.faizauthar12.github.revolusiindonesia.ui.heroes.detail.DetailHeroesActivity

class HeroesFragment : Fragment() {
    // Binding support
    private lateinit var binding: FragmentHeroesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // binding support
        binding = FragmentHeroesBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            // ViewModel
            val viewModel = ViewModelProvider(this).get(HeroesViewModel::class.java)
            val heroes = viewModel.getHeroes()

            // Heroes Adapter
            val heroesAdapter = HeroesAdapter()
            heroesAdapter.setHero(heroes)

            // move to detail
            heroesAdapter.onItemClickCallback = object : HeroesAdapter.OnItemClickCallback {
                override fun onItemClicked(hero: HeroEntity) {
                    Intent(activity, DetailHeroesActivity::class.java).apply {
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
    }
}