package com.example.topnews.ui.detail

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.topnews.domain.`data`.Results
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class DetailFragmentArgs(
  public val news: Results
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Results::class.java)) {
      result.putParcelable("news", this.news as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Results::class.java)) {
      result.putSerializable("news", this.news as Serializable)
    } else {
      throw UnsupportedOperationException(Results::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DetailFragmentArgs {
      bundle.setClassLoader(DetailFragmentArgs::class.java.classLoader)
      val __news : Results?
      if (bundle.containsKey("news")) {
        if (Parcelable::class.java.isAssignableFrom(Results::class.java) ||
            Serializable::class.java.isAssignableFrom(Results::class.java)) {
          __news = bundle.get("news") as Results?
        } else {
          throw UnsupportedOperationException(Results::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__news == null) {
          throw IllegalArgumentException("Argument \"news\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"news\" is missing and does not have an android:defaultValue")
      }
      return DetailFragmentArgs(__news)
    }
  }
}
