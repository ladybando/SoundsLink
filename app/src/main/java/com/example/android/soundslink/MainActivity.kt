package com.example.android.soundslink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.soundslink.adapter.SongArtistListAdapter
import com.example.android.soundslink.databinding.ActivityMainBinding
import com.example.android.soundslink.model.SongsViewModel


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: SongArtistListAdapter
    private val viewModel: SongsViewModel by viewModels()
//creates window for ui

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = SongArtistListAdapter()
        setUpRecyclerView()
        //todo figure out how to get viewModel list to display with picture and appropriate text
        //how can i associate singer with song?


        //have view model functions that take an int and allow mainactivity to set resources per adapter item
        // songItem = viewModel.getResourcefromResources(getResources().
        //getIntArray(R.array.stamp_counter_array))

    }

    private fun setUpRecyclerView(){
        recyclerView = binding.recycleViewList
        adapter = SongArtistListAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}