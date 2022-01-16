package com.example.yesno

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.yesno.databinding.FragmentYesNoBinding
import com.example.yesno.service.AppServices

class YesNoFragment: Fragment() {

    private var fragmentYesNoBinding: FragmentYesNoBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentYesNoBinding.inflate(inflater, container, false)
        fragmentYesNoBinding = binding

        with(binding) {
            ask.setOnClickListener {
                ask.setText("ЗАДАТЬ ЕЩЕ ОДИН ВОПРОС")
                answer.setText(AppServices().getRandomText())
            }
        }
        return binding.root
    }

}

