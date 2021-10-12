package com.example.android.soundslink.associations

class Artist {
    var name: String? = null
    var genre: String? = null
    lateinit var songLibrary: ArrayList<Song>

    //allow artist to be associated with their song
    fun setSongMember(song: Song){
        songLibrary.add(song)
    }
}
