package com.example.android.soundslink

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.soundslink.databinding.SongItemLayoutBinding

class SongArtistListAdapter(listOfSongs: List<String>, listOfAlbums: List<String>) : RecyclerView.Adapter<SongArtistListAdapter.SongViewHolder>() {
    private var listOfSongs = listOf<String>()
    private var listOfAlbums = listOf<String>()

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

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        holder.artistTextView.text = listOfSongs[position]
        holder.songAlbumName.text = listOfAlbums[position]
        holder.albumArtImage.setImageResource(R.drawable.gta_vicecity_main)
    }

    override fun getItemCount(): Int = listOfSongs.size
}