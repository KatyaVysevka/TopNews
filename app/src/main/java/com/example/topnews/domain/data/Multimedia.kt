package com.example.topnews.domain.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Multimedia(
    @SerializedName("caption") var caption : String,
    @SerializedName("copyright") var copyright : String,
    @SerializedName("format") var format : String,
    @SerializedName("height") var height : Int,
    @SerializedName("subtype") var subtype : String,
    @SerializedName("type") var type : String,
    @SerializedName("url") var url : String,
    @SerializedName("width") var width : Int
): Parcelable
