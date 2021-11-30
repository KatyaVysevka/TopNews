package com.example.topnews.domain.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class News(
    @SerializedName("status"       ) var status      : String?       ,
    @SerializedName("copyright"    ) var copyright   : String?      ,
    @SerializedName("section"      ) var section     : String?       ,
    @SerializedName("last_updated" ) var lastUpdated : String?       ,
    @SerializedName("num_results"  ) var numResults  : Int?         ,
    @SerializedName("results"      ) var results     : List<Results>
) : Parcelable
