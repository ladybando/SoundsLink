package com.example.android.soundslink.model

import androidx.lifecycle.ViewModel
import com.example.android.soundslink.data.allArtistsList
import com.example.android.soundslink.data.allSongsList

class SongsViewModel : ViewModel() {
    private var _songsList : List<String> = listOf()
    val songsList : List<String> get() = _songsList

    private lateinit var _currentSong : String
    val currentSong : String get() =  _currentSong

    private lateinit var _currentArtist: String
    val currentArtist : String get() = _currentArtist

   fun getSong(position: Int){
        _currentSong = allArtistsList[position]
    }
    fun getArtist(position: Int){
        _currentArtist = allSongsList[position]
    }
}