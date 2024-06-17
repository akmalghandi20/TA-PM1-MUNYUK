package com.uti.indonesea

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.uti.indonesea.databinding.FragmentCategoryBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CategoryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CategoryFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCategoryBinding.inflate(inflater, container, false)
        binding.btnikan.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction().addToBackStack(null).replace(R.id.frm_lay, IkanFragment()).commit()
        }
        binding.btnkerang.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction().addToBackStack(null).replace(R.id.frm_lay, KerangFragment()).commit()
        }
        binding.btnlumba.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction().addToBackStack(null).replace(R.id.frm_lay, LumbaFragment()).commit()
        }
        binding.btnpaus.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction().addToBackStack(null).replace(R.id.frm_lay, PausFragment()).commit()
        }
        binding.btnpari.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction().addToBackStack(null).replace(R.id.frm_lay, PariFragment()).commit()
        }
        binding.btnpenyu.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction().addToBackStack(null).replace(R.id.frm_lay, PenyuFragment()).commit()
        }
        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment CategoryFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CategoryFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}