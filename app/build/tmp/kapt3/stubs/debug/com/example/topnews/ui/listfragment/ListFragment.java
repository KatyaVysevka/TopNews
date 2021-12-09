package com.example.topnews.ui.listfragment;

import java.lang.System;

@kotlin.OptIn(markerClass = {kotlinx.coroutines.InternalCoroutinesApi.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0016H\u0016J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0016H\u0016J\u001a\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006-"}, d2 = {"Lcom/example/topnews/ui/listfragment/ListFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/topnews/ui/listfragment/NewsListAdapter$OnItemClickListener;", "()V", "_binding", "Lcom/example/topnews/databinding/FragmentListBinding;", "binding", "getBinding", "()Lcom/example/topnews/databinding/FragmentListBinding;", "listenerSettings", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "getListenerSettings", "()Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "setListenerSettings", "(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V", "viewModel", "Lcom/example/topnews/ui/listfragment/ListViewModel;", "getViewModel", "()Lcom/example/topnews/ui/listfragment/ListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onItemClick", "results", "Lcom/example/topnews/domain/data/Results;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onResume", "onViewCreated", "view", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ListFragment extends androidx.fragment.app.Fragment implements com.example.topnews.ui.listfragment.NewsListAdapter.OnItemClickListener {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.topnews.databinding.FragmentListBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private android.content.SharedPreferences.OnSharedPreferenceChangeListener listenerSettings;
    private java.util.HashMap _$_findViewCache;
    
    public ListFragment() {
        super();
    }
    
    private final com.example.topnews.ui.listfragment.ListViewModel getViewModel() {
        return null;
    }
    
    private final com.example.topnews.databinding.FragmentListBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences.OnSharedPreferenceChangeListener getListenerSettings() {
        return null;
    }
    
    public final void setListenerSettings(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.OnSharedPreferenceChangeListener p0) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.example.topnews.domain.data.Results results) {
    }
}