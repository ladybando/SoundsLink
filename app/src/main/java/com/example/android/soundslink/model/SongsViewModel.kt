package com.example.android.soundslink.model

import androidx.lifecycle.ViewModel

class SongsViewModel : ViewModel() {
    private lateinit var _currentSong : String
    val currentSong : String get() =  _currentSong

    private lateinit var _currentArtist: String
    val currentArtist : String get() = _currentArtist

}