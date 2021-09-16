package com.tiooooo.foodmarket.ui.auth

import android.os.Bundle
import android.view.View
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.tiooooo.foodmarket.R
import com.tiooooo.foodmarket.databinding.ActivityAuthBinding
import com.tiooooo.foodmarket.databinding.LayoutToolbarBinding

class AuthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pageRequest = intent.getIntExtra(EXTRA_REQUEST, 0)
        if (pageRequest == 2) {
            toolbarSignUp()
            val navOptions = NavOptions.Builder()
                .setPopUpTo(R.id.fragmentSignIn, true)
                .build()

            Navigation.findNavController(findViewById(R.id.authHostFragment))
                .navigate(R.id.action_sign_up, null, navOptions)
        }

    }

    fun toolbarSignUp(){
        with(binding.layoutToolbar.toolbar){
            title = "Sign Up"
            subtitle = "Daftar dan pesan sekarang"
            setNavigationOnClickListener { onBackPressed() }
        }
    }

    fun toolbarSignUpAddress(){
        with(binding.layoutToolbar.toolbar){
            title = "Alamat"
            subtitle = "Isikan alamat dengan benar"
            setNavigationOnClickListener { onBackPressed() }
        }
    }

    fun toolbarSignUpSuccess(){
        binding.layoutToolbar.toolbar.visibility = View.GONE
    }



    companion object {
        const val EXTRA_REQUEST = "extra request"
    }
}