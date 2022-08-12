package com.example.android.soundslink.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.android.soundslink.R
import com.example.android.soundslink.data.*
import com.example.android.soundslink.databinding.SongsListLayoutBinding

class SongArtistListAdapter() : RecyclerView.Adapter<SongArtistListAdapter.SongViewHolder>() {
//this is an array list of strings
    //need to pass this as parameter
    val artist = allArtistsList
    val song  = allSongsList
    inner class SongViewHolder(binding: SongsListLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var artistTextView = binding.tvArtistName
        var songAlbumName = binding.tvSongTitle
        var albumArtImage = binding.songAlbumImage
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val binding =
            SongsListLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SongViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) = with(holder) {
        artistTextView.text = song[position].toString()
        songAlbumName.text = artist[position].toString()
        albumArtImage.setImageResource(R.drawable.gta_vicecity_main)
    }

    private val allList = song + artist
    override fun getItemCount(): Int = allList.size
}
