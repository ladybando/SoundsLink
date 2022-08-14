package com.example.android.soundslink

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.android.soundslink.adapter.RadioListAdapter
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
        //set viewModel data to  variable to pass to adapter for readability
        val stationData = viewModel.stationNameList
        val iconData = viewModel.iconImageList
        adapter = RadioListAdapter(this.requireContext(), stationData, iconData, this)

        recyclerView = binding.recyclerViewList
        recyclerView.adapter = adapter

    }

    override fun onStationClicked(index: Int) {
        var song = ""
        //when radioTitleTextView is clicked
        println(viewModel.flashSongsList)
        //move to songsFragment
        //display appropriate album data
/*
        val action =
            RadioFragmentDirections.actionRadioFragmentToSongsFragment()
        findNavController().navigate(action)
*/

    }
}