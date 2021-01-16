package com.example.android.navigation

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.android.navigation.databinding.FragmentTitleBinding
import java.util.*

class TitleFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_title, container, false)

        binding.playButton.setOnClickListener {
            //You can also use any of the below 3 lines. All three works same
            //Navigation.findNavController(it).navigate(R.id.action_titleFragment_to_gameFragment)
            //Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
            it.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
        }

        setHasOptionsMenu(true)

        return binding.root

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.overflow_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!, view!!.findNavController()) || super.onOptionsItemSelected(item)
    }
}