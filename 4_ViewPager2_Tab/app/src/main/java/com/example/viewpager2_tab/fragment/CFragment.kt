package com.example.viewpager2_tab.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpager2_tab.databinding.FragmentCBinding

class CFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentCBinding.inflate(inflater, container, false)

        //TODO init Function at Here

        return binding.root
    }
}