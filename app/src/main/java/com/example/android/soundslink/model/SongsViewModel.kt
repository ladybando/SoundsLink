package com.example.android.soundslink.model

import androidx.lifecycle.ViewModel
import com.example.android.soundslink.data.allSongsList
import com.example.android.soundslink.data.iconsList
import com.example.android.soundslink.data.stationList

class SongsViewModel : ViewModel() {
    private var _stationNameList: ArrayList<String?> = stationList
    val stationNameList get() = _stationNameList

    private var _iconImageList: ArrayList<Int?> = iconsList
    val iconImageList get() = _iconImageList

    private var _songTitleList: ArrayList<String?> = allSongsList
    val songTitleList get() = _songTitleList

    private var _iconImage : Int? = null
    val iconImage get() = _iconImage!!

    fun getIconImage(){
        for(element in iconsList){
            _iconImage = element
        }
    }

}