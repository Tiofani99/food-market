package com.tiooooo.foodmarket.ui.auth.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.tiooooo.foodmarket.R
import com.tiooooo.foodmarket.databinding.FragmentSignUpAddressBinding
import com.tiooooo.foodmarket.ui.auth.AuthActivity


class SignUpAddressFragment : Fragment() {


    private var _binding: FragmentSignUpAddressBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignUpAddressBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            btnSignUpNow.setOnClickListener {
                Navigation.findNavController(it)
                    .navigate(R.id.action_sign_up_success,null)
            }
        }

        (activity as AuthActivity).toolbarSignUpAddress()

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}