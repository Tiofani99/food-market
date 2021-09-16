package com.tiooooo.foodmarket.model.dummy

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HomeVerticalModel(
     var title: String,
     var price: String,
     var src: String,
     var rating: Float
):Parcelable
