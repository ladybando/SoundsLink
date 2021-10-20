package com.example.android.soundslink.stationfrags

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.soundslink.databinding.FragmentFlashBinding

/**
 * A fragment representing a list of Items.
 */
class FlashStationFragment : Fragment() {

    private var _binding: FragmentFlashBinding? = null
    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MyFlashStationRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentFlashBinding.inflate(inflater, container, false)
        recyclerView = binding.recycleViewList
        // Set the adapter
        adapter = MyFlashStationRecyclerViewAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this.requireContext())
        recyclerView.adapter=adapter

        return binding.root
    }

}