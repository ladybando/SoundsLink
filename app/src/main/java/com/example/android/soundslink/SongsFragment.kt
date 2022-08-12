package com.example.android.soundslink

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.soundslink.adapter.SongArtistListAdapter
import com.example.android.soundslink.databinding.FragmentSongsBinding

/**
 * A fragment representing a list of Items.
 */
class SongsFragment : Fragment() {

//todo refactor to use viewModel for data
    private var _binding: FragmentSongsBinding? = null
    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: SongArtistListAdapter
    val args: SongsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentSongsBinding.inflate(inflater, container, false)
        //once adapter passes array list use images to pass in as parameter to adapter
        //need images to update to correct image for correct radio station
        val stationImage = args.stationImage
        val stationInfo = args.stationInfo

        recyclerView = binding.recycleViewList

        adapter = SongArtistListAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this.requireContext())
        recyclerView.adapter = adapter
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}