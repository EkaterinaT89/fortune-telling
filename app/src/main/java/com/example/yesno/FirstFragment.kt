package com.example.yesno

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.yesno.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var fragmentFirstBinding: FragmentFirstBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentFirstBinding.inflate(inflater, container, false)
        fragmentFirstBinding = binding

        with(binding) {
            yesNoButton.setOnClickListener {
                findNavController().navigate(R.id.action_firstFragment_to_yesNoFragment)
            }

            diceButton.setOnClickListener {
                findNavController().navigate(R.id.action_firstFragment_to_diceFragment)
            }

            runaButton.setOnClickListener {
                findNavController().navigate(R.id.action_firstFragment_to_runaFragment)
            }
        }
        return binding.root
    }

}

