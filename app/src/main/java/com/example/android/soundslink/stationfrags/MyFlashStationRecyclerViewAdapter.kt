package com.example.android.soundslink.stationfrags

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.soundslink.R
import com.example.android.soundslink.data.allArtistsList
import com.example.android.soundslink.data.allSongsList
import com.example.android.soundslink.data.flashArtistList
import com.example.android.soundslink.data.flashSongList
import com.example.android.soundslink.databinding.FragmentFlashListBinding

class MyFlashStationRecyclerViewAdapter : RecyclerView.Adapter<MyFlashStationRecyclerViewAdapter.FlashViewHolder>() {

    private var song = flashSongList
    private var artist = flashArtistList

    inner class FlashViewHolder(binding: FragmentFlashListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var artistTextView = binding.tvArtistName
        var songAlbumName = binding.tvSongTitle
        var albumArtImage = binding.songAlbumImage
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlashViewHolder {
        val binding =
            FragmentFlashListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FlashViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FlashViewHolder, position: Int) = with(holder) {
        artistTextView.text = song[position]
        songAlbumName.text = artist[position]
        albumArtImage.setImageResource(R.drawable.flash_image)
    }

    private val allList = song + artist
    override fun getItemCount(): Int = allList.size


}