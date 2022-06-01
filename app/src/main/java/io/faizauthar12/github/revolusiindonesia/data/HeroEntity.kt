package io.faizauthar12.github.revolusiindonesia.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class HeroEntity(
    var heroName: String,
    var heroPicture: String,
    var heroDescription: String
) : Parcelable