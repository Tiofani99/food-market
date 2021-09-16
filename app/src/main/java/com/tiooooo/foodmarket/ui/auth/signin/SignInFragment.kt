package com.tiooooo.foodmarket.ui.auth.signin

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tiooooo.foodmarket.MainActivity
import com.tiooooo.foodmarket.R
import com.tiooooo.foodmarket.databinding.FragmentSignInBinding
import com.tiooooo.foodmarket.ui.auth.AuthActivity
import kotlinx.android.synthetic.*


class SignInFragment : Fragment() {

    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignInBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            btnSignUp.setOnClickListener {
                val intent = Intent(requireActivity(),AuthActivity::class.java)
                intent.putExtra(AuthActivity.EXTRA_REQUEST,2)
                startActivity(intent)
            }

            btnSignIn.setOnClickListener {
                val intent = Intent(requireActivity(),MainActivity::class.java)
                startActivity(intent)
                activity?.finish()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}