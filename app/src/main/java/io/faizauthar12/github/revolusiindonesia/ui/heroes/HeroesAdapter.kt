package io.faizauthar12.github.revolusiindonesia.ui.heroes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import io.faizauthar12.github.revolusiindonesia.data.HeroEntity
import io.faizauthar12.github.revolusiindonesia.databinding.ItemsHeroesBinding

class HeroesAdapter : RecyclerView.Adapter<HeroesAdapter.HeroesViewHolder>() {

    private lateinit var binding: ItemsHeroesBinding

    private val listHero = ArrayList<HeroEntity>()

    fun setHero(heroes: List<HeroEntity>?) {
        if (heroes.isNullOrEmpty()) return
        this.listHero.clear()
        this.listHero.addAll(heroes)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroesViewHolder {
        binding = ItemsHeroesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HeroesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HeroesViewHolder, position: Int) {
        val hero = listHero[position]
        holder.bind(hero)
    }

    override fun getItemCount(): Int = listHero.size

    class HeroesViewHolder(private val binding: ItemsHeroesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(hero: HeroEntity) {
            with(binding) {
                Glide.with(itemView.context)
                    .load(hero.heroPicture)
                    .into(imgHero)

                tvHero.text = hero.heroName
            }
        }

    }
}