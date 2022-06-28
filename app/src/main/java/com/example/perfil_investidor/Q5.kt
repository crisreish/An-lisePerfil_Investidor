package com.example.perfil_investidor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.perfil_investidor.databinding.FragmentQ3Binding
import com.example.perfil_investidor.databinding.FragmentQ5Binding
import com.example.perfil_investidor.model.QuizViewModel

class Q5 : Fragment() {

    private var binding : FragmentQ5Binding? = null
    private val sharedViewModel : QuizViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentQ5Binding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    fun nextQuestion() {
        findNavController().navigate(R.id.action_q5_to_q6)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            q5 = this@Q5
        }

    }
}