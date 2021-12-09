package com.example.topnews.ui.listfragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.topnews.R
import com.example.topnews.domain.`data`.Results
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class ListFragmentDirections private constructor() {
  private data class ActionListFragmentToDetailFragment(
    public val news: Results
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_listFragment_to_detailFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun actionListFragmentToDetailFragment(news: Results): NavDirections =
        ActionListFragmentToDetailFragment(news)

    public fun actionListFragmentToSettingsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_listFragment_to_settingsFragment)
  }
}
