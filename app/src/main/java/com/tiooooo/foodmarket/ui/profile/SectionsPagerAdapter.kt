package com.tiooooo.foodmarket.ui.profile

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tiooooo.foodmarket.ui.home.newtaste.HomeNewTasteFragment
import com.tiooooo.foodmarket.ui.home.popular.HomePopularFragment
import com.tiooooo.foodmarket.ui.home.recommended.HomeRecommendedFragment
import com.tiooooo.foodmarket.ui.profile.account.ProfileAccountFragment
import com.tiooooo.foodmarket.ui.profile.foodmarket.ProfileFoodMarketFragment

class SectionsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Account"
            1 -> "Food Market"
            else -> ""
        }
    }

    override fun getCount(): Int = 3

    override fun getItem(position: Int): Fragment {
        val fragment: Fragment
        return when (position) {
            0 -> {
                fragment = ProfileAccountFragment()
                fragment
            }
            1 -> {
                fragment = ProfileFoodMarketFragment()
                fragment
            }
            else -> {
                fragment = ProfileAccountFragment()
                fragment
            }
        }
    }
}