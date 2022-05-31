package io.faizauthar12.github.revolusiindonesia.ui.heroes

import androidx.lifecycle.ViewModel
import io.faizauthar12.github.revolusiindonesia.data.HeroEntity
import io.faizauthar12.github.revolusiindonesia.utils.dummy.HeroDummy

class HeroesViewModel : ViewModel() {
    fun getHeroes(): List<HeroEntity> = HeroDummy.generateHeroDummy()
}