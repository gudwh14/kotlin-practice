package com.example.kotlin_practice.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.kotlin_practice.R
import com.example.kotlin_practice.databinding.FragmentResultBinding

/**
 * A simple [Fragment] subclass.
 * Use the [ResultFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ResultFragment : Fragment() {

    private var _binding : FragmentResultBinding? = null
    private val binding get() = _binding!!
    lateinit var navController: NavController
    var option = -1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        option = arguments?.getInt("index") ?: -1
        _binding = FragmentResultBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        setResult(option)

        binding.btnHome.setOnClickListener{
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
    }

    fun setResult(option : Int) {
        when(option) {
            1 -> {
                binding.tvMain.text = "You are a QUITTER"
                binding.tvSub.text = "You can let the person easily."
            }
            2 -> {
                binding.tvMain.text = "You should focus on yourself"
                binding.tvSub.text = "You become really clingy to your ex."
            }
            3 -> {
                binding.tvMain.text = "You Should take it easy"
                binding.tvSub.text = "You can do crazy things no matter what it takes."
            }
            4 -> {
                binding.tvMain.text = "You are pretty mature"
                binding.tvSub.text = "You can easily accept the break-up."
            }
        }
    }

}
