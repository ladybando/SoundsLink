package com.example.android.soundslink

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.android.soundslink.adapter.SongArtistListAdapter
import com.example.android.soundslink.model.SongsViewModel

/**
 * A fragment representing a list of Items.
 */
class SongsFragment : Fragment() {

    private val viewModel: SongsViewModel by activityViewModels()

    //  private var _binding : FragmentSongsListBinding? = null
//    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: SongArtistListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        //todo configure to use viewBinding
        val view = inflater.inflate(R.layout.fragment_songs, container, false)

        adapter = SongArtistListAdapter()
        recyclerView = view.findViewById(R.id.recycle_view_list)
        adapter = SongArtistListAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this.requireContext())
        recyclerView.adapter = adapter
        return view
    }

}