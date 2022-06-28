package com.example.perfil_investidor

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.perfil_investidor.databinding.FragmentQ7Binding
import com.example.perfil_investidor.databinding.FragmentQ9Binding
import com.example.perfil_investidor.model.QuizViewModel

class Q9 : Fragment() {

    private var binding : FragmentQ9Binding? = null
    private val sharedViewModel : QuizViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentQ9Binding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    fun finishQuiz () {
        val name = getActivity()?.getIntent()?.getStringExtra("name")
        var profile : String = ""
        val finalScore = sharedViewModel.score.value?.toInt()

        fun setProfile(score: Int): String {

            profile = if (score <= 12) {
                "Conservador"
            } else if (score <= 29) {
                "Moderado"
            } else {
                "Arrojado"
            }

            return profile
        }

        if (finalScore != null) {
            setProfile(finalScore)
        }

        val navController = findNavController()
        val bundle = Bundle()
        bundle.putString("username", name)
        bundle.putString("userprofile", profile)
        navController.navigate(R.id.action_q9_to_resultActivity, bundle)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel
            q9 = this@Q9
        }

    }
}