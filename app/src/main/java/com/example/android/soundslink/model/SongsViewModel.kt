package com.example.android.soundslink.model

import androidx.lifecycle.ViewModel
import com.example.android.soundslink.data.allArtistsList
import com.example.android.soundslink.data.allSongsList

class SongsViewModel : ViewModel() {
    private var songsList : List<String> = listOf()
    private lateinit var currentSong : String
    private lateinit var currentArtist: String

    private fun getSong(position: Int){
        currentSong = allArtistsList[position]
    }

    private fun getArtist(position: Int){
        currentArtist = allSongsList[position]
    }

    private fun allSongsList(): List<String> {
        return songsList
    }
}