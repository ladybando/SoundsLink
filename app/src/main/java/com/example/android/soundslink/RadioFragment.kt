package com.example.android.soundslink

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.soundslink.adapter.RadioListAdapter
import com.example.android.soundslink.data.flashArtistList
import com.example.android.soundslink.data.flashSongList
import com.example.android.soundslink.databinding.FragmentRadioBinding
import com.example.android.soundslink.model.SongsViewModel

/**
 * A simple [Fragment] subclass.
 */

class RadioFragment : Fragment(), RadioListAdapter.OnCLickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RadioListAdapter

    private var _binding: FragmentRadioBinding? = null
    private val binding get() = _binding!!

    private val viewModel: SongsViewModel by activityViewModels()
    private var iconData = arrayListOf<Int?>()
    private var stationData = arrayListOf<String?>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentRadioBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        stationData = viewModel.stationNameList
        iconData = viewModel.iconImageList

        adapter = RadioListAdapter(this.requireContext(), stationData, iconData, this)

        recyclerView = binding.recyclerViewList
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this.requireContext())

    }

    //todo create radio stations which link to correct songs
    //todo: reusable fragments representing each radio station
    //how and where should I iterate over allSongsList etc...
    override fun onTaskClicked(index: Int) {
        //navigate to songs fragment and pass appropriate image
        val action =
            RadioFragmentDirections.actionRadioFragmentToFlashStationFragment()
        findNavController().navigate(action)

    }
}