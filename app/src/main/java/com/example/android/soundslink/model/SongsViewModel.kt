package com.example.android.soundslink.model

import androidx.lifecycle.ViewModel
import com.example.android.soundslink.data.*

class SongsViewModel : ViewModel() {
    private var _stationNameList: ArrayList<String?> = stationList
    val stationNameList get() = _stationNameList

    private var _iconImageList: ArrayList<Int?> = iconsList
    val iconImageList get() = this._iconImageList


    private var _songTitleList: ArrayList<String?> = SongNameList().addToSongs()
    val songTitleList get() = _songTitleList

    private var _artistNameList: ArrayList<String?> = ArtistNameList().addToArtist()
    val artistNameList get() = _artistNameList

    private var _flashSongsList: ArrayList<String> = flashSongList
    val flashSongsList get() = _flashSongsList

    private var

}