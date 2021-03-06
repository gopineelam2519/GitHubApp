package com.piotr.xapo.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.piotr.xapo.model.Repository;
import de.hdodenhof.circleimageview.CircleImageView;

public abstract class FragmentDetailsBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final CollapsingToolbarLayout collapsing;

  @NonNull
  public final CoordinatorLayout detailsRoot;

  @NonNull
  public final CircleImageView ivProfile;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView tvAuthor;

  @NonNull
  public final TextView tvDescription;

  @NonNull
  public final TextView tvForks;

  @NonNull
  public final TextView tvImageUrl;

  @NonNull
  public final TextView tvLanguage;

  @NonNull
  public final TextView tvPeriodStars;

  @NonNull
  public final TextView tvStars;

  @NonNull
  public final TextView tvUrl;

  @Bindable
  protected Repository mRepository;

  protected FragmentDetailsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, CollapsingToolbarLayout collapsing,
      CoordinatorLayout detailsRoot, CircleImageView ivProfile, Toolbar toolbar, TextView tvAuthor,
      TextView tvDescription, TextView tvForks, TextView tvImageUrl, TextView tvLanguage,
      TextView tvPeriodStars, TextView tvStars, TextView tvUrl) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.collapsing = collapsing;
    this.detailsRoot = detailsRoot;
    this.ivProfile = ivProfile;
    this.toolbar = toolbar;
    this.tvAuthor = tvAuthor;
    this.tvDescription = tvDescription;
    this.tvForks = tvForks;
    this.tvImageUrl = tvImageUrl;
    this.tvLanguage = tvLanguage;
    this.tvPeriodStars = tvPeriodStars;
    this.tvStars = tvStars;
    this.tvUrl = tvUrl;
  }

  public abstract void setRepository(@Nullable Repository repository);

  @Nullable
  public Repository getRepository() {
    return mRepository;
  }

  @NonNull
  public static FragmentDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDetailsBinding>inflate(inflater, com.piotr.xapo.R.layout.fragment_details, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDetailsBinding>inflate(inflater, com.piotr.xapo.R.layout.fragment_details, null, false, component);
  }

  public static FragmentDetailsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentDetailsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentDetailsBinding)bind(component, view, com.piotr.xapo.R.layout.fragment_details);
  }
}
