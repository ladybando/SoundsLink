package com.example.android.soundslink

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.soundslink.adapter.SongArtistListAdapter
import com.example.android.soundslink.databinding.FragmentSongsBinding

/**
 * A fragment representing a list of Items.
 */
class SongsFragment : Fragment() {

    //todo reusable fragments representing each radio station
    //how and where should I iterate over allSongsList etc...
    private var _binding: FragmentSongsBinding? = null
    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: SongArtistListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentSongsBinding.inflate(inflater, container, false)

        recyclerView = binding.recycleViewList
        adapter = SongArtistListAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this.requireContext())
        recyclerView.adapter = adapter
        return binding.root
    }

}