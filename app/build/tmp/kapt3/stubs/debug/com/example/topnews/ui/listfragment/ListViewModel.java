package com.example.topnews.ui.listfragment;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tR\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/topnews/ui/listfragment/ListViewModel;", "Landroidx/lifecycle/ViewModel;", "newsUseCase", "Lcom/example/topnews/domain/usecase/NewsUseCase;", "state", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/example/topnews/domain/usecase/NewsUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "currentSection", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "news", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/topnews/domain/data/Results;", "getNews", "()Lkotlinx/coroutines/flow/Flow;", "choseSection", "", "section", "Companion", "app_debug"})
public final class ListViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.topnews.domain.usecase.NewsUseCase newsUseCase = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> currentSection = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.topnews.domain.data.Results>> news = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.topnews.ui.listfragment.ListViewModel.Companion Companion = null;
    private static final java.lang.String CURRENT_SECTION = "current_query";
    private static final java.lang.String DEFAULT_SECTION = "home";
    
    @javax.inject.Inject()
    public ListViewModel(@org.jetbrains.annotations.NotNull()
    com.example.topnews.domain.usecase.NewsUseCase newsUseCase, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle state) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.topnews.domain.data.Results>> getNews() {
        return null;
    }
    
    public final void choseSection(@org.jetbrains.annotations.NotNull()
    java.lang.String section) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/topnews/ui/listfragment/ListViewModel$Companion;", "", "()V", "CURRENT_SECTION", "", "DEFAULT_SECTION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}