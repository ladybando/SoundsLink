package com.example.android.soundslink.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.soundslink.data.ArtistNameList
import com.example.android.soundslink.data.SongNameList
import com.example.android.soundslink.data.iconsList
import com.example.android.soundslink.databinding.SongsListLayoutBinding

class SongArtistListAdapter(context: Context, albumImage: ArrayList<Int?>, artist: ArrayList<String?>, song: ArrayList<String?>, private val listener: OnCLickListener) : RecyclerView.Adapter<SongArtistListAdapter.SongViewHolder>() {

    var songs = SongNameList().addToSongs()
    var artists = ArtistNameList().addToArtist()
    var albumImages = iconsList

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
        artistTextView.text = songs[position]
        songAlbumName.text = artists[position]
        albumArtImage.setImageResource(albumImages[position]!!)
    }

    init{
        LayoutInflater.from(context)
        songs = song
        artists = artist
        albumImages = albumImage
    }

    interface OnCLickListener{
        fun onStationClicked(index: Int)
    }

    private val allList = songs + artists
    override fun getItemCount(): Int = allList.size
}
