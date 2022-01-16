package com.example.yesno

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.yesno.databinding.FragmentDiceBinding
import com.example.yesno.service.AppServices

class DiceFragment : Fragment() {

    private var fragmentDiceBinding: FragmentDiceBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentDiceBinding.inflate(inflater, container, false)
        fragmentDiceBinding = binding

        with(binding) {
            counter.setOnClickListener {
                counter.setText("ЕЩЕ РАЗ!")
                dice1.setImageResource(AppServices().getRandomDiceImage())
            }
        }
        return binding.root
    }

}
