package com.example.kotlin_practice.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.kotlin_practice.R
import com.example.kotlin_practice.databinding.FragmentSelectionBinding

/**
 * A simple [Fragment] subclass.
 * Use the [SelectionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SelectionFragment : Fragment() , View.OnClickListener{

    private var _binding : FragmentSelectionBinding? = null
    private val binding get() = _binding!!
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSelectionBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        binding.btnBack.setOnClickListener(this)
        binding.option1.setOnClickListener(this)
        binding.option2.setOnClickListener(this)
        binding.option3.setOnClickListener(this)
        binding.option4.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.btn_back -> {
                navController.popBackStack()
            }
            R.id.option_1 ->{navigateWithIndex(1)}
            R.id.option_2 ->{navigateWithIndex(2)}
            R.id.option_3 ->{navigateWithIndex(3)}
            R.id.option_4 ->{navigateWithIndex(4)}
        }
    }

    fun navigateWithIndex(index : Int) {
        var bundle : Bundle = bundleOf("index" to index) // key, value pair
        navController.navigate(R.id.action_selectionFragment_to_resultFragment,bundle)
    }

}
