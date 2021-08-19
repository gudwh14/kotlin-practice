package com.example.kotlin_practice.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.kotlin_practice.R
import com.example.kotlin_practice.databinding.FragmentQuestionBinding

/**
 * A simple [Fragment] subclass.
 * Use the [QuestionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuestionFragment : Fragment(), OnClickListener {

    private var _binding : FragmentQuestionBinding? = null
    private val binding get() = _binding!!
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentQuestionBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        binding.btnNext.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        // view!! -> requireView()
        when(view?.id) {
            R.id.btn_next -> {
                navController.navigate(R.id.action_questionFragment_to_selectionFragment)
            }
        }
    }

}
