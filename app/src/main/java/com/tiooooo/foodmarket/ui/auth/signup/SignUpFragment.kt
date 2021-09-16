package com.tiooooo.foodmarket.ui.auth.signup

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.google.android.material.navigation.NavigationView
import com.tiooooo.foodmarket.R
import com.tiooooo.foodmarket.databinding.FragmentSignUpBinding
import com.tiooooo.foodmarket.ui.auth.AuthActivity


class SignUpFragment : Fragment() {

    private var _binding: FragmentSignUpBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignUpBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            btnContinue.setOnClickListener {
                Navigation.findNavController(it)
                    .navigate(R.id.action_sign_up_address,null)
            }
        }

        (activity as AuthActivity).toolbarSignUp()

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}