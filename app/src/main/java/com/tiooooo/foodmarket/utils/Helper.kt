package com.tiooooo.foodmarket.utils

import android.widget.TextView
import com.tiooooo.foodmarket.model.dummy.HomeVerticalModel
import com.tiooooo.foodmarket.model.dummy.ProfileMenuModel
import java.text.DecimalFormat

object Helper {
    fun TextView.formatPrice(value: String){
        this.text = getCurrencyIDR(value.toDouble())
    }

    fun getCurrencyIDR(price: Double) : String{
        val format = DecimalFormat("#,###,###")
        return "IDR "+format.format(price).replace(",".toRegex(),".")
    }

     fun initDataDummy(foodList: ArrayList<HomeVerticalModel>){
        foodList.add(HomeVerticalModel("Cherry Healthy","35000","",5f))
        foodList.add(HomeVerticalModel("Burger Tamayo","25000","",4f))
        foodList.add(HomeVerticalModel("Bakwan Healthy","30000","",4.5f))
        foodList.add(HomeVerticalModel("Bakwan Healthy","30000","",4.5f))
        foodList.add(HomeVerticalModel("Bakwan Healthy","30000","",4.5f))
        foodList.add(HomeVerticalModel("Bakwan Healthy","30000","",4.5f))
        foodList.add(HomeVerticalModel("Bakwan Healthy","30000","",4.5f))
        foodList.add(HomeVerticalModel("Bakwan Healthy","30000","",4.5f))
        foodList.add(HomeVerticalModel("Bakwan Healthy","30000","",4.5f))
        foodList.add(HomeVerticalModel("Bakwan Healthy","30000","",4.5f))
        foodList.add(HomeVerticalModel("Bakwan Healthy","30000","",4.5f))
        foodList.add(HomeVerticalModel("Bakwan Healthy","30000","",4.5f))
        foodList.add(HomeVerticalModel("Bakwan Healthy","30000","",4.5f))
        foodList.add(HomeVerticalModel("Bakwan Healthy","30000","",4.5f))
        foodList.add(HomeVerticalModel("Bakwan Healthy","30000","",4.5f))
        foodList.add(HomeVerticalModel("Bakwan Healthy","30000","",4.5f))
        foodList.add(HomeVerticalModel("Bakwan Healthy","30000","",4.5f))
        foodList.add(HomeVerticalModel("Bakwan Healthy","30000","",4.5f))
    }

    fun initDataMenuAccountDummy(menuList: ArrayList<ProfileMenuModel>){
        menuList.add(ProfileMenuModel("Edit Profile"))
        menuList.add(ProfileMenuModel("Alamat Rumah"))
        menuList.add(ProfileMenuModel("Keamanan"))
        menuList.add(ProfileMenuModel("Pembayaran"))
    }

    fun initDataMenuFoodMarketDummy(menuList: ArrayList<ProfileMenuModel>){
        menuList.add(ProfileMenuModel("Rate App"))
        menuList.add(ProfileMenuModel("Help Center"))
        menuList.add(ProfileMenuModel("Privacy & Policy"))
        menuList.add(ProfileMenuModel("Terms & Condition"))
    }

}