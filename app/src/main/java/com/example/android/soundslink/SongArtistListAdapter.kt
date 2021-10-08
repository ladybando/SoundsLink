package com.example.android.soundslink

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.soundslink.data.allArtistsList
import com.example.android.soundslink.data.allSongsList
import com.example.android.soundslink.databinding.SongItemLayoutBinding

//should set how recyclerview items look
//should functionality should be set to activity?
//and data should be set to viewmodel?
class SongArtistListAdapter : RecyclerView.Adapter<SongArtistListAdapter.SongViewHolder>() {
    //as of right now only displaying the last song and artist in list

    private val song = allSongsList
    private val artist = allArtistsList

    inner class SongViewHolder(binding: SongItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var artistTextView = binding.tvArtistName
        var songAlbumName = binding.tvSongTitle
        var albumArtImage = binding.songAlbumImage
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val binding =
            SongItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SongViewHolder(binding)
    }

    //returning two songs now
    override fun onBindViewHolder(holder: SongViewHolder, position: Int) = with(holder) {
        artistTextView.text = song[position]
        songAlbumName.text = artist[position]
        val song = song[position]
        Log.d("Adapter song", song)
        albumArtImage.setImageResource(R.drawable.gta_vicecity_main)
    }

    private val allList = song + artist
    override fun getItemCount(): Int = allList.size
}