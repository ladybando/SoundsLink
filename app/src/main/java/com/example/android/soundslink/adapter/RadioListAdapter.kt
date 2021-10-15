package com.example.android.soundslink.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.soundslink.data.iconsList
import com.example.android.soundslink.data.stationList
import com.example.android.soundslink.databinding.RadioListLayoutBinding

class RadioListAdapter(private val context: Context, private val stationData: ArrayList<String?>, private val iconData: ArrayList<Int?>, private val listener: OnCLickListener) : RecyclerView.Adapter<RadioListAdapter.RadioViewHolder>() {

    private var stationName = ArrayList<String?>()
    private var stationIcon = ArrayList<Int?>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): RadioListAdapter.RadioViewHolder {
        val binding = RadioListLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RadioViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RadioListAdapter.RadioViewHolder, position: Int) = with(holder) {
        //throws out of bounds exception even with addition of vrock image
        val stationSize = stationName.size
        val iconSize = stationIcon.size
        Log.i("RadioAdapter station", "$stationSize" )
        Log.i("RadioAdapter icon", "$iconSize")
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
                listener.onTaskClicked(absoluteAdapterPosition)
            }
            radioAlbumImage.setOnClickListener{
                listener.onTaskClicked(absoluteAdapterPosition)
            }
        }
    }

    init {
        LayoutInflater.from(context)
        stationName = stationData
        stationIcon = iconData
    }

    interface OnCLickListener{
        fun onTaskClicked(index: Int)
    }
}