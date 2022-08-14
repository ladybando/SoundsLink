package com.example.android.soundslink.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.soundslink.data.iconsList
import com.example.android.soundslink.data.stationList
import com.example.android.soundslink.databinding.RadioListLayoutBinding

class RadioListAdapter(context: Context, stationData: ArrayList<String?>, iconData: ArrayList<Int?>, private val listener: OnCLickListener) : RecyclerView.Adapter<RadioListAdapter.RadioViewHolder>() {

    private var stationName = stationList
    private var stationIcon = iconsList

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): RadioListAdapter.RadioViewHolder {
        val binding = RadioListLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RadioViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RadioListAdapter.RadioViewHolder, position: Int) = with(holder) {
        //throws out of bounds exception even with addition of vrock image
        radioAlbumImage.setImageResource(stationIcon[position]!!)
        radioTitle.text = stationName[position]
    }

    private val station = stationIcon + stationName
    override fun getItemCount(): Int = station.size

    inner class RadioViewHolder(binding: RadioListLayoutBinding) : RecyclerView.ViewHolder(binding.root){
        var radioAlbumImage = binding.radioImage
        var radioTitle = binding.radioTitle

        init {
            radioTitle.setOnClickListener {
                listener.onStationClicked(absoluteAdapterPosition)
            }
            radioAlbumImage.setOnClickListener{
                listener.onStationClicked(absoluteAdapterPosition)
            }
        }
    }

    init {
        LayoutInflater.from(context)
        stationName = stationData
        stationIcon = iconData
    }

    interface OnCLickListener{
        fun onStationClicked(index: Int)
    }
}