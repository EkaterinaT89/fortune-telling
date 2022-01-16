package com.example.yesno

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.yesno.databinding.FragmentRunaBinding
import com.example.yesno.service.AppServices

class RunaFragment : Fragment() {

    private var runaFragmentBinding: FragmentRunaBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentRunaBinding.inflate(inflater, container, false)
        runaFragmentBinding = binding

        with(binding) {
            runaAsk.setOnClickListener {
                val randomRunaInt = (1..19).random()
                runaPic.setImageResource(AppServices().getRunaImage(randomRunaInt))
                runaAsk.setText("ЗАДАТЬ ЕЩЕ ВОПРОС")
                runaAnswer.setText(AppServices().getRunaText(randomRunaInt))
            }

        }

        return binding.root
    }

}
