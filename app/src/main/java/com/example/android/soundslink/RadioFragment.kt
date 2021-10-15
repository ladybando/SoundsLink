package com.example.android.soundslink

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.soundslink.adapter.RadioListAdapter
import com.example.android.soundslink.adapter.SongArtistListAdapter
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

        adapter = RadioListAdapter( this.requireContext(),viewModel.getStationData(),viewModel.getIconData(),this)
        val station = viewModel.getStationData()
        val icon = viewModel.getIconData()
        Log.i("RadioFrag", "$station")
        Log.i("RadioFrag", "$icon")
        recyclerView = binding.recyclerViewList
        recyclerView.layoutManager = LinearLayoutManager(this.requireContext())
        recyclerView.adapter = adapter

    }

    //todo create radio stations which link to correct songs
    override fun onTaskClicked(index: Int) {
        val action = RadioFragmentDirections.actionRadioFragmentToSongsFragment()
        findNavController().navigate(action)
    }

}