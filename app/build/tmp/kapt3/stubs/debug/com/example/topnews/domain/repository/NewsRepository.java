package com.example.topnews.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u000e\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/topnews/domain/repository/NewsRepository;", "Lcom/example/topnews/domain/repository/Repository;", "newsApi", "Lcom/example/topnews/api/NewsApi;", "(Lcom/example/topnews/api/NewsApi;)V", "appScope", "Lkotlinx/coroutines/CoroutineScope;", "map", "", "", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/topnews/domain/data/Results;", "getResults", "section", "app_debug"})
@javax.inject.Singleton()
public final class NewsRepository implements com.example.topnews.domain.repository.Repository {
    private final com.example.topnews.api.NewsApi newsApi = null;
    private final kotlinx.coroutines.CoroutineScope appScope = null;
    private final java.util.Map<java.lang.String, kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.topnews.domain.data.Results>>> map = null;
    
    @javax.inject.Inject()
    public NewsRepository(@org.jetbrains.annotations.NotNull()
    com.example.topnews.api.NewsApi newsApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.topnews.domain.data.Results>> getResults(@org.jetbrains.annotations.NotNull()
    java.lang.String section) {
        return null;
    }
}