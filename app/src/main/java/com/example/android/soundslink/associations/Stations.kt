package com.example.android.soundslink.associations

import com.example.android.soundslink.R
import kotlin.collections.ArrayList

class Stations {
    var station : String? = null
    var title : Song? = null
    var stationIcon : Int = R.drawable.gta_vicecity_main

    lateinit var artistToStation: ArrayList<Artist>

    fun setSongArtistToStation(artist: Artist){
        artistToStation.add(artist)
    }

    fun getIcon(){
        val flashIcon = R.drawable.flash_image
        val feverIcon = R.drawable.fever_image
        val emotionIcon = R.drawable.emotion_image
        val espantosoIcon = R.drawable.espantoso_image
        val waveIcon = R.drawable.wave_image
        val wildstyleIcon = R.drawable.wildstyle_image

        val iconsList = arrayListOf<Int>()
        iconsList.addAll(arrayListOf(
            flashIcon,
            feverIcon,
            emotionIcon,
            espantosoIcon,
            waveIcon,
            wildstyleIcon
        ))
    }
}