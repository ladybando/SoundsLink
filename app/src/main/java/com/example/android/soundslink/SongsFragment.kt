package com.example.android.soundslink

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.soundslink.adapter.SongArtistListAdapter
import com.example.android.soundslink.databinding.FragmentSongsBinding
import com.example.android.soundslink.model.SongsViewModel

/**
 * A fragment representing a list of Items.
 */
class SongsFragment : Fragment(), SongArtistListAdapter.OnCLickListener {

    private var _binding: FragmentSongsBinding? = null
    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: SongArtistListAdapter
    private val viewModel: SongsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentSongsBinding.inflate(inflater, container, false)
        //set recyclerview in onCreateView to ensure its built when screen first populates
        recyclerView = binding.recycleViewList
        //call method to populate correct data based on station selected by user
        return binding.root
    }

    override fun onStationClicked(index: Int){
        //user clicks on station image

        //call iTunes API or YouTube link
        //play song in app or move to external site for music

        adapter = SongArtistListAdapter(this.requireContext(), viewModel.iconImageList, viewModel.songTitleList, viewModel.artistNameList, this)
        recyclerView.layoutManager = LinearLayoutManager(this.requireContext())
        recyclerView.adapter = adapter
    }

}