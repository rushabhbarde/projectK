package com.example.projectk.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.projectk.Diagnose
import com.example.projectk.R
import com.example.projectk.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.diagnoseBtn.setOnClickListener {
            startActivity(Intent(requireContext(),Diagnose::class.java))
        }

        return binding.root
    }


}