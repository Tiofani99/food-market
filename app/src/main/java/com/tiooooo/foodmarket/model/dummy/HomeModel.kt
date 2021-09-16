package com.tiooooo.foodmarket.model.dummy

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HomeModel(
     var title: String,
     var src: String,
     var rating: Float
):Parcelable
