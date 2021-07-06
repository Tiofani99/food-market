package com.tiooooo.foodmarket.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.tiooooo.foodmarket.R
import com.tiooooo.foodmarket.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pageRequest = intent.getIntExtra(EXTRA_REQUEST,0)
        if(pageRequest == 2 ){
            val navOptions = NavOptions.Builder()
                .setPopUpTo(R.id.fragmentSignIn,true)
                .build()

            Navigation.findNavController(findViewById(R.id.authHostFragment))
                .navigate(R.id.action_sign_up,null,navOptions)
        }

    }

    companion object{
        const val EXTRA_REQUEST = "extra request"
    }
}