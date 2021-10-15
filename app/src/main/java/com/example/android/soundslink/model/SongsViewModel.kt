package com.example.android.soundslink.model

import androidx.lifecycle.ViewModel
import com.example.android.soundslink.data.iconsList
import com.example.android.soundslink.data.stationList

class SongsViewModel : ViewModel() {
    private var _stationName: ArrayList<String?> = arrayListOf()
    val stationName get() = _stationName

    private var _stationIcon: ArrayList<Int?> = arrayListOf()
    val stationIcon get() = _stationIcon

    fun getStationData() : ArrayList<String?>{
        _stationName = stationList
        return _stationName
    }

    fun getIconData() : ArrayList<Int?>{
        _stationIcon = iconsList
        return _stationIcon
    }
}