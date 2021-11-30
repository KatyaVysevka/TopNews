package com.example.topnews.domain.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Results(
    @SerializedName("section"             ) var section           : String?          ,
    @SerializedName("subsection"          ) var subsection        : String?          ,
    @SerializedName("title"               ) var title             : String?          ,
    @SerializedName("abstract"            ) var abstract          : String?          ,
    @SerializedName("url"                 ) var url               : String?          ,
    @SerializedName("uri"                 ) var uri               : String?          ,
    @SerializedName("byline"              ) var byline            : String?          ,
    @SerializedName("item_type"           ) var itemType          : String?          ,
    @SerializedName("updated_date"        ) var updatedDate       : String?          ,
    @SerializedName("created_date"        ) var createdDate       : String?          ,
    @SerializedName("published_date"      ) var publishedDate     : String?          ,
    @SerializedName("material_type_facet" ) var materialTypeFacet : String?          ,
    @SerializedName("kicker"              ) var kicker            : String?          ,
    @SerializedName("des_facet"           ) var desFacet          : List<String>     ,
    @SerializedName("org_facet"           ) var orgFacet          : List<String>     ,
    @SerializedName("per_facet"           ) var perFacet          : List<String>     ,
    @SerializedName("geo_facet"           ) var geoFacet          : List<String>     ,
    @SerializedName("multimedia"          ) var multimedia        : List<Multimedia> ,
    @SerializedName("short_url"           ) var shortUrl          : String?

): Parcelable
