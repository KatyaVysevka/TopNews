// Generated by view binder compiler. Do not edit!
package com.example.topnews.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.topnews.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDetailBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageView imageNewsDetail;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView textAbstract;

  @NonNull
  public final TextView textLink;

  @NonNull
  public final TextView textTitle;

  private FragmentDetailBinding(@NonNull ScrollView rootView, @NonNull ImageView imageNewsDetail,
      @NonNull ProgressBar progressBar, @NonNull TextView textAbstract, @NonNull TextView textLink,
      @NonNull TextView textTitle) {
    this.rootView = rootView;
    this.imageNewsDetail = imageNewsDetail;
    this.progressBar = progressBar;
    this.textAbstract = textAbstract;
    this.textLink = textLink;
    this.textTitle = textTitle;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageNewsDetail;
      ImageView imageNewsDetail = ViewBindings.findChildViewById(rootView, id);
      if (imageNewsDetail == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.textAbstract;
      TextView textAbstract = ViewBindings.findChildViewById(rootView, id);
      if (textAbstract == null) {
        break missingId;
      }

      id = R.id.textLink;
      TextView textLink = ViewBindings.findChildViewById(rootView, id);
      if (textLink == null) {
        break missingId;
      }

      id = R.id.textTitle;
      TextView textTitle = ViewBindings.findChildViewById(rootView, id);
      if (textTitle == null) {
        break missingId;
      }

      return new FragmentDetailBinding((ScrollView) rootView, imageNewsDetail, progressBar,
          textAbstract, textLink, textTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
